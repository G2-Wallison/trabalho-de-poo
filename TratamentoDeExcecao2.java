package SegundaQuestao;

import java.util.Random;

public class TratamentoDeExcecao2 {
    public static void main(String[] args, int i)throws Excecao2 {
        Robo2 r1 = new Robo2("Azul");
        Robo2 r2 = new Robo2("Vermelho");
        Random random = new Random();
        
        
        System.out.println("Usuário, determine a posição do alimento para os robôs : ");
        r1.determinarLugarDoAlimento(2,3);
        r2.determinarLugarDoAlimento(2,3);
        
        do{
            for(int k =0;k<2;k++){
                if (k==1){
                    r1.mover(random.nextInt(4));
                    r1.setK1(r1.getK1() + 1);
                    if(r1.verificar()){
                        System.out.println("O primeiro Robô encontrou primeiro com " + r1.getK1() +"movimentos.");
                        i = 1;
                    }
                }if (k==2){
                    r2.mover(random.nextInt(4));
                    r2.setK2(r2.getK2() + 1);
                    if(r2.verificar()){
                        System.out.println("O segundo Robô encontrou primeiro com " + r2.getK2() +"movimentos.");
                        i= 1;
                    }
                }
            }
        }while( i != 1 );
    }
}   
