package Group;


public class People {

	private String name;					//�̸�
	private String rank;					//����
	private int birthday;					//����
	private int people_id;					//�����ȣ
	private int start;						//�Ի糯¥
	private People_Department department;	//�μ�
	
	//����ڰ� ���� ������ ����
	private int phone_number;				//��ȭ��ȣ
	private String email;					//email
	private String address;					//�ּ�
	private People_Account account;			//����
	
	float pay;								//���޾�
	float serverence_pay;					//������
	
	public People() {
		department = new People_Department();
		account = new People_Account();
	}
	
	public void setPeople(String name, String rank, int birthday, int start, int department_code, String department_name, 
			int phone_number, int people_id, String email, String address, String account_name, String account_number, String account_owner) {
		this.setName(name);
		this.setRank(rank);
		this.setBirthday(birthday);
		this.setStart(start);
		department = new People_Department(department_code, department_name);
		this.setPhone_number(phone_number);
		this.setPeople_id(people_id);
		this.setEmail(email);
		this.setAddress(address);
		account = new People_Account(account_name, account_number, account_owner);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartmentName() {
		return department.getName();
	}

	public void setDepartmentName(String departmentName) {
		this.department.setName(departmentName);
	}
	
	public int getDepartmentCode() {
		return department.getCode();
	}
	
	public void setDepartmentCode(int code) {
		department.setCode(code);
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getPeople_id() {
		return people_id;
	}

	public void setPeople_id(int people_id) {
		this.people_id = people_id;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	
	public String getAccountName() {
		return account.getBank_name();
	}
	
	public void SetAccountName(String name) {
		account.setBank_name(name);
	}
	
	public String getAccountOwner() {
		return account.getAccount_owner();
	}
	
	public void SetAccountOwner(String owner) {
		account.setAccount_owner(owner);
	}
	
	public String getAccountNumber() {
		return account.getAccount_number();
	}
	
	public void SetAccountNumber(String number) {
		account.setAccount_number(number);
	}
	
	public int getYear() {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int year = cal.get ( cal.YEAR );
		return year-start;
	}
	   
}
