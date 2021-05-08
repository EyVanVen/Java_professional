package homework10.task2;

import com.sun.jdi.Accessible;

public class Bird {
    final int beak = 1;
    transient int feathers = 1000;
    static String name = "Parrot";

    public Bird (){}

    public Bird(int feathers, String name) {
        this.feathers = feathers;
        Bird.name = name;
    }

    public int getBeak() {
        return beak;
    }

    public int getFeathers() {
        return feathers;
    }

    public void setFeathers(int feathers) {
        this.feathers = feathers;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Bird.name = name;
    }

    public static Bird createClone (Bird original){
        Bird newBird = new Bird();

        newBird.feathers = original.feathers;

        return newBird;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "beak=" + beak +
                ", feathers=" + feathers +
                ", Name=" + name +
                '}';
    }
}
