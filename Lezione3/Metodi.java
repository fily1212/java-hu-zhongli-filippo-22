import java.util.Scanner;
public class Metodi {
    public static void main(String[] args) {
        // chiamata di un metodo (quando lo utilizziamo)
        // chiamata di un metodo static
        System.out.println("Ciao");
        
        // chiamata di un metodo NON static (prima devo fare inizializzare Scanner)
        Scanner tastiera = new Scanner(System.in);
        String a = tastiera.nextLine();

    }

    //definizione del metodo (quando descriviamo cosa deve fare quando viene chiamato)
    // [modificatore d'accesso] [static/niente] [tipo di ritorno] 
    public static void nomeMetodo(int a, int b, String c){

    }


}
