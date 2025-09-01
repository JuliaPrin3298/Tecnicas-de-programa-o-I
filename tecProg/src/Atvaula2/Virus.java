package Atvaula2;

public class Virus {
 private int id;
 private String nome;
 private String tipo;
 private double taxaMorte;
 
 public Virus( int id, String nome, String tipo, double taxaMorte){
		this.id =  id;
		this.nome = nome;
		this.tipo = tipo;
		this.taxaMorte = taxaMorte;
	}
 
 public void mostrarNome() {
	 System.out.println("O nome do vírus é "+ nome);
 }
 
 public void mostrarTipo() {
	 System.out.println("O tipo do vírus é "+ tipo);
 }
 
 public void infoVirus(){
	System.out.println("Vírus: "+ nome);
	System.out.println("Tipo: "+ tipo);
	System.out.println("Taxa de Mortalidade: "+ taxaMorte);
	System.out.println("=================================");

 }
}
