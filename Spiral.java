public class Spiral {
	private static void spiralSize(int num) {
		int k, l;
		int i = 1, move = 0;
		int n = (int) Math.ceil(Math.sqrt(num));

		if (n % 2 == 0) {
			k = (n / 2) - 1;
			l = (n / 2) - 1;
		} else {
			k = n / 2;
			l = n / 2;
		}

		int[][] array = new int[n][n];
		array[l][k] = i;

		while (i <= num) {
			move++;
			int temp = move;

			// move RIGHT
			while (temp != 0) {
				i++;
				k++;
				if (i > num)	break;
				else array[l][k] = i;
				temp--;
			}
			temp = move;

			// move DOWN
			while (temp != 0) {
				i++;
				l++;
				if (i > num)	break;
				else array[l][k] = i;
				temp--;
			}
			move++;
			temp = move;

			// move LEFT
			while (temp != 0) {
				i++;
				k--;
				if (i > num)	break;
				else array[l][k] = i;
				temp--;
			}temp = move;

			// move UP
			while (temp != 0) {
				i++;
				l--;
				if (i > num)	break;
				else array[l][k] = i;
				temp--;
			}

		}
		///// Printing the values of the ARRAY in the spiral form
		for (l = 0; l < n; l++) {
			for (k = 0; k < n; k++) {
				if (array[l][k] == 0)
					System.out.printf("     ");
				else
					System.out.printf("%-5d", array[l][k]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Spiral.spiralSize(213);

	}
}
