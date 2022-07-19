package com.coderbyte.anagramCount;

import java.util.*;
import java.util.stream.Collectors;


public class AnagramCount {
    public static int countingAnagrams(String str){
        Map<String, List<String>> map = Arrays.stream(str.split(" "))
                .distinct()
                .filter( w-> w.length() > 1)
                .collect(Collectors.groupingBy(w -> sortChars(w)));
        return map.size();
    }
    public static String sortChars(String input) {
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    public static void main(String args[])
    {

    }

}
