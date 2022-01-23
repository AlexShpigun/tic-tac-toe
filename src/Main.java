public class Main {
    public static void main(String[] args) {
        int[][] gameField = {
                {1, 2, 2},
                {1, 1, 2},
                {1, 2, 2} };


        if ((gameField[0][0] == 1 && gameField[1][1] == 1 && gameField[2][2] == 1) || (gameField[0][2] == 1 && gameField[1][1] == 1 && gameField[2][0] == 1)) {

            System.out.println("winner winner");
        } else if ((gameField[0][0] == 2 && gameField[1][1] == 2 && gameField[2][2] == 2) || (gameField[0][2] == 2 && gameField[1][1] == 2 && gameField[2][0] == 2)) {
            System.out.println("noup");
        } else {
            System.out.println("draw");
        }

        /*---------------------------------------------------------------------*/
        if ((gameField[0][1] == 2 && gameField[1][1] == 2 && gameField[2][1] == 2 || (gameField[1][0] == 2 && gameField[1][1] == 2 && gameField[1][2] == 2))) {
            System.out.println("winner winner chicken dinner");
        } else if ((gameField[0][1] == 1 && gameField[1][1] == 1 && gameField[2][1] == 1 || (gameField[1][0] == 1 && gameField[1][1] == 1 && gameField[1][2] == 1))) {
            System.out.println("noup again");
        } else {
            System.out.println("draw again");
        }

    }
}

