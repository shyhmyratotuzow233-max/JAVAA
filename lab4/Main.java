class Student {
    String name;
    int age;

    // Конструктор
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Ақпарат шығару әдісі
    void showInfo() {
        System.out.println("Аты: " + name + ", Жасы: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Үш объект құру
        Student s1 = new Student("Mahym", 18);
        Student s2 = new Student("Mahri", 19);
        Student s3 = new Student("Gozel", 20);

        // Барлық объекттердің бастапқы мәндерін шығару
        System.out.println("Бастапқы мәндер:");
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        // Бір объекттің мәнін өзгерту
        s1.name = "Nurlan";
        s1.age = 21;

        System.out.println("\nӨзгерткеннен кейін:");
        s1.showInfo();  // Өзгерді
        s2.showInfo();  // Өзгерген жоқ
        s3.showInfo();  // Өзгерген жоқ
    }
}