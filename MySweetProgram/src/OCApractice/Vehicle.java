package OCApractice;

class Vehicle {

String type = "4W";

int maxSpeed = 100;

Vehicle(String type, int maxSpeed) {

this.type = type;

this.maxSpeed = maxSpeed;

}

}

 

class Car extends Vehicle {

String trans;

Car(String trans) {// Line n1 Implicit super constructor Vehicle() is undefined. Must explicitly invoke another constructor

this.trans = trans;

}

Car(String type, int maxSpeed, String trans) {

super(type, maxSpeed);

this(trans);      // Line n2 Constructor call must be the first statement in a constructor

}

public static void main(String[] args) {

 Car  c1 =  new  Car("Auto");

Car  c2 =  new  Car("4W" ,  150 ,  "Manual");

System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);

System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

        }

}