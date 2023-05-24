package Stack_and_Queue.Questions;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][]mat = new  int[n][n];
        for (int i = 0 ; i<mat.length; i++){
            for (int j = 0; j<mat[0].length; j++){
                mat[i][j] = scn.nextInt();
            }
        }

//        int[][]arr = {{0,0,1,0},{ 0,0 ,1 ,0},{0,0,0 ,0},{0, 0, 1, 0} };
        Celebrity(mat);


    }

    private static void Celebrity(int[][] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(i);

        }
        while (s.size()>1){
            int a = s.pop();
            int b = s.pop();
            if(arr[a][b]==1){
                s.push(b);
            }
            else {
                s.push(a);
            }
        }
        int candidate = s.pop();
        for (int i = 0; i <arr.length ; i++) {
            if(i!=candidate && (arr[candidate][i]==1||arr[i][candidate]==0)){
                System.out.print("No Celebrity");
            }

        }
        System.out.println(candidate);
    }
}
