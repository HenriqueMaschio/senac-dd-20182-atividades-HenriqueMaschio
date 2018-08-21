package br.sc.senac.dd.aula04.exercicio1;

import br.sc.senac.dd.aula04.exercicio1.Veiculos;

public class Moto extends Veiculos {  
	
	public Moto(int roda, String combustivel, double potencia, double tanque, String marca, String modelo) {
		super(roda, combustivel, potencia, tanque, marca, modelo);
	}
	
	public Moto() {
		
	}
	
	public void empinar() {
		System.out.println("Empinando");
	}
}
