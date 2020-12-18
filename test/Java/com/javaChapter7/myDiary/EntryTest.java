package Java.com.javaChapter7.myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry("Title");
    }

    @AfterEach
    void tearDown() {
        entry = null;
    }

    @Test
    void testEntryCanChangeTitle(){
        entry = new Entry("My Title");

        entry.setEntryTitle("New entry created");

        assertEquals(entry.getEntryTitle(), "New entry created");
    }

    @Test
    void testDateOfEntryIsCreatedAfterConstruction(){
//        given
        Entry newEntry;
//        When
        newEntry = new Entry("My Title");
//        assert
        LocalDateTime entryDateAndTime = newEntry.getEntryDateAndTime();
        assertNotNull(entryDateAndTime);
//        assert localDate
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        assertEquals(entryDate, LocalDate.now());
    }

    @Test
    void testEntryBodyCanBeEdited(){
        //    Given
        Entry newEntry;
        //    When
        newEntry = new Entry("My Title");
        newEntry.setEntryBody("This is the entry body");
        //    assert
        String entryBody = newEntry.getEntryBody();
        assertEquals(entryBody, "This is the entry body");
    }

    @Test
    void testViewEntry() {
//        Given
        Entry userEntry = new Entry("My Breakup story");
        userEntry.setEntryBody("It just happened");
        String actual = userEntry.viewEntry();
        String expected = ("Title: My Breakup story" + "\n" + "Entry Date: " + LocalDate.now() + "\n" + "Entry Body: " + "It just happened");
//        When

//        Assert
        assertEquals(expected, actual);
        actual = userEntry.toString();
        assertEquals(expected, actual);
    }

}