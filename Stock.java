package learningjava;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock() {
    }

    Stock(String sym,String na){
        symbol = sym;
        name = na;
    }

    public void setSymbol(String smb){
        symbol = smb;
    }

    public void setName(String na){
        name = na;
    }

    public void setpreviousClosingPrice(double pcP){
        previousClosingPrice = pcP;
    }

    public void setCurrentPrice(double currP){
        currentPrice = currP;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getName(){
        return name;
    }

    public double getpreviousClosingPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getChangePercent() {
        double price;
        if (currentPrice > previousClosingPrice) {
            price = (((currentPrice - previousClosingPrice) / currentPrice) * 100);
            return price;
        } else {
            price = (((previousClosingPrice - currentPrice) / previousClosingPrice) * 100);
            return price;
        }

    }

}
