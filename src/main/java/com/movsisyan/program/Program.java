package com.movsisyan.program;

import com.movsisyan.repository.FlightRepository;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try {
            FlightRepository repository = new FlightRepository(
                    "C:\\Users\\Yoga-M\\Dropbox\\ПК\\Desktop\\AirlinesLite\\FrequentFlyerForum-Profiles.json");
            System.out.println(repository);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
