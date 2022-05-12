package com.company.lab4.ocurrence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachWords {
    static void CountWords(Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File("Java Curs GAD\\src\\com\\company\\lab4\\ocurrence"));
        while (file.hasNext()) {
            String word = file.next();
            Integer count = words.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            words.put(word, count);
        }
        file.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<String, Integer>();
        CountWords(words);
        System.out.println(words);
    }
}
