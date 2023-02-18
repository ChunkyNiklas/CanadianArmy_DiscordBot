package dev.hnweiland;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
   private static JDA jda = null;

   private static BufferedReader bufferedReader;


    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new FileReader("src/main/resources/token"));
        JDABuilder jdaBuilder = JDABuilder.createDefault(bufferedReader.readLine());
        jdaBuilder.setBulkDeleteSplittingEnabled(false);

        jda = jdaBuilder.build();



    }
}