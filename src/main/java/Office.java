import java.util.List;

public class Office {
    private int id;
    private String name;
    private List<Employers> personList;

    public Office(int id, String name, List<Employers> personList) {
        this.id = id;
        this.name = name;
        this.personList = personList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employers> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Employers> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personList=" + personList +
                '}';
    }
}
