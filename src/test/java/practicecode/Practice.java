package practicecode;

public class Practice {
    public static void main(String[] args) {
        String str = "DDDUUDUUUUDDD";
        char ch[] = str.toCharArray();
        int valley=0, hill=0;
        for(int i = 0 ; i < ch.length ; i++)
        {
            if(ch[i]=='U')
            {
                hill++;
                if(hill == 0)
                {
                    valley++;
                }
            }
            else
            {
                hill--;
            }
        }

        System.out.println(valley);



    }
}
