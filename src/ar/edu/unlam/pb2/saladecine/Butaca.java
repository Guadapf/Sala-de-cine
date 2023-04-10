package ar.edu.unlam.pb2.saladecine;

public class Butaca {
	
	private NumeroDeButacas numeroDeButaca;
	private Filas fila;
	
	public Butaca(NumeroDeButacas numeroDeButaca, Filas fila) {
		this.numeroDeButaca = numeroDeButaca;
		this.fila = fila;
	}
	
	
	public String toString() {
		return "Butaca" + fila + numeroDeButaca;
	}
}
