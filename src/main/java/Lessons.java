import java.util.Random;

public class Lessons {

    public static void main(String[] args) {

        int[] randomArray = getRandomArray();
//        int[] nullArray = {1,2,3,4,5,6,7,8,9,10};
        Number one = new Number(randomArray);
//        Number two = new Number(nullArray);

        System.out.println();
        System.out.println("The sum is: " + one.getSum());
        System.out.println("The sum with string: " + one.getSum("random!"));
        System.out.println("The sum with int: " + one.getSum(42));
//        System.out.println(two.getSum());
    }

    public static int[] getRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[random.nextInt(9) + 1];
        System.out.print("Given array: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21);
            System.out.print(randomArray[i] + ", ");
        }
        return randomArray;
    }
}
