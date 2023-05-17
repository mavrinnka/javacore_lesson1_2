package ua.lviv.lgs;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		// 1		
				boolean a = true;
				char b = 'c';
				byte c = 127;
				short d = 1024;
				int e = -1024000;
				long f = 1234567890;
				float g = 23.45f;
				double h = -45.67;
				
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				System.out.println("d = " + d);
				System.out.println("e = " + e);
				System.out.println("f = " + f);
				System.out.println("g = " + g);
				System.out.println("h = " + h);
				
//			2
				System.out.println();
//				System.out.println("Boolean max = " + Boolean.); у типу Boolean немає таких значень
				System.out.println("Character min = '" + Character.MIN_VALUE + "' max = '" + Character.MAX_VALUE + "'");
				System.out.println("Byte min = " + Byte.MIN_VALUE + " max = " + Byte.MAX_VALUE);
				System.out.println("Short min = " + Short.MIN_VALUE + " max = " + Short.MAX_VALUE);
				System.out.println("Integer min = " + Integer.MIN_VALUE + " max = " + Integer.MAX_VALUE);
				System.out.println("Long min = " + Long.MIN_VALUE + " max = " + Long.MAX_VALUE);
				System.out.println("Float min = " + Float.MIN_VALUE + " max = " + Float.MAX_VALUE);
				System.out.println("Double min = " + Double.MIN_VALUE + " max = " + Double.MAX_VALUE);
				
		// 3
				System.out.println();
				int[] array = new int[10];
				Random random = new Random();
				for(int i = 0; i < array.length; i++)
					array[i] = random.nextInt();
				
				int min = 0;
				int max = 0;
				System.out.print("Array: ");
				for(int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
					if(array[i] < min)
						min = array[i];
					if(array[i] > max)
						max = array[i];
				}
				System.out.println();
				
				System.out.println("min = " + min);
				System.out.println("max = " + max);
	

	}

}
