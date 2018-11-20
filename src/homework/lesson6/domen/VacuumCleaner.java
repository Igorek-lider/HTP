package homework.lesson6.domen;

import homework.lesson6.utils.Utils;

/**
 * класс, описывающий бытовой пылесос
 */
public class VacuumCleaner extends Device<Integer> implements BasesElectro, CustomInfo {

    private EnergySaving energySaving;

    private double coastPurchase;


    public VacuumCleaner(Integer serial, EnergySaving energySaving, double coastPurchase) {
        super(serial);
        this.energySaving = energySaving;
        this.coastPurchase = coastPurchase;
    }

    public EnergySaving getEnergySaving() {
        return energySaving;
    }

    public void setEnergySaving(EnergySaving energySaving) {
        this.energySaving = energySaving;
    }


    public void setCoastPurchase(double coastPurchase) {

        this.coastPurchase = coastPurchase;
    }

    @Override
    public double getCurrentPower() {

        return Utils.randInt(1000, 2500);
    }

    @Override
    public double getOperationTime() {

        return Utils.randInt(30, 100);
    }

    @Override
    public double getCoastDevicePurchase() {
        return coastPurchase;
    }

    @Override
    public double getCoastDeviceUsing() {
        return Utils.randInt(0, 1000);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Пылесос{ ");
        sb.append("уровень энергопотребления = ").append(getEnergySaving().name());
        sb.append(", класс энергопотребления = ").append(getEnergySaving().getEnergySavingCode());
        sb.append(", стоимость покупки = ").append(getCoastDevicePurchase()).append(" руб");
        sb.append(", наработка = ").append(getOperationTime()).append(" ч");
        sb.append(", стоимость эксплуатации = ").append(getCoastDeviceUsing()).append(" руб");
        sb.append('}');
        return sb.toString();
    }
}
