package Java.com.javaChapter7.myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary myDiary;
    @BeforeEach
    void setUp() {
        myDiary = new Diary(5);
    }

    @AfterEach
    void tearDown() {
        myDiary = null;
    }

    @Test
    void testDiaryEntryIsSet(){
//        Given
//        When
//        Assert

        //        Given
        Diary myBreakUpDiary = new Diary(5);
        //        When
        int numberOfDiaryEntries = myBreakUpDiary.getNumberOfDiaryEntries();
        //        Assert
        assertEquals(numberOfDiaryEntries, 5);
    }

    @Test
    void testDiaryEntryIsNotNull(){
        //        Given
        Diary myBreakUpDiary;
        //        When
        myBreakUpDiary = new Diary(10);
        //        Assert
        Entry[] entries = myBreakUpDiary.getEntries();
        assertNotNull(entries);

    }

    @Test
    void testDiaryEntryCanBeEntered(){
        //        Given
        Diary myBreakUpDiary = new Diary(5);
        Entry entry = new Entry("My break up story");
        entry.setEntryBody("We love you");
        //        When


        entry.setEntryTitle("My break up story");
        entry.setEntryBody("We love you");
        myBreakUpDiary.addNewEntry(entry);
        Entry output = myBreakUpDiary.getEntries()[0];

        //        Assert
        assertEquals(entry, output);

    }

    @Test
    void testDiaryEntryCanBeView(){
        // given
        Diary newDairy = new Diary(2);
        Entry newEntry = new Entry("The Love of my life");
        newEntry.setEntryBody("The day is bright");
        newDairy.addNewEntry(newEntry);

        newDairy.addNewEntry(newEntry);
//        assertEquals(newEntry, myDiary.getEntries()[0]);
        // when
        Entry entry = new Entry("The Love of my life");
        entry.setEntryTitle("My break up story");
        entry.setEntryBody("We love you");
        newDairy.addNewEntry(entry);

        System.out.println((Arrays.toString(myDiary.getEntries())));

    }


}

