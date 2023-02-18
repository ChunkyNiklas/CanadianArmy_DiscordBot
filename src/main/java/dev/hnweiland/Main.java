package dev.hnweiland;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
   private static JDA jda = null;
    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault(args[0]);
        jdaBuilder.setBulkDeleteSplittingEnabled(false);

        jda = jdaBuilder.build();

    }
}