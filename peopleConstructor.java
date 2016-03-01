class Person {
  public String firstName;
  public String lastName;

  Person(String fname, String lname) {
    this.firstName = fname;
    this.lastName = lname;
  }

  public String fullName() {
    return firstName + " " + lastName;
  }

  public static void main(String [] args) {
    Person newPerson = new Person(args[0], args[1]);
    System.out.println(newPerson.fullName());
  }
}
