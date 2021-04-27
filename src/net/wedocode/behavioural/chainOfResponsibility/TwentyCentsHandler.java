package net.wedocode.behavioural.chainOfResponsibility;

// Concrete Handler
public class TwentyCentsHandler extends CoinHandlerBase{
    @Override
    public void handleCoin(Coin coin) {
        if (Math.abs(coin.Weight - 5) < 0.01 && Math.abs(coin.Diameter - 21.4) < 0.1)
            System.out.println("Captured 20 cents");
        else if (successor != null)
            successor.handleCoin(coin);
    }
}
