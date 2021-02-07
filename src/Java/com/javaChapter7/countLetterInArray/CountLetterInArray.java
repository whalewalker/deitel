package Java.com.javaChapter7.countLetterInArray;

import java.util.Random;

public class CountLetterInArray {
    private char[] characterArray;

    public CountLetterInArray() {
        characterArray = new char[100];
    }

    public char[] createCharacterArray() {
        Random randomNumber = new Random();
        for(int count = 0; count < characterArray.length; count++){
            char characters = (char) (randomNumber.nextInt(26) + 'a');
            characterArray[count] = characters;
        }
        return characterArray;
    }

    public String displayCharacterArray(char[] character){
        StringBuilder display = new StringBuilder();
        for(int count = 0; count < characterArray.length; count++){
                display.append(character[count]).append(" ");
        }
        return display.toString();
    }


    public int[] characterCount(char[] characters) {
        int[] letterCount = new int[26];
        for (char character : characters) {
            letterCount[character - 'a']++;
        }
        return letterCount;
    }

    public String displayCount(int[] characterCount){
        StringBuilder letterCount = new StringBuilder();
        for(int count = 0; count < characterCount.length; count++){
            letterCount.append(characterCount[count]).append(" ").append((char) (count + 'a')).append(" ");
            if(((count + 1)  % 10) == 0){
                letterCount.append("\n");
            }
        }
        return letterCount.toString();
    }

    public static void main(String[] args) {
        CountLetterInArray character = new CountLetterInArray();
        char[] charactersArray = character.createCharacterArray();
        int[] characterCount = character.characterCount(charactersArray);
        System.out.println(character.displayCount(characterCount));
    }
}
