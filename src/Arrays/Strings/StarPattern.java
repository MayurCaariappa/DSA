package Arrays.Strings;

public class StarPattern {
    public static void main(String[] args) {
//        fiveByFive(5);
//        fiveByFour(5);
//        leftRightAngleBottomTriangle(5);
//        leftRightAngleTopTriangle(5);
        rightRightAngleTriangle(5);
    }

    //outer loop -> rows
    //inner loop -> columns

    public static void fiveByFive(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void fiveByFour(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftRightAngleBottomTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftRightAngleTopTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightRightAngleTriangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
