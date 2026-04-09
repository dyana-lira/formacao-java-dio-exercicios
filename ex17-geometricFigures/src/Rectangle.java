public record Rectangle(double heigth, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return heigth * base;
    }

}
