package homework.lesson9.domen;

/**
 * класс-контейнер для хранения информации о пользователе
 */
public class User {

    private String login;
    private int age;
    private String counryCode;


    public User(String login, int age, String counryCode) {
        this.login = login;
        this.age = age;
        this.counryCode = counryCode;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCounryCode() {
        return counryCode;
    }

    public void setCounryCode(String counryCode) {
        this.counryCode = counryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (o instanceof User) {

            User user = (User) o;

            if (age != user.age) return false;
            if (!login.equals(user.login)) return false;
            return counryCode.equals(user.counryCode);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + age;
        result = 31 * result + counryCode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User { ");
        sb.append("login = '").append(login).append('\'');
        sb.append(", age = ").append(age);
        sb.append(", countryCode = '").append(counryCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
