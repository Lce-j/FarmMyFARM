public class Shop {
    /// int animalBought => (stock = +1 animal)
    /// int animalProductSold => (stock = -1 animal_product)
    /// int animalSold => (stock = -1 animal)
    /// int cropsBought => (stock = +1 seed_crop)
    /// int cropsSold => (stock = -1 crops_product)
    private String animalName;
    private int animalPrice;
    private int animalBought;
    private int animalProductSold;
    private int animalSold;
    private int animalStock;
    private int animalProductStock

    private String cropsName;
    private int cropsPrice;
    private int cropsBought;
    private int cropsSold;
    private int cropsStock;

    public Shop(String animalName, int animalPrice, int animalBought, int animalProductSold, int animalSold, int animalStock, int animalProductStock,
                String cropsName, int cropsPrice,  int cropsBought, int cropsSold, int cropsStock) {
        this.animalName = animalName;
        this.animalPrice = animalPrice;
        this.animalBought = animalBought;
        this.animalProductSold = animalProductSold;
        this.animalSold = animalSold;
        this.animalStock = animalStock;
        this.animalProductStock = animalProductStock;

        this.cropsName = cropsName;
        this.cropsPrice = cropsPrice;
        this.cropsBought = cropsBought;
        this.cropsSold = cropsSold;
        this.cropsStock = cropsStock;
    }

    public String setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public String getAnimalName() {
        return animalName;
    }

    public String setAnimalPrice(int animalPrice) {
        this.animalPrice = animalPrice;
    }
    public int getAnimalPrice() {
        return animalPrice;
    }

    public String setAnimalBought(int animalBought) {
        this.animalBought = animalBought;
    }
    public int getAnimalBought() {
        return animalBought;
    }

    public String setAnimalProductSold(int animalProductSold) {
        this.animalProductSold = animalProductSold;
    }
    public int getAnimalProductSold() {
        return animalProductSold;
    }

    public String setAnimalSold(int animalSold) {
        this.animalSold = animalSold;
    }
    public int getAnimalSold() {
        return animalSold;
    }

    public String setAnimalStock(int animalStock) {
        this.animalStock = animalStock;
    }
    public int getAnimalStock() {
        return animalStock;
    }

    public String setCropsName(String cropsName) {
        this.cropsName = cropsName;
    }
    public String getCropsName() {
        return cropsName;
    }

    public int setCropsPrice(int cropsPrice) {
        this.cropsPrice = cropsPrice;
    }
    public int getCropsPrice() {
        return cropsPrice;
    }

    public int setCropsBought(int cropsBought) {
        this.cropsBought = cropsBought;
    }
    public int getCropsBought() {
        return cropsBought;
    }

    public int setCropsSold(int cropsSold) {
        this.cropsSold = cropsSold;
    }
    public int getCropsSold() {
        return cropsSold;
    }

    public int setCropsStock(int cropsStock) {
        this.cropsStock = cropsStock;
    }

    public class Bought{
        if (animalBought++) {
            animalStock++;
        }
        if (cropsBought++){
            cropsSold++;
        }
    }

    public class Sold{
        if (cropsSold ++){
            cropsStock--;
        }
        if (animalProductSold++){
            animalProductSold--;
        }
        if (animalSold++){
            animalStock--;
        }
    }
}
