import java.util.Scanner;
import java.util.ArrayList;

public class rangel{

    public static void main(String[] args) {
        Scanner var_ = new Scanner(System.in);
        Integer opc = var_.nextInt();
        
        
        switch(opc){
            case 1:
                //System.out.println("+--- OPC 1 ---+");
                //System.out.print("Número: ");
                Scanner var1 = new Scanner(System.in);
                int n1 = var1.nextInt();
                
                if(n1 > 10){
                    System.out.println("MAIOR");
                }
                else{
                    System.out.println("MENOR");
                }
                
                var1.close(); 
                break;
            
            case 2:
                //System.out.println("+--- OPC 2 ---+");
                Scanner var2 = new Scanner(System.in);
                int n2 = var2.nextInt();
                
                if(n2%2 == 0){
                    n2 = n2 * 5;
                }
                if(n2%3 == 0){
                    n2 = n2 - 1;
                }
                System.out.println(n2);
                
                var2.close(); 
                break;
                
            case 3:
                //System.out.println("+--- OPC 3 ---+");
                
                Scanner var3 = new Scanner(System.in);
                //System.out.print("Quantidade de palavras: ");
                int n3 = var3.nextInt();
                System.out.print("\n");
                
                ArrayList<String> palavras = new ArrayList<>();
                
                for(int i = 0; i < n3; i++){
                
                    Scanner pal = new Scanner(System.in);
                        
                    //System.out.printf("%dª Palavra: ",i+1);
                    String palavra = pal.next();
                    //System.out.print("\n");
                    
                    palavras.add(palavra);
                }
                
                for(int j = (n3-1); j != -1; j--){
                    System.out.print(palavras.get(j)+" ");
                }
                 
                var3.close(); 
                break;
                
            case 4:
                //System.out.println("+--- OPC 4 ---+");
                int mdc = 0;
                
                Scanner v_1 = new Scanner(System.in);
                //System.out.print("1º valor: ");
                int primeiro = v_1.nextInt();
                v_1.close(); 
                
                Scanner v_2 = new Scanner(System.in);
                //System.out.print("2º valor: ");
                int segundo = v_2.nextInt();
                v_2.close(); 
            
                ArrayList<Integer> divisores_1 = new ArrayList<>();

                for(int i = primeiro; i >= 1; i--){
                    if(primeiro%i == 0){
                        divisores_1.add(i);
                    }
                }
                
                for(int j = segundo; j >=1; j--){
                    if(segundo%j == 0){
                        if(divisores_1.contains(j)){
                            mdc = j;
                            break;
                        }
                    }
                }

                System.out.println(mdc);

                break;
                
            case 5:
                //System.out.println("+--- OPC 5 ---+");
                //System.out.print("Valor: ");
                Scanner var5 = new Scanner(System.in);
                int acul = 0;
                
                while(var5.hasNextInt()){
                    
                    acul += var5.nextInt();
                    System.out.print("Valor: ");
                    var5 = new Scanner(System.in);
                }
                
                System.out.println(acul);
                
                var5.close(); 
                break;
                
            default:
                //System.out.println("Nenhuma opção válida");
                break;
                
        }
    }
}