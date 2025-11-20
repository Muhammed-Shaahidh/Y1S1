/*
Write a Java program that calculates the length of the hypotenuse of a right triangle
 when two other sides are known (assume Side A = 3 and Side B = 4).
 *Hint: Hypotenuse = square root (SideA² + SideB²)
 */

public class IT24610823Lab2Q3{
public static void main(String []args){

double side_A, side_B, hypotenuse;

side_A= 3;
side_B= 4;

hypotenuse= Math.sqrt(Math.pow(side_A, 2)+Math.pow(side_B, 2));

System.out.println("Length of the hypotenus:"+hypotenuse);

}

}

