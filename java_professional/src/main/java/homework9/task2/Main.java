package homework9.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework9\\task2\\output_file.txt");
        Animal an = new Animal(8, 13, "Parrot");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

            oos.writeObject(an);
            Animal an2 = (Animal) ois.readObject();

            an2.setBreed("Fly");

            System.out.println(an2);

            oos.writeObject(an2);

            Animal an3 = (Animal) ois.readObject();

            an3.setAge(4);

            oos.flush();
            oos.close();

            System.out.println(an3);



        } catch (Exception e){
            System.out.println(e);
        }

    }
}
