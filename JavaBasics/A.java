
public class A {

	public static void main(String[] args) {
		if(args.length==2){
		if(Character.isDigit(args[0].charAt(0)) &&  Character.isDigit((args[1].charAt(0)))){	
		int a = Integer.parseInt(args[0]) ;
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("Sum is "+c);
		}
		else
		{
			System.out.println("Only Number Allowed");
		}
		}
		else
		{
			System.out.println("Invalid Args Required 2 Integers");
		}

	}

}
