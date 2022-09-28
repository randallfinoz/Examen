public class Genero {
    /**
     * @param ar
     */
    public static void main(String []ar) {
        Musica[] mu = new Musica [3];
        Electronica mue = new Electronica();
        System.out.println();
        Rock mur = new Rock();
        Metal mum = new Metal();
        mu[0] = mue;
        mu[1] = mur;
        mu[2] = mum;

        for(int i = 0; i < 3 ) {
            mu[i++]estimulo();
        }
        mue = mum;
        Object obj;
        ((Object) mue).equals(obj)estimulo();

    }

    private static void estimulo() {
    }
}
