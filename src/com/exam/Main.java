package com.exam;

import java.util.ArrayList;
import java.util.List;


public class Main {

	List<Menu> menus = new ArrayList<>();
	Machine m = new Machine();

	public Main() {
		m.readMenu();
		m.on();
	}


	public static void main(String[] args) {
		new Main();
	}

}
