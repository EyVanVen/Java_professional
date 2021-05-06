package homework6.task2;


import java.io.*;
import java.util.regex.*;

public class Decoder {
    public static void main(String[] args) throws IOException {


        try(BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework6\\task2\\text.txt"))) {


            Pattern p = Pattern.compile("\\b[A-Za-z]{2,4}\\s");

            Matcher m = p.matcher(bfr.readLine());

            String st = m.replaceAll(" java ");

            System.out.println(st);

            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework6\\task2\\text.txt")));
            bfw.write(st);

            bfw.flush();
            bfw.close();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
