package Encapsulation_Exercise.ClassBoxDataValidation;

import java.security.InvalidParameterException;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        this.validateSide("Length", length);
        this.length = length;
    }

    private void setWidth(double width) {
        this.validateSide("Width", width);
        this.width = width;
    }

    private void setHeight(double height) {
        this.validateSide("Height", height);
        this.height = height;
    }

    private void validateSide(String fieldName, double size) {
        if(size <= 0) {
            throw new InvalidParameterException(fieldName + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea () {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume () {
        return this.height * this.length * this.width;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume – %.2f",
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }
}
