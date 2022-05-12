package Group;


import java.util.Scanner;

public class User {
	private People people;
	private Worker worker;
	private PartTimer partTimer;
	
	public User(Worker worker) {
		this.worker = worker;
		people = worker;
		partTimer = null;
	}
	
	public User(PartTimer partTimer) {
		this.partTimer = partTimer;
		people = partTimer;
		worker = null;
	}
	
	public void print() {
		if(worker != null) {
			System.out.println("�̸�\t : "+worker.getName());
			System.out.println("�����ȣ\t : "+worker.getPeople_id());
			System.out.println("��ȣ\t : "+worker.getPhone_number());
			System.out.println("����\t : "+worker.getBirthday());
			System.out.println("�̸���\t : "+worker.getEmail());
			System.out.println("�ּ�\t : "+worker.getAddress());
			System.out.println("�μ���\t : "+worker.getDepartmentName());
			System.out.println("�μ���ȣ\t : "+worker.getDepartmentCode());
			System.out.println("����\t : "+worker.getRank());
			System.out.println("�Ի���\t : "+worker.getStart());
			System.out.println("���¹�ȣ\t : "+worker.getAccountNumber());
			System.out.println("��������\t : "+worker.getAccountName());
			System.out.println("���¿�����\t : "+worker.getAccountOwner());
			System.out.println("�ѱ޿�\t : "+worker.getTotal());
			System.out.println("������\t : "+worker.getTax());
			System.out.println("�����޾�\t : "+worker.getRealPay());
			System.out.println();
		}
		else {
			System.out.println("�̸�\t : "+partTimer.getName());
			System.out.println("�����ȣ\t : "+partTimer.getPeople_id());
			System.out.println("��ȣ\t : "+partTimer.getPhone_number());
			System.out.println("����\t : "+partTimer.getBirthday());
			System.out.println("�̸���\t : "+partTimer.getEmail());
			System.out.println("�ּ�\t : "+partTimer.getAddress());
			System.out.println("�μ���\t : "+partTimer.getDepartmentName());
			System.out.println("�μ���ȣ\t : "+partTimer.getDepartmentCode());
			System.out.println("����\t : "+partTimer.getRank());
			System.out.println("�Ի���\t : "+partTimer.getStart());
			System.out.println("���¹�ȣ\t : "+partTimer.getAccountNumber());
			System.out.println("��������\t : "+partTimer.getAccountName());
			System.out.println("���¿�����\t : "+partTimer.getAccountOwner());
			System.out.println("�ѱ޿�\t : "+partTimer.getTotalPay());
			System.out.println("������\t : "+partTimer.getTax());
			System.out.println("�����޾�\t : "+partTimer.getRealPay());
			System.out.println();
		}
	}
	
	//�������ε� �̿�
	public void edit() {
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1.��ȭ��ȣ 2.�̸��� 3.�ּ� 4.���¹�ȣ 5.�������� 6.���¿����� 7.����");
			choice = sc.nextInt();
			if(choice == 1) {
				people.setPhone_number(sc.nextInt());
			}
			else if(choice == 2) {
				people.setEmail(sc.next());
			}
			else if(choice == 3) {
				people.setAddress(sc.next());
			}
			else if(choice == 4 ) {
				people.SetAccountNumber(sc.next());
			}
			else if(choice == 5) {
				people.SetAccountName(sc.next());
			}
			else if(choice == 6) {
				people.SetAccountOwner(sc.next());
			}
			else if(choice == 7) {
				return;
			}
			else {
				System.out.println("�߸� �� �Է��Դϴ�.");
			}
		}
	}
}
