package prog;

public interface PriceableWithVAT25 {
    default double getVAT(){
        return 0.25;
    }
}
