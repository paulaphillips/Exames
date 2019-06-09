package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import dao.ExamesDAO;
import model.Exame;

@Action(value = "default", results = { @Result(name = "SUCCESS", location = "/welcome.jsp"),
		@Result(name = "ERROR", location = "/error.jsp") })
@Namespaces(value = { @Namespace("/"), @Namespace("/") })
public class LoginAction {

	public Exame exame = new Exame();

	private List<Exame> exames = new ArrayList<Exame>();

	private ExamesDAO examesDao = new ExamesDAO();

	@Action(value = "cadastrarExame", results = { @Result(name = "SUCCESS", location = "/listar_exames.jsp"),
			@Result(name = "ERROR", location = "/login2.jsp") })
	public String cadastrarExame() {

		try {
			examesDao.adicionarExame(exame);
		} catch (SQLException e) {
			return "ERROR";
		}

		return "SUCCESS";
	}

	@Action(value = "listar_exames", results = { @Result(name = "SUCCESS", location = "/listar_exames.jsp"),
			@Result(name = "ERROR", location = "/login2.jsp") })
	public String listarExame() {

		try {
			examesDao.listarExames();
		} catch (SQLException e) {
			return "ERROR";
		}

		Exame teste1 = new Exame();
		teste1.setNome("paula");
		teste1.setCpf("47111312312321");
		teste1.setEmail("phillips");
		teste1.setExame("sangue");
		teste1.setData("15/08/196");
		teste1.setSituacao("concluido");
		teste1.setId("1");
		Exame teste2 = new Exame();
		teste2.setNome("eric");
		teste2.setCpf("58896547");
		teste2.setEmail("ornelas");
		teste2.setExame("sangue1");
		teste2.setData("12/06/1991");
		teste2.setSituacao("espera");
		teste2.setId("2");

		exames.add(teste1);
		exames.add(teste2);

		return "SUCCESS";
	}

	@Action(value = "excluir_exame", results = { @Result(name = "SUCCESS", location = "/listar_exames.jsp"),
			@Result(name = "ERROR", location = "/login2.jsp") })
	public String excluirExame() {

		try {
			System.out.println(exame);
			examesDao.excluirExame(Long.parseLong(exame.getId()));
		} catch (SQLException e) {
			return "ERROR";
		}
		return listarExame();
	}

	@Action(value = "alterar_exame", results = { @Result(name = "SUCCESS", location = "/listar_exames.jsp"),
			@Result(name = "ERROR", location = "/login2.jsp") })
	public String alterarExame() {

		try {
			examesDao.alterarExame(exame);
		} catch (SQLException e) {
			return "ERROR";
		}
		return listarExame();
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

}
