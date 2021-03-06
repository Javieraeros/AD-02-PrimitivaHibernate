// default package
// Generated 19-dic-2016 9:00:20 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Premios generated by hbm2java
 */
@Entity
@Table(name = "Premios", schema = "dbo")
public class Premios implements java.io.Serializable {

	private PremiosId id;
	private Byte especial;
	private Byte primera;
	private Byte segunda;
	private Byte tercera;
	private Byte cuarta;
	private Byte quinta;

	public Premios() {
	}

	public Premios(PremiosId id) {
		this.id = id;
	}

	public Premios(PremiosId id, Byte especial, Byte primera, Byte segunda, Byte tercera, Byte cuarta, Byte quinta) {
		this.id = id;
		this.especial = especial;
		this.primera = primera;
		this.segunda = segunda;
		this.tercera = tercera;
		this.cuarta = cuarta;
		this.quinta = quinta;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tipoApuesta", column = @Column(name = "TipoApuesta", nullable = false)),
			@AttributeOverride(name = "numerosAcertados", column = @Column(name = "NumerosAcertados", nullable = false)) })
	public PremiosId getId() {
		return this.id;
	}

	public void setId(PremiosId id) {
		this.id = id;
	}

	@Column(name = "Especial")
	public Byte getEspecial() {
		return this.especial;
	}

	public void setEspecial(Byte especial) {
		this.especial = especial;
	}

	@Column(name = "Primera")
	public Byte getPrimera() {
		return this.primera;
	}

	public void setPrimera(Byte primera) {
		this.primera = primera;
	}

	@Column(name = "Segunda")
	public Byte getSegunda() {
		return this.segunda;
	}

	public void setSegunda(Byte segunda) {
		this.segunda = segunda;
	}

	@Column(name = "Tercera")
	public Byte getTercera() {
		return this.tercera;
	}

	public void setTercera(Byte tercera) {
		this.tercera = tercera;
	}

	@Column(name = "Cuarta")
	public Byte getCuarta() {
		return this.cuarta;
	}

	public void setCuarta(Byte cuarta) {
		this.cuarta = cuarta;
	}

	@Column(name = "Quinta")
	public Byte getQuinta() {
		return this.quinta;
	}

	public void setQuinta(Byte quinta) {
		this.quinta = quinta;
	}

}
