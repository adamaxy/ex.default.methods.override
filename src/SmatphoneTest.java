public class SmatphoneTest {

    public class SmartphoneTester {
        public static void main(String[] args) {
            try {
                // Create SmartphonePrice objects
                SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.0);
                SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 500.0);
                SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 700.0);
                SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 700.0);

                // Create Smartphone objects using the SmartphonePrice objects
                Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S20", 4000, producerPrice1, retailPrice1);
                Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 3500, producerPrice2, retailPrice2);

                // Print details of the Smartphone objects
                System.out.println("Smartphone 1 Details:\n" + smartphone1);
                System.out.println("\nSmartphone 2 Details:\n" + smartphone2);

                // Check if the smartphones are equal
                System.out.println("\nAre the smartphones equal? " + smartphone1.equals(smartphone2));

                // Clone the second smartphone
                Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();

                // Print details of the cloned smartphone
                System.out.println("\nCloned Smartphone Details:\n" + clonedSmartphone);

                // Check if the second smartphone is equal to the cloned smartphone
                System.out.println("\nAre the second smartphone and the cloned smartphone equal? " + smartphone2.equals(clonedSmartphone));
            } catch (CloneNotSupportedException e) {
                // Handle the CloneNotSupportedException
                e.printStackTrace();
                System.out.println("\nError: Cloning not supported.");
            }
        }
    }
}
