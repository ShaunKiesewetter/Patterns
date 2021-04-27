package net.wedocode.behavioural.chainOfResponsibility;

// Concrete Handler
public class FiveCentsHandler extends CoinHandlerBase{
    @Override
    public void handleCoin(Coin coin) {
        if (Math.abs(coin.Weight - 3.25D) < 0.02 && Math.abs(coin.Diameter - 18) < 0.1){
            System.out.println("Captured 5 cents");

        } else if (successor != null){
            successor.handleCoin(coin);
        }
    }
}
