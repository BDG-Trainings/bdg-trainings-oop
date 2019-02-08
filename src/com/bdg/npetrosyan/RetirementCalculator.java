package com.bdg.npetrosyan;

import java.util.Scanner;


class RetirementCalculator {
    public static void main(String[] args) {
        int i1 = 1;
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter your name");
        Person person1 = new Person();
        person1.name = n1.nextLine();
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter your age");
        person1.age = a1.nextInt();
        Scanner g1 = new Scanner(System.in);
        System.out.println("Enter your sex: If male enter (1), If female enter (2)");
        person1.gender = g1.nextInt();
        person1.writeInfo();
        person1.speak();

        if(person1.gender==i1){
            person1.gender1();
        }else{
            person1.gender2();
        }
        person1.calculateYearsToRetirement();

    }
}
class Person{
    String name;
    int gender;
    int age;


    void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Years To Retirement ("+years+" Years remaining)");
    }

    void speak(){
        System.out.println("Name- " + name );
        System.out.println("Age- " + age);
    }

    void writeInfo(){
        System.out.println("Personal Info");
    }
    void gender1(){
        System.out.println("Gender- Male");
    }
    void gender2(){
        System.out.println("Female");
    }
    void femaleCalculateYearsToRetirement() {
        int years = 62 - age;
        System.out.println("Years To Retirement (" + years + " Years remaining)");
    }

}
/*class Female{
    String name;
    int age;

    void calculateYearsToRetirement(){
        int years = 62-age;
        System.out.println("Years To Retirement ("+years+" Years remaining)");

    }
    void speak(){
        {
            System.out.println("My name is " + name + "," + " I am " + age);
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
*/
