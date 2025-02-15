package clases;

public class Matricula 
{	//  Atributos privados
	private Long codAlumno,codCurso;
	private int numMatricula;
	private String fecha, hora;
	//  Constructor
	public Matricula(int numMatricula, Long codAlumno, Long codCurso, String fecha, String hora) {
		this.numMatricula = numMatricula;
		this.codAlumno = codAlumno;
		this.codCurso = codCurso;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Matricula() {

	}

	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public Long getCodAlumno() {
		return codAlumno;
	}
	public void setCodAlumno(Long codAlumno) {
		this.codAlumno = codAlumno;
	}
	public Long getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Long codCurso) {
		this.codCurso = codCurso;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Matricula{" +
				"numMatricula=" + numMatricula +
				", codAlumno=" + codAlumno +
				", codCurso=" + codCurso +
				", fecha='" + fecha + '\'' +
				", hora='" + hora + '\'' +
				'}';
	}
}
