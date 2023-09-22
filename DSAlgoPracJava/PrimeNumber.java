import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
 
    // https://www.baeldung.com/cs/prime-number-algorithms#:~:text=2.%20Sieve%20of%20Eratosthenes
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Integer inp = sc.nextInt();
        for(Integer i = 0; i<=inp; i++){
            boolean temp = isPrime(i);
            if(temp){
                list.add(i);
            }
        }
        sc.close();
        System.out.println(list);
    }

    public static boolean isPrime(Integer val){
        // time compelxity of trail division method is O(sqrt(N))
        boolean res;
        if(val <= 1){
            return false;
        } else {
            for(int i=2; i<(Math.sqrt(val)+1); i++){
                Integer remainder = val%i;
                if(remainder==0){
                    return false;
                }
            }
            res = true;
        }
        return res;
    }
}
