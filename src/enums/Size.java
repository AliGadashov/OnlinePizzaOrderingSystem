package enums;

public enum Size {
    SMALL(1, "Small", 0),
    MEDIUM(2,"Medium",6.99),
    LARGE( 3,"Large",13.99);

    private final int id;
    private final String name;
    private final double prize;

    Size(int id, String name, double prize) {
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
