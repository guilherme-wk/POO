import java.util.Scanner;   

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercicios ex = new Exercicios();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
            ex.classificarNumero(sc);
                break;
            case 2:
            ex.manipularNumeros(sc);
                break;
            case 3:
            ex.lerPalavras(sc);
                break;
            case 4:
            ex.calcularMDC(sc);
                break;
            case 5:
            ex.somarNumeros(sc);
                break;
            default:
                return;
        }
    }
}


class Exercicios {
    public void classificarNumero(Scanner sc){
        int n = sc.nextInt();

        if (n > 10){
            System.out.println("MAIOR");
        }else{
        System.out.println("MENOR");
        }
    }
    public void manipularNumeros(Scanner sc){
        int n = sc.nextInt();   

        if(n % 2 == 0){
            n = n * 5;
        }
        if(n % 3 == 0){
            n = n - 1;
        }
        System.out.println(n);

    }
    public void lerPalavras(Scanner sc){
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] palavras = new String[n];
        for(int i = 0; i < n; i++){
            palavras[i] = sc.nextLine();
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(palavras[i] + " ");
        }
        System.out.println();
    }
    public void calcularMDC(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (m != 0) {
        int temp = m;
        m = n % m;
        n = temp;
    }
    System.out.println(n);
    }
    
    public void somarNumeros(Scanner sc){
        int soma = 0;

        while (sc.hasNextInt()) {
            soma += sc.nextInt();
        }
        
        System.out.println(soma);
    }
}