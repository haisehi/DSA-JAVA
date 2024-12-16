package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        Map<String,Integer> wordCount = new HashMap<>();

        for (String word:words){
            word = word.toLowerCase();
            if (wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            } else {
                wordCount.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry:wordCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
