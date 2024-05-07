package com.abctreinamentos.siscapacit;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;


public class SiscapacitApp {
	
	
	static List<ServidorPublico> servidores = new LinkedList<>();
	List<Curso> cursos = new LinkedList<>();
	


	public void adicionarServidorPublico()
	{
		int matricula = Integer.parseInt(JOptionPane.showInputDialog ("Digite a matricula: "));
	    String nome = JOptionPane.showInputDialog ("Digite o nome: ");
	    String orgao = JOptionPane.showInputDialog ("Digite o orgao: ");
	    String cargo = JOptionPane.showInputDialog ("Digite o cargo: ");
	    String lotacao = JOptionPane.showInputDialog ("Digite a lota��o: ");
	    String email = JOptionPane.showInputDialog ("Digite o email: ");
	    double salario = Double.parseDouble(JOptionPane.showInputDialog ("Digite o salario: "));
	    
	    ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
	    servidores.add(servidor);
		
	}
	
	
	public void listaServidoresPublicos()
	{
		for (ServidorPublico servidor : servidores)
			System.out.println(servidor);
		
	}
	
	public void excluirServidorPublico(int matricula)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				servidores.remove(servidor);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor P�blico com a matr�cula informada n�o existe.");
		else

			System.out.println("A exclus�o do servidor publico com matricula "+matricula+
					" foi realizada");
	}
	
	public void alterarServidorPublico(ServidorPublico servidorAlterado)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == servidorAlterado.getMatricula())
			{	
				servidores.remove(servidor);
				servidores.add(servidorAlterado);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor P�blico com a matr�cula informada n�o existe.");
		else
			System.out.println("A altera��o do Servidor P�blico com a matr�cula "+servidorAlterado.getMatricula()+
					" foi realizada com sucesso!");
	}
	
	public void procurarServidorPublico(int matricula)
	{
		boolean encontrou = false;
		
		for(ServidorPublico servidor : servidores)
		{
			if(servidor.getMatricula() == matricula)
			{	
				System.out.println(servidor);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Servidor P�blico com a matr�cula informada n�o existe.");
	}
	
	public void calcularFolhaServidoresPublicos()
	{
		double folhaSalarial = 0;
		for (ServidorPublico servidor: servidores)
			folhaSalarial = folhaSalarial + servidor.getSalario();
		System.out.println("A folha salarial �: "+folhaSalarial);
	}
	
	
	public void adicionarCurso()
	{
		int idcurso = Integer.parseInt(JOptionPane.showInputDialog ("Digite id curso: "));
	    String nome = JOptionPane.showInputDialog ("Digite o nome: ");
	    String formarealizacao = JOptionPane.showInputDialog ("Digite o forma: ");
	    String ofertante = JOptionPane.showInputDialog ("Digite o ofertante: ");
	    double valor = Double.parseDouble(JOptionPane.showInputDialog ("Digite valor do curso: "));
	    
	    Curso curso = new Curso(idcurso, nome, formarealizacao, ofertante, valor);
	    cursos.add(curso);
		
	}
	
	
	public void listaCurso()
	{
		for (Curso curso : cursos)
			System.out.println(curso);
		
	}
	
	public void excluirCurso(int idcurso)
	{
		boolean encontrou = false;
		
		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == idcurso)
			{	
				cursos.remove(curso);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Curso com a idcurso informada n�o existe.");
		else

			System.out.println("A exclus�o do curso com matricula "+idcurso+
					" foi realizada");
	}
	
	public void alterarCurso(Curso cursoAlterado)
	{
		boolean encontrou = false;
		
		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == cursoAlterado.getIdcurso())
			{	
				cursos.remove(curso);
				cursos.add(cursoAlterado);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O curso com a idcurso informado n�o existe.");
		else
			System.out.println("A altera��o do curso com a idcurso "+cursoAlterado.getIdcurso()+
					" foi realizada com sucesso!");
	}
	
	public void procurarCurso(int idcurso)
	{
		boolean encontrou = false;
		
		for(Curso curso : cursos)
		{
			if(curso.getIdcurso() == idcurso)
			{	
				System.out.println(curso);
				encontrou = true;
				break;
			}
		}
		
		if(!encontrou)
			System.out.println("O Curso com a id curso informado n�o existe.");
	}
	
	public void calcularValorCurso()
	{
		double cursoTotal = 0;
		for (Curso curso: cursos)
			cursoTotal = cursoTotal + curso.getValor();
		System.out.println("A valor dos cursos � de: "+cursoTotal);
	}
	
	
	
	public static void main(String[] args) {
		//SiscapacitApp sistema = new SiscapacitApp();
		//sistema.adicionarServidorPublico();
		//sistema.adicionarServidorPublico();
		//sistema.adicionarServidorPublico();
		//sistema.listaServidoresPublicos();
		//sistema.procurarServidorPublico(111);
		//sistema.excluirServidorPublico(222);
		//ServidorPublico servidorAlterado = new ServidorPublico(3, "nome", "orgao", "cargo", "lotacao", 
			//	"email", 2334);
		//sistema.alterarServidorPublico(servidorAlterado);
		//sistema.listaServidoresPublicos();
		//sistema.calcularFolhaServidoresPublicos();
		
		SiscapacitApp curso = new SiscapacitApp();
		
		curso.adicionarCurso();
		curso.adicionarCurso();
		curso.adicionarCurso();
		curso.listaCurso();
		curso.procurarCurso(1);
		curso.excluirCurso(2);
		Curso cursoAlterado = new Curso(3, "nome", "formarealizacao", "ofertante", 333.4);
		curso.alterarCurso(cursoAlterado);
		curso.listaCurso();
		curso.calcularValorCurso();

	}

}
