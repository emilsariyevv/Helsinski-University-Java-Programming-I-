public class Container {

    int amountOfLiquid;

    public Container() {

    }

    public int contains() {

        return amountOfLiquid;
    }

    public void add(int amount) {

        if (amount > 0) {

            this.amountOfLiquid = amountOfLiquid + amount;
        }

        if (amountOfLiquid > 100) {

            this.amountOfLiquid = 100;
        }
    }

    public void remove(int amount) {

        if (amount > 0) {

            this.amountOfLiquid = amountOfLiquid - amount;
        }

        if (amountOfLiquid < 0) {

            this.amountOfLiquid = 0;
        }

    }

    @Override
    public String toString() {

        return amountOfLiquid + "/100";
    }

    

}
