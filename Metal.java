public class Metal extends Musica {
    public Electronica() {
        System.out.print(S:"se crea el genero Metal");
    }
    
    @Override
    public void Genero() {
        System.out.println("\t Metalica");
    }

    public void Estimulo(String msg) {
        System.out.println("\t Master of puppets" + msg 
                + " lanzado el 1986 con el album del mismo nombre" );
    }
}
