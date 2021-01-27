public class Camion extends Thread{

    Darsena darsena;
    public Camion(Darsena darsena){
        this.darsena = darsena;
    }

    public void run(){
        darsena.entrada(this);
    }
}
