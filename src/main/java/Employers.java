import java.util.Objects;

public class Employers {
    private String name;
    private int age;
    private Position position;
    private int salary;

    enum Position {
        ENGEENEER, DIRECTOR, MANAGER
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employers(String name, int age, Position position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employers(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employers employers = (Employers) o;
        return age == employers.age &&
                salary == employers.salary &&
                Objects.equals(name, employers.name) &&
                position == employers.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position, salary);
    }
}
