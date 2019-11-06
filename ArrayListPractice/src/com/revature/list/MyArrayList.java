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
		for(int i = index; i < size ; i++) {
			arr[i] = arr[i + 1];
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
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < size; i++) {
			if(i != 0) {
				sb.append(", ");
			}
			sb.append(arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}
}
