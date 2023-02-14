package cammons.models;

public class TriangleModel {
    /** ATTRIBUTES **/
    double height;
    double base;

    /** CONSTRUCTOR **/
    public TriangleModel(double pHeight, double pBase) {
        height = pHeight;
        base = pBase;

    }

    /** METHODS **/
    public String calculateArea() {
        double area = (base * height)/2;
        return String.valueOf(area);

    }

}
