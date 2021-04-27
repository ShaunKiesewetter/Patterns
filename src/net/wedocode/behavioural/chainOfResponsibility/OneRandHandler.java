package net.wedocode.behavioural.chainOfResponsibility;

// Concrete Handler
public class OneRandHandler extends CoinHandlerBase{
    @Override
    public void handleCoin(Coin coin) {
        if (Math.abs(coin.Weight - 9.5) < 0.02 && Math.abs(coin.Diameter - 22.5) < 0.13)
            System.out.println("Captured R1");
        else if (successor != null)
            successor.handleCoin(coin);
    }
}
