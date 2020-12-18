package Java.com.javaChapter7.myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NewDiaryTest {
    NewDiary myDiary;
    @BeforeEach
    void setUp() {
        myDiary = new NewDiary(3);
    }

    @AfterEach
    void tearDown() {
        myDiary = null;
    }

    @Test
    void testForNumberOfEntryInDiary() {
        NewDiary newDiary = new NewDiary(2);
        int number = newDiary.getDiaryEntry();
        assertEquals(2, number);
    }
    @Test
    void checkIfPasswordGenerated(){
        //given
        String pass = "Hello123";
        myDiary.setPassword(pass);
        //assert
        assertEquals(pass, myDiary.getPassword());
    }

    @Test
    void testIfPasswordIsNotNull(){
        //given
        myDiary.setPassword("Hwow");
        //assert
        assertNotNull(myDiary.getPassword());
    }

    @Test
    void checkTheNumberOfEntryInDiary(){
        //when
        NewDiary diary;
        //given
        diary = new NewDiary(3);
        int entries = diary.getDiaryEntry();
        //assert
        assertEquals(3, entries);
    }

    @Test
    void checkIfEntryDiaryCanBeSet(){
        NewDiary mainDiary = new NewDiary(3);
        mainDiary.setNumberEntry(5);
        assertEquals(5, mainDiary.getDiaryEntry());
    }

    @Test
    void checkEntryInDiaryIsNotNull(){
        NewDiary mainDiary = new NewDiary(3);
        Entry[] output = mainDiary.getEntry();
        assertNotNull(output);
    }

    @Test
    void testIfEntryCanBeAddedToDiary(){
        NewDiary mainDiary = new NewDiary(3);
        Entry myEntry = new Entry("My breakup letter");
        myEntry.setEntryBody("She left");

        mainDiary.addEntry(myEntry);
//        ====================================
        Entry entry = new Entry("Wow");
        entry.setEntryTitle("Hello world");
        entry.setEntryBody("Wow");

        mainDiary.addEntry(entry);

        //  ====================================
        assertEquals(mainDiary.getEntry()[1], entry);
    }

    @Test
    void testIfIndexOfArrayCanBeRemove(){
        NewDiary myDiary = new NewDiary(5);
        Entry entry = new Entry("Hello my dear");
        entry.setEntryBody("You're welcome");
//        =========

        Entry myEntry = new Entry("My breakup letter");
        myEntry.setEntryBody("She left");
//====================

//        ====================================
        Entry newEntry = new Entry("Wow");
        newEntry.setEntryBody("Wow");

        myDiary.addEntry(entry);
        myDiary.addEntry(myEntry);
        myDiary.addEntry(newEntry);


//        assertEquals(myDiary.getEntry(), output);

        Entry newAdded = new Entry("How old are you");
        newAdded.setEntryBody("play me");

        Entry added = new Entry("My added");
        added.setEntryBody("She");

        myDiary.addEntry(newAdded);
        myDiary.addEntry(added);

        myDiary.removeItemInArray(myDiary.getEntry(), 2);
//        myDiary.getEntry();

        Entry val = new Entry("Love you");
        val.setEntryBody("She hate me");
        myDiary.addEntry(val);

        myDiary.getEntry();

    }

    @Test
    void testIfEntryCanBeUpdatedAfterBeingDeleted(){
        Entry entry = new Entry("The world war");
        entry.setEntryBody("The world war is brutal");

        Entry newEntry = new Entry("The second world war||");
        newEntry.setEntryBody("Second is peaceful");

        myDiary.addEntry(entry);
        myDiary.addEntry(newEntry);

        myDiary.removeItemInArray(myDiary.getEntry(), 0);

        Entry newValue = new Entry("The Love");
        newValue.setEntryBody("Love is blind");

        Entry[] output = myDiary.updateDiary(myDiary.getEntry(), newValue);

        System.out.println(Arrays.toString(myDiary.getEntry()));
        System.out.println(Arrays.toString(output));
        assertEquals(Arrays.toString(output), Arrays.toString(myDiary.getEntry()));

    }


}