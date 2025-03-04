package com.kunal;

import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter b & h: ");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double area=b*h;
        //lengths of two adj sides
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double perimeter=2*(s1+s2);
        System.out.println("area: "+area);
        System.out.println("perimeter: "+perimeter);
    }
}
/*rhombus 4 sides equal length
perimeter=4*s;
area=0.5*d1*d2;//using diagonals
area=b*h//using base and height base=side=s
//equi triangle
a=(Math.sqrt(3)/4)*s*s
when h is known
a=0.5*s*h;
h=(Math.sqrt(3)/2)*s
p=3s

//square
p=4s
a=s*s

//cone vol=(1/3)*3.14*r*r*h
//prism vol=basearea*h //base are is area of the base
//cylinder vol=3.14*r*r*h
//spheree vol=(4/3)*3.14*r*r*r
//vol of pyramid=1/3*base area*h
//csa of cylinder=2*3.14*r*h
//tsa of cube=6*s*s



 */
