package org.example.twoPointer;

import java.util.*;

public class EmailCleaner {
    public static List<String> cleanEmails(List<String> emails) {
        Set<String> uniqueEmails = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        for (String email : emails) {
            uniqueEmails.add(email.toLowerCase());  // Normalize to lowercase
        }

        return new ArrayList<>(uniqueEmails);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "john@example.com",
                "Jane@Sample.com",
                "john@example.com",
                "mark@hello.ie"
        );

        List<String> output = cleanEmails(input);
        System.out.println(output);
    }
}