import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OfficeTestDrive {
    public static void main(String[] args) {
        List<Office> organizations = Arrays.asList(
                new Office(1, "DPD",
                        Arrays.asList(
                                new Employers("Olga", 20, Employers.Position.MANAGER, 30),
                                new Employers("Vlad", 22, Employers.Position.MANAGER, 50),
                                new Employers("Oleg", 30, Employers.Position.ENGEENEER, 100),
                                new Employers("Konstantin", 24, Employers.Position.ENGEENEER, 100))),
                new Office(2, "Pochta Rossii",
                        Arrays.asList(
                                new Employers("Olga1", 26, Employers.Position.ENGEENEER, 100),
                                new Employers("Alena", 30, Employers.Position.DIRECTOR, 300))),
                new Office(3, "DHL",
                        Arrays.asList(
                                new Employers("Olga2", 28, Employers.Position.MANAGER, 100),
                                new Employers("Victor", 18, Employers.Position.MANAGER, 100),
                                new Employers("Irina", 24, Employers.Position.ENGEENEER, 100),
                                new Employers("Vova", 40, Employers.Position.DIRECTOR, 300)),


        //Вернуть имена всех сотрудников, в компании которых > 2 человек
                        System.out.println(organizations.stream()
                                .filter(o -> o.getPersonList().size() > 2)
                                .map(o -> o.getPersonList())
                                .flatMap(p -> p.stream())
                                .distinct()
                                .map(p -> p.getName())
                                .collect(Collectors.toSet();


        //Создать map, где ключ-название должности, а значение - список людей на этой должности
        System.out.println(organizations.stream()
                .map(o -> o.getPersonList())
                .flatMap(people -> people.stream())
                .collect(Collectors.groupingBy(f -> f.getPosition())));

        //Создать map, где ключ-название должности, а значение - средняя зарплата людей на этой должности
        System.out.println(organizations.stream()
                .map(o -> o.getPersonList())
                .flatMap(people -> people.stream())
                .collect(Collectors.groupingBy(f -> f.getPosition(), Collectors.averagingDouble(f -> f.getSalary()))));
    }
}
