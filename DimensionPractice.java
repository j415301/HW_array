package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		String[][] arr = new String[3][3];
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				arr[i][j] = "("+i+", "+j+")";
			}
		}
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 0;
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				arr[i][j] = ++num;
			}
		}
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int num = 16;
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				arr[i][j] = num--;
			}
		}
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				arr[i][3] += arr[i][j]; 
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]*2;
			}
		}
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ũ�� : ");
		int line = sc.nextInt();
		System.out.print("�� ũ�� : ");
		int column = sc.nextInt();
		char[][] arr = new char[line][column];
		for (int i=0 ; i<line ; i++) {
			for (int j=0 ; j<column ; j++) {
				arr[i][j] = (char)((int)(Math.random()*26)+65);
			}
		}
		for (int i=0 ; i<line ; i++) {
			for (int j=0 ; j<column ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
			"��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "!", "��", "!! "}};
		for (int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				String t = strArr[i][j];
				strArr[i][j] = strArr[j][i];
				strArr[j][i] = t;
			}
		}
		for (int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� : ");
		int line = sc.nextInt();
		char[][] arr = new char[line][];
		char alpha = 'a';
		for (int i=0 ; i<line ; i++) {
			System.out.print(i+"���� �� ũ�� : ");
			int row = sc.nextInt();
			arr[i] = new char [row]; //�� �࿡ ���ּҸ� ����
		}
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = alpha;
				++alpha;
			}
		}
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] student = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������",
				"������", "��õ��", "��ǳǥ", "ȫ����"};
		String[][] sit = new String[3][2];
		int num = 0;
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				sit[i][j] = student[num];
				num++;
			}
		}
		System.out.println("== 1�д� ==");
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				System.out.print(sit[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				sit[i][j] = student[num];
				num++;
			}
		}
		System.out.println("== 2�д� ==");
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				System.out.print(sit[i][j]+" ");
			}
			System.out.println();
		}
	}
}