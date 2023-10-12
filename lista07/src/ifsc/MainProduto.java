package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop pc = new Desktop();
		pc.setCodBarra(159357489635l);
		pc.setFabricante("Positivo");
		pc.setGamer(false);
		
		ArrayList<String> pecas = new ArrayList<>();		
		pecas.add("Teclado");
		pecas.add("Monitor");
		pecas.add("Mouse");
		pc.setPecas(pecas);	
		
		desktops.add(pc);
		
		
		Desktop pc2 = new Desktop();
		pc2.setCodBarra(147963258149l);
		pc2.setFabricante("Evolut");
		pc2.setGamer(true);
		
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Teclado com fio");
		pecas2.add("Monitor ultra");
		pecas2.add("Mouse com fio");
		pc2.setPecas(pecas2);
		
		desktops.add(pc2);
		

		Desktop pc3 = new Desktop();
		pc3.setCodBarra(125036715920l);
		pc3.setFabricante("Acer");
		pc3.setGamer(false);
		
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Teclado rosa");
		pecas3.add("Monitor preto");
		pecas3.add("Mouse rosa");
		pc3.setPecas(pecas3);
						
		desktops.add(pc3);
		
		
		System.out.println("");
		
		
		ArrayList<Smartphone> celulares = new ArrayList<>();
		
		Smartphone cel = new Smartphone();		
		cel.setCodBarra(167984320010l);
		cel.setMarca("Lenovo");
		cel.setDimensoesTela("15x12");
		cel.setFabricante("isabelle");
		celulares.add(cel);
		
		Smartphone cel2 = new Smartphone();
		cel2.setCodBarra(167984320010l);
		cel2.setMarca("Motorola");
		cel2.setDimensoesTela("15x12");
		cel2.setFabricante("maria");
		celulares.add(cel2);
		
		Smartphone cel3 = new Smartphone();
		cel3.setCodBarra(167984320010l);
		cel3.setMarca("Samsung");
		cel3.setDimensoesTela("15x12");
		cel3.setFabricante("camili");
		celulares.add(cel3);
		
		System.out.println("Desktop: "+"\n");
		for (Desktop desktop : desktops) {
			System.out.println(desktop.getCodBarra());
			System.out.println(desktop.getFabricante());
			
			for(String peca : desktop.getPecas()) {
				System.out.println(peca);
			}
			System.out.println("");
		}
		
		System.out.println("Smartphone: "+"\n");
		for (Smartphone smartphone : celulares) {
			System.out.println(smartphone.getCodBarra());
			System.out.println(smartphone.getMarca());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println("");
		}
	}	 
}
