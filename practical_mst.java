import java.util.*;

public class practical_mst {

    static int row = 0;
    static int col = 0;

    public static void add_mat(int m1[][] , int m2[][] , int addition[][]){
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                int res = m1[i][j] + m2[i][j];
                addition[i][j] = res;
            }
        }
    }

    public static void sub_mat(int m1[][] , int m2[][] , int subtraction[][]){
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                int res = m1[i][j] - m2[i][j];
                subtraction[i][j] = res;
            }
        }
    }

    public static void print_mat(int mat[][]){

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix: ");
        row = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        col = sc.nextInt();
        
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int addition[][] = new int[row][col];
        int subtraction[][] = new int[row][col];

        System.out.println("Enter Matrix 1 Values: " );

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.printf("Enter value for row -> %d , column -> %d : " , i+1 , j+1);
                int value = sc.nextInt();
                matrix1[i][j] = value;
            }
        }

        System.out.println("Enter Matrix 2 Values: " );
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.printf("Enter value for row -> %d , column -> %d : " , i+1 , j+1);
                int value = sc.nextInt();
                matrix2[i][j] = value;
            }
        }

        sc.close();

        add_mat(matrix1 , matrix2 , addition);

        sub_mat(matrix1 , matrix2 , subtraction);

        System.out.println("Matrix after Addition is: ");
        print_mat(addition);

        System.out.println("Matrix after Subtraction is: ");
        print_mat(subtraction);

    }

}
