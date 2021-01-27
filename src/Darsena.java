import java.util.concurrent.Semaphore;

public class Darsena {

    private static final Semaphore almacen = new Semaphore(5,false);

    public void entrada(Camion camion){
        try {
            almacen.acquire();
            System.out.println("El camion "+camion.getName()+ " entra en su darsena");
            Mozos.iniciarDescarga(camion);
            almacen.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
