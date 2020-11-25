package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ar.edu.unlam.pb2.eva03.enumeradores.*;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion, Map<Integer, Deportista> participantes) {
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = participantes;
	}

	public Evento(TipoDeEvento e){
		this.tipo=e;
	}
}
