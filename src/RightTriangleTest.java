public class RightTriangleTest {

    public static void main(String[] args) {

        RightTriangle rightTriangle = new RightTriangle();

        Triangle triangle1 = new Triangle();
        triangle1.setSideA(13);
        triangle1.setSideB(12);
        triangle1.setSideC(5);

        Triangle triangle2 = new Triangle();
        triangle2.setSideA(3);
        triangle2.setSideB(4);
        triangle2.setSideC(5);

        Triangle triangle3 = new Triangle();
        triangle3.setSideA(5);
        triangle3.setSideB(7);
        triangle3.setSideC(12);

        // check frist traingle
            if(rightTriangle.isRightTriangle(triangle1)) {
            System.out.println("Is right trinagle.");
        }else {
            System.out.println("Is not right triangle.");
        }

        // check second triangle
        if(rightTriangle.isRightTriangle(triangle2)) {
            System.out.println("Is right trinagle.");
        }else {
            System.out.println("Is not right triangle.");
        }

        // check thirth triangle
        if(rightTriangle.isRightTriangle(triangle3)) {
            System.out.println("Is right trinagle.");
        }else {
            System.out.println("Is not right triangle.");
        }
    }
}
