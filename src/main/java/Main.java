import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set set = new TreeSet();
        set.add("2");
        set.add("5");
        set.add("3");
        set.add("1");
        set.add("4");
        for (Object o : set){
            System.out.println(o);
        }

        /* ClassCastException
        ** Java не знает как сортировать Set
        Set personSet = new TreeSet();
        personSet.add(new Person(2));
        personSet.add(new Person(5));
        personSet.add(new Person(3));
        personSet.add(new Person(1));
        personSet.add(new Person(4));
        for (Object o : set){
            System.out.println(o);
        }
        */

        Set personImpComparableSet = new TreeSet();
        personImpComparableSet.add(new PersonImpComparable(2));
        personImpComparableSet.add(new PersonImpComparable(5));
        personImpComparableSet.add(new PersonImpComparable(3));
        personImpComparableSet.add(new PersonImpComparable(1));
        personImpComparableSet.add(new PersonImpComparable(4));
        for (Object o : personImpComparableSet){
            System.out.println(o);
        }

        Set personSet = new TreeSet(new ComparePerson());
        personSet.add(new Person(2));
        personSet.add(new Person(5));
        personSet.add(new Person(3));
        personSet.add(new Person(1));
        personSet.add(new Person(4));
        for (Object o : personSet){
            System.out.println(o.toString());
        }

    }

}
