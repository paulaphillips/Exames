package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Exame;


public class ExamesDAO {

//	Connection connection = new ConnectionFactory().getConnection();

	public void adicionarExame(Exame exame) throws SQLException {

//		try {
//		String sql = "insert into exames (nome,cpf,email,exame,data,situacao) values (?,?,?,?)";
//
//		PreparedStatement stmt = connection.prepareStatement(sql);
//
//		stmt.setString(1, exame.getNome());
//		stmt.setString(2, exame.getCpf());
//		stmt.setString(3, exame.getEmail());
//		stmt.setString(4, exame.getExame());
//		stmt.setString(5, exame.getData());
//		stmt.setString(6, exame.getSituacao());
//
//		stmt.execute();
//		stmt.close();
//
//		connection.close();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
		
	}

	public List<Exame> listarExames() throws SQLException {
//		try {
//			List<Exame> examesList = new ArrayList<Exame>();
//
//			PreparedStatement stmt = connection.prepareStatement("select * from exames");
//			ResultSet rs = stmt.executeQuery();
//
//			while (rs.next()) {
//
//				Exame exame = new Exame();
//				exame.setNome(rs.getString("nome"));
//				exame.setEmail(rs.getString("email"));
//				exame.setCpf(rs.getString("cpf"));
//				exame.setExame(rs.getString("exame"));
//				exame.setData(rs.getString("data"));
//				exame.setSituacao(rs.getString("situacao"));
//
//				examesList.add(exame);
//			}
//
//			rs.close();
//			connection.close();
//
//			return examesList;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
		return null;
	}

	public void alterarExame(Exame exame) throws SQLException {

//		String sql = "update exames set nome=?, cpf=?, email=?, exame=?," + "data=?, situacao=? where id=?";
//		try {
//			PreparedStatement stmt = connection.prepareStatement(sql);
//
//			stmt.setString(1, exame.getNome());
//			stmt.setString(2, exame.getCpf());
//			stmt.setString(3, exame.getEmail());
//			stmt.setString(4, exame.getExame());
//			stmt.setString(5, exame.getData());
//			stmt.setString(6, exame.getSituacao());
//			stmt.setString(7, exame.getId());
//
//			stmt.execute();
//			stmt.close();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
	}

	public void excluirExame(Long id) throws SQLException {
//		try {
//			PreparedStatement stmt = connection.prepareStatement("delete from exames where id=?");
//
//			stmt.setLong(1, id);
//			stmt.execute();
//			stmt.close();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
	}
}
