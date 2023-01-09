import java.io.IOException;

public interface Calculatable extends Dividable, Multiplicatable,Addable,Subtractable,Prosentable{
    void calculator() throws IOException;
}
