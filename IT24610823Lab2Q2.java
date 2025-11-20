/*
A rope is used to create a square fence. The length of a side of the square is known
 (assume it is 10). Later this same rope is used to create a circular fence.
 
 Write a Java program to find the radius of the circular fence.
 *Hint: Perimeter of a Square = 4 * length
 Circumference of Circle = 2 * PI * Radius
 PI = 22/7 = 3.14
 */

public class IT24610823Lab2Q2{
public static void main(String[]args){

double length,radius,PI;

length=10;
PI= 3.14;

radius=(4*length)/(2*PI);


System.out.println ("Radius of circular fence:"+radius);

}

}


