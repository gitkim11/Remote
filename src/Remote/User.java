package Remote;

import java.io.InputStream;
import java.util.Scanner;

public class User extends AbstractUser{

    Scanner scanner = new Scanner(System.in);

    public void User (String name, int age){
        setName(name);
        setAge(age);
    }
    @Override
    public String getName() {
        String name = scanner.next();
        return name;
    }

    @Override
    public int getAge() {
        int age = scanner.nextInt();
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
