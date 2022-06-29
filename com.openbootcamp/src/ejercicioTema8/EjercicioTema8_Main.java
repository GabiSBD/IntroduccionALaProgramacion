package ejercicioTema8;

public class EjercicioTema8_Main {
    public static void main(String[]args){
        Persona roberto=new Persona();
        roberto.setNombre("Roberto");
        roberto.setEdad(45);
        roberto.setTelefono(915462542);
        System.out.println("ficha de afiliado:\n"+roberto.getNombre()+"\nEdad: "+roberto.getEdad()+
                "\nTelefono: "+roberto.getTelefono());
    }
}
