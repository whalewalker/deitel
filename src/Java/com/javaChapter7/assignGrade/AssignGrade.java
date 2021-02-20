package Java.com.javaChapter7.assignGrade;

public class AssignGrade {
    public static char[] assignGrade(int[] scores) {
        char[] grade = new char[scores.length];
        for (int count = 0; count < scores.length; count++){
            if(scores[count] > 69 ){
                grade[count] = 'A';
            }else if(scores[count] > 54 && scores[count] <= 69){
                grade[count] = 'B';
            }else if(scores[count] >= 40 && scores[count] <= 54){
                grade[count] = 'C';
            }else if(scores[count] > 30 && scores[count] <= 39){
                grade[count] = 'D';
            }else {
                grade[count] = 'F';
            }
        }
        return grade;
    }
}
