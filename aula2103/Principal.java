public class Principal {
    public static void main(String[] args) {
        float a = 2;
        float b = 5;
        float c = 3;
        float d = 7;
        float e = 1;
        Media media = new Media();

        String primeiro = media.calculaMedia(a, b);
        String segundo = media.
                calculaMedia(a, b, c, d, e);
        System.out.print(primeiro);
        System.out.print(segundo);



    }

}
