package Arrays;

public class WavePrint {
    public static void main(String[] args) {
        int [][]mat = {{11, 12, 13, 14 },
                            {21,22,23,24},
                            {31,32,33,34},
                            {41,42,43,44}};

        wave(mat);
    }

    public static void  wave(int[][]mat){
        for(int col = 0; col<mat[0].length;col++) {
            for (int row = 0; row < mat.length; row++) {
               int row_tp = row;
//                if(col%2==1){
//                    row_tp = mat.length-1-row;
//                }
                System.out.print(mat[row_tp][col] + " ");
            }
            System.out.println("==");
        }
    }
}
