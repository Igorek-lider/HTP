package homework.lesson9.domen;

import homework.lesson9.exception.AgeException;
import homework.lesson9.exception.CountryException;
import homework.lesson9.exception.LoginException;

/**
 * класс, осуществляющий валидацию пользовательский данных
 */
public class UserValidator<T extends User> {

    private T currUser;

    private boolean isAgeCorrect;   //маркер корректности возраста
    private boolean isLoginCorrect; //маркер корректности логина
    private boolean isCountryCorrect;   //маркер корректности страны регистрации

    //маркер, указывающий на выполненную/невыполненную валидацию полей пользователя
    private boolean isCompleteCheckFieldUser;


    public UserValidator(T currUser) {
        this.currUser = currUser;
    }


    /**
     * осуществляет проверку корректности страны регистрации пользователя
     *
     * @throws CountryException
     */
    private void checkCorrectCountryUser() throws CountryException {
        if (!(currUser.getCounryCode().equals("BY") || currUser.getCounryCode().equals("RU") || currUser.getCounryCode().equals("UA"))) {
            throw new CountryException("Ошибка расположения: сервис недоступен в вашей стране");
        }
    }

    /**
     * осуществляет проверку корректности возраста пользователя
     *
     * @throws AgeException
     */
    private void checkCorrectAgeUser() throws AgeException {
        if (currUser.getAge() < 18) {
            throw new AgeException("Ошибка возраста: низкий возраст");
        }
    }

    /**
     * осуществляет проверку корректности логина пользователя
     *
     * @throws LoginException
     */
    private void checkCorrectLoginUser() throws LoginException {
        if (currUser.getLogin().length() > 20) {
            throw new LoginException("Ошибка авторизации: слишком длинное имя пользователя");
        }
    }


    /**
     * осуществляет проверку корректности значимых полей пользователя
     *
     * @return
     */
    public boolean checkCorrectUserInfo() {

        if (!isCompleteCheckFieldUser) {
            try {
                checkCorrectCountryUser();
                isCountryCorrect = true;
            } catch (CountryException ex) {
                isCountryCorrect = false;
            }


            try {
                checkCorrectAgeUser();
                isAgeCorrect = true;
            } catch (AgeException ex) {
                isAgeCorrect = false;
            }


            try {
                checkCorrectLoginUser();
                isLoginCorrect = true;
            } catch (LoginException ex) {
                isLoginCorrect = false;
            }
        }

        //помеяаем, что валидация данных для текущего пользователя уже осуществлялась
        isCompleteCheckFieldUser = true;

        return isAgeCorrect && isLoginCorrect && isCountryCorrect;
    }

    /**
     * выводит сводную информацию о валидности отдельных полей пользователя
     *
     * @return
     */
    public String printCorrectInfo() {

        if (isCompleteCheckFieldUser) checkCorrectUserInfo();

        StringBuilder sb = new StringBuilder("User {");
        sb.append(" login => ").append(isLoginCorrect ? "valid" : "invalid");
        sb.append(", age => ").append(isAgeCorrect ? "valid" : "invalid");
        sb.append(", countryCode => ").append(isCountryCorrect ? "valid" : "invalid");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String toString() {
        return currUser.toString();
    }
}
