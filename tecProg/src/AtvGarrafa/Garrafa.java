package AtvGarrafa;

public class Garrafa {
	float ml;
	float mlatual;
	
	
	public void testeGarrafa(){
		System.out.println("Teste de Garrafas: ");
		System.out.println("ML que a garrafa contém: "+ ml);
		
		if(ml == mlatual){
			System.out.println("A garrafa está lacrada");
		} else {
			System.out.println("A garrafa está aberta");
		}
	}
}
