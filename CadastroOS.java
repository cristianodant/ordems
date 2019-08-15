package ordemS;

import javax.swing.JFrame;
import javax.swing.JButton;

public class CadastroOS {
	
	public static void main(String[] args) {
		
		JFrame janelaOS = new JFrame("Cadastrar O.S.");
		janelaOS.setVisible(true);
		janelaOS.setSize(800, 600);
		janelaOS.setDefaultCloseOperation(janelaOS.EXIT_ON_CLOSE);
		
		JButton botaoSalvar = new JButton("Salvar O.S.");
		janelaOS.add(botaoSalvar);
		
		while (true) {
			
			System.out.println("Teste de execusão");
		}
		
		
	}

}
