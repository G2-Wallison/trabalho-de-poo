package tratamentodeexcecao;
import java.util.Random;

public class Robo  {
    private int x,y;
    private String cor;
    private int x0 = 0;
    private int y0 = 0;
    public Robo( String cor){
        this.cor = cor;
        this.x = 0;
        this.y = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void determinarLugarDoAlimento(int x, int y){
        this.x0 = x;
        this.y0 = y;
    }
    public void gerarLugarDoAlimento(){
        Random random = new Random();
        int x0 = random.nextInt(5);
        int y0 = random.nextInt(5);
        this.x0 = x0;
        this.y0 = y0;
    }

    public void lugarDoAlimento(){
        System.out.println("Local do alimento:" +"("+this.x0+ "," +this.y0+")");  
    }
    public void mover(String m) throws Excecao{
        if(m == "up"){
            this.setY(getY()+1);
            System.out.println("("+this.getX() +","+ this.getY()+")");
        }else if(m == "down"){
            if( y > 0 ){
                this.setY(getY() - 1);
                System.out.println("("+this.getX() +","+ this.getY()+")");
            }else{
                throw new Excecao();
            }
        }else if(m == "right"){
            this.setX(getX() + 1);
            System.out.println("("+this.getX() +","+ this.getY()+")");
        }else{
            if(x > 0 ){    
                this.setX(getX() - 1);
                System.out.println("("+this.getX() +","+ this.getY()+")");
            }else{
                throw new Excecao();
            }
        }
    }
    public void mover(int p) throws Excecao{
        if(p == 1){
            this.setY(getY()+1);
            System.out.println("("+this.getX() +","+ this.getY()+")");
        }else if(p == 2){
            if( y > 0 ){
                this.setY(getY() - 1);
                System.out.println("("+this.getX() +","+ this.getY()+")");
            }else{
                throw new Excecao();
            }
        }else if(p == 3){
            this.setX(getX() + 1);
            System.out.println("("+this.getX() +","+ this.getY()+")");
        }else if(p == 4){
            if(x > 0 ){    
                this.setX(getX() - 1);
                System.out.println("("+this.getX() +","+ this.getY()+")");
            }else{
                throw new Excecao();
            }
        }else{
            System.out.println("Você podes apenas se movimentar de 4 formas, 1 até 4.");
        }
    }
    public boolean verificar(){
        if(this.getX()==this.x0 && this.getY()==this.y0){
            System.out.println("Parabéns !!! achou o alimento !!!");
            return true;
        }else{
            System.out.println("Continue procurando !!!");
            return false;
        }
    }
    public void ondeEstou(){
        System.out.println("Seu local atual é:"+"("+this.getX()+","+this.getY()+")");
        
    }
}
