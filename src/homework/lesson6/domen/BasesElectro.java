package homework.lesson6.domen;

/**
 * интерфейс с базовыми методами для электрических приборов
 */
public interface BasesElectro {

    /**
     * возвращает текущую потребляемую мощность
     *
     * @return текущая потребляемая мощность
     */
    public double getCurrentPower();

    /**
     * возвращает общее время работы
     *
     * @return общее время работы
     */
    public double getOperationTime();
}
