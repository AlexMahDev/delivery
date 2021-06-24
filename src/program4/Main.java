package program4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        TextConverter textConverter = new TextConverter();
        Delivery delivery = new Delivery();
        DeliveryArea area = new DeliveryArea();
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();

        /*
        checkDeliveryArea:
        принимает список координат, размер поля по X, размер поля по Y.
        возвращает новый список без координат, которые не входят в зону доставки.
        */

        ArrayList<ArrayList<Integer>> listOfCoordinates = area.checkDeliveryArea(textConverter.textToList(data), textConverter.getSquareX(), textConverter.getSquareY());

        delivery.toDeliver(listOfCoordinates);

    }
}

