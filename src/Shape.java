interface Shape {
    void shape();
}

class Circle implements Shape {
    public void shape() {
        System.out.println("Shape circle");
    }
}

class Quad implements Shape {
    public void shape() {
        System.out.println("Shape quad");
    }
}
class Rectangle implements Shape {
    public void shape() {
        System.out.println("Shape rectangle ");
    }
}

class Pentagon implements Shape {
    public void shape() {
        System.out.println("Shape pentagon");
    }
}
class Hexagon implements Shape {
    public void shape() {
        System.out.println("Shape hexagon");
    }
}


class ShapeName {
    public void shape(Shape shape) {
        shape.shape();
    }
}

class ShapeNameTest {
    public static void main(String[] args) {
        new ShapeName().shape(new Circle());
        new ShapeName().shape(new Quad());
        new ShapeName().shape(new Rectangle());
        new ShapeName().shape(new Pentagon());
        new ShapeName().shape(new Hexagon());
    }
}
