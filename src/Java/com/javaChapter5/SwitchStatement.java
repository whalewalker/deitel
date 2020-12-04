package Java.com.javaChapter5;

public class SwitchStatement {
    public static void main(String[] args) {
          char val = 'B';

          switch (val){
              case 'A' :
                  System.out.println("Value is A");
                  break;
              case 'B' :
              System.out.println("Value is B");
                  break;
              case 'C' :
                  System.out.println("Value is C");
                  break;
              case 'D' :
                  System.out.println("Value is D");
                  break;
              case 'E' :
                  System.out.println("Value is E");
                  break;
              default:
                  System.out.println("Not found!");
                  break;
          }

//          int counter =1;
//          counter = counter +++counter++; //3 ;
////        System.out.println(counter);
//
//        int counter = 1;
//        counter = counter++ + ++counter; //3 ;
//        System.out.println(counter);


    }
}
