package homework8.task3;

public class Class1 extends Class2 {

    @Override
    public int[] createRandArray(int numbersCanBeDividedOn) {
        Class2 c3 = new Class2();
        Class cls = c3.getClass();
        CompareWithTen compareWithTen = (CompareWithTen) cls.getAnnotation(CompareWithTen.class);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            if (arr[i] % numbersCanBeDividedOn != 0) {
                i--;
            }
        }

        if (numbersCanBeDividedOn % compareWithTen.Ten() == 0) {
            System.out.println("All numbers will contain \"0\" in the end.");
        } else {
            System.out.println("Not every number will contain \"0\" in the end.");
        }

        return arr;
    }
}
