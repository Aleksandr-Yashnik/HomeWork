import java.util.Arrays;
import java.util.Random;

public class HomeArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 100);
            System.out.println("Filled array with random numbers = " + nums[i]);
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i];
            System.out.println(nums[i]);
        }
        int max = nums[0];// начальное значение максимального элемента
        int min = nums[0];// начальное значенние минимального элемента
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
                break;
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
            System.out.println("Умножение на  2 = " + nums[i]);

        }
        int[] numsArr = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(numsArr));

        boolean isArraysEquals = true;
        if (nums.length != numsArr.length) {
            isArraysEquals = false;
        }
        if (isArraysEquals) {
            for (int i = 0; i == numsArr.length; i++) {
                if (!nums.equals(numsArr.length)) {
                    isArraysEquals = false;
                    break;
                }
            }
        }
        System.out.println("isArraysEquals = " + isArraysEquals);

    }
}
