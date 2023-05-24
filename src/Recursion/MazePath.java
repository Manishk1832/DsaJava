package Recursion;

public class MazePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        PrintPath(m-1,n-1,0,0,"");
    }
    public static void PrintPath(int end_row,int end_col,int currRow,int currCol,String ans ){
        if(currCol==end_col && currRow==end_row){
            System.out.print(ans+" ");
            return;
        }
        if (currCol>end_col||currRow>end_row){
            return;
        }
         PrintPath(end_row,end_col,currRow,currCol+1,ans+"H");
        PrintPath(end_row,end_col,currRow+1,currCol,ans+"V");
    }
}
