import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
      
      exercicio06();
      
    }
    
    public static void exercicio06(){
        
    }
    
    public static void exercicio05(){
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }
        
        for(int j = 52; j <= 100; j+=2){
            System.out.println(j);
        }
    }
    
    public static void exercicio04(){
        Scanner scan = new Scanner(System.in);
        int opt;
        String escolha = "";
        double total = 0.00;
        
        System.out.println("Menu");
        System.out.println("[1] - Hamburguer R$15,00");
        System.out.println("[2] - HotDog R$10,00");
        System.out.println("[3] - Batata Frita R$5,00");
        System.out.println("Escolha sua opção:");
        opt = scan.nextInt();
        
        switch(opt){
            case 1:
                escolha = "Hamburguer";
                total = 15.00;
                break;
            case 2:
                escolha = "Hot Dog";
                total = 10.00;
                break;
            case 3:
                escolha = "Batata Frita";
                total = 5.00;
                break;
        }
        
        System.out.println("Você escolheu: " + escolha);
        System.out.println("Valor a pagar: R$" + total);
        
    }
    
    public static void exercicio03(){
        Scanner scan = new Scanner(System.in);
        double produto, newValue, desconto = 0.10;
        
        System.out.println("Digite o valor do produto: R$");
        produto = scan.nextFloat();
        
        newValue = (produto * (1 - desconto));
        
        System.out.println("Valor com desconto: R$" + newValue);
        
    }
    
    public static void exercicio02(){
        Scanner scan = new Scanner(System.in);
        float salario;
        int pendencias;
        String message;
        
        System.out.println("Digite seu salário: ");
        salario = scan.nextFloat();
        
        System.out.println("Digite o número de pendencias: ");
        pendencias = scan.nextInt();
        
        if(salario < 1500 || pendencias > 2){
            message = "Empréstimo recusado.";
        } else{
            message = "Empréstimo aprovado.";
        }
        
        System.out.println(message);
    }
  
    public static void exercicio01(){
        Scanner scan = new Scanner(System.in);
        int distancia, gas;
        float media;
        
        System.out.println("Digite a distância percorrida (em Km):");
        distancia = scan.nextInt();
        
        System.out.println("Digite o consumo de combustível (em litros):");
        gas = scan.nextInt();
        
        media = (distancia/gas);
        
        System.out.println("Consumo médio do veículo: " + media + "Km/L");
    }
}
