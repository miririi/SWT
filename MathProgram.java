public class MathUtilities {

    public static void main(String[] args) {
        int zahl = 23;
        int quadrat = quadriere(zahl);

        System.out.println("Das Quadrat von " + zahl + " ist " + quadrat);
    }

    public static int quadriere(int zahl) {
        return zahl * 2;
    }
}