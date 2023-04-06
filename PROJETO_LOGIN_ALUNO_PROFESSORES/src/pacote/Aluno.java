package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa{
	private String matricula;
	private double nota1;
	private double nota2;
	private double media;
	private String situacaoAluno;
	private ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	
	
	
	public Aluno() {
		
	}
	
	public Aluno ( String SituacaoAluno, String nome , String cpf, double altura, double peso, String matricula, double nota1, double nota2, double media) {
		super(nome, cpf, altura, peso);
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
        
	}
	
	
	public void addAlunos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= CADASTRO DE ALUNOS =========");
		Aluno aluno = new Aluno();
		
		System.out.print("Informe seu nome: ");
		aluno.setNome(sc.nextLine());
		System.out.print("Informe seu CPF: ");
		aluno.setCpf(sc.nextLine());
		System.out.print("Informe sua altura: ");
		aluno.setAltura(sc.nextDouble());
		System.out.print("Informe seu peso: ");
		aluno.setPeso(sc.nextDouble());
		System.out.print("Informe sua matricula:");
		sc.nextLine();
		aluno.setMatricula(sc.nextLine());
		
		
		boolean matriculaJaExiste = false;
		
		for(int i=0; i<listaDeAlunos.size(); i++) {
			 if( aluno.getMatricula().equals(listaDeAlunos.get(i).getMatricula()) && listaDeAlunos.size() != 0) {
				 System.out.println("\t === MATRICULA JÁ EXISTE === ");
				 matriculaJaExiste = true;
				 break;
			}
			 
			 
	}
		if(matriculaJaExiste == false) { 
			listaDeAlunos.add(aluno);
			System.out.println("\t === ALUNO CADASTRADO ===");
		}
		
	
	}
	
	public void listarAlunos() {
		if(listaDeAlunos.size() == 0) {
			System.out.println("\t === LISTA ESTÁ VAZIA  ===\n");
		}else {
		for(int i=0; i<listaDeAlunos.size(); i++) {
			System.out.println("\t====== LISTA DE ALUNOS CADASTRADOS");
			System.out.println("\t====== ALUNO [" + i + "]" + "======"); 
			System.out.println("\tIndice -> [" + i + "]" + " -> Nome: " + listaDeAlunos.get(i).getNome());
			System.out.println("\tIndice -> [" + i + "]" + " -> CPF: " +  listaDeAlunos.get(i).getCpf());
			System.out.printf("\tIndice -> [" + i + "]" + " -> Altura:%.2f%n",listaDeAlunos.get(i).getAltura());
			System.out.printf("\tIndice -> [" + i + "]" + " -> Peso:%.2f%n",  listaDeAlunos.get(i).getPeso());
			System.out.println("\tIndice -> [" + i + "]" + " -> Matricula: " + listaDeAlunos.get(i).getMatricula());
			System.out.println("=====================================");
	}
	
		}	
	}
	
	public void buscarAluno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= BUSCAR ALUNO POR MATRICULA ============");
		System.out.print("Informe a Matricula do aluno: ");
		String matricula = sc.nextLine();
		
		boolean encontrado = false;
		for(int i=0; i<listaDeAlunos.size(); i++) {
			if(matricula.equals(listaDeAlunos.get(i).getMatricula())) {
				System.out.println("=========== ALUNO ENCONTRADO =============");
				System.out.println("\tIndice -> [" + i + "]" + " -> Nome: " + listaDeAlunos.get(i).getNome());
				System.out.println("\tIndice -> [" + i + "]" + " -> CPF: " +  listaDeAlunos.get(i).getCpf());
				System.out.println("\tIndice -> [" + i + "]" + " -> Matricula: " + listaDeAlunos.get(i).getMatricula());
				System.out.println("=====================================");
				encontrado = true;
				break;
			}
		}
		if(encontrado == false) {
			System.out.println("==== USUARIO NÃO ENCONTRADO =====");
			System.out.println("=====================================");
		}
	}
	
	public void atualizarCadastroAluno() {
		
		Aluno aluno = new Aluno();
		if(listaDeAlunos.size() == 0) {
			System.out.println("No momento nã há alunos cadastrados");
		}else {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<listaDeAlunos.size(); i++) {
			System.out.println("======= ATUALIZACAO DE CADASTRO ========");
			System.out.println("\t  ALUNO [" + i + "]"  ); 
			System.out.println("\tIndice -> [" + i + "]" + " -> Nome: " + listaDeAlunos.get(i).getNome());
			System.out.println("\tIndice -> [" + i + "]" + " -> CPF: " +  listaDeAlunos.get(i).getCpf());
			System.out.println("\tIndice -> [" + i + "]" + " -> Matricula: " + listaDeAlunos.get(i).getMatricula());
			System.out.println("=====================================");
		}
		System.out.println("Informe a referencia de indice do Aluno que você deseja atualizar: ");
		int referencia = sc.nextInt();
		System.out.println("Informe a nova matricula do aluno: ");
		sc.nextLine();
		String novaMatricula = sc.nextLine();
		aluno = listaDeAlunos.get(referencia);
		aluno.setMatricula(novaMatricula);
		if(listaDeAlunos.get(referencia).getMatricula().equals(novaMatricula)) {
		System.out.println("=========== ATUALIZAÇÃO FEITA COM SUCESSO VÁ ATE A ABA DE LISTA DE ALUNOS PARA VER ===============");
		
		}
		}
		
	}
	
	public void situacaoAlunos() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ===== SITUAÇÃO DE ALUNOS =====");
		int referencia;
		if(listaDeAlunos.size() ==0) {
			System.out.println("\t No momento não há alunos cadastrados");
		}else {
		Aluno aluno = new Aluno();
		for(int i=0; i<listaDeAlunos.size(); i++) {
			System.out.println("[Nome do Aluno: ] " + listaDeAlunos.get(i).getNome() + " //// Referencia -> [" + i + "]");
		}
		System.out.println("Informe a referencia de indice do Aluno que você deseja calcular a media: ");
		referencia = sc.nextInt();
		boolean alunoTemSituacao = false;
		for (int i=0; i<listaDeAlunos.size(); i++) {
			if(listaDeAlunos.get(referencia).getSituacaoAluno() == null) {
			 sc.nextLine();
			 aluno = listaDeAlunos.get(referencia);
			 System.out.print("Informe a 1a nota do aluno [" + referencia + "]: " );
			 aluno.setNota1(sc.nextInt());
			 sc.nextLine();
			 System.out.print("Informe a 2a nota do aluno [" + referencia + "]: " );
			 aluno.setNota2(sc.nextInt());;
			 sc.nextLine();
			 aluno.mediaAluno();
			 aluno.setMedia(aluno.mediaAluno());
			 alunoTemSituacao = true;
			 if(listaDeAlunos.get(referencia).getMedia() < 3) {
				 listaDeAlunos.get(referencia).setSituacaoAluno("Reprovado");
				 System.out.println("Aluno [" + referencia + "->] " + listaDeAlunos.get(referencia).getSituacaoAluno());
				 
			 }else if(listaDeAlunos.get(referencia).getMedia() >= 3 && listaDeAlunos.get(referencia).getMedia() <7) {
				 listaDeAlunos.get(referencia).setSituacaoAluno("Aguardando Final");
				 System.out.println("Aluno [" + referencia + "->] " + listaDeAlunos.get(referencia).getSituacaoAluno());
				 
			 }else if (listaDeAlunos.get(referencia).getMedia() >= 7) {
				 listaDeAlunos.get(referencia).setSituacaoAluno("Aprovado");
				 System.out.println("Aluno [" + referencia + "->] " + listaDeAlunos.get(referencia).getSituacaoAluno());
				 break;
			 }
		}
			
		}
			if(alunoTemSituacao == false) {
				System.out.println("\t CALCULO DE MEDIA JÁ FOI REALIZADO");
		}
			for(int i=0; i<listaDeAlunos.size(); i++) {
				System.out.println("============= SITUAÇÃO  DE ALUNOS CADASTRADOS ===========");
				System.out.println("\t====== ALUNO [" + i + "]" + "======"); 
				
				System.out.println("\tIndice -> [" + i + "]" + " -> Nome: " + listaDeAlunos.get(i).getNome());
				System.out.println("\tIndice -> [" + i + "]" + " -> Matricula: " + listaDeAlunos.get(i).getMatricula());
				if(listaDeAlunos.get(i).getSituacaoAluno() != null) {
					System.out.println("\tAluno [" + i + " ->] " +"Media: " + listaDeAlunos.get(i).getMedia() + " Situação -> " + listaDeAlunos.get(i).getSituacaoAluno());
					
				}
				System.out.println("==========================================================");
			}
			
		}
	}
	
	public void removerAlunos() {
		Scanner sc = new Scanner(System.in);
	       boolean alunoRemovidoSucesso = false;
		 System.out.println("\t === REMOÇÃO DE CADASTRO ===");
		 
			System.out.println("Informe  a matricula do aluno a ser removido: ");
			 String matriculaTemp = sc.nextLine();
			 
			for(int i=0; i<listaDeAlunos.size(); i++) {
				if(matriculaTemp.equals(listaDeAlunos.get(i).getMatricula())) {
					listaDeAlunos.remove(i);
					alunoRemovidoSucesso = true;
					break;
				}
			}
			if(alunoRemovidoSucesso == true) {
				System.out.println("\t Aluno Removido Com Sucesso\n");
			}else {
				System.out.println("Aluno digitando não possui cadastro no sistema\n");
				
			}
		
	}
	
   public void switchCaseAlunos() {
	   Aluno aluno = new Aluno();
	   Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		while (rodando) {
			System.out.println();
		System.out.println("\t [1]  CADASTRAR ALUNOS  ");
		System.out.println("\t [2]  LISTAR ALUNOS CADASTRADOS");
		System.out.println("\t [3]  PROCURAR ALUNO POR MATRICULA ");
		System.out.println("\t [4]  ATUALIZAR CADASTRO DE ALUNO");
		System.out.println("\t [5]  CALCULO DE MEDIA / VER SITUAÇÃO DE ALUNO");
		System.out.println("\t [6]  REMOVER ALUNO CADASTRADO");
		System.out.println("\t [7]  FINALIZAR PROGRAMA ALUNOS   ");
		System.out.print("\t INFORME SUA OPÇÃO USUARIO : ");
		int opcao = sc.nextInt();
		System.out.println();
		
		switch (opcao) {
		case 1:
			aluno.addAlunos();
			break;
		case 2:
			aluno.listarAlunos();
			break;
		case 3:
			aluno.buscarAluno();
			break;
		case 4:
			aluno.atualizarCadastroAluno();
			break;
		case 5:
			aluno.situacaoAlunos();
			break;
		case 6:
			aluno.removerAlunos();
			
			break;
		case 7:
			System.out.println("\t === Programa [Aluno] Finalizado ===");
			rodando = false;
			System.out.println();
			break;
			
		}
   }
   }
	public String getSituacaoAluno() {
		return situacaoAluno;
	}

	public void setSituacaoAluno(String situacaoAluno) {
		this.situacaoAluno = situacaoAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media ;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public double mediaAluno () {
		double media = (nota1 + nota2) /2;
		return media;
	}

		
	}

