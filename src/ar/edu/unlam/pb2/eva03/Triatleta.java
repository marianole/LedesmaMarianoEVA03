package ar.edu.unlam.pb2.eva03;

public class Triatleta extends Deportista{

    private String distanciaPreferida;
    private String tipoDeBicicleta;

    public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, String tipoDeBicicleta) {
        super(numeroDeSocio, nombre);
        this.distanciaPreferida = distanciaPreferida;
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    public String getDistanciaPreferida() {
        return distanciaPreferida;
    }

    public void setDistanciaPreferida(String distanciaPreferida) {
        this.distanciaPreferida = distanciaPreferida;
    }

    public String getTipoDeBicicleta() {
        return tipoDeBicicleta;
    }

    public void setTipoDeBicicleta(String tipoDeBicicleta) {
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    @Override
    public Integer getNumeroDeSocio() {
        return super.getNumeroDeSocio();
    }

    @Override
    public void setNumeroDeSocio(Integer numeroDeSocio) {
        super.setNumeroDeSocio(numeroDeSocio);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }


}
