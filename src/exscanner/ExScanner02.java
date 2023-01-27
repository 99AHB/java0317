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
		
		System.out.print("!!이름을 입력하세요!!:");
		name = sc.nextLine();		
		
		System.out.print("!!학과명을 입력하세요!! :");
		name2 = sc.nextLine();
			
		System.out.print("영어 점수 입력:");
		ex1 = sc.nextInt();
		
		System.out.print("물리학 점수 입력:");
		ex2 = sc.nextInt();
		
		System.out.print("미적분학 점수 입력:");
		ex3 = sc.nextInt();
		
		System.out.print("!!주소를 입력하세요!! :");
		name3 = sc.nextLine();
		
		System.out.printf("이름=%s\n", name);
		System.out.printf("학과명=%s\n", name2);
		System.out.printf("영어=%s\n" , ex1);
		System.out.printf("물리학=%s\n" , ex2);
		System.out.printf("미적분학=%s\n", ex3);
		System.out.printf("총점=%s\n", ex1+ex2+ex3);
		System.out.printf("평균=%s\n", ((ex1+ex2+ex3)/3));
		System.out.printf("주소=%s\n", name3);

	}

}


