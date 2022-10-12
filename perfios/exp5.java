class Exp5 {
    public static void main(String[] args)
    {
        //unary operators 
        int x =0;
        System.out.println(x++); //0 
        System.out.println(x); //1 
        System.out.println(x--);//1
        System.out.println(x);//0
        int y = 1;
        System.out.println(++y);//2
        System.out.println(y);//2
        System.out.println(--y);//1
        System.out.println(y);//1
        // relational operators
        System.out.println(x>1);
        System.out.println(x<=0);
        System.out.println(x==0);
        System.out.println(x!=0);
        // conditional statements
        if (x==0) 
        {
            System.out.println("x value is 0");
            if(y>=1)
            {
            System.out.println("y value is not 0");
            }
        }
        else 
        {
            System.out.println("x and y values are wrong");
        }
    }
}
