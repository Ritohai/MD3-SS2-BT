
public class BT3 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (i > 10) {
                if (i % 2 != 0) {
                    if (i % 3 != 0) {
                        if (i % 5 != 0) {
                            if (i % 7 != 0) {
                                System.out.print(i + " , ");
                            }
                        }
                    }
                }
            }
            if (i < 10) {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    System.out.print(i + " , ");
                }
            }
        }
    }
}
