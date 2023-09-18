import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu gồm : \n" +
                    "1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác\n" +
                    "3. Tính chu vi và diện tích hình tròn.\n" +
                    "4. Thoát\n");
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài:");
                    int width = sc.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    int height = sc.nextInt();
                    rectangle(width, height);
                    break;
                case 2:
                    System.out.println("Nhập cạnh thứ nhất: ");
                    int a = sc.nextInt();
                    System.out.println("Nhập cạnh thứ hai: ");
                    int b = sc.nextInt();
                    System.out.println("Nhập cạnh thứ ba: ");
                    int c = sc.nextInt();
                    triangle(a, b, c);
                    break;
                case 3:
                    System.out.println("Nhập bán kính hình tròn: ");
                    int R = sc.nextInt();
                    circle(R);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("CHọn từ 1 -4!!!");
                    break;
            }
        }
    }

    public static void rectangle(int width, int height) {
        int P = (width + height) * 2;
        int S = width * height;
        System.out.println("Chu vi là: " + P);
        System.out.println("Diện tích là: " + S);
    }

    public static void triangle(int a, int b, int c) {
        double C = a + b + c;
        double Dt = Math.sqrt((C / 2) * ((C / 2) - a) * ((C / 2) - b) * ((C / 2) - c));
        System.out.println("Chu vi hình tam giác là: " + C);
        System.out.println("Diện tích hình tam giác là: " + Dt);
    }

    public static void circle(int R) {
        double C = 2 * R * Math.PI;
        double S = Math.pow(R,2) * Math.PI;
        System.out.println("Chu vi hình tròn là: " + C);
        System.out.println("Diện tích hình tròn là: " + S);
    }
}
