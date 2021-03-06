package geopixel.model.hb.dto;

// default package
// Generated 15/07/2015 12:59:24 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AppUsarioxprefil generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "app_usarioxprefil")

public class AppUsarioxprefil implements java.io.Serializable{

	private AppUsarioxprefilId id;
	private AppUsuario appUsuario;
	private AppPerfil appPerfil;

	public AppUsarioxprefil() {
	}

	public AppUsarioxprefil(AppUsarioxprefilId id, AppUsuario appUsuario,
			AppPerfil appPerfil) {
		this.id = id;
		this.appUsuario = appUsuario;
		this.appPerfil = appPerfil;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "prfId", column = @Column(name = "prf_id", nullable = false)),
			@AttributeOverride(name = "usrId", column = @Column(name = "usr_id", nullable = false)) })
	public AppUsarioxprefilId getId() {
		return this.id;
	}

	public void setId(AppUsarioxprefilId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usr_id", nullable = false, insertable = false, updatable = false)
	public AppUsuario getAppUsuario() {
		return this.appUsuario;
	}

	public void setAppUsuario(AppUsuario appUsuario) {
		this.appUsuario = appUsuario;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prf_id", nullable = false, insertable = false, updatable = false)
	public AppPerfil getAppPerfil() {
		return this.appPerfil;
	}

	public void setAppPerfil(AppPerfil appPerfil) {
		this.appPerfil = appPerfil;
	}

}
