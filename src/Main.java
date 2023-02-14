import cammons.models.PersonModel;
import cammons.models.PrintHelloWorld;
import cammons.models.TriangleModel;
import cammons.sources.StringES;

public class Main {
    public static void main(String[] args) {
        StringES stringES = new StringES();

        PersonModel personOne = new PersonModel("Jhonatan", 21, "hombre", 1.73);
        personOne.sendGreeting();

        stringES.printShortcut("\n");

        TriangleModel triangleOne = new TriangleModel(4.6, 5.8);
        stringES.printShortcut(new StringES().txtTriangleArea + triangleOne.calculateArea());

        stringES.printShortcut("\n");

        PrintHelloWorld printHelloWorld = new PrintHelloWorld(5);
        printHelloWorld.printHelloWorld();

    }

}