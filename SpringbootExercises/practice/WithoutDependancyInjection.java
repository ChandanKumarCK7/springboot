package practice;





class Circle1  {
    public double getArea(int r){
        return (float) (3.14*r*r);
    }

}

class Square1  {
    public double getArea(int l, int b){
        return l*b;
    }

}

public class WithoutDependancyInjection {
    public static void main(String[] args){
        Square1 sqaure1 = new Square1();
        System.out.println(sqaure1.getArea(5, 6));

        Circle1 circle1 = new Circle1();
        System.out.println(circle1.getArea(5));  // problem with the approach is that whenever u want to find area of circle

        // u have to manually create circle object and then with that only u can invoke APIs in realtime, creating an object
        // can be troublesome if it requires too many parameters so with dependancy injection we tell what object we want and get that

        // object and use that in the program


    }
}
