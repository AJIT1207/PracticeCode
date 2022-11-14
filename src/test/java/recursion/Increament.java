package recursion;

public class Increament {
    public static void main(String[] args) {
        String s = "a1c1e1";
        char ch[] = s.toCharArray();

        for(int i = 1 ; i < ch.length; i=i+2)
        {
            ch[i] = (char)(ch[i-1] + ch[i] - '0'); //ch[0] + ch[1] -'0' // a + 1 - '0'
        }

        System.out.println(String.valueOf(ch));

        //        String s = "ajit 1 jaiswal 2";
//        String arr[] = s.split(" ");
//        for(String data : arr) {
//            int x = Integer.parseInt(data);
//            System.out.println(x);
//        }
//        StringBuilder digit = new StringBuilder();
//        for(Character c : s.toCharArray())
//        {
//            if(Character.isDigit(c))
//            {
//                digit.append(c);
//            }
//        }
//        System.out.println(digit);
    }
}
