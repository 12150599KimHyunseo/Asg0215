import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;
enum Gender{ 남, 여 }

public class TestTwo {
    private static OptionalDouble getAverage(List<Integer> list) {
        return list.stream().mapToInt(a -> a).average();
    }
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce((x, y) -> x + y));

        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());

        si = ages.stream();
        OptionalDouble avg = getAverage(ages);
        System.out.println(avg);
    }
}