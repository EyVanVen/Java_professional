package homework12.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class JacksonParser {

    public void parse () throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework12\\task2\\City.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework12\\task2\\City_new.json"));

        ObjectMapper mapper = new ObjectMapper();
        Object json = mapper.readValue(reader.readLine(), Object.class);

        String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);

        System.out.println(str);
        writer.write(str);

        writer.flush();

    }
}
