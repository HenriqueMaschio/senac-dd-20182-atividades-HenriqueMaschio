package br.sc.senac.dd.aula05.exercicio2.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.sc.senac.dd.aula05.exercicio2.model.vo.Funcionario;

public class FuncionarioDAO extends BaseDAO<Funcionario> {

	@Override
	public String getNomeTabela() {
		return "FUNCIONARIO";
	}

	@Override
	public String getNomeColunaChavePrimaria() {
		return "ID";
	}

	@Override
	public String getNomesColunasInsert() {
		return "NOME,MATRICULA,CPF";
	}

	@Override
	public String getInterrogacoesInsert() {
		return "?,?,?";
	}

	@Override
	public void setValoresAtributosInsert(Funcionario entidade, PreparedStatement preparedStmt) {
		try {
			preparedStmt.setString(1, entidade.getNome());
			preparedStmt.setString(2, entidade.getNumeroMatricula());
			preparedStmt.setString(3, entidade.getCpf());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getValoresClausulaSetUpdate(Funcionario entidade) {
		// SET NOME=func.getNome(), MATRICULA=func.getNumeroMatricula()...
		String clausulaSet = " NOME = ?, MATRICULA = ?, CPF = ?"; 

		return clausulaSet;
	}

	@Override
	public void setValoresAtributosUpdate(Funcionario entidade, PreparedStatement preparedStmt){
		//Preenche cada interrogação da cláusula SET
		try {
			preparedStmt.setString(1, entidade.getNome());
			preparedStmt.setString(2, entidade.getNumeroMatricula());
			preparedStmt.setString(3, entidade.getCpf());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Funcionario construirObjetoDoResultSet(ResultSet resultado) {

		Funcionario novoFuncionario = null; //retorna null caso o resultado esteja vazio
		try {
			novoFuncionario = new Funcionario();
			novoFuncionario.setIdFuncionario(resultado.getInt("ID"));
			novoFuncionario.setNome(resultado.getString("NOME"));
			novoFuncionario.setNumeroMatricula(resultado.getString("MATRICULA"));
			novoFuncionario.setCpf(resultado.getString("CPF"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return novoFuncionario;
	}

	@Override
	public void setValoresAtributosInsert(FuncionarioDAO entidade, PreparedStatement preparedStmt) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getValoresClausulaSetUpdate(FuncionarioDAO entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValoresAtributosUpdate(FuncionarioDAO entidade, PreparedStatement stmt) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Funcionario> ListarTodosFuncionarios() {

		String sql = " SELECT * FROM FUNCIONARIO ";

		Connection conn =  Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conn, sql);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {

			ResultSet result = prepStmt.executeQuery(sql);

			while(result.next()){
				Funcionario f = new Funcionario();

				//Obtendo valores pelo NOME DA COLUNA
				f.setIdFuncionario(result.getInt("ID"));
				f.setNome(result.getString("NOME"));
				f.setCpf(result.getString("CPF"));
				f.setNumeroMatricula(result.getString("MATRICULA"));
				funcionarios.add(f);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return funcionarios;		

	}
	
	public Funcionario obterPorId(int id){
		String sql = " SELECT * FROM PRODUTO "
				+ " WHERE ID=?";
		
		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		Funcionario f = null;
		
		try {
			prepStmt.setInt(1, id);
			ResultSet result = prepStmt.executeQuery();
			
			while(result.next()){
				f = new Funcionario();
				
				//Obtendo valores pelo NOME DA COLUNA
				f.setIdFuncionario(result.getInt("ID"));
				f.setNome(result.getString("NOME"));
				f.setCpf(result.getString("CPF"));
				f.setNumeroMatricula(result.getString("MATRICULA"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	

}