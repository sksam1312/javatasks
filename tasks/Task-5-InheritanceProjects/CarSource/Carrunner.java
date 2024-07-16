package com.vehicle;

public class CarRunner{

public static void main(String[] args){
try {
Swift swift=new Swift();
swift.setSeats(4);
swift.setAirBags(2);
swift.setModel("Classic1000");
swift.setColor("Blue");
swift.setType("Hatch");
System.out.println("Swift car details:-");
System.out.println("No of seats: "+swift.getSeats());
System.out.println("No of airbags: "+swift.getAirBags());
System.out.println("Model: "+swift.getModel());
System.out.println("Color: "+swift.getColor());
System.out.println(" ");
SCross scross=new SCross();
scross.setSeats(5);
scross.setAirBags(2);
scross.setModel("s1500");
scross.setColor("White");
scross.setYearOfMake(2016);
scross.setEngineNumber("s131291");
scross.setType("Sedan");
System.out.println("SCross car details:-");
System.out.println("No of seats:  "+scross.getSeats());
System.out.println("No of airbags: "+scross.getAirBags());
System.out.println("Model: "+scross.getModel());
System.out.println("Color: "+scross.getColor());
System.out.println("Year of Make: "+scross.getYearOfMake());
System.out.println("Engine Number: "+scross.getEngineNumber());
System.out.println("Type: "+scross.getType());
System.out.println(" ");
XUV xuv=new XUV();
xuv.setSeats(7);
xuv.setAirBags(5);
xuv.setModel("Classic1000");
xuv.setColor("Black");
xuv.setType("SUV");
carType(swift);
move(swift);
System.out.println(scross.maintenance());
Car cr=new SCross();
System.out.println(cr.maintenance());
Car carr=new Car();
System.out.println(carr.maintenance());
System.out.println(swift.maintenance());
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
}
}


public static void carType(Car car){
if(car instanceof Swift) {
System.out.println("Type: "+car.getType());
}
else if(car instanceof SCross){
System.out.println("Type: "+car.getType());
}
else if(car instanceof XUV){
System.out.println("Type: "+car.getType());
}
}


public static void move(Swift swift){
System.out.println("Swift is moving");
}

}

