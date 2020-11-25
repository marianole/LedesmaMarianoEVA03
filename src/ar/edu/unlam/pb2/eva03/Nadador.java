package ar.edu.unlam.pb2.eva03;

public class Nadador extends Deportista{

   private String estiloPreferido;

    public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
        super(numeroDeSocio, nombre);
        this.estiloPreferido = estiloPreferido;
    }

    public String getEstiloPreferido() {
        return estiloPreferido;
    }

    public void setEstiloPreferido(String estiloPreferido) {
        this.estiloPreferido = estiloPreferido;
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
