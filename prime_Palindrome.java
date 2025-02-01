class prime_Palindrome {
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
    public static int num_of_dig(int n){
        int count=0;
        while(n!=0){
           count +=1;
           n=n/10;
        }
        return count;
    }
    public static boolean ispal(int n){
         while (isprime(n)==false){
           n++;
        }
        int count =0;
        int noe = num_of_dig(n);
        double n1=n;
        for (int i=0;i<noe/2;i++){
            double a = n1%10;
            double p= Math.pow (10,noe-i+1);
            double b= n1% p;
            if (a==b){
                count +=1;
            }
            n1=n1%p;
            n1=n1/10;
        }
        if (count == noe/2)
        return true ;
        else 
        return false ;
    }

    public static int primePalindrome(int n) {
        while (ispal(n)==false ){
            n+=1;
        }
        return n;
    }
	public static void main(String args[])
	{
		int a=9;
		int b=primePalindrome(a);
		System.out.println("Prime Palendrome is "+b);
	}
}