package BT_2;
//    Viết chương trình java sử dụng hàm để tính tổng (S) của n số nguyên tố đầu tiên, với n được nhập vào từ bàn phím.
//    Ví dụ: Nếu nhập n = 5 thì S = 28

//--- Trong chương trình này, chúng ta sử dụng Scanner để lấy số nguyên tố n từ người dùng. 
//--- Tiếp theo, chúng ta gọi hàm findPrimeSum() để tính tổng của n số nguyên tố đầu tiên. 
//--- Trong hàm này, chúng ta sử dụng một vòng lặp để tìm số nguyên tố và cộng dồn vào biến sum. 
//--- Hàm isPrime() được sử dụng để kiểm tra xem một số có phải là số nguyên tố hay không.
//--- Cuối cùng, chúng ta in ra kết quả tổng của n số nguyên tố đầu tiên.
import java.util.*;

public class PrimeSum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên tố n: ");
        int n = sc.nextInt();

        int sum = findPrimeSum(n);
        System.out.println("Tổng của " + n + " số nguyên tố đầu tiên là: " + sum);
        sc.close();
	}
	public static int findPrimeSum(int n) {
        int count = 0;
        int number = 2;
        int sum = 0;

        while (count < n) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
