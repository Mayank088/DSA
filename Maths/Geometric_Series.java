public class Geometric_Series
{
        public double termOfGP(int A,int B,int N)
        {
            double r =(double) B/A;
            double ans = A * ((double)Math.pow(r , N-1));
            return ans;
        }


    public static void main(String args[]){
        Geometric_Series g = new Geometric_Series();
        double ans = g.termOfGP(1,2,5);

        //gp : An = A*r raised to (N-1)
        //whare r = B/A
        System.out.println(ans);
    }
}
