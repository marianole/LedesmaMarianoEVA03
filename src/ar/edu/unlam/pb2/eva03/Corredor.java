package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista{

    private Integer cantidadDeKilometrosEntrenados;
    private Integer distanciaPreferida;

    public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
        super(numeroDeSocio, nombre);
        this.distanciaPreferida=distanciaPreferida;
    }

    public Integer getCantidadDeKilometrosEntrenados() {
        return cantidadDeKilometrosEntrenados;
    }

    public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
        this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
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

    public Integer getDistanciaPreferida() {
        return distanciaPreferida;
    }

    public void setDistanciaPreferida(Integer distanciaPreferida) {
        this.distanciaPreferida = distanciaPreferida;
    }
}
