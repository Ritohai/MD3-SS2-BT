import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < number){
            if(isPrime(N)){
                System.out.print(N + " , ");
                count++;
            }
            N++;
        }

    }
    public static boolean isPrime(int number){
        if(number <= 1) {
            return false;
        }
        if(number <= 3){
            return true;
        }
        if(number %2 == 0 || number % 3 == 0){
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number %i==0 || number %(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
