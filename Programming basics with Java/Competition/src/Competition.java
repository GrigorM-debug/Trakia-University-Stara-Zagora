public class Competition {
    private String name;
    private String theme;
    private double price;
    private double nightPrice;

    public Competition(String name, String theme, double price, double nightPrice){
        this.name = name;
        this.theme = theme;
        this.price = price;
        this.nightPrice = nightPrice;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Състезание по: " + this.name);
        sb.append("\n");
        sb.append("Тема на състезанието: " + this.theme);
        sb.append("\n");
        sb.append("Общ разход за него: " + (this.price + this.nightPrice));
        sb.append("\n");

        return sb.toString();
    }
}
