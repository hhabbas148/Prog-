package prog;

public interface PriceableWithVAT6 {

    default double getVAT(){
        return 0.06;
    }
}
