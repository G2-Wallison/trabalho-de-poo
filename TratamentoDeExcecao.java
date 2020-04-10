package tratamentodeexcecao;
public class TratamentoDeExcecao {
    public static void main(String[] args) throws Excecao {
        System.out.println(" ___________________________________________________________________");
        System.out.println("Caro Usário, Encontre o alimento para sair do game, good luck !!!");
        System.out.println(" ___________________________________________________________________");
        System.out.println(" MENU: ");
        System.out.println("---- Para aumentar o valor do Y digite 1 ou escreva up entre áspas ---- ");
        System.out.println("---- Para diminuir o valor do Y digite 2 ou escreva down entre áspas ----");
        System.out.println("---- Para aumentar o valor do X digite 3 ou escreva right entre áspas ----");
        System.out.println("---- Para diminuir o valor do X digite 4 ou escreva left entre áspas ----");
        System.out.println();
        Robo R = new Robo("Azul");
        R.determinarLugarDoAlimento(3, 3);
        R.mover(1);
        R.mover(1);
        R.mover(1);
        R.mover(3);
        R.mover(3);
        R.mover("right");
        R.verificar();
    }
}

