package program4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        TextConverter textConverter = new TextConverter();
        Delivery delivery = new Delivery();
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();

        ArrayList<ArrayList<Integer>> listOfCoordinates = textConverter.textToList(data);
        System.out.println(listOfCoordinates);


        delivery.toDeliver(listOfCoordinates);

    }
}

