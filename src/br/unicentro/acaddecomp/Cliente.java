package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String args[]) {
		ClienteBanco cb = new ClienteBanco("joão");
		FacadeEmprestimo fe = new FacadeEmprestimo(cb);
		System.out.println(fe.emprestimoPossivel(500));
	}
}
