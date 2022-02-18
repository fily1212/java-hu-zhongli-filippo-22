public class RicorsioneEsempio {
    public static void metodoRicorsivo(int n){
        System.out.println(n);
        if(n > 0)
            metodoRicorsivo(n-1);
    }
    public static void main(String[] args) {
        metodoRicorsivo(10);
    }
}
