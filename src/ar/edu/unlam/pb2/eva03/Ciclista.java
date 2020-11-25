package ar.edu.unlam.pb2.eva03;

public class Ciclista extends Deportista{

    private String tipoDeBicicleta;

    public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
        super(numeroDeSocio, nombre);
        this.tipoDeBicicleta = tipoDeBicicleta;
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
