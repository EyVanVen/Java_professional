package homework1.task1.ex_004_comparable.interface_comparable;

import java.util.Comparator;

public class Animal implements Comparable { // <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object obj) {

        int tmp = this.speed - ((Animal)obj).speed;

        if (tmp == 0 && this.price - ((Animal)obj).price != 0) {
            return this.price - ((Animal) obj).price;
        }
        else if(tmp == 0 && this.weight - ((Animal)obj).weight != 0){
            return this.weight - ((Animal)obj).weight;
        } else if(tmp == 0){
           return  this.breed.compareTo(((Animal)obj).breed);
        }
         else {
            return tmp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
}