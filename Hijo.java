public class Hijo extends Padre {
    public Hijo(String nombre){
    //metodo super//    
	super(nombre);
    }
    @Override
    public void caminar() {
        System.out.println("El hijo esta caminando");
    }
//Sobrecarga de metodos//
    public void caminar(String s1){
        System.out.println("El hijo esta caminando en"+s1);
    }
    public void caminar(double d1){
        System.out.println("El hijo esta camino"+ d1 + "metros");
    }

}