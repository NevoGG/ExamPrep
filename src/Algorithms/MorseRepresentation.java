package Algorithms;

import java.util.HashSet;

public class MorseRepresentation {
    private static final String[] MORSE_CODES = {".-", "-...", "-.-.", "-..",".", "..-.","--.","....","..",".---",
            "-.-", ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    private int uniqueMorse(String[] words){
        HashSet<String> morseUnique = new HashSet<String>();
        for(String word : words){
            StringBuilder morse = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                String morseOfChar = MORSE_CODES[Character.toLowerCase(c) - 'a'];
                morse.append(morseOfChar);
            }
            morseUnique.add(morse.toString());
        }
        return morseUnique.size();
    }
}
