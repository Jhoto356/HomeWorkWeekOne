package cammons.models;

import cammons.sources.StringES;

public class PrintHelloWorld {
    /** ATTRIBUTES **/
    int quantity = 0;
    StringES stringES = new StringES();

    /** CONSTRUCTOR **/
    public  PrintHelloWorld(int pQuantity) {
        quantity = pQuantity;

    }

    /** METHODS **/
    public void printHelloWorld() {
        if (quantity > 0) {
            for (int i = 1; i <= quantity; i++) {
                stringES.printShortcut("Hello, World!!");

            }
            return;

        }
        stringES.printShortcut("Upps, el numero es menor o igual a 0");


    }


}
