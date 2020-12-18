package Java.com.javaChapter7.myDiary;

import java.util.Arrays;

public class NewDiary {

    private String password;
    private int counter;
    Entry[] entries;

    public NewDiary(int numberOfEntry) {
        this.entries = new Entry[numberOfEntry];
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDiaryEntry() {
        return entries.length;
    }

    public void setNumberEntry(int entriesValue) {
        entries = new Entry[entriesValue];
    }


    public Entry[] getEntry() {
        return entries;
    }

    public void addEntry(Entry entry) {
       if(counter < entries.length){
           entries[counter] = entry;
           counter++;
       }
    }

    public void removeItemInArray(Entry[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length || arr[index] == null){
            entries = arr;
        }

        Entry[] newArray = new Entry[arr.length - 1];
        for(int counter = 0, indexValue = 0; counter < arr.length; counter++){

            if(counter == index){
                continue;
            }
            newArray[indexValue++] = arr[counter];
        }
        entries = newArray;
    }

    public Entry[] updateDiary(Entry[] arr, Entry entryValue) {
        if(arr == null){
            entries = arr;
        }
        Entry[] newArray = new Entry[arr.length + 1];
        for(int counter = 0, indexValue = arr.length - 1; counter < arr.length; counter++){
            if(counter == indexValue){
                newArray[indexValue] = entryValue;
            }
//            newArray[indexValue--] = arr[counter];
        }
        entries = newArray;
        return entries;
    }

    public static void main(String[] args) {
        NewDiary myDiary = new NewDiary(4);
        Entry entry = new Entry("Hello my dear");
        entry.setEntryBody("You're welcome");

        Entry myEntry = new Entry("You're my love");
        myEntry.setEntryBody("Let go out");

        Entry breakUp = new Entry("Don't fall");
        breakUp.setEntryBody("You're kind");

        myDiary.addEntry(entry);
        myDiary.addEntry(myEntry);
        myDiary.addEntry(breakUp);

        myDiary.removeItemInArray(myDiary.getEntry(), 0);
        System.out.println(Arrays.toString(myDiary.getEntry()));

        Entry love = new Entry("Welcome");
        love.setEntryBody("You're wicked");

//        myDiary.removeItemInArray(myDiary.getEntry(), 1);
//
//        myDiary.removeItemInArray(myDiary.getEntry(), 1);
        myDiary.updateDiary(myDiary.getEntry(), love);


        System.out.println(Arrays.toString(myDiary.getEntry()));


    }


}
