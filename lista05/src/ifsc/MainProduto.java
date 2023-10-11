package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto pro1 = new Produto();
		pro1.setNome("chapinha");
		pro1.setPreço(438.24);
		pro1.setFornecedor("Titanium");
		pro1.setCodBarra(159753698452l);
		produtos.add(pro1);
		
		Produto pro2 = new Produto();
		pro2.setNome("secador");
		pro2.setPreço(182.50);
		pro2.setFornecedor("Taiff");
		pro2.setCodBarra(14795136324l);
		produtos.add(pro2);
		
		Produto pro3 = new Produto();
		pro3.setNome("Babyliss");
		pro3.setPreço(190.24);
		pro3.setFornecedor("Taiff");
		pro3.setCodBarra(456982033496l);
		produtos.add(pro3);
		
		for(Produto produto: produtos) {
		
			System.out.println(produto.getNome());
			System.out.println(produto.getPreço());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getCodBarra());
		}
 
	}

}
