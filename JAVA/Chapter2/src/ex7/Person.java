package ex7;

public class Person {
    String name;
    int age;

    public Person() {
         this("이름없음", 1); // 생성자에서 생성자 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.showPerson();
        
        Person person2 = new Person("Kim",20);
        person2.showPerson();
    }
}
