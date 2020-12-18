package Java.com.javaChapter7.myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class NewEntryTest {
    NewEntry myEntry;
    @BeforeEach
    void setUp() {
        myEntry = new NewEntry("Hello");
    }

    @AfterEach
    void tearDown() {
        myEntry = null;
    }

    @Test
    void testIfEntryHasATitleWhenEntryIsConstructed(){
        //When
        NewEntry myEntry;
        //Given
        myEntry = new NewEntry("My first entry");
        //Assert
        assertEquals("My first entry", myEntry.getEntryTitle());
    }
    @Test
    void testIfDataAndTimeIsCreatedWhenEntryIsConstructed(){
        //When
        NewEntry entry;
        //Given
        entry = new NewEntry("The Breakup letter");
        //Assert
        assertNotNull(entry.getLocalDateAndTime());
    }

    @Test
    void testIfDateIsCanBeGetWhenEntryIsConstructed(){
        //When
        NewEntry entry;
        //Given
        entry = new NewEntry("The Breakup letter");
        LocalDate date  = entry.getLocalDateAndTime().toLocalDate();
        //Assert
       assertEquals(LocalDate.now(), date);
    }

    @Test
    void testIfEntryTitleCanBeSet(){
        //Given
        myEntry.setEntryTitle("The Breakup Letter");
        String entryTitle = myEntry.getEntryTitle();

        myEntry.setEntryTitle("The Breakup");
        entryTitle = myEntry.getEntryTitle();
        //Assert
        assertEquals("The Breakup", entryTitle);
    }

    @Test
    void testIfEntryBodyCanBeSet(){
        //given
        myEntry.setEntryBody("it just happen");
        String entryBody = myEntry.getEntryBody();
        //assert
        assertEquals(entryBody, "it just happen");
    }

    @Test
    void testIfEntryBodyIsNotNullWhenEntryIsCreated(){
        //When
        NewEntry entry;
        //Given
        entry = new NewEntry("The Love letter");
        entry.setEntryBody("hello");
        //assert
        assertNotNull(entry.getEntryBody());
    }

    @Test
    void testIfEntryCanBeViewAfterConstruction(){
        //when
        NewEntry entry;
        //given
        entry = new NewEntry("Lovely Road");
        entry.setEntryBody("The road of success");

        String expected = "Entry title : Lovely Road\n" + "Entry date : " + LocalDate.now() + "\nEntry body : The road of success";
        String actual = entry.viewEntry();

        //assert
        assertEquals(expected, actual);
    }
}