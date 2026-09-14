package com.string;
public class FreqCount {
    public static void main(String[] args) {

        String s = "javadev";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

            // Check if already counted
            boolean already = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    already = true;
                    break;
                }
            }

            if (!already) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(Character.toUpperCase(ch) + " - " + count);
            }
        }
    }
}
