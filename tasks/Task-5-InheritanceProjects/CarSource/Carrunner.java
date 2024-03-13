package com.vehicle;

public class Carrunner{

public static void main(String[] args){

Swift swift=new Swift();
swift.setseats(4);
swift.setairBags(2);
swift.setmodel("Classic1000");
swift.setcolor("Blue");
swift.settype("Hatch");
System.out.println("Swift car details:-");
System.out.println("No of seats: "+swift.getseats());
System.out.println("No of airbags: "+swift.getairBags());
System.out.println("Model: "+swift.getmodel());
System.out.println("Color: "+swift.getcolor());
System.out.println(" ");
SCross scross=new SCross();
scross.setseats(5);
scross.setairBags(2);
scross.setmodel("s1500");
scross.setcolor("White");
scross.setyearOfMake(2016);
scross.setengineNumber("s131291");
scross.settype("Sedan");
System.out.println("SCross car details:-");
System.out.println("No of seats:  "+scross.getseats());
System.out.println("No of airbags: "+scross.getairBags());
System.out.println("Model: "+scross.getmodel());
System.out.println("Color: "+scross.getcolor());
System.out.println("Year of Make: "+scross.getyearOfMake());
System.out.println("Engine Number: "+scross.getengineNumber());
System.out.println("Type: "+scross.gettype());
System.out.println(" ");
XUV xuv=new XUV();
XUV xav=new XUV("sam");
xuv.settype("SUV");
System.out.println("CarTypes available:- ");
cartype(swift);
cartype(scross);
cartype(xuv);
Swift obj=new Swift();
obj.maintenance();
scross.maintenance();
Car a=new SCross();
a.maintenance();
Car b=new Car();
b.maintenance();
move(swift);
Car c=new Swift();
move(c);
move(xuv);
move(scross);

}
public static void cartype(Car car){
System.out.println("Type: "+car.gettype());
}
public static void move(Car ca){
System.out.println("Car is moving");
}
}

