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

    }
}
