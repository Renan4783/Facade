package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String args[]) {
		ClienteBanco cb = new ClienteBanco("jo�o");
		FacadeEmprestimo fe = new FacadeEmprestimo(cb);
		System.out.println(fe.emprestimoPossivel(500));
	}
}
