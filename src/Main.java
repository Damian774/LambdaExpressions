import builder.Person;
import factory.Vehicle;
import factory.VehicleFactory;

import java.util.Arrays;

import static factory.VehicleFactoryEnum.*;

public class Main {

    public static void main(String[] args) {
/*
//Factory
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = vehicleFactory.getVehicle(CAR);
        vehicles[1] = vehicleFactory.getVehicle(PLANE);
        vehicles[2] = vehicleFactory.getVehicle(SHIP);

        Arrays.stream(vehicles).forEach(p -> System.out.println(p);
        Arrays.stream(vehicles).forEach(Vehicle::start); //polimorficzne wywolanie
//lambda to anonimowa impl interfejsu funkcyjnego
*/

/*

        Person[] people = new Person[2];

        people[0] = Person.PersonBuilder.aPerson("123").build();
        people[1] = Person.PersonBuilder.aPerson("123123123").withLastname("nazwisko").withFirstName("imie").build();


        Arrays.stream(people).forEach(person -> System.out.println(person));
        */

        MyInterface myAnonymousImplementation = new MyInterface() {
            @Override
            public String go(String s,String s2, int a) {
                return s + a + "Implementacja w 'anonimowej' klasie";

            }
        };


        MyInterface myLambda = (p1,p2,p3) ->{
            return p1+p2+"Implementacja w lambdzie";
        };

        MyFirstImplementation myFirstImplementation = new MyFirstImplementation();

        System.out.println(myFirstImplementation.go("x","a",7));
        System.out.println(myAnonymousImplementation.go("a","b",10));
        System.out.println(myLambda.go("b","15",15));

        useLambdaOrAnonymousInterface(new MyFirstImplementation(),"20","5",30);



        useLambdaOrAnonymousInterface(myAnonymousImplementation,"25","11",25);



        useLambdaOrAnonymousInterface(myLambda,"30","11",50);
        useLambdaOrAnonymousInterface((s,i,b)->s+i+"anonimowa lambda","2","13",3);



    }

    static void useLambdaOrAnonymousInterface(MyInterface myInterface,
                                              String s,String s1,int i){
        System.out.println(myInterface.go(s,s1,i));

    }
}

@FunctionalInterface
interface MyInterface{
    String go(String s,String s1,int a);
}

class MyFirstImplementation implements MyInterface{
    @Override
    public String go(String s,String s1, int a) {
        return s+a+"Implementacja w 'zwyklej' klasie";
    }
}
