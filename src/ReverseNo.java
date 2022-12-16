public class ReverseNo {

    public static void main(String[] args) {
        int a =123456;
//        int rev = 0;
//
//        while (a !=0){
//            rev= rev*10 + a%10;//0*10+6;6*10+5;
//            a=a/10;

//        }
        //second approch
        StringBuffer sb =new StringBuffer(String.valueOf(a));
             StringBuffer rev= sb.reverse();
        System.out.println(rev);

    }
}


