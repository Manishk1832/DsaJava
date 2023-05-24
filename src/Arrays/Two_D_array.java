package Arrays;

public class Two_D_array {
    public static void main(String[] args) {
      int[][]mat = new int[5][3];
        System.out.println(mat);
        System.out.println(mat.length);
        System.out.println(mat[0]);
        System.out.println(mat[1]);
        System.out.println(mat[2]);
        System.out.println(mat[3]);
        System.out.println(mat[4]);
        System.out.println(mat[0].length);

        mat[0][0] = 10;
        mat[0][1] = 20;
        mat[0][2] = 30;

        for(int[] row : mat){
            for (int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();

        }
        System.out.println("=================");
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length;col++){
                System.out.print(mat[row][col] +"  ");
            }
            System.out.println();
        }


    }
}
