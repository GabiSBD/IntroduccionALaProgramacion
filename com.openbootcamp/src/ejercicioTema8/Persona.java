package ejercicioTema8;

 class Persona {
    public int getEdad(){
        return edad;
    }
    public void setEdad(int e){
        edad=e;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int t){
        telefono=t;
    }
    private int edad;
    private String nombre;
    private int telefono;
}
