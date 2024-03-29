import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Tipos primitivos:
            // Tipos utilizados para intiros: byte, short, int, long
            // Tipos utilizados para texto: char
                // O String não é um tipo primitivo
            // Tipos booleanos: boolean
            // Números não inteiros: double, float



        // Declaração de variáveis
        int idade = 21; // Declaração com tipagem
        String nome = "Felipe"; // Declaração sem tipagem
        boolean brasileiro = true;

        System.out.println("Nome: " + nome);
        if(idade > 18){
            System.out.println("È maior de idade: " + idade);
        }else if(idade == 18){
            System.out.println("É maior de idade: " + idade);
        }else{
            System.out.println("È menor de idade: " + idade);
        }
        if(brasileiro == true){
            System.out.println("È brasileiro");
        }else{
            System.out.println("Não é brasileiro");
        }


        
        //Utilizando Matrizes (Arrays)

        //Array list
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(50);
        idades.add(30);
        idades.remove(1);


        int idade_principal = idades.getFirst();
        int idade_size = idades.size();

        System.out.println(idades);
        System.out.println(idade_principal);
        System.out.println(idade_size);

    }
}