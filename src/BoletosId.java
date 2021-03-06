// default package
// Generated 19-dic-2016 9:00:20 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BoletosId generated by hbm2java
 */
@Embeddable
public class BoletosId implements java.io.Serializable {

	private long idBoleto;
	private long idSorteo;

	public BoletosId() {
	}

	public BoletosId(long idBoleto, long idSorteo) {
		this.idBoleto = idBoleto;
		this.idSorteo = idSorteo;
	}

	@Column(name = "IdBoleto", nullable = false)
	public long getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(long idBoleto) {
		this.idBoleto = idBoleto;
	}

	@Column(name = "IdSorteo", nullable = false)
	public long getIdSorteo() {
		return this.idSorteo;
	}

	public void setIdSorteo(long idSorteo) {
		this.idSorteo = idSorteo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BoletosId))
			return false;
		BoletosId castOther = (BoletosId) other;

		return (this.getIdBoleto() == castOther.getIdBoleto()) && (this.getIdSorteo() == castOther.getIdSorteo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdBoleto();
		result = 37 * result + (int) this.getIdSorteo();
		return result;
	}

}
