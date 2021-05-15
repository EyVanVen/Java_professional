package homework12.task2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        JacksonParser parser = new JacksonParser();

        parser.parse();
    }
}
