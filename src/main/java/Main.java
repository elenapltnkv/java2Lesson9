import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employers> personList = new ArrayList<>();
        personList.add(new Employers("Oleg", 31, Employers.Position.DIRECTOR));
        personList.add(new Employers("Andrey", 22, Employers.Position.ENGEENEER));
        personList.add(new Employers("Oleg", 42, Employers.Position.MANAGER));
        personList.add(new Employers("Oleg", 24, Employers.Position.ENGEENEER));
        personList.add(new Employers("Oleg", 34, Employers.Position.ENGEENEER));
        personList.add(new Employers("Oleg", 52, Employers.Position.MANAGER));
        personList.add(new Employers("Oleg", 67, Employers.Position.DIRECTOR));

        //Оставить в списке только инженеров и отсортировать их по возрасту
        List<String> personList1 = personList.stream()
                .filter(p -> p.getPosition() == Employers.Position.ENGEENEER)
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .map(p -> p.getName())
                .collect(Collectors.toList());

        Optional<Integer> sumAges = personList.stream()
                .map(p -> p.getAge())
                .reduce((age1, age2) -> age1 + age2);

        System.out.println("Сумма возрастов персонов: " + sumAges);

        Stream<Integer> integerStream = Stream.of();
        Optional<Integer> intSum = integerStream.reduce((a1, a2) -> a1 + a2);

        if (intSum.isPresent()) {
            System.out.println(intSum.get());
        }
        //System.out.println(personList1);

        Stream.of("123", "1435", "123", "34")
                .distinct()
                .forEach(p -> System.out.println(p));

        Integer[][] integers = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {8, 7, 9}};

        Stream.of(integers)
                .flatMap(a -> Stream.of(a))
                .forEach(System.out::println);
    }
}
