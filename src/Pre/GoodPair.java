package Pre;

public class GoodPair {
    //Given an array A & an integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B).
    //Check if any good pair exists or not
    //Output: return 1 if good pair exits, else return 0
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 2;

        System.out.println(goodPair(a, b));
    }

    public static int goodPair(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (i != j && a[i] + a[j] == b) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
