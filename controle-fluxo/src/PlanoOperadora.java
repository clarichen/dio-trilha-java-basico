public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "M"; //M /T
        
        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram GRÁTIS!");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            
        }
    }
}
