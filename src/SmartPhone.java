class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) retailPrice.clone();
        return clonedSmartphone;
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + ", Model: " + modelName + ", Battery: " + batterymAh + "mAh\n"
                + "Producer Price: " + producerPrice + "\nRetail Price: " + retailPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Smartphone)) return false;
        Smartphone other = (Smartphone) obj;
        return brandName.equals(other.brandName) && modelName.equals(other.modelName)
                && batterymAh == other.batterymAh && producerPrice.equals(other.producerPrice)
                && retailPrice.equals(other.retailPrice);
    }

    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + modelName.hashCode();
        result = 31 * result + batterymAh;
        result = 31 * result + producerPrice.hashCode();
        result = 31 * result + retailPrice.hashCode();
        return result;
    }
}
