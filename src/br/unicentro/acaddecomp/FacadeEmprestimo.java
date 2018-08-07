package br.unicentro.acaddecomp;

import java.security.InvalidParameterException;

public class FacadeEmprestimo {
	private ClienteBanco cliente;
	private Banco banco;
	private Emprestimo emprestimo;
	private Credito credito;

	public FacadeEmprestimo(ClienteBanco cliente) {
		this.cliente = cliente;
	}

	public boolean emprestimoPossivel(double Valor) {
		try {
			if (Valor > 0) {
				banco.economiaSuficiente(cliente);
				emprestimo.analiseEmprestimo(cliente);
				credito.analiseCredito(cliente);
				return true;
			}
		} catch (InvalidParameterException ie) {
			System.out.println("Erro de validação");
			return false;
		}
		return false;
	}
}
