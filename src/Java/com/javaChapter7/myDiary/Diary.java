package Java.com.javaChapter7.myDiary;

public class Diary {
    private Entry[] entries;
    private int entryCount = 0;

    public Diary(int numberOfDiaryEntry) {
        this.entries = new Entry[numberOfDiaryEntry];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry entry) {
        if(entryCount < entries.length){
            entries[entryCount] = entry;
            entryCount++;
        }

    }

//   public void addNewEntry(Entry newDiaryEntry) {
//        for (int count = 0; count < entries.length; count++){
//            entries[count] = newDiaryEntry;
//        }
//    }
}
