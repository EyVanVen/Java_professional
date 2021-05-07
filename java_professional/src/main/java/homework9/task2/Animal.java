package homework9.task2;

import java.io.Serializable;

public class Animal implements Serializable {
    int  age = 15;
    int  tail = 5;
    String breed = "Cat";

    public Animal(int age, int tail, String breed) {
        this.age = age;
        this.tail = tail;
        this.breed = breed;
    }

    public Animal(){}

    public int getAge(){
        return this.age;
    }

    public int getTail(){
        return this.tail;
    }

    public String  getBreed(){
        return this.breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", tail=" + tail +
                ", breed='" + breed + '\'' +
                '}';
    }


}


