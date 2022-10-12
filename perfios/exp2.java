class Exp2
{
int a; // class variables
float b;
char c;
boolean d;
public void disp() // method with disp as name and no return type
{
// System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
int j=9; // method varibales or local variables // they have to be intialized .
System.out.println(j);
}
public static void main(String[] args)
{
Exp2 obj = new Exp2(); // creating a object of class Exp2 
obj.disp();
System.out.println(obj.a); // to access class variables and methods in main method use obj_name.varibale_name or object_name.method_name
}
}

