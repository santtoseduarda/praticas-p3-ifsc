package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
	 Cachorro jubiscreito = new Cachorro();
	 jubiscreito.late();
	 jubiscreito.setNome("Jubiscreito");
	 jubiscreito.setRaca("Pitibul");
	 jubiscreito.setComprimento(34.6f);
	 jubiscreito.setNumeroDePatas(4);
	 jubiscreito.setCor("Caramelo");
	 jubiscreito.setEcossistema("Terra");
	 
	 
	 
	 System.out.println(jubiscreito.getNome());
	 System.out.println(jubiscreito.getRaca());
	 System.out.println(jubiscreito.getComprimento());
	 System.out.println(jubiscreito.getNumeroDePatas());
	 System.out.println(jubiscreito.getCor());
	 System.out.println(jubiscreito.getEcossistema());
	 
	 jubiscreito.caminha();
	 System.out.println("");
	 
	 Gato piupiu = new Gato();
	 piupiu.mia();
	 piupiu.setNome("Piupiu");
	 piupiu.setRaca("Persa");
	 piupiu.setComprimento(34.6f);
	 piupiu.setNumeroDePatas(4);
	 piupiu.setCor("Branco");
	 piupiu.setEcossistema("Voador");
	 
	 System.out.println(piupiu.getNome());
	 System.out.println(piupiu.getRaca());
	 System.out.println(piupiu.getComprimento());
	 System.out.println(piupiu.getNumeroDePatas());
	 System.out.println(piupiu.getCor());
	 System.out.println(piupiu.getEcossistema());
	 
	 piupiu.caminha();
	 System.out.println("");
	 
	}
	

}



