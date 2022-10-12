public class exp7 {
    // public void disp()
    // {
    //     int a =0;// all local variables in java are non static variables.
    //     // static int b = 1; // static - memory allocation at run time not at compile time

    // }
    public static void main(String[] args)
    {
        for(int a =0;a<=10;a++)
        {
            System.out.println(a+ " ");
            
        }
        int b=1;
        while(b<=1)
        {
            System.out.println(b+" is less than and equal to 1");
            b++;
        }
        System.out.println(b);
        int c = 2;
        do
        {
            System.out.println(c);
            c--;
        } while(c==2); 
        System.out.println(c);
    }
}

