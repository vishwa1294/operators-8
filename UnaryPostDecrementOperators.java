class UnaryPostDecrementOperatorsDemo{
public static void main(String[]args){
int x=100;
int y=--x;
int z=y--;
System.out.println(x+y+z);//296
System.out.println(--z);//98
System.out.println(z);//98
System.out.println(y--);//98
System.out.println(x);//99
}
}

