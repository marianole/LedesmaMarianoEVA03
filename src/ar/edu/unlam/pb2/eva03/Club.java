package ar.edu.unlam.pb2.eva03;

import java.util.*;

import ar.edu.unlam.pb2.eva03.enumeradores.*;

import javax.swing.*;


public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;



	public Club(String nombre){
		this.nombre=nombre;
		this.socios=new HashSet<Deportista>();
		this.competencias= new HashMap<String, Evento>();
	}
	public void agregarDeportista(Deportista deportista)  {
		socios.add(deportista);
	}


	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento evento, String nombreEvento){
		this.competencias.put(nombreEvento, new Evento(evento));

	}

	public Integer inscribirEnEvento(String nombreMaraton, Deportista deportista) {
		/* no sé como desarrollarlo*/
		return 2;
	}


}
