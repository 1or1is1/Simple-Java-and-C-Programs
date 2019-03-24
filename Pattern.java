public class Pattern {
	static void makeShape(int num){
		System.out.println();
	     if(num <= 0)
	 			System.out.println("Invalid input");
	 	else if((num+1) % 2 != 0)
	 			System.out.println("Enter a ODD number");
	 		else{
	 			for(int i = 0; i <= num-1; i++){
	 				for(int j = 0; j <= num-1; j++){
	 					if(i <= (num-1)/2){
	 						if((j<=i || j>=num-i-1) && ((i%2 == 0 && j%2 == 0) || ((i+1)%2 == 0 && (j+1)%2 == 0)))
	 							System.out.print(" x");
	 						else
	 							System.out.print("  ");
	 						}
	 					else{
	 						if((j<=(num-i-1) || j>=i) && ((i%2 != 0 && j%2 != 0) || (i%2 == 0 && j%2 == 0)))
	 							System.out.print(" x");
	 						else
	 							System.out.print("  ");
	 						}
	 					}
	 				System.out.println();
	 				}
	 		}
	     }
	     public static void main(String[] args){
			makeShape(13);
	     }
}