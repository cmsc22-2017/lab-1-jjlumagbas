// JJ: Perfect!

class Person {
  String name;
  int age;
  String gender;
  Address address;

  Person(String name, int age, String gender, Address address) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
  }

}

class Address {
  String city;
  String state;

  Address(String city, String state) {
    this.city = city;
    this.state = state;
  }
}

class ExamplesPerson {
  ExamplesPerson() {}

  Address boston = new Address("Boston", "MA");
  Address warwick = new Address("Warwick", "RI");
  Address nashua = new Address("Nashua", "NH");

  Person tim = new Person("Tim", 20, "M", this.warwick);
  Person pat = new Person("Pat", 19, "F", this.boston);
  Person kim = new Person("Kim", 17, "F", this.boston);
  Person dan = new Person("Dan", 22, "M", this.nashua);

}
