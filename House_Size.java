//By John Luo
//How Big?
//March 1st, 2015

import java.util.Scanner;
public class House_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors do you want in your house?");
		int how_big = scan.nextInt();
		
		if (how_big == 1) {
			System.out.println(" + \n|_|");
			System.exit(0);
		}
		
		int size = (how_big-1) * 2;
		int value = size/2;
		String space = "";
		for (int i = 1; i <= value; i++) {
			space = " " + space;
		}
		StringBuilder roof = new StringBuilder(space + "+" + space);
		// first roof
		System.out.println(roof);
		// constructs the rest of the roof
		for (int i = 1; i <= value; i++) {
			// rest of the roofs (Replaces the initial plus symbol in the lower
			// levels with space and moving the plus symbols to their
			// appropriate spots)
			roof.setCharAt(value, ' ');
			roof.setCharAt(value - i, '+');
			if (i == value) {
				for (int j = 1; j < size; j++) {
					roof.replace(j, j, "-");
				}
			}
			roof.setCharAt(value + i, '+');
			System.out.println(roof);
			// deletes the previous symbols so the new string can be constructed
			// into a new roof level
			roof.setCharAt(value - i, ' ');
			roof.setCharAt(value + i, ' ');
		}
		
		//now everything below the roof
		String floor = "";
		if(size % 2 == 0) {
			for (int i = 2; i <= size; i++) {
				floor = "_" + floor;
			}
			StringBuilder level = new StringBuilder("|" + (floor) + "|");
			//print level and floor
			for (int i = 0; i < value+1; i++) {
				System.out.println(level);
			}	
		}
		else {
			for (int i = 2; i < size; i++) {
				floor = "_" + floor;
			}
			StringBuilder level = new StringBuilder("|" + (floor) + "|");
			//print level and floor
			for (int i = 0; i < value+1; i++) {
				System.out.println(level);
			}	
		}

}
}