
public class TwoDArray {

	public static void main(String[] args) {
		
		final int MAX = 100;
		
		int x[][] = new int[3][];
		x[0] = new int[10];
		x[1] = new int[20];
		x[2] = new int[MAX];
		System.out.println(x.length);
		/*for(int i = 0; i<x.length; i++){
			for(int j = 0; j<x[i].length ; j++){
				System.out.println(x[i][j]);
			}
		}*/
		for(int i[] : x){
			for(int j : i){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
