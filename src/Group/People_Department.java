package Group;


public class People_Department {
	private int code;		//�μ� ��ȣ
	private String name;	//�μ� �̸�
	
	public People_Department() {
		
	}
	
	public People_Department(int code, String name) {
		this.setCode(code);
		this.setName(name); 
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
