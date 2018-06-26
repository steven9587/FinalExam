package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Machine {
	List<Menu> menus = new ArrayList<>();
	List<Integer> orders = new ArrayList<>();
	List<Integer> numbers = new ArrayList<>();
	Menu m;

	public void readMenu() {
		try {
			FileReader fr = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				String tokens[] = line.split(",");
				int number = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int heat = Integer.parseInt(tokens[3]);
				Menu m = new Menu(number, name, price, heat);
				menus.add(m);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void on() {
		int z = -1;
		while (z != 0) {
			for (Menu m : menus) {
				System.out.println(m.getNumber() + " " + m.getName());
			}
			System.out.println(0 + " " + "結算");
			System.out.println("q" + " " + "離開");
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入餐點:");
			int order = scanner.nextInt();
			orders.add(order);
			System.out.print("請輸入數量:");
			int number = scanner.nextInt();
			numbers.add(number);
			switch (order) {
			case 1:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 2:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 3:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 4:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 5:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 6:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			case 7:
				for (int i = 0; i < orders.size(); i++) {
					System.out.println(
							"目前餐點：" + (i+1) + "." + menus.get(orders.get(i) - 1).getName() + " " + numbers.get(i) + "份");
				}
				System.out.println("==========");
				break;
			}
		}
	}
}
