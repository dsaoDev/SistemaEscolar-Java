package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {
	private String discEnsinada;
	private ArrayList<Professor> listaDeProfessores = new ArrayList<Professor>();
	

	
	
	public Professor() {
		
	}
	
	public Professor( String nome, String cpf, double peso , double altura, String discEnsinada) {
		super(nome, cpf,peso ,altura);
		this.discEnsinada = discEnsinada;
	}
	
	public void addProfessores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ==== ABA DE CADASTRO ====");
		 
		 Professor professor = new Professor();
		 
		 
		 System.out.print("Informe seu nome: ");
		 professor.setNome(sc.nextLine());
		 System.out.print("Informe seu CPF: ");
		 professor.setCpf(sc.nextLine());
		 System.out.print("Informe a sua disciplina lecionada: ");
		 professor.setDiscEnsinada(sc.nextLine());
		 
		 boolean cpfJaExiste = false;
	        
			for(int i=0; i<listaDeProfessores.size(); i++) {
				 if( professor.getCpf().equals(listaDeProfessores.get(i).getCpf()) && listaDeProfessores.size() != 0) {
					 System.out.println("\t === CPF CADASTRADO JÁ EXISTE NO SISTEMA === ");
					 cpfJaExiste = true;
					 break;
				}			
			}
			
				if(cpfJaExiste == false) { 
					listaDeProfessores.add(professor);
					System.out.println("\t === PROFESSOR CADASTRADO ===");
				}
		
	}
	
	public void listaDeProfessores() {
		
		if(listaDeProfessores.size() == 0) {
			 System.out.println("\t === NENHUM CADASTRO ENCONTRADO === ");
			 System.out.println();
		 }else {
			 System.out.println("\t==== LISTA DE PROFESSORES ====");
		 for(int i=0; i<listaDeProfessores.size(); i++) {
			 System.out.println("\t Professor [" + i + "]");
			 System.out.println("\t Nome -> " + listaDeProfessores.get(i).getNome());
			 System.out.println("\t CPF -> " + listaDeProfessores.get(i).getCpf());
			 System.out.println("\t Disciplina lecionada -> " + listaDeProfessores.get(i).getDiscEnsinada());
			 System.out.println();
		 }
	 }
		
	}
	
	public void buscarProfessores() {
		Scanner sc = new Scanner(System.in);
		
		boolean professorencontrado = false;
		
		 System.out.println("\t ==== PROCURAR PROFESSOR POR CPF =====");
		 
		 System.out.print("Informe o CPF: ");
		 String cpf = sc.nextLine();
		 for(int i=0; i<listaDeProfessores.size(); i++) {
		 if(cpf.equals(listaDeProfessores.get(i).getCpf())) {
			 System.out.println("\t === Cadastro Encontrado ===");
			 System.out.println("\t Professor [" + i + "]");
			 System.out.println("\t Nome -> " + listaDeProfessores.get(i).getNome());
			 System.out.println("\t CPF -> " + listaDeProfessores.get(i).getCpf());
			 System.out.println("\t Disciplina lecionada -> " + listaDeProfessores.get(i).getDiscEnsinada());
			 System.out.println();
			 professorencontrado = true;
			 break;
			 
		 }
		 }
		 if(professorencontrado == false) {
			 System.out.println("\t === Cadastro não Encontrado ===");
		 }
		
	}
	
	public void atualizarCadastro() {
		Scanner sc = new Scanner(System.in);
		Professor professor = new Professor();
		if(listaDeProfessores.size() == 0 ) {
			System.out.println("\t === Não há nenhum Professor cadastrado no momento ===");
		}else {
		 System.out.println("\t === ATUALIZAR CADASTROS ===");
		 for(int i=0; i<listaDeProfessores.size(); i++) {
			 System.out.println("\t Professor [" + i + "]");
			 System.out.println("\t Nome -> " + listaDeProfessores.get(i).getNome());
			 System.out.println("\t CPF -> " + listaDeProfessores.get(i).getCpf());
			 System.out.println("\t Disciplina lecionada -> " + listaDeProfessores.get(i).getDiscEnsinada());
			 System.out.println();
		 }
		 System.out.print("Informe a [referencia] de indice do Professor a ser atualizado: ");
		 int referencia = sc.nextInt();
		 System.out.print("Informe a nova Disciplina lecionada do Professor: ");
		 sc.nextLine();
		 String novaDisciplina = sc.nextLine();
		 professor = listaDeProfessores.get(referencia);
		 professor.setDiscEnsinada(novaDisciplina);
		 
		 if(novaDisciplina.equals(listaDeProfessores.get(referencia).getDiscEnsinada())){
			 System.out.println("\t CADASTRO ATUALIZADO");
			 
			 
		 }
		}
	}
	
	public void removerCadastroProfessor() {
		Scanner sc = new Scanner(System.in);
	     boolean cadastroRemovidoSucesso = false;
		 System.out.println("\t ==== REMOÇÃO DE CADASTROS ====");
		 
		 System.out.print("Informe o cpf de  do Professor a ser removido: ");
		 String cpfTemp = sc.nextLine();
		for(int i=0; i<listaDeProfessores.size(); i++) {
			if(cpfTemp.equals(listaDeProfessores.get(i).getCpf())) {
				listaDeProfessores.remove(i);
				cadastroRemovidoSucesso = true;
				break;
				
			}
		}
		
		if(cadastroRemovidoSucesso == true) {
			System.out.println("\t === Cadastro removido com Sucesso ===");
		}else {
			System.out.println("\t CPF Digitado não consta no nosso sistema");
		}
		
	}
	
	public void switchCaseProfessores() {
		Scanner sc = new Scanner(System.in);
		Professor professor = new Professor();
		 boolean codigoroda = true;
		 while(codigoroda) {
			 System.out.println();
			 System.out.println("\t [1] CADASTRAR PROFESSORES");
			 System.out.println("\t [2] LISTAR PROFESSORES CADASTRADOS");
			 System.out.println("\t [3] PROCURAR PROFESSOR POR CPF");
			 System.out.println("\t [4] ATUALIZAR CADASTRO DE PROFESSOR");
			 System.out.println("\t [5] REMOVER CADASTRO DE PROFESSOR");
			 System.out.println("\t [6] FINALIZAR PROGRAMA ");
			 System.out.print("\t INFORME SUA OPÇÃO USUARIO: ");
			 int opcao = sc.nextInt();
			 System.out.println();
			 System.out.println();
			 
			switch (opcao) {
			case 1:
				professor.addProfessores();
				break;
			case 2:
				professor.listaDeProfessores();
				break;
			case 3:
				professor.buscarProfessores();
				break;
			case 4:
				professor.atualizarCadastro();
				break;
			case 5:
				professor.removerCadastroProfessor();
				break;
			case 6:
				System.out.println("\t === Programa [Professor] Finalizado ===");
				codigoroda = false;
				break;
				
			}
			
			
			
		 }		
	}
	
	
	
	
	

	public String getDiscEnsinada() {
		return discEnsinada;
	}

	public void setDiscEnsinada(String discEnsinada) {
		this.discEnsinada = discEnsinada;
	}
	
	
	
}
