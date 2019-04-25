package view;

import javax.swing.JOptionPane;
import model.Aluno;

public class Cadastro {
	
	public static void main(String[] args) {
		Aluno pessoa = new Aluno();
		pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		
		System.out.println(pessoa.getNome());
		
		pessoa.setendereco(JOptionPane.showInputDialog("Digite seu endereço"));
		
		System.out.println(pessoa.getendereco());
		
		pessoa.setbairro(JOptionPane.showInputDialog("Digite seu bairro"));
		
		System.out.println(pessoa.getbairro());
		
		pessoa.setcep(Long.parseLong(JOptionPane.showInputDialog("Digite seu CEP")));
		
		System.out.println(pessoa.getcep());
		
		pessoa.setcidade(JOptionPane.showInputDialog("Digite sua cidade"));
		
		System.out.println(pessoa.getcidade());
		
		pessoa.setestado(JOptionPane.showInputDialog("Digite seu estado"));
		
		System.out.println(pessoa.getestado());
	}
	
}
