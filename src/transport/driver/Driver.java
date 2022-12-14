package transport.driver;

import transport.Transport;

public abstract class Driver<A extends Transport> {
    private final String fio;
    private boolean hasDriveLicense;
    private int expirience;
    private String category;

    public Driver(String fio, boolean hasDriveLicense, int expirience,String category) {
        this.fio = fio;
        this.hasDriveLicense = hasDriveLicense;
        this.expirience = expirience;
        setCategory(category);
    }

    public String getFio() {
        return fio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категрию прав!");
        }
        this.category = category;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public abstract void start(A transport);

    public abstract void stop(A transport);

    public abstract void refuel(A transport);

    public void printInfo(A transport) {
        System.out.println("Водитель - "+fio+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }
}
