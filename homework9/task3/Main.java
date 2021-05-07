package homework9.task3;

import homework9.task2.Animal;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homework9\\task3\\output_file_car.txt");
        Car car = new Car(18, 330, "Audi");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

            oos.writeObject(car);
            Car car2 = (Car) ois.readObject();
            oos.writeObject(car);

            car2.setMark("Toyota");

            System.out.println(car2);

            oos.writeObject(car2);

            Car car3 = (Car) ois.readObject();

            car3.setMaxSpeed(492);

            oos.flush();
            oos.close();

            System.out.println(car);


        } catch (Exception e){
            System.out.println(e);
        }

    }
}
