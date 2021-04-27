package net.wedocode.behavioural.chainOfResponsibility;

// Concrete Handler
public class TenCentsHandler extends CoinHandlerBase{
    @Override
    public void handleCoin(Coin coin) {
        if (Math.abs(coin.Weight - 6.5) < 0.03 && Math.abs(coin.Diameter - 24.5) < 0.15)
            System.out.println("Captured 10 cents");
        else if (successor != null)
            successor.handleCoin(coin);
    }
}
