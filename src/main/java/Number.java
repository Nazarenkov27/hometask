import java.util.Random;

/*
Создать модель (класс) "Number", который принимает (в констуркторе) !массив! с числами размером в n (0 < n < 10).
У данной модели будет перегруженый метод "getSum". Данный метод суммирует все значения массива.
 Так же, если в этот метод передали строку - он возвращает строку, в которой есть строка которую передали и сумма всех чисел массива.
 Если в метод передали число - сплюсовать это число с суммой всех чисел массива.
  Массив наполнить рандомными числами k, где 0 <= k <= 20.
  Вывести результаты метода getSum в консоль.
 */

public class Number {

    public Number(int[] intArray) {
        if (intArray.length == 0 ^ intArray.length > 10) {
            throw new IllegalArgumentException("Length should be from 1 to 9");
        }
    }

    public int getRandomArraySum() {
        Random random = new Random();
        int[] randomArray = new int[6];
        int randomArraySum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21);
            randomArraySum += randomArray[i];
        }

        return randomArraySum;
    }

    public int getSum(int[] intArray) {
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return sum;
    }

    public String getSum(String string) {
        return string + " " + getRandomArraySum();
    }

    public int getSum(int number) {
        return number + getRandomArraySum();
    }

}
