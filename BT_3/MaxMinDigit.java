package BT_3;
// Viết chương trình java sử dụng hàm để tìm chữ số lớn nhất (max) và nhỏ nhất (min) của một số nguyên dương n được nhập vào từ bàn phím.

// Ví dụ: Nếu nhập n = 10293 thì max = 9 và min = 0

//--- Trong chương trình này, chúng ta sử dụng Scanner để lấy một số nguyên dương n từ người dùng. 

//--- Tiếp theo, chúng ta gọi hai hàm findMaxDigit() và findMinDigit() để tìm chữ số lớn nhất và nhỏ nhất của số n. 

//--- Trong các hàm này, chúng ta sử dụng vòng lặp while để lấy từng chữ số cuối cùng của số và so sánh với giá trị hiện tại của max và min để tìm chữ số lớn nhất và nhỏ nhất.

//--- Cuối cùng, chúng ta in ra kết quả của chữ số lớn nhất và nhỏ nhất của số n.
import java.util.*;

public class MaxMinDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int n = sc.nextInt();

        int max = findMaxDigit(n);
        int min = findMinDigit(n);

        System.out.println("Chữ số lớn nhất của " + n + " là: " + max);
        System.out.println("Chữ số nhỏ nhất của " + n + " là: " + min);
        sc.close();
	}
	public static int findMaxDigit(int number) {
        int max = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }

        return max;
    }

    public static int findMinDigit(int number) {
        int min = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }

        return min;
    }

}
