import java.util.Scanner;
class num{
    int i,sum=0;
    int sum_method(int n){
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
}

class num2{
    int i,j,sum=0;
    int sum_method2(int n){
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                sum++;
            }
        }
        return sum;
    }
}

class num3{
    int sum_method3(int n){
        return n*(n+1)/2;
    }

}

public class Main {
    public static void main(String[] args) {
        num kc = new num();
        int k = kc.sum_method(5);
        System.out.println(k);

        num2 m = new num2();
        int k2 = m.sum_method2(5);
        System.out.println(k2);

        num3 h = new num3();
        int k3 = h.sum_method3(5);
        System.out.println(k3);
    }
}