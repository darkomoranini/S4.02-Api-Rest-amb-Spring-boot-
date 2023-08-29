package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class FrutaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int id;
	
	private String nombre;
	private int cantidadKilos;
	
	public FrutaModel() {
		super();
	}
	
	public FrutaModel(int id, String nombre, int cantidadKilos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadKilos = cantidadKilos;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadKilos() {
		return cantidadKilos;
	}

	public void setCantidadKilos(int cantidadKilos) {
		this.cantidadKilos = cantidadKilos;
	}

}
