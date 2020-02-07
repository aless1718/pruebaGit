package net.ausiasmarch.calorias.main;

public class MetabolismoBasal {

	private double peso, altura, mBasal;
	public double calorias = 0;
	private int edad;
	private String sexo;
	private TipoActividad tipo;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public TipoActividad getTipo() {
		return tipo;
	}

	public void setTipoActividad(TipoActividad tipo) {
		this.tipo = tipo;
	}

	/**
	 * AHORA LE PASAMOS LO QUE DEBE SACAR EL METABOLISMO BASAL
	 * @return
	 */
	
	public double getMBasal() {

		if (sexo.equalsIgnoreCase("HOMBRE")) {

			mBasal = (10 * peso) + (6.25 * altura) - (5 * edad) + 5;

		} else if (sexo.equalsIgnoreCase("MUJER")) {

			mBasal = (10 * peso) + (6.25 * altura) - (5 * edad) - 161;
		}

		return mBasal;
	}
	/**
	 * AHORA LE PASAMOS LO QUE DEBE SACAR EN LAS KCALS DE MANTENIMIENTO
	 * @return
	 */

	public double getCalorias() {

		calorias = mBasal * tipo.getFactor();
		return calorias;
	}

	/**
	 * AHORA LE PASAMOS LO QUE DEBE SACAR EN LAS KCALS PARA BAJAR DE PESO 
	 * @return
	 */
	public double getAdelgazar() {

		double pPeso = calorias * 0.8;
		return pPeso;
	}

}
