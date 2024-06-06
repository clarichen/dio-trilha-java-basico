public class ResultadoEscolar {
    public static void main(String[] args) {
       int nota = 10;

       if(nota >=7)
       System.out.println("Aprovado");

       else if (nota >= 5 && nota < 7)
       System.out.println("Prova Recuperação");
       else
       System.out.println("Reprovado");

        //condição ternaria
        int notaB = 6;

        String resultadoB = notaB >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultadoB);


        int notaC = 6;

        String resultadoC = notaC >= 7 ? "Aprovado" : notaC >= 5 && notaC <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultadoC);

    }
    
}
