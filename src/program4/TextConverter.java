package program4;

import java.util.ArrayList;

public class TextConverter {

    /*
    data - введённая строка.
    text - data без пробелов.
    arrayOfString - массив строк, полученный делением строки text на подстроки с разделителем "(".
    squareX и squareY - размер поля по X и Y.
    listOfCoordinates - список координат.
    */

    private String text;
    private String[] arrayOfString;
    private int squareX;
    private int squareY;
    private ArrayList<ArrayList<Integer>> listOfCoordinates = new ArrayList<>();

    public int getSquareX() {
        return squareX;
    }

    public int getSquareY() {
        return squareY;
    }

    ArrayList<ArrayList<Integer>> textToList(String data) {
        text = data.replaceAll("\\s","");
        arrayOfString = text.split("\\(");
        squareX = Character.getNumericValue(arrayOfString[0].charAt(0));
        squareY = Character.getNumericValue(arrayOfString[0].charAt(2));
        for(int i = 1; i<arrayOfString.length; i++) {
            ArrayList<Integer> coordinate = new ArrayList<>();
            coordinate.add(Character.getNumericValue(arrayOfString[i].charAt(0)));
            coordinate.add(Character.getNumericValue(arrayOfString[i].charAt(2)));
            listOfCoordinates.add(coordinate);
        }
        return listOfCoordinates;
    }
}
