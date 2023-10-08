package practice;




abstract class Shape{
    public abstract double getArea(int i);

    public abstract double getArea(int l, int b);
}

class Circle extends Shape {
    public double getArea(int r){
        return (float) (3.14*r*r);
    }

    @Override
    public double getArea(int l, int b) {
        return 0;
    }

}

class Square extends Shape {
    @Override
    public double getArea(int i) {
        return 0;
    }

    public double getArea(int l, int b){
        return l*b;
    }

}

class ShapeFactory{
    public Shape getShapeElement(String shape){
        return shape.equalsIgnoreCase("circle") ? new Circle() : new Square();
    }
}

public class DependancyInjection {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShapeElement("circle"); // that is the method of dependancy injecttion throuh which if we want
        // to find area of any shape we can easil find by getting object of that Shape ex - circle or square or whatever
        System.out.println(shape.getArea(5));


        Shape shape1 = shapeFactory.getShapeElement("square");
        System.out.println(shape1.getArea(5, 6));

    }
}
