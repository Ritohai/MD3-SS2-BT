public class BT5 {
    public static void main(String[] args) {
        int N =1;
        while (true){
            if(N % 5 == 0 && N % 7 == 0 && N % 11 ==0){
                System.out.println("Số chia hết cho cả 5, 7, 11 là: "+N);
                break;
            }
            N++;
        }

    }
}
