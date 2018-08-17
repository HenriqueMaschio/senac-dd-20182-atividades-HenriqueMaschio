package br.com.senac.exercicio05.view;

import javax.swing.JOptionPane;

public class Tela {

		
		private static final int OPCAO_CADASTRAR_FUNCIONARIO = 1;
		private static final int OPCAO_CADASTRAR_PRODUTO = 2;
		private static final int OPCAO_ALTERAR_FUNCIONARIO = 3;
		private static final int OPCAO_ALTERAR_PRODUTO = 4;
		private static final int OPCAO_REMOVER_FUNCIONARIO = 5;
		private static final int OPCAO_REMOVER_PRODUTO = 6;
		private static final int OPCAO_LISTARTODOS_FUNCIONARIO = 7;
		private static final int OPCAO_LISTARTODOS_PRODUTO = 8;
		private static final int OPCAO_MOSTRARPORIDENTIFICADOR_FUNCIONARIO = 9;
		private static final int OPCAO_MOTRARPORIDENTIFICADOR_PRODUTO = 10;
		private static final int OPCAO_SAIR = 11;
		
		

		public void apresentarMenu(){
			try{
				int opcaoMenu = -1;
				
				while(opcaoMenu != OPCAO_SAIR){
					String mensagemMenu = construirMenu();
					String opcao = JOptionPane.showInputDialog(null, mensagemMenu, "Título", JOptionPane.INFORMATION_MESSAGE);
					opcaoMenu = Integer.parseInt(opcao);
					
					switch (opcaoMenu) {
					case OPCAO_CADASTRAR_FUNCIONARIO:
						cadastrarFuncionario();
						apresentarMenu();
						break;
					case OPCAO_CADASTRAR_PRODUTO:
						cadastrarProduto();
						apresentarMenu();
						break;
					case OPCAO_ALTERAR_FUNCIONARIO:
						alterarFuncionario();
						apresentarMenu();
						break;	
					case OPCAO_ALTERAR_PRODUTO:
						alterarProduto();
						apresentarMenu();
						break;
					case OPCAO_REMOVER_FUNCIONARIO:
						removerFuncionario();
						apresentarMenu();
						break;
					case OPCAO_REMOVER_PRODUTO:
						removerProduto();
						apresentarMenu();
						break;
					case OPCAO_LISTARTODOS_FUNCIONARIO:
						listartodosFuncionario();
						apresentarMenu();
						break;
					case OPCAO_LISTARTODOS_PRODUTO:
						listartodosProdutos();
						apresentarMenu();
						break;
					case OPCAO_MOSTRARPORIDENTIFICADOR_FUNCIONARIO:
						mostrarporidentificadorFuncionario();
						apresentarMenu();
						break;
					case OPCAO_MOSTRARPORIDENTIFICADOR_PRODUTO:
						mostrarporidentificadorProdutos();
						apresentarMenu();
						break;
					default:
						mostrarMensagemOpcaoInvalida();
						apresentarMenu();
						break;
					}
				}
			
			}
