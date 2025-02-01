import java.util.*;
class simplified_fractions
{
    public static int gcd(int a , int b){
        int temp;
        while (b!=0)
        {
            temp = b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
		int n=5;
       for (int i=1;i<=n-1;i++)
       {
        for (int j=i+1;j<=n;j++)
        {
            if (gcd(i,j)==1 )
            list.add(i+"/"+j);
        }
       } 
System.out.println(list);
       //return list;
    }
}