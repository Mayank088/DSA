public class absolute
{
    static int absolut_num(int i){
        if (i>0){
            return i;
        }
        else {
            return -1*i;
        }
    }
    static int absolut_num1(int i){
        if (i>0){
            return i;
        }
        else {
            int absolutenum = Math.abs(i);
            return absolutenum;
        }
    }

    public static void main(String args[]){
        absolute a = new absolute();
        int x = a.absolut_num(-69);

        System.out.println(x);
    }

}
