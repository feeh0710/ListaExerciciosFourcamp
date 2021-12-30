package caso1;

public class Incidente {
	GraudePerigo graudePerigo = new GraudePerigo();
	int id;
	
	public void avioesProximos(String grau) {
		this.graudePerigo.descricao = grau;
	}
}
