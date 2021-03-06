package geopixel.model.hb.dto;

// default package
// Generated 15/07/2015 12:59:24 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * AppTabela generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "app_tabela")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppTabela implements java.io.Serializable{

	private int tblId;
	private String nome;
	private String urlConexaoBanco;
	private Set<AppDocumentoDigital> appDocumentoDigitals = new HashSet<AppDocumentoDigital>(0);
	private Set<AppDicionarioDado> appDicionarioDados = new HashSet<AppDicionarioDado>(0);

	public AppTabela() {
	}

	public AppTabela(int tblId) {
		this.tblId = tblId;
	}

	public AppTabela(int tblId, String nome, String urlConexaoBanco,
			Set<AppDocumentoDigital> appDocumentoDigitals, Set<AppDicionarioDado> appDicionarioDados) {
		this.tblId = tblId;
		this.nome = nome;
		this.urlConexaoBanco = urlConexaoBanco;
		this.appDocumentoDigitals = appDocumentoDigitals;
		this.appDicionarioDados = appDicionarioDados;
	}

	@Id
	@Column(name = "tbl_id", unique = true, nullable = false)
	public int getTblId() {
		return this.tblId;
	}

	public void setTblId(int tblId) {
		this.tblId = tblId;
	}

	@Column(name = "nome")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "url_conexao_banco")
	public String getUrlConexaoBanco() {
		return this.urlConexaoBanco;
	}

	public void setUrlConexaoBanco(String urlConexaoBanco) {
		this.urlConexaoBanco = urlConexaoBanco;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "appTabela")
	public Set<AppDocumentoDigital> getAppDocumentoDigitals() {
		return this.appDocumentoDigitals;
	}

	public void setAppDocumentoDigitals(Set<AppDocumentoDigital> appDocumentoDigitals) {
		this.appDocumentoDigitals = appDocumentoDigitals;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "appTabela")
	public Set<AppDicionarioDado> getAppDicionarioDados() {
		return this.appDicionarioDados;
	}

	public void setAppDicionarioDados(Set<AppDicionarioDado> appDicionarioDados) {
		this.appDicionarioDados = appDicionarioDados;
	}

}
