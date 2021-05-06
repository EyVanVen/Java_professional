package homework8.task3;


@CompareWithTen
@SuppressWarnings({"rawtypes", "unused"})
public class Class3{

    public int[] createRandArray (int arrSize){
        Class3 c3 = new Class3();
        Class cls = c3.getClass();
        CompareWithTen compareWithTen = (CompareWithTen) cls.getAnnotation(CompareWithTen.class);

        System.out.println(compareWithTen.Ten());

        int [] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++){
            arr[i] = (int) (Math.random() * 100);
        }

        if (compareWithTen.Ten() < arrSize) {
            System.out.println("Array size is bigger than 10.");
        }

        else if (compareWithTen.Ten() ==  arrSize){
                System.out.println("Array size equals 10.");
        }

        else {
            System.out.println("Array size is smaller than 10.");
        }

        return arr;
    }

}
