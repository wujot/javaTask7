public class RightTriangle {

    Triangle triangle = new Triangle();

    public boolean isRightTriangle(Triangle triangle) {
        if ((triangle.getSideA() * triangle.getSideA()) + (triangle.getSideB() * triangle.getSideB()) ==
                (triangle.getSideC() * triangle.getSideC())) {
            return true;
        } else if (((triangle.getSideA() * triangle.getSideA()) + (triangle.getSideC() * triangle.getSideC()) ==
                (triangle.getSideB() * triangle.getSideB()))) {
            return true;
        } else if (((triangle.getSideB() * triangle.getSideB()) + (triangle.getSideC() * triangle.getSideC()) ==
                (triangle.getSideA() * triangle.getSideA())))
            return true;
        else
            return false;
    }
}
