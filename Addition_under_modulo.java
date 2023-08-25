public class Addition_under_modulo
{
    long add(long a,long b){
        long m = (long)(Math.pow(10,9) + 7);
        //(a+b)%m mate aa use karvu formula
        return ((a % m) + (b % m) % m);
    }

    long mul(long a,long b){
        long m = (long)(Math.pow(10,9) + 7);
        //(a*b)%m mate aa use karvu formula
        return ((a % m) * (b % m) % m);
    }

    public static void main(String args[]){
        long a = 9223372036854775807L;
        long b = 9223372036854775807L;

        Addition_under_modulo u = new Addition_under_modulo();
        long ans = u.add(a,b);
        long ans1 = u.mul(a,b);

        System.out.println(ans);
        System.out.println(ans1);
    }
}


