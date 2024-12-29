package Pre;

public class CountPrimes {
    //You'll be given an integer n. You need to return the count of prime numbers <= n
    public static void main(String[] args) {
        System.out.println(countPrimes(23));
    }

    public static int countPrimes(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

        public boolean isPrime(int num){
        int count =0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i == num){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        if(count ==2){
            return true;
        }
        return false;
    }
}
