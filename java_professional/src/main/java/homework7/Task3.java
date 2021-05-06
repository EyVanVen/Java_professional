package homework7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Task3 {
    public int num = 9;
    private String str = "text";
    protected double dbl = 1.3;

    public int recreateNum(int num){
        this.num = num;
        return num;
    }

    public String recreateStr(String str){
        this.str = str;
        return str;
    }

    public double recreateDbl(double doubleNum){
        this.dbl = doubleNum;
        return doubleNum;
    }

    public Task3(int num, String str, double dbl) {
        this.num = num;
        this.str = str;
        this.dbl = dbl;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Task3 t3 = new Task3(13, "JoJo", 1.73);
        Class refCl = t3.getClass();

        Constructor[] info1 = refCl.getConstructors();
        Field [] info2 = refCl.getDeclaredFields();
        Class<?> info5 = refCl.getSuperclass();
        Class<?>[] info6 = info5.getClasses();
        boolean info8 = refCl.isLocalClass();

        for (int i = 0; i < info2.length; i++) {
            try{
            Field info3 = refCl.getDeclaredField(refCl.getDeclaredFields()[i].toString());
            String info4 = refCl.getConstructors()[i].toString();
            System.out.println(info3);
            System.out.println(info4);
            } catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println(refCl);
        System.out.println(Arrays.toString(info1));
        System.out.println(Arrays.toString(info2));
        System.out.println(Arrays.toString(info6));
        System.out.println(info5);
        System.out.println(info8);

    }
}
