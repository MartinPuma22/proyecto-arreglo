package clases;

public class Curso {

	private Long codCurso;
	private int ciclo;
	private int cantidadCreditos;
	private int horas;
	private String asignatura;

	public Long getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Long codCurso) {
		this.codCurso = codCurso;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getCantidadCreditos() {
		return cantidadCreditos;
	}

	public void setCantidadCreditos(int cantidadCreditos) {
		this.cantidadCreditos = cantidadCreditos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Course{" +
				"codCurso=" + codCurso +
				", ciclo=" + ciclo +
				", cantidadCreditos=" + cantidadCreditos +
				", horas='" + horas + '\'' +
				", asignatura='" + asignatura + '\'' +
				'}';
	}
}

