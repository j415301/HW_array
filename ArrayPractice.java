package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] num = new int[10];
		for (int i=0 ; i<10 ; i++) {
			num[i] = i+1;
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice2() {
		int[] num = new int[10];
		for (int i=0 ; i<10 ; i++) {
			for (int j=10 ; j>=10-i ; j--) {
				num[i] = j;
			}
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int su = sc.nextInt();
		int[] nums = new int[su];
		for (int i=0 ; i<su ; i++) {
			nums[i] = i+1;
		}
		for (int i=0 ; i<su ; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public void practice4() {
		String[] fruit = {"���", "��", "����", "������", "����"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String user = sc.nextLine();
		System.out.print("���� : ");
		char alpha = sc.next().charAt(0);
		char[] loca = new char[user.length()];
		String index = "";
		int count = 0;
		for (int i=0 ; i<user.length() ; i++) {
			loca[i] = user.charAt(i);
		}
		for (int i=0 ; i<user.length() ; i++) {
			if (loca[i] == alpha) {
				index += ""+i+" ";
				count ++;
			}
		}
		System.out.println(user+"�� "+alpha+"�� �����ϴ� ��ġ(�ε���) : "+index);
		System.out.println("i ���� : "+count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int su = sc.nextInt();
		String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
		if (su>=0 && su<=6) {
			System.out.println(day[su]+"����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int su = sc.nextInt();
		int[] nums = new int[su];
		for (int i=0 ; i<su ; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			nums[i] = sc.nextInt();
		}
		int total = 0;
		for (int i=0 ; i<su ; i++) {
			System.out.print(nums[i]+" ");
			total += nums[i];
		}
		System.out.println();
		System.out.println("�� �� : "+total);
	}
	
	public void practice8() {
		//*******��ǰ
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		String[] menu = {"�Ķ��̵�","���","����","�Ѹ�Ŭ"};
		boolean flag = false;
		for (int i=0 ; i<menu.length ; i++) {
			if (menu[i].equals(chicken)) {
				flag = true;
			}
		}
		System.out.println(flag? chicken+"ġŲ ��� ����" : chicken+"ġŲ�� ���� �޴��Դϴ�.");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String user = sc.next();
		char[] code = new char[user.length()];
		for (int i=0 ; i<14 ; i++) {
			code[i] = user.charAt(i);
		}
		char[] code2 = code;
		for (int i=7 ; i<14 ; i++) {
			code2[i] = '*';
		}
		for(int i=0 ; i<14 ; i++) {
			System.out.print(code[i]);
		}
	}
	
	public void practice11() {
		int[] nums = new int[10];
		for (int i=0 ; i<10 ; i++) {
			nums[i] = (int)(Math.random()*10)+1;
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public void practice12() {
		int[] nums = new int[10];
		for (int i=0 ; i<10 ; i++) {
			nums[i] = (int)(Math.random()*10)+1;
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(nums[i]+" ");
		}
		for (int i=0 ; i<10 ; i++) {
			for (int j=0 ; j<i ; j++) {
				if (nums[i]<nums[j]) {
					int t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		}
		System.out.println();
		System.out.println("�ִ밪 : "+nums[9]);
		System.out.println("�ּҰ� : "+nums[0]);
	}
	
	public void practice13() {
		int[] nums = new int[10];
		for (int i=0 ; i<10 ; i++) {
			nums[i] = (int)(Math.random()*10)+1;
			for (int j=0 ; j<i ; j++) {
				if (nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		for (int i=0 ; i<6 ; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j=0 ; j<i ; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i=0 ; i<6 ; i++) {
			for (int j=0 ; j<i ; j++) {
				if (lotto[i]<lotto[j]) {
					int t = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = t;
				}
			}
		}
		for (int i=0 ; i<6 ; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String v = sc.nextLine();
		char[] voca = new char[v.length()];
		for (int i=0 ; i<v.length() ; i++) {
			voca[i] =  v.charAt(i);
		}
		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int i=0 ; i<v.length() ; i++) {
			System.out.print(voca[i]+" ");
		}
		System.out.println();
		System.out.println("���� ���� : "+v.length());
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];
		for (int i=1 ; i<=num ; i++) {
			System.out.print(i+"��° ���ڿ� : ");
			str[i-1] = sc.nextLine();
		}
		boolean flag = true;
		int num2 = 0;
		while (flag) {
			System.out.print("����ؼ� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char check = sc.next().charAt(0);
			if (check == 'Y') {
				System.out.println("�� �Է��ϰ� ���� ���� : ");
				num2 = sc.nextInt();
				
				for (int i=num+1 ; i<=num+num2 ; i++) {
					System.out.println(i+"��° ���ڿ� : ");
					str[i-1] = sc.nextLine();
				}
				continue;
			} else {
				flag = false;
			}
		}
	}
}
