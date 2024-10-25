import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
      //maneira preguiçosa
      Scanner scan = new Scanner(System.in);
      int opt = 0;
      
      System.out.println("Qual exercicío você deseja executar?");
      System.out.println("Digite o num do exercicío 1 ao 12");
      opt = scan.nextInt();
      
        switch(opt){
            case 1:
                exercicio01();
                break;
            case 2:
                exercicio02();
                break;
            case 3:
                exercicio03();
                break;
            case 4:
                exercicio04();
                break;
            case 5:
                exercicio05();
                break;
            case 6:
                exercicio06();
                break;
            case 7:
                exercicio07();
                break;
            case 8:
                exercicio08();
                break;
            case 9:
                exercicio09();
                break;
            case 10:
                exercicio10();
                break;
            case 11:
                exercicio11();
                break;
            case 12:
                exercicio12();
                break;
            default:
                System.out.println("Exercício inválido...");
                break;
        }
      
    }
    
    public static void exercicio12(){
        Scanner scan = new Scanner(System.in);
        char genero;
        int oi = 0, entrevistado = 0, homem = 0, mulherPobre = 0, idade = 0, mediaIdade = 0;
        float salario, mediaH = 0;
        
        
        while(oi == 0){
            System.out.println("[M] - Mulher");
            System.out.println("[H] - Homem");
            genero = scan.next().charAt(0);
            
            System.out.println("Qual sua idade?");
            idade = scan.nextInt();
            if(idade < 1){
                System.out.println("Idade inválida");
                break;
            }
            
            System.out.println("Qual o seu salário?");
            salario = scan.nextFloat();
            
            
            
            if((genero == 'M' || genero == 'm') && salario < 600){
                mulherPobre ++;
            } else if(genero == 'H' || genero == 'h'){
                homem ++;
                mediaH += salario;
            }
            
            mediaIdade += idade;
            entrevistado ++;
            
            
            System.out.println("[0] - Adicionar mais pessoas");
            System.out.println("[1] - Parar");
            oi = scan.nextInt();
        }
        
        if(oi == 1){
                mediaIdade = (mediaIdade / entrevistado);
                mediaH = (mediaH / homem);
                
                System.out.println("A média da idade dos entrevistados é: " + mediaIdade);
                System.out.println(mulherPobre + " mulheres que recebem menos de 600 reais");
                System.out.println("A média do salário dos homens é de: " + mediaH);
            }
    }
    
    public static void exercicio11(){
        Scanner scan = new Scanner(System.in);
        float nota, somaNota = 0, mediaNota = 0;
        int aprovado = 0, exame = 0, reprovado = 0, faltas = 0;
        
        for(int i = 1; i <= 20; i++){
            System.out.println("Insira a nota do "+ i +"º aluno");
            nota = scan.nextFloat();
            System.out.println("Insira as faltas do "+ i +"º aluno");
            faltas = scan.nextInt();
            
            somaNota += nota;
            
            if(faltas > 15  || nota <= 3){
                reprovado ++;
            } else if(nota < 6){
                exame++;
            } else{
                aprovado ++;
            }
            
            faltas = 0;
            nota = 0;
        }
        
        mediaNota = (somaNota / 20);
        
        System.out.println("Média das notas da turma: " + mediaNota);
        System.out.println("Alunos reprovados: " + reprovado);
        System.out.println("Alunos de exame: " + exame);
        System.out.println("Alunos aprovados: " + aprovado);
    }

    public static void exercicio10(){
        Scanner scan = new Scanner(System.in);
        int mulheres = 0, homens = 0;
        
        System.out.println("Quantas mulheres?");
        mulheres = scan.nextInt();
        System.out.println("Quantos homens?");
        homens = scan.nextInt();
        
        float mediaH = 0, mediaM = 0;
        
        for(int i = 1; i <= homens; i++){
            System.out.println("Insira a idade da " + i + "º homem");
            mediaH = (mediaH + scan.nextInt());
        }
        
        for(int i = 1; i <= mulheres; i++){
            System.out.println("Insira a idade da " + i + "º mulher");
            mediaM = (mediaM + scan.nextInt());
        }
        
        mediaM = (mediaM / mulheres);
        mediaH = (mediaH / homens);
        System.out.println("Média da idade de homens: " + mediaH);
        System.out.println("Média da idade de mulheres: " + mediaM);
        
    }
    
    public static void exercicio09(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua altura (em metros):");
        double altura = scan.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = scan.nextDouble();
        
        double imc = peso / (altura * altura);
        String situacao = " ";
        
        System.out.println("Seu IMC: " + imc);
        
        if(imc >= 31.1){
            situacao = "Obeso";
        } else if(imc >= 27.8){
            situacao = "Acima do peso";
        } else if(imc >= 26.4){
            situacao = "Pouco acima do peso";
        } else if(imc >= 20.7){
            situacao = "Peso normal";
        } else if(imc < 20.7){
            situacao = "Abaixo do peso";
        }
        
        System.out.println("Você está " + situacao);
        
    }
    
    public static void exercicio08(){
        Scanner scan = new Scanner(System.in);
        double salario, parcela, valor = 0;
        int pendencias, parcelas;
        String message;
        
        System.out.println("Digite seu salário: ");
        salario = scan.nextDouble();
        
        System.out.println("Digite o número de pendencias: ");
        pendencias = scan.nextInt();
            
        if(salario < 1500 || pendencias > 2){
            System.out.println("Empréstimo recusado.");
        } else{
            System.out.println("Empréstimo aprovado.");
            System.out.println("Valor do empréstimo: ");
            valor = scan.nextDouble();
            System.out.println("Número de parcelas");
            parcelas = scan.nextInt();
            
            parcela = (valor/parcelas) * 1.09;
            double valorFinal = (parcela * parcelas);
            
            
            System.out.println("Valor de cada parcela: " + parcela);
            System.out.println("Valor final do empréstimo: " + valorFinal);
        }
        
        
        
    }
    
    
    public static void exercicio07(){
        Scanner scan = new Scanner(System.in);
        double menor = 0.0;
        double[] numeros = new double[3];
        int negativo = 0, positivo = 0;
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Insira um número");
            numeros[i] = scan.nextDouble();
            if(numeros[i] > 0){
                positivo ++;
            } else{
                negativo ++;
            }
            
            if(i == 0){
                menor = numeros[i];
            } else if(menor > numeros[i]){
                menor = numeros[i];
            }
        }
        
        System.out.println("Números negativos: " + negativo);
        System.out.println("Números positivos: " + positivo);
        System.out.println("Menor número: " + menor);        
    }
    
    public static void exercicio06(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = scan.nextInt();
        double soma = 0.0;
 
        
      for(double i = 1.0; i <= n; i++){
          soma = soma + (1.0 / i);
      }
       
      System.out.println(soma);
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