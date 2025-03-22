public class EstruturaDeDecisao {

    public static void main(String[] args){

        int idade = 46;
        int contribuicao = 15;
        char sexo = 'M';

        if (sexo == 'F' && idade >= 62 && contribuicao >= 15)
            System.out.println("Aptp a se aposentar");
        else if (sexo == 'M' && idade >= 65 && contribuicao >= 15)
            System.out.println("Aptp a se aposentar");
        else if (sexo == 'F' && idade >= 57 && contribuicao >= 30)
            System.out.println("Aptp a se aposentar");
        else if (sexo == 'M' && idade >= 60 && contribuicao >= 35)
            System.out.println("Aptp a se aposentar");
        else System.out.println("Não pode se aposentar");



    }

}
