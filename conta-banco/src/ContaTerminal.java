import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //Conhecer e importar a classe scanner
       Scanner scanner = new Scanner(System.in); 

       //Exibir as mensagesn para o nosso usuario
       System.out.println("Por favor, insira o seu nome:"); 

       // Obter pelo scanner os valores digitados no terminal
       String nome = scanner.nextLine();

       System.out.println("Por favor, insira o valor inicial da conta:");
       double valorInicial = scanner.nextDouble();

       // Exibimos a mensagem conta criada 
       System.out.println("Conta criada com sucesso! Nome: " + nome + ", Valor Inicial: " + valorInicial);
        
       // Fechamos o scanner para evitar vazamentos de memória
       scanner.close(); 

    }
}
