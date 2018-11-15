package homework.lesson3;

public class Bus {

    private String nameDriver;
    private int numberBus;
    private int numberRoute;
    private String modelBus;
    private int productionYear;
    private int mileage;

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public void setNumberBus(int numberBus) {
        this.numberBus = numberBus;
    }

    public void setNumberRoute(int numberRoute) {
        this.numberRoute = numberRoute;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getNameDriver() {

        return nameDriver;
    }

    public int getNumberBus() {
        return numberBus;
    }

    public int getNumberRoute() {
        return numberRoute;
    }

    public String getModelBus() {
        return modelBus;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMileage() {
        return mileage;
    }


    public Bus(String nameDriver, int numberBus, int numberRoute, String modelBus, int productionYear, int mileage) {
        this.nameDriver = nameDriver;
        this.numberBus = numberBus;
        this.numberRoute = numberRoute;
        this.modelBus = modelBus;
        this.productionYear = productionYear;

        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus bus = (Bus) o;

        if (numberBus != bus.numberBus) return false;
        if (numberRoute != bus.numberRoute) return false;
        if (productionYear != bus.productionYear) return false;
        if (mileage != bus.mileage) return false;
        if (nameDriver != null ? !nameDriver.equals(bus.nameDriver) : bus.nameDriver != null) return false;
        return modelBus != null ? modelBus.equals(bus.modelBus) : bus.modelBus == null;
    }

    @Override
    public int hashCode() {
        int result = nameDriver != null ? nameDriver.hashCode() : 0;
        result = 31 * result + numberBus;
        result = 31 * result + numberRoute;
        result = 31 * result + (modelBus != null ? modelBus.hashCode() : 0);
        result = 31 * result + productionYear;
        result = 31 * result + mileage;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Автобус { ");
        sb.append("модель автобуса = '").append(modelBus).append('\'');
        sb.append(", регистрационный номер = ").append(numberBus);
        sb.append(", водитель = '").append(nameDriver).append('\'');
        sb.append(", номер маршрута = ").append(numberRoute);
        sb.append(", год выпуска = ").append(productionYear);
        sb.append(", пробег = ").append(mileage);
        sb.append('}');
        return sb.toString();
    }
}
