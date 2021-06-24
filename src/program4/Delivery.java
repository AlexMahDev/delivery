package program4;

import java.util.ArrayList;
import java.util.Collections;

public class Delivery {

    /*
    (currentX, currentY) - координата, где находится робот.
    minDistanceIndex - индекс ближайшей точки до робота.
    */

    private int currentX = 0;
    private int currentY = 0;
    private int minDistanceIndex = 0;

    private ArrayList<Double> listOfDistances = new ArrayList<>();

    Direction direction = new Direction();

    void toDeliver(ArrayList<ArrayList<Integer>> listOfCoordinates) {
        while(!listOfCoordinates.isEmpty()) {
            /*Находим расстояние от робота до всех точек и заполняем список расстояний*/
            for (int i = 0; i < listOfCoordinates.size(); i++) {
                double distance = Math.sqrt(Math.pow((listOfCoordinates.get(i).get(0) - currentX), 2) + Math.pow((listOfCoordinates.get(i).get(1) - currentY), 2));
                listOfDistances.add(distance);
            }
            minDistanceIndex = listOfDistances.indexOf(Collections.min(listOfDistances));
            direction.checkDirection(currentX, currentY, listOfCoordinates.get(minDistanceIndex).get(0), listOfCoordinates.get(minDistanceIndex).get(1));
            currentX = listOfCoordinates.get(minDistanceIndex).get(0); //координата нового расположения робота по X.
            currentY = listOfCoordinates.get(minDistanceIndex).get(1); //координата нового расположения робота по Y.
            listOfCoordinates.remove(minDistanceIndex); //освобождаем список от координаты, в которую доставка была осуществлена.
            listOfDistances.clear(); //очищаем список дистанций, так как робот уже выбрал ближайшую точку и посетил её.
        }
    }
}
