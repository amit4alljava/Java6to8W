class Sum{
public static void main(String args[]){
//int a =Integer.parseInt(args[0]);  
//int b =Integer.parseInt(args[1]);
int c = 0 ;
for(int i = 0;i<args.length; i++)
{
c = c + Integer.parseInt(args[i]);
}
//c= a + b;
System.out.println(c);
}
}