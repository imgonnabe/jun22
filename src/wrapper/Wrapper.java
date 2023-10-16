package wrapper;

import java.util.ArrayList;
import java.util.List;

// 랩퍼 클래스
/*
 * 컬랙션 타입은 참조값만 담을 수 있다.
 * = 기본 자료형의 값은 담을 수 없다.
 * 
 * 기본 자료형의 값을 컬랙션에 담기 위해서 랩퍼 클래스를 사용한다.
 * 모든 기본 자료형에 대해새ㅓ 그에 대응하는 랩퍼 클래스가 있다.
 * 기본 자료형의 값을 멤버 변수의 값으로 저장하고
 * 이 값 주위로 값을 가공하는 메소드들이 감싸고 있다고해서 랩퍼 클래스라고 한다.
 * 
 * 기본 자료형    랩퍼 클래스
 *	  char          Character
 *   boolean         Boolean
 *    byte           Byte
 *    short          Short
 *    int           Integer    
 *    long           Long
 *    float          Float
 *   double          Double
 */ 

public class Wrapper {
	public static void main(String[] args) {
		int num = 20;
		List<Integer> a = new ArrayList<Integer>();
		
		Integer i1 = new Integer(100);
		Integer i2 = 100;// 오토 박싱
		byte b = i2.byteValue();
		System.out.println(b);// 100
		short s = i2.shortValue();
		
		// Byte bNum = new Byte((byte)20);
		Byte bNum = 20;
		bNum.intValue();
		float f = bNum.floatValue();
		b = Byte.MAX_VALUE;
		System.out.println(b);
		
		if (i1.equals(i2)) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		
		int num1 = i2;// 오토 언박싱
		System.out.println(num1);
		
		Object obj = 10;
		System.out.println(obj);
		
		int num2 = (int)obj + 1;
		System.out.println(num2);
		
		int num3 = ((Integer)obj).intValue() + 1;
		System.out.println(num3);
	}
}
