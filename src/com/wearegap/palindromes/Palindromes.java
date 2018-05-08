package com.wearegap.palindromes;

import java.util.Scanner;

/**
 *
 * @author David Cardona
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String initialText = "", invertedText = "";
        Scanner inputText = new Scanner(System.in);
        
        System.out.println("Please insert a text to validate if it is a palindrome:");
        initialText = inputText.nextLine();
        initialText = initialText.replace(" ", "");
        invertedText = new StringBuilder(initialText).reverse().toString();
        
        if (invertedText.equalsIgnoreCase(initialText)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
    
}
