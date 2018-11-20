package homework.lesson6.domen;

/**
 * интерфейс с методами, возвращающими потребительские характеристики
 */
public interface CustomInfo {

    /**
     * возвращает стоимость покупки
     *
     * @return стоимость покупки
     */
    public double getCoastDevicePurchase();


    /**
     * возвращает стоимость эксплуатации
     *
     * @return стоимость эксплуатации
     */
    public double getCoastDeviceUsing();
}
