package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();

		Veiculo car1 = new Veiculo();
		car1.setNome("Fit");
		car1.setAno(2018);
		car1.setNumRodas(4);
		car1.setFabricante("Honda");
		car1.setCor("Grafite");
		veiculos.add(car1);
		
		Veiculo car2 = new Veiculo();
		car2.setNome("Polo");
		car2.setAno(2018);
		car2.setNumRodas(4);
		car2.setFabricante("Volkswagen");
		car2.setCor("Vermelho");
		veiculos.add(car2);		
		
		Veiculo car3 = new Veiculo();
		car3.setNome("Uno");
		car3.setAno(2018);
		car3.setNumRodas(4);
		car3.setFabricante("Fiet");
		car3.setCor("Branco");
		veiculos.add(car3);
		
		
		for(Veiculo veiculo: veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("");
		}
	}

}
