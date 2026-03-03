class Student {
    String name;
    int age;
    String major;

    // Конструктор
    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Ақпарат шығару әдісі
    void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Объект құру
        Student s1 = new Student("Nadirbek", 23, "Информатика");
        Student s2 = new Student("Shmyrat", 26, "Математика");

        // Ақпарат шығару
        s1.showInfo();
        s2.showInfo();
    }
}