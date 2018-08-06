import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		
		/*
		Student student = new Student();
		student.setName("강감찬");
		student.setGender("남자");
		student.setScore(97);
		student.setSubject("사회복지학과");
		student.setAge(24);
		
		Student student1 = new Student("남자현", "여자", 92, "전자계산학과", 25);
		*/
		
		
		//Student 클래스의 인스턴스 배열
		Student [] ar = new Student[5];
		ar[0] = new Student("을지문덕","남자",98,"컴퓨터공학과",24);
		ar[1] = new Student("권유리","여자",75,"조리학과",30);
		ar[2] = new Student("이지연","여자",99,"컴퓨터공학과",25);
		ar[3] = new Student("최수지","여자",100,"컴퓨터공학과",28);
		ar[4] = new Student("최재성","남자",54,"체육학과",35);
		
		
		/*
		//성별이 남자인 데이터만 출력
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(student -> student.getGender().equals("남자")).
		 forEach(student -> System.out.println(student));
		*/
		/*
		//성별이 여자이고 나이가 30이상인 데이터
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(
				student -> student.getGender().equals("여자") &&student.getAge() >= 30).
		 forEach(student -> System.out.println(student));
		*/
		/*
		//Student를 score 로 변경
		Stream<Student> stream = Arrays.stream(ar);
		stream.mapToInt(Student::getScore).forEach(student -> System.out.println(student));
		*/
		/*
		int [] array = {30, 20, 31, 78, 12};
		
		IntStream stream = Arrays.stream(array);
		
		stream.sorted().forEach(su -> System.out.println(su));
		
		String [] insa = {
				"Morning", "Afternoon", "Evening", "Night"
		};
		*/
		/*
		//문자열 배열을 정렬해서 출력
		Stream<String> s = Arrays.stream(insa);
		//s.sorted().forEach(su -> System.out.println(su));
		//내림차순 
		s.sorted((n1,n2)->n2.compareTo(n1)).forEach(su -> System.out.println(su));
		*/
		
		Stream<Student> stream1 = Arrays.stream(ar);
		stream1.sorted((n1,n2)->n2.getAge()-n1.getAge()).forEach(student -> System.out.println(student));

	}

}
