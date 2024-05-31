package org.example;

import org.example.model.Contact;
import com.google.gson.Gson;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = {
                new Contact("Louinord", "Innocent", "Inno100", "Owner"),
                new Contact("Lyse", "Innocent", "Inno100", "Co-Owner"),
                new Contact("Lumane", "Innocent", "Inno100", "Owner"),
                new Contact("Werlandie", "Innocent", "Inno100", "Owner"),
                new Contact("Marguerite", "Innocent", "Inno100", "Owner"),
                new Contact("Louine", "Innocent", "Inno100", "Owner")
        };

        printContacts(contacts);


    }

    public static void printContacts(Contact[] contacts) {
        Arrays.sort(contacts, Comparator.comparing(Contact::getFirstName));

        System.out.println("JSON Format:");
        System.out.println(Arrays.toString(contacts));

        Gson gson = new Gson();
        String json = gson.toJson(contacts);
    }
//
//    private static void printAsJson(Contact[] contacts) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(contacts);
//        System.out.println(json);
//    }
}




