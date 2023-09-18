import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu tiên:");
        int a = sc.nextInt();
        System.out.println("Nhập giá trị cuối:");
        int b = sc.nextInt();
        int sum = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } else {
            if (a % 2 == 0) {
                System.out.println(a + b);
            } else {
                System.out.println("Không có số chẵn.");
            }
        }
    }
}
