package com.revature.list;

import java.util.Arrays;

public class MyArrayList {

	int[] arr = new int[10];
	int capacity = 10;
	int size = 0;
	
	public void add(int val) {
		arr[size] = val;
		
		size++;
		if(size >= capacity) {
			capacity *= 2;
			arr = Arrays.copyOf(arr, capacity);
		}
	}

	public void set(int index, int val) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("Index " + index + " out of bounds");
		}
		arr[index] = val;
	}

	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("Index " + index + " out of bounds");
		}
		for(int i = index; i < arr.length ; i++) {
			arr[index] = arr[index + 1];
		}
		size--;
	}

	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("Index " + index + " out of bounds");
		}else {
			return arr[index];
		}
	}

	@Override
	public String toString() {
		String s = "";
		s += "[";
		for(int i = 0; i < arr.length; i++) {
			if(i != 0) {
				s += ", ";
			}
			s += arr[i];
		}
		s += "]";
		return s;
	}
}
