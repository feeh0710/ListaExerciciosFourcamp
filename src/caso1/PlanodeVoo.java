package caso1;

import java.util.Date;

public class PlanodeVoo {
	Aeronave aeronave = new Aeronave();
	Incidente incidente = new Incidente();
	Date dataSaida;
	Date dataChegada;
	String localSaida;
	String localDestino;
	
	public boolean pousar() {
		return true;
	}
}
