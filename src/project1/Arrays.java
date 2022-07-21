package project1;

public class Arrays {
	

		public static void main(String[] args) {
            //array
			int array[][]= {{4,5,6},{7,8,9},{10,21,12}};
			System.out.println("Let's print Elements");


			for(int row=0; row<3;row++) {

				for(int col=0; col<3; col++) {

					System.out.print(array[row][col]+"\t");
				}

				System.out.println();

			}

		}





	}