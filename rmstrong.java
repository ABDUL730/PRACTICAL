import java.util.Scanner;

public class rmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp /= 10;
        }

        return sum == num;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
