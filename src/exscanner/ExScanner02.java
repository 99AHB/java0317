package exscanner;


import java.util.Scanner;


public class ExScanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ex1 = 0 ;
		int ex2 = 0 ;
		int ex3 = 0 ;
		String name = null ; 
		String name2 = null ;
		String name3 = null ;
		
		System.out.print("!!�̸��� �Է��ϼ���!!:");
		name = sc.nextLine();		
		
		System.out.print("!!�а����� �Է��ϼ���!! :");
		name2 = sc.nextLine();
			
		System.out.print("���� ���� �Է�:");
		ex1 = sc.nextInt();
		
		System.out.print("������ ���� �Է�:");
		ex2 = sc.nextInt();
		
		System.out.print("�������� ���� �Է�:");
		ex3 = sc.nextInt();
		
		System.out.print("!!�ּҸ� �Է��ϼ���!! :");
		name3 = sc.nextLine();
		
		System.out.printf("�̸�=%s\n", name);
		System.out.printf("�а���=%s\n", name2);
		System.out.printf("����=%s\n" , ex1);
		System.out.printf("������=%s\n" , ex2);
		System.out.printf("��������=%s\n", ex3);
		System.out.printf("����=%s\n", ex1+ex2+ex3);
		System.out.printf("���=%s\n", ((ex1+ex2+ex3)/3));
		System.out.printf("�ּ�=%s\n", name3);

	}

}


