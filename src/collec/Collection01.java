package collec;

import java.util.ArrayList;
import java.util.List;

// List<E>: 순서o, 중복 저장o
// Set<E>: 순서x, 중복 저장x
// Map<K, V>: 순서x, 키/값 저장
public class Collection01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();// 인터페이스는 객체 생성 불가
		list.add(100);// 0
		list.add(200);// 1
		list.add(300);// 2
		System.out.println(list);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		System.out.println(list);// [100, 200, 300, 0, 1, 2]

		for (int i = 0; i < 3; i++) {
			list.add(i * 2, 10 * i);
		}
		System.out.println(list);// [0, 100, 10, 200, 20, 300, 0, 1, 2]
		list.clear();
		System.out.println(list.isEmpty());// true
		
		for (int i = 0; i < 10; i++) {
			// list.add(i, 10 - i);
			list.add(0, i + 1);
		}
		System.out.println(list);// [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
	}
}
