package task2;

public class Main {
    int fact(int n) {
        int result;
        if (n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }
}
/*class Rec {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.print("Факториал 5 равен" + fact.fact(5));
    }
}
*/