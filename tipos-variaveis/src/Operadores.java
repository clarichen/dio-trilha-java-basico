public class Operadores {

    public static void main(String[] args) {
        System.out.println("Hoje iremos estudar os Operadores!");
        
        System.out.println("Clara " + "Chen");

        System.out.println("Qual sua idade? " + 24);

        int resultado = +1;  //operadores unarios

        System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        resultado = -resultado;
        System.out.println(resultado);

        boolean sucess = false;    //operadores unarios
        System.out.println(sucess);
        System.out.println(!sucess);

        int tamanho = 2;
        tamanho *= 4;
        System.out.println(tamanho);

        int valorA  = 1;    //operadores de igualdade
        int valorB = 2;

        if (valorA == valorB) {
                System.out.println("OS VALORES CORRESPONDEM!");
        } else {
                System.out.println("OS VALORES NÃO CORRESPONDEM!");
        }

        int valorC  = 4;
        int valorD = 4;

        if (valorC == valorD) {
            System.out.println("OS VALORES CORRESPONDEM!");
    } else {
            System.out.println("OS VALORES NÃO CORRESPONDEM!");
    }

        int precoA = 4;    //operadores relacionais
        int precoB = 8;

        if (precoA > precoB) {
            System.out.println("O valor é menor!");
        }

        if (precoA < precoB) {
            System.out.println("O valor é maior!");
        }

        if (precoA >= precoB) {
            System.out.println("O valor é maior ou igual!");
        }

        if (precoA <= precoB) {
            System.out.println("O valor é menor ou igual!");
        
        }
        
    }
    
}
