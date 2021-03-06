package program4;

public class Direction {
    Movement move = new Movement();
    void checkDirection(int currentX, int currentY, int coordinateX, int coordinateY) {

        /*
        (currentX, currentY) - координата, где находится робот.
        (coordinateX, coordinateY) - ближайшая к роботу координата, куда нужно доставить.
        */

        int directionX = coordinateX - currentX;
        int directionY = coordinateY - currentY;

        if(directionX>0) {
            move.moveRight(Math.abs(directionX));
        } else if (directionX<0) {
            move.moveLeft(Math.abs(directionX));
        }

        if(directionY>0) {
            move.moveUp(Math.abs(directionY));
        } else if (directionY<0) {
            move.moveDown(Math.abs(directionY));
        }

        move.leavePizza();

    }
}


