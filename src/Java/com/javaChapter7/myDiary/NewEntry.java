package Java.com.javaChapter7.myDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NewEntry {

        private String entryTitle;
        private LocalDateTime entryLocalDateAndTime;
        private String entryBody;

        public NewEntry(String entryTitle) {
            this.entryTitle = entryTitle;
            this.entryLocalDateAndTime = LocalDateTime.now();
        }

        public String getEntryTitle() {
            return entryTitle;
        }

        public LocalDateTime getLocalDateAndTime() {
            return entryLocalDateAndTime;
        }

        public void setEntryTitle(String entryTitle) {
            this.entryTitle = entryTitle;
        }

        public String getEntryBody() {
                return entryBody;
        }

        public void setEntryBody(String entryBody) {
            this.entryBody = entryBody;
        }

        public String viewEntry() {
            String output = "";
            output = "Entry title : " + getEntryTitle() + "\nEntry date : " + getLocalDateAndTime().toLocalDate() + "\nEntry body : " + getEntryBody();
                return output;
        }
}
