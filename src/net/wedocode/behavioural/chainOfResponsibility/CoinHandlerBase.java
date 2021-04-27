package net.wedocode.behavioural.chainOfResponsibility;

// Handler base
public abstract class CoinHandlerBase {

    protected CoinHandlerBase successor;

    public abstract void handleCoin(Coin coin);

    public void setSuccessor(CoinHandlerBase successor){
        this.successor = successor;
    }

}
