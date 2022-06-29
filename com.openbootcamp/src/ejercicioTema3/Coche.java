package ejercicioTema3;

public class Coche {
    public Coche(){
        numPuertas=3;
    }
    public void masPuertas(int increment){
        numPuertas=numPuertas+increment;
    }
    public int getPuertas(){
        return numPuertas;
    }
   private int numPuertas;
}
