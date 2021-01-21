package Java.com.javaChapter7.playground;

public class Gradebook {
    private String courseName;
    private int[]grades;

    public Gradebook (String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinimum(){
        int lowGrade = grades[0];
            for(int grade : grades){
                    if (grade < lowGrade){
                        lowGrade = grade;
                    }
            }
        return lowGrade;

    }

    public int getMaximum(){
        int highGrade = grades[0];
            for(int grade : grades){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        return highGrade;
    }

    public double getAverage(){
        int total = 0;
            for(int grade : grades){
                total += grade;
            }
        return (double) total / grades.length;
    }

    public void outputBarChart(){
        System.out.println("Grade distribution : ");
        int [] frequency = new int [11];

        for(int grade : grades){
            ++frequency[grade / 10];
        }

        for(int count = 0; count < frequency.length; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);;
            }
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrade(){
        System.out.println("The grades are : %n%n");

        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }

    public  void processGrades(){
        outputGrade();
        System.out.printf("%nClass average is %.2f%n", getAverage() );
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum() , getMaximum() );

        outputBarChart();
    }

    public static void main(String[] args) {
        int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        Gradebook myGradeBook = new Gradebook("CS101 Introduction to Java Programming", gradesArray );
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
