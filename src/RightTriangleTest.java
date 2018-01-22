public class RightTriangleTest {

    public static void main(String[] args) {

        RightTriangle rightTriangle = new RightTriangle();

        Triangle triangle1 = new Triangle();
        triangle1.setSideA(2);
        triangle1.setSideB(2);
        triangle1.setSideC(3);

        Triangle triangle2 = new Triangle();
        triangle2.setSideA(3);
        triangle2.setSideB(4);
        triangle2.setSideC(5);

        // check frist traingle
        if(rightTriangle.isRightTriangle(triangle1) == true) {
            System.out.println("Is right trinagle.");
        }else {
            System.out.println("Is not right triangle.");
        }

        // check second triangle
        if(rightTriangle.isRightTriangle(triangle2) == true) {
            System.out.println("Is right trinagle.");
        }else {
            System.out.println("Is not right triangle.");
        }
    }
}
