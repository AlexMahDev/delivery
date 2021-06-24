package program4;

import java.util.ArrayList;

public class DeliveryArea {

    ArrayList<ArrayList<Integer>> newListOfCoordinates = new ArrayList<>();

    ArrayList<ArrayList<Integer>> checkDeliveryArea(ArrayList<ArrayList<Integer>> listOfCoordinates, int squareX, int squareY) {
        for (int i = 0; i < listOfCoordinates.size(); i++) {
            if (listOfCoordinates.get(i).get(0) <= squareX && listOfCoordinates.get(i).get(1) <= squareY) {
                newListOfCoordinates.add(listOfCoordinates.get(i));
            } else {
                System.out.println("Доставка в точку (" + listOfCoordinates.get(i).get(0) + "," + listOfCoordinates.get(i).get(1) + ") не осуществляется!");
            }
        }
        return newListOfCoordinates;
    }

}
