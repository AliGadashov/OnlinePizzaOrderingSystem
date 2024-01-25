package enums;

public enum Sous {
    KETCHUP(1, "Ketchup", 0.7),
    BARBECU(2,"Barbecu",0.7),
    MAYONNAISE(3,"Mayonnaise",0.7),
    NONE( 4,"None",0);

    private final int id;
    private final String name;
    private final double prize;

    Sous(int id, String name, double prize) {
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
