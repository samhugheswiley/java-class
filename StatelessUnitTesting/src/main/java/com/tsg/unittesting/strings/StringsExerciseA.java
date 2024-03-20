/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

/**
 *
 * @author ahill
 */
public class StringsExerciseA {

    /**
     * Take a word, and change it so that it is a shout. 
     * If there are any quiet letters, make them LOUD!
     *
     * Ex:
     * yell( "Hello there." ) ->  "HELLO THERE."
     * yell( "shhhhhhhhhhhh" ) ->  SHHHHHHHHHHHH
     * yell( "AAaAAAaAAAaaAAHHHH" ) ->  "AAAAAAAAAAAAAAHHHH"
     * 
     * @param word
     * @return String yell
     */
    public static String yell(String word){
        if (word == null){
            return (null);
        }
        else{
            for (int i = 0; i <= (word.length() - 1); ++i){
                try {
                    word = word.substring(0, i) + Character.toUpperCase(word.charAt(i)) + word.substring(i + 1);
                }catch(Exception e){};
            }
            return(word);
        }

    }
}
