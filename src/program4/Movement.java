package program4;

public class Movement {
    void moveUp(int times) {
        for(int i = 0; i < times; i++)
            System.out.print("N");
    }
    void moveDown(int times) {
        for(int i = 0; i < times; i++)
            System.out.print("S");
    }
    void moveRight(int times) {
        for(int i = 0; i < times; i++)
            System.out.print("E");
    }
    void moveLeft(int times) {
        for(int i = 0; i < times; i++)
            System.out.print("W");
    }
    void leavePizza() {
        System.out.print("D");
    }
}
