class Student {
    String name;
    int age;

    static int studentCount = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    static void showStudentCount() {
        System.out.println(studentCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Бастапқы сан
        Student.showStudentCount(); // 0

        // Студенттерді құру
        Student s1 = new Student("Shyhmyrat", 20);
        Student s2 = new Student("Nadirbek", 19);
        Student s3 = new Student("Shagadam", 21);

        // Құрылғаннан кейінгі сан
        Student.showStudentCount(); // 3

        // Әр студенттің атын шығару
        System.out.println("1-студент: " + s1.name);
        System.out.println("2-студент: " + s2.name);
    }
}