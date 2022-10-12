class Exp6 {
    public static void main(String[] args)
    {
        int a=1;
        int b=2;
        int c= 3;
        a++;
        System.out.println(a);
        if (a==1)
        {
            if (b%2==0 && c%2==0)
            {
                System.out.println("b is even and c is odd ");
            }
            else if(b+c%2==0)
            {
                System.out.println(b+"+"+c + "is even");
            }
            else
            {
                System.out.println(b+"+"+c + " is odd");
            }
        }
        else if (a==2)
        {
            if ((b+2)%2==0 || c+1%3==0)
            {
                System.out.println("hello world");
            }
        }
        else
        {
            System.out.println("The end");
        }

    }
}
