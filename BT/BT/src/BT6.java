import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu gồm : \n" +
                    "1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2. Kiểm tra số nguyên tố.\n" +
                    "3. Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4. Thoát\n");
            System.out.println("Nhập lựa chọn của bạn!!!");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Kiểm tra tính chẵn lẻ của 1 số.");
                    break;
                case 2:
                    System.out.println("Kiểm tra số nguyên tố.");
                    break;
                case 3:
                    System.out.println("Kiểm tra một số có chia hết cho 3 không.");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập trong khoảng từ 1 - 4..");
            }
        }
    }
}
