package homework8.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;
import java.util.Scanner;


@SuppressWarnings("All")  //хоть что-то будет правильно работать

/**
 * @author - Ivan Balabanov
 * Simple calculator
 */

/**
 * Main body
 */
public class Task2 {

    /**
     * if there is an exception occures, it replaces error numbers with it's own, to avoid mistakes!
     */
    @Documented
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface NumsIfError {
        int num1();
        int num2();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a - add, m - multiply, d - divide, s - subtract");
        switch (in.nextLine()){

            case ("a"):
                System.out.println(add());

            case ("m"):
                System.out.println(multiplication());

            case ("d"):
                System.out.println(division());

            case ("s"):
                System.out.println(subtraction());
        }
    }


    /**
     *
     * @return adds two numbers.
     */
    @NumsIfError(num1 = 1, num2 = 2)
    public static int add(){

        Task2 t2 = new Task2();
        Class cls = t2.getClass();

        NumsIfError numsIfErr = (NumsIfError) cls.getAnnotation(NumsIfError.class);

        Scanner in = new Scanner(System.in);

        int num1, num2;



        try {
            num1 = in.nextInt();
            num2 = in.nextInt();

            return num1 + num2;

        } catch (Exception e){
            System.out.println("Houston we have a problem: " + e);
            System.out.println("Answer with numbers " + numsIfErr.num1() + " and " + numsIfErr.num2() + " is:");
            return numsIfErr.num1() * numsIfErr.num2();
        }

    }


    /**
     *
     * @return returns subtraction for two numbers.
     */
    @NumsIfError(num1 = 1, num2 = 2)
    public static int subtraction(){

        Task2 t2 = new Task2();
        Class cls = t2.getClass();

        NumsIfError numsIfErr = (NumsIfError) cls.getAnnotation(NumsIfError.class);

        Scanner in = new Scanner(System.in);

        int num1, num2;



        try {
            num1 = in.nextInt();
            num2 = in.nextInt();

            return num1 - num2;

        } catch (Exception e){
            System.out.println("Houston we have a problem: " + e);
            System.out.println("Answer with numbers " + numsIfErr.num1() + " and " + numsIfErr.num2() + " is:");
            return numsIfErr.num1() * numsIfErr.num2();
        }

    }

    /**
     *
     * @return returns multiplication for two numbers.
     */
    @NumsIfError(num1 = 6, num2 = 2)
    public static int multiplication(){

        Task2 t2 = new Task2();
        Class cls = t2.getClass();

        NumsIfError numsIfErr = (NumsIfError) cls.getAnnotation(NumsIfError.class);

        Scanner in = new Scanner(System.in);

        int num1, num2;



        try {

            num1 = in.nextInt();
            num2 = in.nextInt();

            return num1 * num2;

        } catch (Exception e){
            System.out.println("Houston we have a problem: " + e);
            System.out.println("Answer with numbers " + numsIfErr.num1() + " and " + numsIfErr.num2() + " is:");
            return numsIfErr.num1() * numsIfErr.num2();
        }

    }


    /**
     *
     * @return returns division for two numbers.
     */
    @NumsIfError(num1 = 6, num2 = 2)
    public static int division(){

        Task2 t2 = new Task2();
        Class cls = t2.getClass();

        NumsIfError numsIfErr = (NumsIfError) cls.getAnnotation(NumsIfError.class);

        Scanner in = new Scanner(System.in);

        int num1, num2;



        try {
            num1 = in.nextInt();
            num2 = in.nextInt();

            return num1 / num2;

        } catch (Exception e){
            System.out.println("Houston we have a problem: " + e);
            System.out.println("Answer with numbers " + numsIfErr.num1() + " and " + numsIfErr.num2() + " is:");
            return numsIfErr.num1() * numsIfErr.num2();
        }

    }
    // Простите за эту "красоту"
}
