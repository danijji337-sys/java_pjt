package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class CollectionEx {

	public static void main(String[] args) {
		
		
		// 어레이 리스트
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(4);
		
		nums.add(2, 100);
		
		nums.clear();
		
		// 스트링 -> 스트링 버퍼 -> 스트링 빌더
		// 어레이 -> 백터 -> 어레이 리스트
		
		Vector<Integer> nums2 = new Vector<Integer>();
		
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(50);
		
		nums2.remove(4);
		nums2.remove(4);
		
		nums2.add(2, 100);
		
		nums2.clear();
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
	}
		
}
