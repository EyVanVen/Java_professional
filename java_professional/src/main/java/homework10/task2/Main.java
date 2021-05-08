package homework10.task2;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird(800, "Ostrich");
        Bird bird2 = Bird.createClone(bird);

        System.out.println(bird);
        System.out.println(bird2);
    }
}
