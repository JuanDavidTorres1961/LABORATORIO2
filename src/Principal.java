
public class Principal {
	
	Flecha flecha1,flecha2,flecha3;

	public static void main(String[] args) {
		
		Principal miPricipal=new Principal();
		
	}
	
	public Principal() {
		
		flecha1=new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.construirFlecha();
		flecha2.color="rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3=new Flecha();
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
	}

}
