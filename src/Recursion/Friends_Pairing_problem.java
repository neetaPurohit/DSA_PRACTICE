package Recursion;

public class Friends_Pairing_problem {
public static int friendsPair(int n){
//    base case
    if (n==1 || n==2){
        return n;
    }
//    choice
//    single
    int fnm1 = friendsPair(n-1);

//    pair
    int fnm2 = friendsPair(n-2);
    int pairWays = (n-1) * fnm2;

//    totalWays
    int totWays = fnm1 + pairWays;
    return totWays;

// or
//    return  friendsPair(n-1) + (n-1) * friendsPair(n-2);

}
    static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
