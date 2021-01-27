import java.util.concurrent.Semaphore;

public class Mozos {

    private static final Semaphore mozo = new Semaphore(2,true);

    public static void iniciarDescarga(Camion camion){
        try {
            mozo.acquire();
            System.out.println(camion.getName()+" esta descargando...");
            int tiempoDeProceso = (int) (Math.random()*(1000)+5000);
            Thread.sleep(tiempoDeProceso);
            System.out.println(camion.getName()+" descarga finalizada");
            mozo.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
