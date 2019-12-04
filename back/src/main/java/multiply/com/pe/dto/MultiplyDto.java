package multiply.com.pe.dto;
 
public class MultiplyDto {

	private Long id;
	private double one;
	private double two;
	private double result;

	public MultiplyDto() {
		super();
	}


	public MultiplyDto(double one, double two) {
		super(); 
		this.one = one;
		this.two = two;
		this.result = one*two;
	}
	public MultiplyDto(Long id, double one, double two, double result) {
		super();
		this.id = id;
		this.one = one;
		this.two = two;
		this.result = one*two;
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
