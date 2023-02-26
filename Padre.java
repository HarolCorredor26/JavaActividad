public class Padre{
   
    public Padre(String nombre){
        this.nombre = nombre;
    }
    private String nombre;

    public void caminar(){
        System.out.println("Padre esta caminando");
    }
    public void comer(){
        System.out.println("Padre esta comiendo");
    }
    public void trabajar(){
        System.out.println("Padre esta trabajando");
    }
    public String getNombre(){
        return this.nombre;
    }
}