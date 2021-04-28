package homework5;

public class Task3 {
    public static void main(String[] args) {
        String text = "in the twenty first century we can't imagine our lives without technologies";

        String firstHalf = text.substring(0, text.length()/2);
        String secondHalf = text.substring(text.length()/2 + 1);

        System.out.println(text);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        System.out.println("Length of the first half: " + firstHalf.length());
        System.out.println("Length of the second half: " + secondHalf.length());
    }
}
