/*
The perimeter of a rectangular fence is known (assume it is 100). If the width of the
 fence is ¾ the size of the length of the fence.
 
 Write a Java program to determine the width and length of the fence.
 *Hint: Perimeter of a Rectangle = 2 * (length + width)
*/

public class IT24610823Lab2Q1{
public static void main(String[]args){



double length,width,perimeter;

perimeter=100;
length=2*perimeter/7;
width=3*length/4;
   
   
System.out.println ("length of the fence:"+length);
System.out.println ("width of the fence:"+width);

}

}