public class Crops {
    public int growth;
    public int sellingPrice;
    public int nbBought;
    public int nbPresent;
    public String product;
    public String name;

    public Crops(int growth, int sellingPrice, int nbBought, int nbPresent, String product, String name) {
        this.growth = growth;
        this.sellingPrice = sellingPrice;
        this.nbBought = nbBought;
        this.nbPresent = nbPresent;
        this.product = product;
        this.name = name;
    }

    public int setGrowth(int growth) {
        this.growth = growth;
    }
    public int getGrowth() {
        return growth;
    }

    public int setPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public int getPrice() {
        return sellingPrice;
    }

    public int setNbBought(int nbBought) {
        this.nbBought = nbBought;
    }
    public int getNbBought() {
        return nbBought;
    }

    public int nb_present(int nbPresent) {
        this.nbPresent = nbPresent;
    }
    public int getNbPresent() {
        return nbPresent;
    }

    public String setProduct(String product) {
        this.product = product;
    }
    public String getProduct() {
        return product;
    }

    public String setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
