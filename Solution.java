class Solution {
    public static void main(String[] args) {
	int[] height={1,8,6,2,5,4,8,3,7};
        int a,b,c,d;
        int max=0;
        for (int i=0;i<height.length-1;i++)
        {
            for (int j=i;j<height.length;j++)
            {
                a=(height[i]<height[j])?height[i]:height[j];
                System.out.println("Value of a :"+a);
                System.out.println("Value of next :"+(j-i));
                b=a*(j-i);
                System.out.println(b);
                if (max<b)
                {
                    max=b;
                }

            }

        }
        System.out.println("Max"+max);
    }
}