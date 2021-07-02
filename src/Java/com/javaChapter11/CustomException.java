package Java.com.javaChapter11;

public class CustomException extends Exception{
    private String message;
    public CustomException(String message){
        super(message);
    }
}

class StudentException extends Exception{
    private String message;
    
//    public void CustomException(String message){
//        super(message);
//    }
}
