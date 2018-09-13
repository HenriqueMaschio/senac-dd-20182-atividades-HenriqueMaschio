package br.sc.senac.dd.aula05.exercicio2.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.sc.senac.dd.aula05.exercicio2.model.dao.ProdutoDAO;
import br.sc.senac.dd.aula05.exercicio2.model.vo.Produto;

public class ProdutoBO {

	ProdutoDAO dao = new ProdutoDAO();
	public boolean inserir(Produto produto) {
		int idGerado = dao.inserir(produto);
		return idGerado > 0;
	}
	public Produto buscarProdutoPorId(String textoId) {
		Produto produtoBuscado = dao.obterPorId(Integer.parseInt(textoId));
		return produtoBuscado;
	}
	public boolean atualizar(Produto produto) {
		boolean sucesso = dao.atualizar(produto);
		return sucesso;
	}
	
	public List<Produto> listarProdutos() {
		ArrayList<Produto> produtos = dao.listarTodos();
		return produtos;
	}
	
	public List<Produto> listarProdutosPorFaixaDePreco(double precoMax) {
		ArrayList<Produto> produtos = dao.listarPorFaixaDePreco(precoMax);
		return produtos;
	}

}
