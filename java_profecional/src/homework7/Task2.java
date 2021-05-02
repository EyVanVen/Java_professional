package homework7;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    PrintInfoMethodLibrary piml = new PrintInfoMethodLibrary();

    static class Class1{
        int num = 3;
        int num2 = num*3;

         int getNum2(){
            return num2;
        }
    }

      public static class Class2 {
        static int num = 3;
        static double num2 = num * 2.5;
        static String str = "Wowie!";

        protected static String getTwoStrs() {
            return num2 + str;
        }
    }

    class Class3 {
            String str = "text";
            String str2  = str + "!";
            String str3;

            public void output() {
                System.out.println(str +  " " + str2);
            }
        }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Task2 t2 = new Task2();



            Scanner in = new Scanner(System.in);
            System.out.println("please, enter the number of class, which you want to observe");
            int classNum = in.nextInt();
            if (classNum == 1){
                t2.piml.printInfoCl1();
            }
            if (classNum == 2){
                t2.piml.printInfoCl2();
            }
            if (classNum == 3){
                t2.piml.printInfoCl3();
            }
            if (classNum == 4){
                t2.piml.printInfoThisClass();
        }

    }


    public class PrintInfoMethodLibrary {
        public void printInfoCl1 () throws NoSuchFieldException, NoSuchMethodException {
            Class1 cl = new Class1();
            Class<?> info1 = cl.getClass();
            Field [] info2 = info1.getDeclaredFields();
            Class<?> info5 = info1.getSuperclass();
            Method[] info7 = info1.getMethods();
            for (int i = 0; i < info2.length; i++) {
                try{
                    Field info3 = info1.getDeclaredField(info1.getDeclaredFields()[i].toString());
                    String info4 = info1.getConstructors()[i].toString();
                    System.out.println(info3);
                    System.out.println(info4);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
            Class<?>[] info6 = info5.getClasses();
            boolean info8 = info1.isLocalClass();

            System.out.println(info1);
            System.out.println(Arrays.toString(info2));
            System.out.println(Arrays.toString(info6));
            System.out.println(info5);
            System.out.println(Arrays.toString(info7));
            //System.out.println(info9);
            System.out.println(info8);

        }
        public void printInfoCl2 () throws NoSuchFieldException, NoSuchMethodException{
            Class1 cl = new Class1();
            Class<?> info1 = cl.getClass();
            Field [] info2 = info1.getDeclaredFields();
            Class<?> info5 = info1.getSuperclass();
            Method[] info7 = info1.getMethods();
            for (int i = 0; i < info2.length; i++) {
                try{
                    Field info3 = info1.getDeclaredField(info1.getDeclaredFields()[i].toString());
                    String info4 = info1.getConstructors()[i].toString();
                    System.out.println(info3);
                    System.out.println(info4);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
            Class<?>[] info6 = info5.getClasses();
            boolean info8 = info1.isLocalClass();

            System.out.println(info1);
            System.out.println(Arrays.toString(info2));
            System.out.println(Arrays.toString(info6));
            System.out.println(info5);
            System.out.println(Arrays.toString(info7));
            //System.out.println(info9);
            System.out.println(info8);

        }
        public void printInfoCl3 () throws NoSuchFieldException, NoSuchMethodException {
            Class1 cl = new Class1();
            Class<?> info1 = cl.getClass();
            Field [] info2 = info1.getDeclaredFields();
            Class<?> info5 = info1.getSuperclass();
            Method[] info7 = info1.getMethods();
            for (int i = 0; i < info2.length; i++) {
                try{
                    Field info3 = info1.getDeclaredField(info1.getDeclaredFields()[i].toString());
                    String info4 = info1.getConstructors()[i].toString();
                    System.out.println(info3);
                    System.out.println(info4);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
            Class<?>[] info6 = info5.getClasses();
            boolean info8 = info1.isLocalClass();

            System.out.println(info1);
            System.out.println(Arrays.toString(info2));
            System.out.println(Arrays.toString(info6));
            System.out.println(info5);
            System.out.println(Arrays.toString(info7));
            //System.out.println(info9);
            System.out.println(info8);


            try {
                Constructor<?> info4 = info1.getConstructor();
                System.out.println(info4);
            } catch (Exception e) {
                System.out.println("Class has no constructor");
            }

        }

        public void printInfoThisClass () throws NoSuchMethodException, NoSuchFieldException {
            int field = 0;

            Class1 cl = new Class1();
            Class<?> info1 = cl.getClass();
            Field [] info2 = info1.getDeclaredFields();
            Class<?> info5 = info1.getSuperclass();
            Method[] info7 = info1.getMethods();
            for (int i = 0; i < info2.length; i++) {
                try{
                    Field info3 = info1.getDeclaredField(info1.getDeclaredFields()[i].toString());
                    String info4 = info1.getConstructors()[i].toString();
                    System.out.println(info3);
                    System.out.println(info4);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
            Class<?>[] info6 = info5.getClasses();
            boolean info8 = info1.isLocalClass();

            System.out.println(info1);
            System.out.println(Arrays.toString(info2));
            System.out.println(Arrays.toString(info6));
            System.out.println(info5);
            System.out.println(info7);
            //System.out.println(info9);
            System.out.println(info8);

            try {
                Constructor<?> info4 = info1.getConstructor();
                System.out.println(info4);
            } catch (Exception e) {
                System.out.println("Class has no constructor");
            }



        }
    }

}
