package homework.lesson6.domen;

/**
 * уровень энергопотребления для электрических приборов
 */
public enum EnergySaving {

    LOW, MEDIUM, HIGTH;

    /**
     * возвращает класс энергопотребления
     *
     * @return класс энергопотребления
     */
    String getEnergySavingCode() {
        switch (this) {
            case LOW:
                return "A+++";
            case MEDIUM:
                return "A+";
            case HIGTH:
                return "C";
            default:
                return "Unknow";
        }
    }
}
