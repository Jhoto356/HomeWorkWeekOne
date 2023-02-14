package cammons.models;

import cammons.sources.StringES;

public class PersonModel {
    /** ATTRIBUTES **/
    String name;
    int age;
    String genre;
    double height;
    StringES stringES = new StringES();

    /** CONSTRUCTOR **/
    public PersonModel (String pName,  int pAge, String pGenre, double pHeight) {
        name = pName;
        age = pAge;
        genre = pGenre;
        height = pHeight;

    }

    /** METHODS **/
    public void sendGreeting() {
        String onePart = stringES.txtMyName;
        String twoPart = name;
        String threePart = stringES.txtMyAge;
        String fourPart = String.valueOf(age);
        String fivePart = stringES.txtMyGenre;
        String sixPart = genre;
        String sevenPart = stringES.txtMyHeight;
        String eightPart = String.valueOf(height);
        String message = onePart + twoPart + threePart + fourPart + stringES.txtYear + fivePart + sixPart + sevenPart + eightPart + ".";
        stringES.printShortcut(message);

    }

}
