package homework4.task3;

import java.io.*;
import java.nio.charset.*;
import java.util.Arrays;


public class FileCreator {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework4\\task3\\Output.txt");

        try  {

            BufferedWriter ots = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

            int [] outPutArr = new int[10];

           for (int i = 0; i != 10; i++){
               outPutArr[i] = (int) (Math.random() * 10);
           }
            Arrays.sort(outPutArr);

            for (int i = 0; i != 10; i++){
                ots.write(outPutArr[i]);
            }

           ots.close();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
