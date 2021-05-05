package homework8.task3;

public class Class2 extends Class3{

    @Override
    public int [] createRandArray (int maxNum){

        Class2 c3 = new Class2();
        Class cls = c3.getClass();
        CompareWithTen compareWithTen = (CompareWithTen) cls.getAnnotation(CompareWithTen.class);

        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * maxNum);
        }

        if (compareWithTen.Ten() < maxNum) {
            System.out.println("Array's max number can be bigger than 10.");
        } else {
            System.out.println("Array's max number is smaller than 10 or equal it.");
        }

        return arr;
    }
}



