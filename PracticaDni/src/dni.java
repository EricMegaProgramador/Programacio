public class dni {

    private static final char[] LETRA = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public dni() {}

    public char obtenerLetradni(int numDNI) {
        return LETRA[numDNI%23];
    }
}