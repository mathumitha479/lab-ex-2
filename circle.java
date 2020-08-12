/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author windows
 */
public class circle {
    private double radius;
    private String color;
    
public circle(){
    radius=1.0;
    color="red";
}
public circle(double r){
    radius=r;
    color="red";
}
    
public double getRadius(){
  return radius;
}
public double getArea(){
    return radius*radius*Math.PI;
}

    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println("the circle has radius of" +c1.getRadius());
        System.out.println("area of that circle is " +c1.getArea());
        circle c2=new circle(2.0);
        System.out.println("the circle has radius of" +c2.getRadius());
        System.out.println("area of that circle is" +c2.getArea());

        // TODO code application logic here
    }
    
}
