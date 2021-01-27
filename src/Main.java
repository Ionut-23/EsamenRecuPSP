public class Main {
    public static void main(String[] args){
        Darsena darsena = new Darsena();
        for (int i=0;i<20;i++){
            Camion c = new Camion(darsena);
            c.setName("Camion"+(i+1));
            c.start();
        }
    }
}
