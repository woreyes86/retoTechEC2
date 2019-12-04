package multiply.com.pe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_multiply")
public class Multiply {
	@Id
	@GeneratedValue
	@Column(name = "ID_DATA")
	private Long id;

	@Column(name = "SUMANDO1")
	private double one;
	@Column(name = "SUMANDO2")
	private double two;
	@Column(name = "RESULTADO")
	private double result;

	public Multiply() {
		super();
	}

	public Multiply(Long id, double one, double two, double result) {
		super();
		this.id = id;
		this.one = one;
		this.two = two;
		this.result = result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getOne() {
		return one;
	}

	public void setOne(double one) {
		this.one = one;
	}

	public double getTwo() {
		return two;
	}

	public void setTwo(double two) {
		this.two = two;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
