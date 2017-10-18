public class PersonImpComparable implements Comparable<PersonImpComparable> {

    int age;

    public PersonImpComparable(int age) {
        this.age = age;
    }

    public int compareTo(PersonImpComparable p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "PersonImpComparable{" +
                "age=" + age +
                '}';
    }
}
