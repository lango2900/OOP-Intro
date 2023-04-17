public class Main {
    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // ex: (phone, desk, computer, coffee cup)

        // an object uses a class

        // constructing class:

        Car myCar1 = new Car();
        System.out.println(myCar1.make);
        // System.out.println(myCar1.model);
        // System.out.println(myCar1.year);
        // System.out.println(myCar1.color);
        // System.out.println(myCar1.price);

        // myCar.drive();
        // myCar.brake();



        // using Car class to make new objects - both corvettes | car class is a blueprint for blue corvettes
        Car myCar2 = new Car();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);


    }
}