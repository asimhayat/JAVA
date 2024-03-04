class main {
        public static void main(String[] args) {
Student s1 = new Student();
s1.name= "Asim";
s1.age = 21;
s1.caste= "Punjabi";

Student s2 = new Student();
s2.name = "Abrar";
s2.age = 20;
s2.caste= "Sindhi";

s1.printInfo();
s2.printInfo();

        }

}

class Student {
    String name;
    int age;
    String caste;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.caste);

    }
}