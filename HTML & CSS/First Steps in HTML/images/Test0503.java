// Има ли грешка в оператора switch:
//		- ако има то каква;
//		- ако няма то какъв е резултата от изпълнението на програмата.

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

/* Кое от твърденията е вярно:
	( а ) x  не е от подходящ тип за оператора sitch;
	( б ) етикета 0 в case-условието трябва да предхожда етикета 1;
	( в ) всяка case-група трябва да завършва с оператора break;
	( г ) етикета default трябва да е последния етикет в оператора case;
	( д ) няма грешка в оператора switch и ако е така какъв е резултатът.
*/