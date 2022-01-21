public class Main {
    public static void main(String[] args) {

        int[] line1 = {1, 2, 2};
        int[] line2 = {2, 1, 1};
        int[] line3 = {1, 2, 0};

        if ((line1[0] == 1 && line2[1] == 1 && line3[2] == 1) || (line1[2] == 1 && line2[1] == 1 && line3[0] == 1)) {

            System.out.println("winner winner");
        } else if ((line1[0] == 2 && line2[1] == 2 && line3[2] == 2) || (line1[2] == 2 && line2[1] == 2 && line3[0] == 2)) {
            System.out.println("noup");
        }else {
            System.out.println("draw");
        }

        /*---------------------------------------------------------------------*/
        if ((line1[1] == 2 && line2[1] == 2 && line3[1] == 2 || (line2[0] == 2 && line2[1] == 2 && line2[2] == 2))){
            System.out.println("winner winner chicken dinner");
        } else if ((line1[1] == 1 && line2[1] == 1 && line3[1] == 1 || (line2[0] == 1 && line2[1] == 1 && line2[2] == 1))){
            System.out.println("noup again");
        }else {
            System.out.println("draw again");
        }

    }
}

