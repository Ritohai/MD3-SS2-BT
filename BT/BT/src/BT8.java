import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập cạnh thứ nhất: ");
            int a = sc.nextInt();
            System.out.println("Nhập cạnh thứ hai: ");
            int b = sc.nextInt();
            System.out.println("Nhập cạnh thứ ba: ");
            int c = sc.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                if (a + b > c && b + c > a && a + c > b) {
                    int P = a + b + c;
                    double S = Math.sqrt((P / 2) * ((P / 2) - a) * ((P / 2) - b) * ((P / 2) - c));
                    System.out.println("Chu vi hình tam giác là: " + P);
                    System.out.println("Diện tính hình tam giác là: " + S);
                } else {
                    System.err.println("Đây không phải là 1 tam giác.");
                    System.err.println("Nhập lại.");
                }
            } else {
                System.err.println("Yêu cầu nhập lại");
                main(args);
            }
        }
    }
}
