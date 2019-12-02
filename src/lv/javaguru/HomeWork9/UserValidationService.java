package lv.javaguru.HomeWork9;


public class UserValidationService {

    //šiem atribūtirm būtu jābūt atsevišķā klasē - User
    public String name;
    public String lastName;
    public int age;

    //šeit nepieciešams padot objektu User
    public UserValidationService(String name, String lastName, int age) {
        //Uzdevumā tika teikts, ka ir jaizveido ari savs exception
        if (isValidName(name)) {
            throw new IllegalArgumentException("To many symbols or to less in name");
        } else if (isValidLastName(lastName)) {
            throw new IllegalArgumentException("To many symbols or to less in Last name");
        } else if (isValidAge(age)) {
            throw new IllegalArgumentException("To many symbols or to less in age");
        }

    }

    private boolean isValidName(String name) {
        System.out.println(name);
        return name.length() <= 2 || name.length() >= 14;
    }

    private boolean isValidLastName(String lastName) {
        System.out.println(lastName);
        return lastName.length() <= 2 || lastName.length() >= 14;
    }

    private boolean isValidAge(int age) {
        System.out.println(age);
        return age <= 0 || age >= 119;
    }


}
