package edu.iffotex;

import java.util.Scanner;

public class ifForEx1026 {
	public static void main(String[] args) {
		int a = -7 ;
		
		if( a> 0 ) {
			System.out.printf("a=%d�� �����\n", a);
		}
		else if(a < 0){
			System.out.printf("a=%d�� ����\n", a);
		}
		else { 
			System.out.printf("a=%d�� 0�Դϴ�\n", a);
		}

		//���� �Ǻ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA����(0~100)�Է� :");
		int score = sc.nextInt() ;
		
		if(90<= score && score <=100)
		{ 
			System.out.printf("A����");
		}
		else if(80 <= score && score <= 89) {
			System.out.printf("B����");
		}
		else if(70 <= score && score <= 79) {
			System.out.printf("C����");
		}
		else if(60 <= score && score <= 69) {
			System.out.printf("D����");
		}
		else 
			System.out.printf("F����");
		//////////////////////////////////////
		if(90<= score)
		{ 
			System.out.printf("A����");
		}
		else if(80 <= score) {
			System.out.printf("B����");
		}
		else if(70 <= score) {
			System.out.printf("C����");
		}
		else if(60 <= score) {
			System.out.printf("D����");
		}
		else 
			System.out.printf("F����");
		
		
		int share = score / 10;
		if( share == 10 || share ==9)
			System.out.printf("A����");
		else if(share ==8)
			System.out.printf("B����");
		else if(share ==7)
			System.out.printf("C����");
		else if(share ==6)
			System.out.printf("D����");
		else
			System.out.printf("F����");
	}
}
