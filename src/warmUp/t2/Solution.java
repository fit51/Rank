package warmUp.t2;

import java.util.*;

public class Solution {

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int el : ar) {
            sum += el;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}