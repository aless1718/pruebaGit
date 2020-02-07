package pruebaGit;

public class Operaciones {
	int operadorA, operadorB;

	public Operaciones(int operadorA, int operadorB) {
		this.operadorA = operadorA;
		this.operadorB = operadorB;
	}
	
	public int getOperadorA() {
		return operadorA;
	}

	public void setOperadorA(int operadorA) {
		this.operadorA = operadorA;
	}

	public int getOperadorB() {
		return operadorB;
	}

	public void setOperadorB(int operadorB) {
		this.operadorB = operadorB;
	}
	
	public int suma() {
		return operadorA + operadorB;
	}
	public int resta() {
		return operadorA - operadorB;
	}
	//LA DE MULTIPLICACIÓN ME LA ELIMINASTE TÚ PORQUE DABA CONFLICTO
	
	public int division() {
		return operadorA / operadorB;
	} 
}
