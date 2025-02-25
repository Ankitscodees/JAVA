public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("❌ Age must be positive!");
        }
    }

    public void displayInfo() {
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
    }
}
