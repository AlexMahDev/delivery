package program4;

import java.util.ArrayList;

public class TextConverter {

    private String text;
    private String[] arrayOfString;
    private int squareX;
    private int squareY;
    private ArrayList<ArrayList<Integer>> listOfCoordinates = new ArrayList<ArrayList<Integer>>();

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
        for(int i = 0; i<arrayOfString.length-1; i++) {
            ArrayList<Integer> coordinate = new ArrayList<Integer>();
            coordinate.add(Character.getNumericValue(arrayOfString[i + 1].charAt(0)));
            coordinate.add(Character.getNumericValue(arrayOfString[i + 1].charAt(2)));
            listOfCoordinates.add(coordinate);
        }
        return listOfCoordinates;
    }
}
