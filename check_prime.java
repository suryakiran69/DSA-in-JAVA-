import java.util.*;
class check_prime {
    public static boolean isprime (int n){
        if (n<=1)
        return false ;
        else if (n==3 || n==2 )
        return true ;
        else if (n%2 == 0 || n%3 ==0)
        return false ;
        else 
        {
            for (int i=5; i*i<=n;i+=6)
            {
                if(n%i==0 || n%(i+2)==0)
                return false ;
                break;
            }

        }
        return true;
    }

    public static void  main (String args[]) {
        Scanner sc=new Scanner (System.in);
		int a = sc.nextInt();
		if (isprime(a)==true)
			System.out.println("Number is prime ");
	    else 
			System.out.println("Not prime ");
    }
}