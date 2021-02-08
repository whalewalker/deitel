package Java.com.javaChapter7.countLetterInArray;

public class CountConsecutiveLetterInArray {

    public int[] characterCount(char[] characterArr) {
        int[] letterCount = new int[characterArr.length];
//        for(char character : characterArr){
//
//            letterCount[character - 'a']++;
//        }
        for(int count = 1; count < characterArr.length; count++){
                if(count > 1){
                    letterCount[characterArr[count]  - 'a']++;
                }
                if(count == 1){
                    letterCount[(characterArr[count - 1] + count - 1) - 'a']++;
                }
                System.out.println(characterArr[count - 1]);
                if(characterArr[count - 1] == characterArr[count]){
                    letterCount[(characterArr[count - 1] + count - 1) - 'a']++;
                }
        }
        return letterCount;
    }
}
