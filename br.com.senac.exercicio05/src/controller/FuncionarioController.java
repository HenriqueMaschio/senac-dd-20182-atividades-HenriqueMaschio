package controller;


import br.sc.senac.dd.aula05.exercicio2.model.bo.FuncionarioBO;
import br.sc.senac.dd.aula05.exercicio2.model.vo.Funcionario;

public class FuncionarioController {
	
	private FuncionarioBO bo = new FuncionarioBO();
	
	/**
	 * Salva um funcionário
	 * 
	 * 
	 * @param func o funcionário a ser salvo no Banco
	 * @return mensagem de sucesso, caso func seja persistido
	 * 		   mensagem de erro, caso contrário (ex.: CPF já existe no banco)
	 */
	public String salvar(Funcionario func) {
		String msgRetorno = "";
		boolean salvou = bo.inserir(func);
		
		if(salvou) {
			msgRetorno = "Funcionário cadastrado!";
		}else {
			msgRetorno = "CPF já existe no banco!";
		}
		
		return msgRetorno;
	}
}