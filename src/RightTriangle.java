public class RightTriangle {

    Triangle triangle = new Triangle();

    public boolean isRightTriangle(double sideA, double sideB, double sideC) {
        if((sideA * sideA) + (sideB * sideB) == (sideC * sideC)) {
            return  true;
        }else {
            return false;
        }
    }
}
