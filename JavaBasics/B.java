
public class B {

	public static void main(String[] args) {
		int sum = 0;
		if(args.length>0){
			for(int i = 0; i<args.length; i++){
				if(Character.isDigit(args[i].charAt(0))){
				sum = sum + Integer.parseInt(args[i]);
				}
				else
				{
					System.out.println("Invalid Args Only Number Allowed");
					break;
				}
			}
		}
		System.out.println("Sum is "+sum);

	}

}
