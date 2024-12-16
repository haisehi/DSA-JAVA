package Hashmap;

import java.util.*;

public class MaxFrequencyNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhap cac so cach nhau boi dau cach
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        int[] numbers = new int[inputArr.length];
        for (int i = 0; i < inputArr.length;i++){
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int num: numbers){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        int maxFrequency = 0;
        for (int freq:frequencyMap.values()){
            maxFrequency = Math.max(maxFrequency,freq);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            if (entry.getValue() == maxFrequency){
                result.add(entry.getKey());
            }
        }

        for (int num: result){
            System.out.print(num+" ");
        }
    }
}
