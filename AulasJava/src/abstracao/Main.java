package abstracao;

public class Main {

	public static void main(String[] args) {
		Aviao aviao = new Aviao("Boeing");
		System.out.println(aviao.veiculo);
		aviao.locomoverOnde();
		aviao.acelerar();
		
		Automovel auto = new Automovel("Carro");
		System.out.println(auto.veiculo);
		auto.locomoverOnde();
		auto.acelerar();

	}

}
