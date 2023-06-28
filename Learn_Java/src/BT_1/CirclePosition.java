package BT_1;

import java.util.*;

// Cho đường tròn tâm O(a,b), bán kính R và một điểm A(x,y). 

// Viết chương trình Java kiểm tra vị trí của điểm A so với đường tròn (trong, trên hay ngoài đường tròn).

//--- * Trong chương trình này, chúng ta sử dụng Scanner để lấy tọa độ tâm đường tròn, bán kính đường tròn và tọa độ điểm A từ người dùng. 

//--- Sau đó, chúng ta tính khoảng cách giữa điểm A và tâm đường tròn bằng công thức Euclid. 

//--- Cuối cùng, chúng ta so sánh khoảng cách này với bán kính của đường tròn để xác định vị trí của điểm A.

//--- Lưu ý rằng trong chương trình trên, ta giả sử rằng tọa độ tâm đường tròn và điểm A là các số thực (double). Nếu bạn chỉ làm việc với các số nguyên (int), bạn có thể thay thế các biến double bằng int và sử dụng nextInt() thay cho nextDouble() trong Scanner.

public class CirclePosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập tọa độ tâm đường tròn (a, b): ");
        double centerX = sc.nextDouble();
        double centerY = sc.nextDouble();

        System.out.print("Nhập bán kính đường tròn (R): ");
        double radius = sc.nextDouble();

        System.out.print("Nhập tọa độ điểm A (x, y): ");
        double pointX = sc.nextDouble();
        double pointY = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

        if (distance < radius) 
        {
            System.out.println("Điểm A nằm trong đường tròn.");
        } 
        else if (distance == radius) 
        {
            System.out.println("Điểm A nằm trên đường tròn.");
        } 
        else 
        {
            System.out.println("Điểm A nằm ngoài đường tròn.");
        }
        sc.close();

	}

}
