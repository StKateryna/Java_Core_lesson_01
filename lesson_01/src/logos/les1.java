package logos;

import java.net.ServerSocket;

public class les1 {
	public static void main(String[] args) {
		

byte num1 = 3;
short num2 = 200;
int num3 = 3650;
long num4 = 1000000L;
char sign = '£';
double num5 = 276.95; 
float pi = 3.14F;
boolean result = true;

System.out.println("ПРИМІТИВНІ ТИПИ ДАНИХ");
System.out.println("byte - " + num1);
System.out.println("short - " + num2);
System.out.println("int - " + num3);
System.out.println("long - " + num4);
System.out.println ("double - " + num5);
System.out.println ("float - " + pi);
System.out.println ("boolean - " + result);
System.out.println ("char - " + sign);

System.out.println("НАЙБІЛЬШЕ І НАЙМЕНШЕ ЧИСЛО З ДВОХ");
System.out.println("Найбільше число - " + Math.max(num4, num5));
System.out.println("Найменше число - " + Math.min(num3, pi));

System.out.println("MAX/MIN WRAPPERS");
System.out.print("Byte: " + Byte.MIN_VALUE);
System.out.println(" - " + Byte.MAX_VALUE);
System.out.print("Short: " + Short.MIN_VALUE);
System.out.println(" - " + Short.MAX_VALUE);
System.out.print("Integer: " + Integer.MIN_VALUE);
System.out.println(" - " + Integer.MAX_VALUE);
System.out.print("Long: " + Long.MIN_VALUE);
System.out.println(" - " + Long.MAX_VALUE);
System.out.print("Double: " + Double.MIN_VALUE);
System.out.println(" - " + Double.MAX_VALUE);
System.out.print("Float: " + Float.MIN_VALUE);
System.out.println(" - " + Float.MAX_VALUE);



int[] array = new int[10];
array[0] = 10;
array[1] = 45;
array[2] = 91;
array[3] = 13;
array[4] = 19;
array[5] = 3;
array[6] = 108;
array[7] = 63;
array[8] = 20;
array[9] = 29;

System.out.println("MAСИВ");
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}

int min = array[0];
int max = array[0];

for(int i = 0; i < array.length; i++) {
if(array[i] < min) {
	min = array[i];
}
if(array[i] > max) {
	max = array[i];
}
}
System.out.println("MAX/MIN МАСИВУ");
System.out.println("Min Value = " + min);        
System.out.println("Max Value = " + max);
}
}

