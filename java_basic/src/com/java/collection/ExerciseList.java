package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ExerciseList {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add('a');
		list.add("a");
		list.add(false);
		list.add(1.0f);
		list.add(1.0);
		list.add(1l);
		
		System.out.println("����Ʈ ũ�� : "+list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(i+"���� �� : "+list.get(i));
		}

	}

}
