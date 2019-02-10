import java.math.BigInteger;
import java.util.Scanner;
public class FibNum {
	static BigInteger getFib(int number){
		BigInteger first = BigInteger.valueOf(1);
		BigInteger second = BigInteger.valueOf(0);
		BigInteger third = BigInteger.valueOf(0);
		int count = 0;
		while (true){
			int length = String.valueOf(second).length();
			if (length == number)
				break;
			third = first;
			first = second;
			second = second.add(third);
			count += 1;
		}
		System.out.println("Index : "+count);
		return second;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		double t0 = System.currentTimeMillis();
		System.out.println("Fibonacci number is : "+getFib(num));
		double t1 = System.currentTimeMillis();
		System.out.println("Time : "+(t1-t0)/1000+"ms");
	}
}