package homework.lesson6.domen;

/**
 * абстрактное устройство
 *
 * @param <T>
 */
public abstract class Device<T> {

    /**
     * серийный номер текущего экземпляра бытовой техники
     */
    private T serial;

    public T getSerial() {
        return serial;
    }

    public void setSerial(T serial) {
        this.serial = serial;
    }

    public Device(T serial) {
        this.serial = serial;
    }
}
