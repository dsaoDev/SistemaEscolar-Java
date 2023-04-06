package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Login  {
	private String email;
	private String senha;
	 private ArrayList<Login> listaLogin = new ArrayList<Login>();
	

	
	
	public Login() {
		
	}
	
	public Login( String email, String senha) {
	    //this.confirmarLogin = confirmarLogin;
		this.email = email;
		this.senha = senha;



	}
	
	public void cadastrarUsuarioLogin() {
		 
		Scanner sc = new Scanner(System.in);
		
		Login loginUsuario = new Login();
		System.out.println("==== CADASTRO DE USUARIO ==== ");
		System.out.print("Informe um email: ");
		loginUsuario.setEmail(sc.nextLine());
		System.out.print("Informe uma senha: ");
		loginUsuario.setSenha(sc.nextLine());
		
		listaLogin.add(loginUsuario);
		System.out.println("\t === Usuario Cadastrado com Sucesso ===");
		
		
	}
	
	public void Logar() {
		 Scanner sc = new Scanner(System.in);
		 boolean testeLogin = false;
		 
		 Login logar = new Login();

		 

	    System.out.println("\t === Login de Usuarios ===");
		 System.out.print("Digite seu email: ");
		 String emailTemp = sc.nextLine();
		 System.out.print("Digite sua senha: ");
		 String senhaTemp = sc.nextLine();

		 for(int i=0; i<listaLogin.size(); i++) {
			 if(emailTemp.equals(listaLogin.get(i).getEmail()) && senhaTemp.equals(listaLogin.get(i).getSenha())) {
				 System.out.println("\t === Acesso Permitido === ");
				 testeLogin = true;
				 break;
			 }
		 }
		 if(testeLogin == true) {
		 logar.homePage();
		 }else {
			 System.out.println("LOGUIN OU SENHA INCORRETO // OU USUARIO NÃO POSSUI CADASTRO ");
		 }

	 }
	
	public void homePage() {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Usuario Deseja ver as suas opções disponiveis? [S/N]");
		 char opcao = sc.next().charAt(0);
		 if(opcao == 'S' || opcao == 's') {
			 boolean rodacodigo = true;
			 while(rodacodigo) {
				 System.out.println("\t [1] -  OPÇÕES PARA ALUNOS ");
	    		 System.out.println("\t [2] -  OPÇÕES PARA PROFESSORES ");
	    		 System.out.println("\t [3] -  FINALIZAR");
	    		 int opcaoUsuario = sc.nextInt();
	    		 switch(opcaoUsuario) {
	    		 
	    		 case 1:
	    			 aluno.switchCaseAlunos();
	    			 break;
	    		 case 2:
	    			 professor.switchCaseProfessores();
	    			 break;
	    		 case 3:
	    			 System.out.println("PROGRAMA [ALUNOS E PROFESSORES] FINALIZADO");
	    			 System.out.println();
	    			 rodacodigo = false;
	    			 break;
	    		 }
			 }
			 
		 }else {
			 System.out.println("\t VOCÊ DIGITOU [N] RETORNANDO AO MENU GERAL");
			 System.out.println();
		 }
	 }


public void homePageGeral() {
	Scanner sc = new Scanner(System.in);
	boolean codigoroda = true;
	Login logar = new Login();

	while(codigoroda) {
		System.out.println();
	    System.out.println("\t       [SISTEMA GERAL]");
		System.out.println("\t [1] -> CADASTRAR-SE NO SISTEMA" );
		System.out.println("\t [2] -> LOGAR NO SISTEMA ");
        System.out.println("\t [3] -> ENCERRAR PROGRAMA ");
        int opcao = sc.nextInt();
        System.out.println();
        switch (opcao) {
        case 1:
        	logar.cadastrarUsuarioLogin();
        	break;
        	
        case 2:
        	logar.Logar();
        	break;
        	
        case 3:
        	System.out.println("\t === Programa [GERAL] Finalizado === ");
        	codigoroda = false;
        	break;
        }
}

}	

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
		
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
		
	}

