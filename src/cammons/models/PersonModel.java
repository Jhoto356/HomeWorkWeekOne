package cammons.models;

import cammons.sources.StringES;

public class PersonModel {
    /** ATTRIBUTES **/
    String name;
    int age;
    char genre;
    double height;

    /** CONSTRUCTOR **/
    public PersonModel (String pName,  int pAge, char pGenre, double pHeight) {
        name = pName;
        age = pAge;
        genre = pGenre;
        height = pHeight;

    }

    /** METHODS **/
    public void sendGreeting() {
        String message = new StringES().

    }

    private void printShortcut(String finalMessage) {
        System.out.println(finalMessage);

    }

}
