package learningjava;

public class TestStock {
    public static void main(String[] args) {
        Stock sc1 = new Stock();
        sc1.setSymbol("ORCL");
        sc1.setName("Oracle Corporation");
        sc1.setpreviousClosingPrice(34.5);
        sc1.setCurrentPrice(34.35);
        double prChangePerc = sc1.getChangePercent();
        System.out.println(sc1.getSymbol()+" \n"+sc1.getName());
        System.out.println("Previous closing price: "+sc1.getpreviousClosingPrice());
        System.out.println("Current Price: "+sc1.getCurrentPrice());
        System.out.println("Price change percentage:");
        System.out.println(prChangePerc);
    }
    
}