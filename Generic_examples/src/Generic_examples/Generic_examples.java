package Generic_examples;

public class Generic_examples <T> {

	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Generic_examples [data=" + data + "]";
	}
}
