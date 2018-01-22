public class RightTriangle {

    Triangle triangle = new Triangle();

    public boolean isRightTriangle(Triangle triangle) {
        if((triangle.getSideA() * triangle.getSideA()) + (triangle.getSideB() * triangle.getSideB()) ==
                (triangle.getSideC() * triangle.getSideC())) {
            return  true;
        }else {
            return false;
        }
    }
}
