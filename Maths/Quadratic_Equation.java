import java.util.*;
class Quadratic_Equation {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        double d=(b*b)-(4*a*c);
        if(d<0){
            list.add(-1);
        }
        else{
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);

            list.add((int)Math.floor(Math.max(x1,x2)));
            list.add((int)Math.floor(Math.min(x1,x2)));
        }

        return list;
    }

    public static void main(String args[]){
        Quadratic_Equation q = new Quadratic_Equation();
        ArrayList<Integer> ans = q.quadraticRoots(1,-7,12);

        System.out.println(ans);
    }
}