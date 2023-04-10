package ar.edu.unlam.pb2.saladecine;

public class SalaDeCine {
	
	private static int CANTIDAD_MAXIMA_BUTACAS = 315;
	private static Filas filasPosibles[] = Filas.values();
	private static NumeroDeButacas butacasPosibles[] = NumeroDeButacas.values();
	private static Butaca butacasDisponibles[] = new Butaca[CANTIDAD_MAXIMA_BUTACAS];
	
	private Butaca butacasTotales[];
	private boolean butacaLibre;
	private boolean salaVacia;
	
	public static void inicializarButacasDisponibles() {
		
		int butacasGuardadas = 0;
		
		for(int i=0;i<butacasPosibles.length;i++) {
			for(int j=0; j<filasPosibles.length;j++) {
				butacasDisponibles[butacasGuardadas++] = new Butaca(butacasPosibles[i], filasPosibles[j]);
			}
		}
		
	}
	
	public SalaDeCine() {
		this.butacasTotales = new Butaca[CANTIDAD_MAXIMA_BUTACAS];
	}
	
	public void iniciarSala() {
		for(int i=0;i<butacasTotales.length;i++) {
			if(butacasTotales[i] == null) {
				butacasTotales[i] = butacasDisponibles[i];
			}
		}
	}
	
	public boolean isSalaVacia() {
		if(butacaLibre == true) {
			return true;
		}
		return false;
	}
	
	public boolean isBuatacaOcupada(Butaca butacaElegida) {
		for(int i=0;i<butacasTotales.length;i++) {
			if(butacasTotales[i] == butacaElegida) {
				return true;
			}
		}
		return false;
	}

}
