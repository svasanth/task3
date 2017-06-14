package com.epam.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Sydubabu_Vasantha on 6/14/2017.
 */
public class Main {

    private static String TEXT_TO_PARSE = "aa sggj fdsf aa ddr hjkh trgj aa ddr fdsf";

    private static String SEPARATOR = " ";

    private static int START_POSITION_OF_STRING = 0;

    public static void main(String[] args) {

        try {
            String words[] = TEXT_TO_PARSE.split(SEPARATOR);

            List<String> listOfWords = Arrays.asList(words);

            System.out.println("List of words from line");

            listOfWords.forEach(s -> System.out.println(s));

            Set<String> stringStartAndEndWithSameAlphabet = listOfWords.stream().filter(s -> s.charAt(START_POSITION_OF_STRING) == s.charAt(s.length() -1))
                    .collect(Collectors.toSet());

            System.out.println("List of Distinct Words with same start and end letters");

            stringStartAndEndWithSameAlphabet.forEach(s -> System.out.println(s));
        } catch (Exception e){
            System.out.println("Exception is:"+e.getMessage());
        }

    }
}
