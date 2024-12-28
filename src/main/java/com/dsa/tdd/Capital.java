package com.dsa.tdd;

public class Capital {

    public String toCapital(String input){

        if(input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(toCapitalForWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String toCapitalForWord(String input) {
        return ( input.charAt(0) +"").toUpperCase()+ input.substring(1);
    }

}
