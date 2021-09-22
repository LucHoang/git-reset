package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static List<?> fileLoader() {
        List<?> data = null; //TODO: init List

        ClassLoader clsLoader = Main.class.getClassLoader();
        InputStream iptStrm = clsLoader.getResourceAsStream("data.txt");
        if (iptStrm != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(iptStrm, StandardCharsets.UTF_8))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    String[] vals = line.split("|");
                    //TODO: add data to List

                }
                return data;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File not found!");
        }
        return data;
    }

}
