import java.util.Scanner;  
import java.util.Arrays; 

public class Exercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercicios ex = new Exercicios();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
            ex.ordenarNumeros(sc);
                break;
            case 2:
            ex.matriz(sc);
                break;
            case 3:
            ex.determinante(sc);
                break;
            case 4:
            ex.somaMatriz(sc);
                break;
            case 5:
            ex.multMatriz(sc);
                break;
            default:
                return;
        }
    }
}


class Exercicios {
    public void ordenarNumeros (Scanner sc){
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for(int i = 0; i < n; i++){
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        for(int elemento: numeros){
            System.out.print(elemento + " ");
        }
    }

    public void matriz (Scanner sc){
        int n = sc.nextInt();   
        int m = sc.nextInt();
        int mat[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int n1 = sc.nextInt();
                mat[i][j] = n1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }




    }
    public void determinante (Scanner sc){
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int det = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int n1 = sc.nextInt();
                mat[i][j] = n1;
            }
        }
        if (mat.length == 1) {
            det = mat[0][0];
            } else if (mat.length == 2) {
            det = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
            } else if (mat.length == 3) {
            det = mat[0][0] * mat[1][1] * mat[2][2]
            + mat[0][1] * mat[1][2] * mat[2][0]
            + mat[0][2] * mat[1][0] * mat[2][1]
            - mat[0][2] * mat[1][1] * mat[2][0]
            - mat[0][0] * mat[1][2] * mat[2][1]
            - mat[0][1] * mat[1][0] * mat[2][2];
        }

        System.out.println(det);



    }
    public void somaMatriz(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat1[][] = new int[n][m];
        int mat2[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int n1 = sc.nextInt();
                mat1[i][j] = n1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int n1 = sc.nextInt();
                mat2[i][j] = n1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j <  m;j++){
                int soma = mat1[i][j] + mat2[i][j];
                System.out.print(soma + " ");
            }
            System.out.print("\n");
        }

    }

    public void multMatriz(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        int mat2[][] = new int[m][n];
        int mat3[][] = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++){
                int n1 = sc.nextInt();
                mat[i][j] = n1;
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++){
                int n1 = sc.nextInt();
                mat2[i][j] = n1;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                for (int k=0; k<m; k++) {
                        mat3[i][j] += mat[i][k]*mat2[k][j];
                    }
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
        
    }

}
