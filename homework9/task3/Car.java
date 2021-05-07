package homework9.task3;

import java.io.*;

public class Car implements Serializable, Externalizable {

    static int age = 15;
    int maxSpeed = 5;
    String mark = "Cat";

    public Car(int age, int maxSpeed, String mark) {
        Car.age = age;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }

    public Car(){}

    public static int getAge(){
        return age;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public String  getMark(){
        return this.mark;
    }

    public void setAge(int age) {
        Car.age = age;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getMark());
        out.writeObject(this.getMaxSpeed());
        out.writeObject(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        mark = (String) in.readObject();
        maxSpeed = (int) in.readObject();
        age = (int) in.readObject();
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", mark=" + mark + '\'' +
                ", age=" +  age  +
                '}';
    }
}
