package Animal;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.nome = "Animal Generico";
		animal1.peso = 100;
		animal1.especie = "Denerica";
		
		System.out.println(animal1.nome +" "+ animal1.especie +" "+ animal1.peso );
		
		animal1.emitirSom();
		
		Raposa raposa1 = new Raposa();
		raposa1.nome = "Mozilla";
		raposa1.especie = "Branca";
		raposa1.peso = 8;
		
		//System.out.println(raposa1.nome +" "+ raposa1.especie +" "+ raposa1.peso );
		raposa1.emitirSom();
		
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Principe";
		cachorro1.especie = "Lhasa Apso";
		cachorro1.peso = 12;
		cachorro1.castrado = false;
		
		System.out.println("\n "+cachorro1.nome +"\n "+ cachorro1.especie +"\n "+ cachorro1.peso +"\n "+ cachorro1.castrado );
		cachorro1.emitirSom();
		
		Gato gato1 = new Gato();
		gato1.nome = "Principe";
		gato1.especie = "Lhasa Apso";
		gato1.peso = 12;
		gato1.emitirSom();
		
		
		
	}

}
