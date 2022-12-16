


public class ReverseString {
    public static void main(String[] args) {


        String str = "ABCDEFF";
        String rev = "";

        int s = str.length();

        for (int i = s-1; i >=0; i--) {

            rev = rev + str.charAt(i);
        }
            System.out.println("reverse string is"+rev);

    }
}
