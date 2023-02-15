import java.util.List;
import java.util.stream.Stream;
//enum Gender{ 남, 여 }
class Member {
    String name;
    Gender gender;
    int age;

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

public class TestThree {
    public static void main(String[] args) {
        int i = 0;
        Stream<String> ss;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        ss = names.stream();
        Stream<Member> sm = ss.map(n -> Member(n, genders.get(i), ages.get(i++)));
        System.out.println("[Member 스트림 원소]");
        sm.forEach(n -> System.out.print(n+ "\t"));

        ss = names.stream();
        System.out.println("[Member 스트림을 성별로 그룹핑]");
    }
}
