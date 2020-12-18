package Java.com.javaChapter7.myDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private String entryTitle;
    private String entryBody;
    private LocalDateTime entryDateAndTime;

    public Entry(String my_title) {
        this.entryTitle = my_title;
        this.entryDateAndTime = LocalDateTime.now();
    }


    public void setEntryTitle(String newEntryTitle) {
        this.entryTitle = newEntryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return this.entryDateAndTime;
    }

    public void setEntryBody(String entryDody) {
        this.entryBody = entryDody;
    }

    public String getEntryBody() {
        return entryBody;
    }


    public String viewEntry() {
        String preview = ("Title: " + getEntryTitle() + "\n" + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n" + "Entry Body: " + getEntryBody());
        return preview;
    }

    @Override
    public String toString(){
        return viewEntry();
    }
}
