package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Alexander";

        // Standard use for revert string

        char[] nameInChars = name.toCharArray();

        String revertString = "";

        for (int i = name.length() - 1; i >= 0;i--){
            revertString += nameInChars[i];
        }

        System.out.println(revertString);


        // use theStringBuilder with revert method

        String rev = revert(name).toString(); //parse StringBuilder to String

        System.out.println(rev);

    }

    public static StringBuilder revert(String name){

        StringBuilder sb = new StringBuilder(name);

        StringBuilder revertedNamesb = sb.reverse();

        return revertedNamesb;
    }// method StringBilder;
}
