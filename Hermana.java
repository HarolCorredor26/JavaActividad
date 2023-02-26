public class Hermana extends Padre {
    public Hermana(String nombre){
    //metodo super//    
	super(nombre);
    }
    @Override
    public void comer() {
        System.out.println("La Hermana esta comiendo");
    }
//Sobrecarga de metodos//
    public void caminar(String s1){
        System.out.println("La Hermana esta caminando en"+s1);
    }
    public void caminar(double d1){
        System.out.println("La Hermana esta camino"+ d1 + "metros");
    }

}