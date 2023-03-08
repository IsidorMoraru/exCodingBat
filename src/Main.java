import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {


     public static void main(String[] args) {
         List<Person> people=new LinkedList<>();

         Person catalin=new Person("Catalin", "Somer");
         Person silvia=new Person("Silvia", "Mother");
         catalin.getNameAndType();
         silvia.getNameAndType();

         people.add(catalin);
         people.add(silvia);

         printNameOfPeople1(people);
         printNameOfPeople2(people);
         printNameOfPeople3(people);


     }
     public static  void printNameOfPeople1(List<Person> people){

            for(int index=0; index<=people.size()-1; index++) {
                System.out.print(people.get(index).name);

                if (index != people.size() - 1) {
                    System.out.print(", ");
                }
            }

     }

    public static void printNameOfPeople2(List <Person> people){

        System.out.println(people.toString());
    }

    public static void printNameOfPeople3(List <Person> people){

        Iterator<Person> peopleIterator=people.iterator();


        while(peopleIterator.hasNext()){
            Person actualPerson=peopleIterator.next();
            System.out.println(actualPerson.name);
            System.out.println(actualPerson.type);

        }



    }

 }

 class Person{
    public String name;
    public String type;


    public Person( String name, String type)
    {
        this.name=name;
        this.type=type;
        this.getNameAndType();
    }

    public String getNameAndType(){
        return this.name+this.type;
    }

    @Override
    public String toString(){
        return name;
    }
 }