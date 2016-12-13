package model;
// Generated 13-dic-2016 13:35:59 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NumerosBoletosId generated by hbm2java
 */
@Embeddable
public class NumerosBoletosId implements java.io.Serializable {

	private long idSorteo;
	private long idBoleto;
	private byte numero;

	public NumerosBoletosId() {
	}

	public NumerosBoletosId(long idSorteo, long idBoleto, byte numero) {
		this.idSorteo = idSorteo;
		this.idBoleto = idBoleto;
		this.numero = numero;
	}

	@Column(name = "IdSorteo", nullable = false)
	public long getIdSorteo() {
		return this.idSorteo;
	}

	public void setIdSorteo(long idSorteo) {
		this.idSorteo = idSorteo;
	}

	@Column(name = "IdBoleto", nullable = false)
	public long getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(long idBoleto) {
		this.idBoleto = idBoleto;
	}

	@Column(name = "Numero", nullable = false)
	public byte getNumero() {
		return this.numero;
	}

	public void setNumero(byte numero) {
		this.numero = numero;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NumerosBoletosId))
			return false;
		NumerosBoletosId castOther = (NumerosBoletosId) other;

		return (this.getIdSorteo() == castOther.getIdSorteo()) && (this.getIdBoleto() == castOther.getIdBoleto())
				&& (this.getNumero() == castOther.getNumero());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdSorteo();
		result = 37 * result + (int) this.getIdBoleto();
		result = 37 * result + this.getNumero();
		return result;
	}

}
