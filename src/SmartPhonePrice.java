class SmartphonePrice implements Cloneable {
   private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Price Type: " + priceType + ", Price in Euros: " + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SmartphonePrice)) return false;
        SmartphonePrice other = (SmartphonePrice) obj;
        return priceType.equals(other.priceType) && priceInEuros == other.priceInEuros;
    }

    @Override
    public int hashCode() {
        int result = priceType.hashCode();
        long temp = Double.doubleToLongBits(priceInEuros);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
