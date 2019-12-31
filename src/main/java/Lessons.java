import java.util.Random;

public class Lessons {

    public static void main(String[] args) {

        int[] randomArray = getRandomArray();

        Number one = new Number(randomArray);
        System.out.println();
        System.out.println("The sum is: " + one.getSum());
        System.out.println("The sum with string: " + one.getSum("random!"));
        System.out.println("The sum with int: " + one.getSum(42));
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
