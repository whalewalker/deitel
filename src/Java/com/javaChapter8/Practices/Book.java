package Java.com.javaChapter8.Practices;

public enum Book {
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & Wordl Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public static void main(String[] args) {
        System.out.println("All books: ");
        for(Book book : Book.values()){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle() , book.getCopyrightYear() );
        }
        System.out.printf("%nDisplay a range of enum constants:%n");

//        for (Book book : Book.(Book.JHTP, Book.CPPHTP) )
//            System.out.printf("%-10s%-45s%s%n", book,
//                    book.getTitle() , book.getCopyrightYear() );

    }



}
