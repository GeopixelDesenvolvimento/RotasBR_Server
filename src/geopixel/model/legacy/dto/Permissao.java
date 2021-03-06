package geopixel.model.legacy.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of app_permissao.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Permissao implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** pem_id. */
	private Integer pemId;

	/** app_tema. */
	private Tema appTema;

	/** queried. */
	private Boolean queried;

	/** resume. */
	private Integer resume;

	/** permit. */
	private String permit;

	/** The set of app_dicionario_dado. */
	private Set<DicionarioDado> appDicionarioDadoSet;

	/**
	 * Constructor.
	 */
	public Permissao() {
		this.appDicionarioDadoSet = new HashSet<DicionarioDado>();
	}

	/**
	 * Set the pem_id.
	 * 
	 * @param pemId
	 *            pem_id
	 */
	public void setPemId(Integer pemId) {
		this.pemId = pemId;
	}

	/**
	 * Get the pem_id.
	 * 
	 * @return pem_id
	 */
	public Integer getPemId() {
		return this.pemId;
	}

	/**
	 * Set the app_tema.
	 * 
	 * @param appTema
	 *            app_tema
	 */
	public void setAppTema(Tema appTema) {
		this.appTema = appTema;
	}

	/**
	 * Get the app_tema.
	 * 
	 * @return app_tema
	 */
	public Tema getAppTema() {
		return this.appTema;
	}

	/**
	 * Set the queried.
	 * 
	 * @param queried
	 *            queried
	 */
	public void setQueried(Boolean queried) {
		this.queried = queried;
	}

	/**
	 * Get the queried.
	 * 
	 * @return queried
	 */
	public Boolean getQueried() {
		return this.queried;
	}

	/**
	 * Set the resume.
	 * 
	 * @param resume
	 *            resume
	 */
	public void setResume(Integer resume) {
		this.resume = resume;
	}

	/**
	 * Get the resume.
	 * 
	 * @return resume
	 */
	public Integer getResume() {
		return this.resume;
	}

	/**
	 * Set the permit.
	 * 
	 * @param permit
	 *            permit
	 */
	public void setPermit(String permit) {
		this.permit = permit;
	}

	/**
	 * Get the permit.
	 * 
	 * @return permit
	 */
	public String getPermit() {
		return this.permit;
	}

	/**
	 * Set the set of the app_dicionario_dado.
	 * 
	 * @param appDicionarioDadoSet
	 *            The set of app_dicionario_dado
	 */
	public void setAppDicionarioDadoSet(Set<DicionarioDado> appDicionarioDadoSet) {
		this.appDicionarioDadoSet = appDicionarioDadoSet;
	}

	/**
	 * Add the app_dicionario_dado.
	 * 
	 * @param appDicionarioDado
	 *            app_dicionario_dado
	 */
	public void addAppDicionarioDado(DicionarioDado appDicionarioDado) {
		this.appDicionarioDadoSet.add(appDicionarioDado);
	}

	/**
	 * Get the set of the app_dicionario_dado.
	 * 
	 * @return The set of app_dicionario_dado
	 */
	public Set<DicionarioDado> getAppDicionarioDadoSet() {
		return this.appDicionarioDadoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pemId == null) ? 0 : pemId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Permissao other = (Permissao) obj;
		if (pemId == null) {
			if (other.pemId != null) {
				return false;
			}
		} else if (!pemId.equals(other.pemId)) {
			return false;
		}
		return true;
	}

}
