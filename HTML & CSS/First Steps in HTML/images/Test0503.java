// ��� �� ������ � ��������� switch:
//		- ��� ��� �� �����;
//		- ��� ���� �� ����� � ��������� �� ������������ �� ����������.

public class Test0503{
	public static void main(String[] args){
		Test0503 t= new Test0503();
		for (int i= 0;i<=4; i++){
			System.out.println("x= "+ i);
			t.test(i);
			System.out.println();
		}		
	}	
	void test(int x){
		switch(x){
			case 1: System.out.println(1);
			case 2:	System.out.println(2);
			case 0:	System.out.println(0);
			default:	System.out.println("d");
			case 4:	System.out.println(4);
		}	
	}	
}

/* ��� �� ����������� � �����:
	( � ) x  �� � �� �������� ��� �� ��������� sitch;
	( � ) ������� 0 � case-��������� ������ �� ��������� ������� 1;
	( � ) ����� case-����� ������ �� �������� � ��������� break;
	( � ) ������� default ������ �� � ��������� ������ � ��������� case;
	( � ) ���� ������ � ��������� switch � ��� � ���� ����� � ����������.
*/