public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5,"red");
        System.out.println(myCircle.toString());

        Cylinder myCylinder = new Cylinder(10,"blue",4);
        System.out.println(myCylinder.toString());

        Circle testCylinder = new Cylinder(2,"orange",5);
        System.out.println(testCylinder.toString());

    }
}
