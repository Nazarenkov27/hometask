public class Lessons {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 1, 2, 3};
        Number number = new Number(arr);
        String sum = String.valueOf(number.getSum(arr));
        System.out.println(sum);
        System.out.println(number.getSum("hellooo!"));
        System.out.println(number.getSum(42));
    }
}
