package com.movsisyan.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movsisyan.model.ForumProfile;
import com.movsisyan.model.Profiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlightRepository {
    private Profiles profiles;

    public FlightRepository(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            this.profiles = mapper.readValue(bufferedReader, Profiles.class);
        }
    }

    @Override
    public String toString() {
        return "FlightRepository{" +
                "profiles=" + profiles +
                '}';
    }
}
