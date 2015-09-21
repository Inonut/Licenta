package licenta.domain.logic;

public class Field<T> {

	private T field;
	private boolean isOK;
	public Field(T field, boolean isOK) {
		super();
		this.field = field;
		this.isOK = isOK;
	}
	
	public Field() {
		// TODO Auto-generated constructor stub
	}

	public T getField() {
		return field;
	}
	public void setField(T field) {
		this.field = field;
	}
	public boolean isOK() {
		return isOK;
	}
	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}
	
	
}
