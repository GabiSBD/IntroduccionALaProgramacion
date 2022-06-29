package ejercicioTema9;

public class Main {
    public static void main(String[]args){
    Cliente persona1=new Cliente();
    Trabajador persona2=new Trabajador();

    persona1.setNombre("mauricio");persona1.setEdad(25);persona1.setTelefono(956521248);
    persona1.setCredito(2000);

    persona2.setNombre("pilar");persona2.setEdad(35);persona2.setTelefono(654258795);
    persona2.setSalario(1250);

        System.out.println("Nombre: "+persona1.getNombre()+
                "\nEdad: "+persona1.getEdad()+"\nTelefono: "+persona1.getTelefono()+"\nCredito: "+persona1.getCredito());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nombre: "+persona2.getNombre()+
                "\nEdad: "+persona2.getEdad()+"\nTelefono: "+persona2.getTelefono()+"\nSalario: "+persona2.getSalario());

    }
}
