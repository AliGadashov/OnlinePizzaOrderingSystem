package enums;

public enum Pizza {
    ITALIANO(1, "Italiano", 11.99),
    AMERICANO(2,"Americano",10.99),
    MEXICAN( 3,"Mexican",12.99),
    CHICKEN_KICKERS(4, "Chicken kickers", 9.99),
    MARGHERITA(5,"Margherita", 13.99),
    PEPPERONI(6,"Pepperoni",14.99);

    private final int id;
    private final String name;
    private final double prize;

    Pizza(int id, String name, double prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return  "\n----------------------" +
                "\nName: " + getName() +
                "\nPrize: " + getPrize() +
                "\n----------------------"
                ;
    }
}
