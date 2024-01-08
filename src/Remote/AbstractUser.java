package Remote;

public abstract class AbstractUser implements IUserControllable {

    String name = "";
    int age;

    public abstract String getName();

    public abstract int getAge();
}
