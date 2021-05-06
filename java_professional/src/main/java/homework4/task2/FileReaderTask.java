package homework4.task2;

import java.io.*;
import java.nio.CharBuffer;

public class FileReaderTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework4\\task2\\srcFile.txt"));
        try (BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bfr.read();

            String temp;
            while ((temp = bfr.readLine()) != null){
                bfw.write(temp);
                bfw.newLine();
            }

        } catch (Exception e){
            System.out.println(e);
        } finally {
                bfr.close();
            }
        }
    }

