package homework12.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;


import java.io.*;
import java.util.Locale;

public class GsonParser {
    public void parse() throws IOException {
        File f = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework12\\task3\\City_start.txt");
        File file = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework12\\task3\\City_new.json");

        BufferedReader reader = new BufferedReader(new FileReader(f));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonElement = new JsonParser().parse(reader.readLine());

        System.out.println(file);

        System.out.println();

        String str = gson.toJson(jsonElement);
        System.out.println(str);

        writer.write(str);
        writer.flush();

    }
}
