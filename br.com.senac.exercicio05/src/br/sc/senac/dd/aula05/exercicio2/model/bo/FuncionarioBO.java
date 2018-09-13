package br.sc.senac.dd.aula05.exercicio2.model.bo;

import br.sc.senac.dd.aula05.exercicio2.model.dao.FuncionarioDAO;
import br.sc.senac.dd.aula05.exercicio2.model.vo.Funcionario;

	public class FuncionarioBO {

		private FuncionarioDAO dao = new FuncionarioDAO();
		
		/**
		 * Tenta salvar um novo funcion�rio.
		 * @param novoFunc o novo funcion�rio a ser salvo
		 * @return true caso o CPF de novoFunc ainda n�o exista no banco e o funcion�rio foi salvo;
		 * 		   false caso contr�rio
		 */
		public boolean inserir(Funcionario novoFunc) {
			boolean sucesso = false;
			
			//Verificar se j� existe funcion�rio com o CPF de novoFunc
			//Caso n�o -> salvar!
			if(!dao.temCPFCadastrado(novoFunc.getCpf())) {
				int novaChave = dao.inserir(novoFunc);
				
				if(novaChave > 0) {
					sucesso = true;
				}
			}
			
			return sucesso;
		}
}
