package homework10.task3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Eagle eg = new Eagle();

        eg.setBreed("Eagle");

        Eagle eg2 = (Eagle) eg.clone();

        System.out.println(eg);
        System.out.println(eg2);
    }
}
