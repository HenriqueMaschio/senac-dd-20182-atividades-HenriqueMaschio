package controller;


import br.sc.senac.dd.aula05.exercicio2.model.bo.FuncionarioBO;
import br.sc.senac.dd.aula05.exercicio2.model.vo.Funcionario;

public class FuncionarioController {
	
	private FuncionarioBO bo = new FuncionarioBO();
	
	/**
	 * Salva um funcion�rio
	 * 
	 * 
	 * @param func o funcion�rio a ser salvo no Banco
	 * @return mensagem de sucesso, caso func seja persistido
	 * 		   mensagem de erro, caso contr�rio (ex.: CPF j� existe no banco)
	 */
	public String salvar(Funcionario func) {
		String msgRetorno = "";
		boolean salvou = bo.inserir(func);
		
		if(salvou) {
			msgRetorno = "Funcion�rio cadastrado!";
		}else {
			msgRetorno = "CPF j� existe no banco!";
		}
		
		return msgRetorno;
	}
}