import java.util.Objects;

public abstract class Jugador {
    
    private String nombre;
    private String color;

    
    /**
     * IMPORTANTE: No modificar este método
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(color) ;
    }
}
