public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, hoje iremos estudar um pouco dos tipos de variaveis!");

        System.out.println("Meu nome é Clara");

        final int cepResidencial = 12308205;
        System.out.println("CEP: " + cepResidencial);

        byte idade = 24;
        System.out.println("Minha idade é: " + idade);

        if (idade >= 21) {
            System.out.println("Você pode comprar bebidas conosco! Do que Gostaria?");
        } else {
            System.out.println("Bebidas apenas para maiores de 21 anos!");
        }

        final long cpf = 25485154736L;
        System.out.println("CPF: "+ cpf);

        float altura = 1.54F;
        System.out.println("Altura: " + altura);

        double salario = 6500.90;
        System.out.println("Salário: " + salario);

        int idadeBeber = 18;

             if (idadeBeber >= 21) {
                System.out.println("Você está autorizado a beber!");      
        }   else {
                System.out.println("Venderemos bebidas apenas a maiores de 21 anos! Por favor não insista!!!" );
        }




    }
}
