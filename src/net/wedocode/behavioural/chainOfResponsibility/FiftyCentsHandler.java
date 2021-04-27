package net.wedocode.behavioural.chainOfResponsibility;

// Concrete Handler
public class FiftyCentsHandler extends CoinHandlerBase{
    @Override
    public void handleCoin(Coin coin) {
        if (Math.abs(coin.Weight - 8) < 0.02 && Math.abs(coin.Diameter - 27.3) < 0.15)
            System.out.println("Captured 50 cents");
        else if (successor != null)
            successor.handleCoin(coin);
    }
}
