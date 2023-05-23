// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int opc, x ,y, valor;
        Scanner read = new Scanner(System.in);
        do{
            System.out.printf("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n0-Sair\nEscolha uma das opcoes acima: ");
            opc = read.nextInt();
            if(opc == 1){
                System.out.printf("Digite o primeiro numero: ");
                x = read.nextInt();
                System.out.printf("Digite o segundo numero: ");
                y = read.nextInt();
                valor = Soma(x,y);
                System.out.printf("%d + %d = %d\n",x, y, valor);
            }
            else if(opc == 2){
                System.out.printf("Digite o primeiro numero: ");
                x = read.nextInt();
                System.out.printf("Digite o segundo numero: ");
                y = read.nextInt();
                valor = Subtrair(x,y);
                System.out.printf("%d - %d = %d\n",x, y, valor);            
            }
            else if(opc == 3){
                System.out.printf("Digite o primeiro numero: ");
                x = read.nextInt();
                System.out.printf("Digite o segundo numero: ");
                y = read.nextInt();
                valor = Mult(x,y);
                System.out.printf("%d x %d = %d\n",x, y, valor);            
            }
            else if(opc == 4){
                System.out.printf("Digite o primeiro numero: ");
                x = read.nextInt();
                System.out.printf("Digite o segundo numero: ");
                y = read.nextInt();
                valor = Dividir(x,y);
                System.out.printf("%d / %d = %d\n",x, y, valor);
            }
            else if(opc == 0){
                System.out.printf("Voce escolheu sair");
            }
            else{
                System.out.println("Escolha uma opcao valida");
            }
        } while(opc != 0);
    }
    
    public static int Soma(int x, int y){
        return x+y;
    }
    
    public static int Subtrair(int x, int y){
        return x - y;
    }
    
    public static int Mult(int x, int y){
        return x*y;
    }
    
    public static int Dividir(int x, int y){
        return x/y;
    }
}