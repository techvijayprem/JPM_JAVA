package CURD_Operations;

public class persal_info {

	private String name , stream;
	private int enroll;
	
	
	public persal_info() {

	}
	
	
	public persal_info(String name, String stream, int enroll) {
		super();
		this.name = name;
		this.stream = stream;
		this.enroll = enroll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getEnroll() {
		return enroll;
	}
	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}
	@Override
	public String toString() {
		return "persal_info [name=" + name + ", stream=" + stream + ", enroll=" + enroll + "]";
	}
	
	
}
