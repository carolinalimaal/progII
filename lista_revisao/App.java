import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Questão 3
        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = input.nextInt();
        
        System.out.print("O maior número entre " + num1 + " e " + num2 + " é: ");
        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        Questão 4
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        for (int i = numero; i >= 0; i--){
            System.out.println(i);
        }

        Questão 5
        int soma = 0;
        long produto = 1;
        for (int i = 1; i <= 30; i++){
            if (i % 2 == 0){
                produto *= i;
            } else {
                soma += i;
            }
        }
        System.out.println(" Soma dos ímpares: " + soma);
        System.out.println("Produto dos pares: " + produto);

        Questão 6
        int a = 2;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        a = 10;
        b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        // Questão 7
        Contato carol = new Contato("Carol", "carol@gmail.com");
        Contato paula = new Contato("Paula", "paula@gmail.com");

        Agenda agenda = new Agenda();
        agenda.adicionar_contato(carol);
        agenda.adicionar_contato(paula);

        agenda.listar_contatos();

        Contato contato_buscado = agenda.buscar_contato("Carol");
        if (contato_buscado != null){
            System.out.println("\n\nContato buscado\n Nome: " + contato_buscado.getNome() + "\n Email: " + contato_buscado.getEmail());
        } else {
            System.out.println("\nContato não encontrado");
        }

        if (agenda.remover_contato("Carol")){
            System.out.println("\nContato removido com sucesso");
        } else {
            System.out.println("\nNão foi possível remover o contato");
        }
        
        agenda.listar_contatos();

        
        
    }
}




