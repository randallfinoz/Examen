public class Electronica extends Musica {
    /**
     * 
     */
    public Electronica() {
        System.out.print("se crea el genero Electronica");
    }
    
    @Override
    public void Genero() {
        System.out.println("\t AVICII");
    }

    public void Estimulo(String msg) {
        System.out.println("\t Wake me up es" + msg 
                + " lanzado el 2013 con el album TRUE" );
    }
}
