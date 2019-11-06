package com.revature.list;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MyArrayList {

	int[] arr = new int[10];
	int capacity = 10;
	int size = 0;
	
	public void add(int val) {
		arr[size] = val;
		
		size++;
		if(size == capacity) {
			capacity *= 2;
			arr = Arrays.copyOf(arr, capacity);
		}
	}

	public void set(int index, int val) {
		if(index < 0 || index >= size) {
			return;
		}
		arr[index] = val;
	}

	public void remove(int index) {
		if(index < 0 || index >= size) {
			return;
		}
		for(int i = index; i < arr.length ; i++) {
			arr[index] = arr[index + 1];
		}
		size--;
	}

	public int get(int index) {
		if(index < 0 || index >= size) {
			return 0;
		}else {
			return arr[index];
		}
	}

	@Override
	public String toString() {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println("]");
		return arr.toString();
	}
}
