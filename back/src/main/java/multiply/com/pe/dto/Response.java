package multiply.com.pe.dto;

public class Response {

	private double result;
	private String comment;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Response() {

	}

	public Response(double result, String comment) {
		super();
		this.result = result;
		this.comment = comment;
	}
	public Response(double result) {
		super();
		this.result = result; 
	}

}
