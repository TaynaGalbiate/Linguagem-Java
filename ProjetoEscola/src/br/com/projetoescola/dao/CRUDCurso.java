package br.com.projetoescola.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoescola.domain.Curso;

public class CRUDCurso extends Conexao implements CRUD<Curso> {

	@Override
	public String gravar(Curso obj) {
		String msg = "";
		
		try {
			abrirConexao();
			String sql = "insert into curso(titulo, descricao, datainicio, datatermino, horarioinicio, horariotermino)values(?,?,?,?,?,?,?)";
		
		pst = conn.prepareStatement(sql);
		//Passar os parametros ara os pontos de interrogação
		pst.setString(1, obj.getTitulo());
		pst.setString(2, obj.getDescricao());
		pst.setDate(3, obj.getDatainicio());
		pst.setDate(4, obj.getDatatermino());
		pst.setString(5, obj.getHorarioinicio());
		pst.setString(6, obj.getHorariotermino());
		
		/*
		 Quando executamos a consulta usando o comando executeUpdate ele 
		 retorna um número que pode ser 1 ou 0(zero), sendo 1 quando o
		 dado é inserido e 0(zero) quando o dado não é inserido.
		 */
		int i = pst.executeUpdate();
		
		if(i>0) {
			msg = "Curso cadastrado com sucesso!";
		}
		else {
			msg = "Não foi possível cadastrar!";
		}
		
		}
		
		catch(SQLException se) {
			msg = "Erro de SQL -> "+se.getMessage();
			}
		catch(Exception e) {
			msg = "Erro inesperado -> " + e.getMessage();
			}
		
		finally {
			fecharConexao();
		}
		
		return msg;
	}

	@Override
	public List<Curso> listar() {
		/*
		 Vamos criar uma lista de cursos, onde sua implementação é
		 um array de cursos no formato de uma lista de cursos.
		 Assim teremos linhas e colunas para os cursos.
		 */

		List<Curso> lstCurso = new ArrayList<Curso>();
		
		try {
			abrirConexao();
			String sql = "Select * From curso";
			//Preparar a consulta para ser executada
			pst = conn.prepareStatement(sql);
			/*
			 O comando executeQuery é utilizado para executar comando 
			 de select.
			 O retorno do executeQuery é um ResultSet, portanto é 
			 necessário que haja uma variável do tipo ResultSet
			 para guardar o retorno da execução. Estamos usando
			 a variável rs que foi declarada na classe Conexao
			 */
			rs = pst.executeQuery();
			
			/*
			 Enquanto houver dados na tabela de banco dados o laço continua a
			 buscar os dados. O comando next() do rs captura dados da tabela e 
			 adiciona em novo curso.
			 */
			
			while(rs.next()) {
				Curso curso = new Curso();
				
				curso.setIdCurso(rs.getLong(1));
				curso.setTitulo(rs.getString(2));
				curso.setDescricao(rs.getString(3));
				curso.setDatainicio(rs.getDate(4));
				curso.setDatatermino(rs.getDate(5));
				curso.setHorarioinicio(rs.getString(6));
				curso.setHorariotermino(rs.getString(7));
				
				//Adiciona um novo curso na lista de curso.
				lstCurso.add(curso);
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
		return lstCurso;
	}

	@Override
	public List<Curso> listar(Curso obj) {
		/*
		 Vamos criar uma lista de cursos, onde sua implementação é
		 um array de cursos no formato de uma lista de cursos.
		 Assim teremos linhas e colunas para os cursos.
		 */

		List<Curso> lstCurso = new ArrayList<Curso>();
		
		try {
			abrirConexao();
			
			String sql = "";
			
			if(obj.getIdCurso()!=0) {
				sql = "Select * From WHERE idcurso = "+obj.getIdCurso();
			}
			else if (obj.getTitulo()!=null) {
				sql = "Select * From WHERE titulo like "+obj.getTitulo()+"%"; //Utilizamos o % para que a pessoa digite o começo e apareça os finais pertinentes
			}
			else if(obj.getDescricao()!=null) {
				sql = "Select * From WHERE descricao like %"+obj.getTitulo()+"%";
			}
			else {
				sql = "Select * From curso";
			}
			
		
			pst = conn.prepareStatement(sql);
			/*
			 O comando executeQuery é utilizado para executar comando 
			 de select.
			 O retorno do executeQuery é um ResultSet, portanto é 
			 necessário que haja uma variável do tipo ResultSet
			 para guardar o retorno da execução. Estamos usando
			 a variável rs que foi declarada na classe Conexao
			 */
			rs = pst.executeQuery();
			
			/*
			 Enquanto houver dados na tabela de banco dados o laço continua a
			 buscar os dados. O comando next() do rs captura dados da tabela e 
			 adiciona em novo curso.
			 */
			
			while(rs.next()) {
				Curso curso = new Curso();
				curso.setIdCurso(rs.getLong(1));
				curso.setTitulo(rs.getString(2));
				curso.setDescricao(rs.getString(3));
				curso.setDatainicio(rs.getDate(4));
				curso.setDatatermino(rs.getDate(5));
				curso.setHorarioinicio(rs.getString(6));
				curso.setHorariotermino(rs.getString(7));
				
				//Adiciona um novo curso na lista de curso.
				lstCurso.add(curso);
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
		return lstCurso;
		
	}

	@Override
	public Curso atualizar(Curso obj) {
		Curso curso = new Curso();
		
		try {
			abrirConexao();
			String sql = "UPDATE curso SET = titulo=?, descricao=?, datainicio=?, datatermino=?, horarioinicio=?, horariotermino=? WHERE idcurso=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, obj.getTitulo());
			pst.setString(2, obj.getDescricao());
			pst.setDate(3, obj.getDatainicio());
			pst.setDate(4, obj.getDatatermino());
			pst.setString(5, obj.getHorarioinicio());
			pst.setString(6, obj.getHorariotermino());
			pst.setLong(7, obj.getIdCurso());
			
			int i = pst.executeUpdate();
			if(i>0) {
				curso = obj;
			}
			else {
				//Exibir mensagem de erro mesmo sem reorno de String
				throw new Exception ("Não foi possível atualizar");
			}
		}
		
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
		return curso;
	}

	@Override
	public String apagar(Curso obj) {
		String msg = "";
		
		try {
			abrirConexao();
			String sql = "Delete From curso WHERE idcurso=?";
			pst = conn.prepareStatement(sql);
			pst.setLong(1, obj.getIdCurso());
			int i = pst.executeUpdate();
			if(i>0) {
				msg = "Curso apagado!";
			}
			else {
				msg = "Não foi possível apagar o curso!";
			}
		}
		catch(SQLException se) {
			msg = "Erro na consulta de SQL -> "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado -> "+e.getMessage();
			}
		finally {
			fecharConexao();
		}
		
		return msg;
	}
	

}
