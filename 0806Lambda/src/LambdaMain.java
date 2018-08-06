import java.util.*;

interface T{
	public void method(int n);
}

interface V{
	public int add(int n1, int n2);
}


public class LambdaMain {

	public static void main(String[] args) {
		/*
		// 위와같은 인터페이스 T를 구현해서 사용해야 하는 경우 
		T ob1 = (n) ->{
			System.out.println("n:"+n);
		};
		*/
		V ob = (n1 , n2) ->{
			return n1 + n2;
		};
		System.out.println(ob.add(100,3000));
		
		//배열은 [인덱스]를 통해서 각가의 데이터에 접근합니다.
		int [] ar = {10, 30, 20};
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]); 
		}
		System.out.println("========================");
		//List 는 get(인덱스)를 통해서 각각의 데이터에 접근합니다.
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(40);
		/*
		for(int i=0; i<list.size(); i=i+1) {
			System.out.println(list.get(i));
		}
		*/
		for(int temp : list) {
			System.out.println(temp);
		}
		
		
		}

}
