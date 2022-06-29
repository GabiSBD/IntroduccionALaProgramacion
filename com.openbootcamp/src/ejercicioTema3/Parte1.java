package ejercicioTema3;

public class Parte1 {
    public static void main(String[]args){
        //parte 1
       int cant=sumaInt(5,10,20);
        System.out.println("la suma de 5+10+20 es "+cant);
        //parte 2
        Coche car=new Coche();
        car.masPuertas(2);
        System.out.println("el coche tiene "+car.getPuertas()+" puertas");
    }
    static int sumaInt(int a,int b,int c){
        return a+b+c;
    }
}
