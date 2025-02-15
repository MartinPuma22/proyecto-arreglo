package arreglos;

import clases.Alumno;
import clases.Curso;
import clases.Matricula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArregloMatricula {

    private final String fileName = "matricula.csv";

    public void create(Matricula matricula){

        Curso curso = new ArregloCurso().findById(matricula.getCodCurso());
        if(curso == null){
            throw new NoSuchElementException("No se encontro el curso!");
        }

        Alumno alumno = new ArregloAlumno().findById(matricula.getCodAlumno());
        if(alumno == null){
            throw new NoSuchElementException("No se encontro el alummno!");
        }
        createBase(matricula);
    }

    private void createBase(Matricula matricula) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            String linea = "\n" + matricula.getNumMatricula() + ","
                    + matricula.getCodAlumno() + ","
                    + matricula.getCodCurso() + ","
                    + matricula.getFecha() + ","
                    + matricula.getHora();
            pw.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Matricula> read() {
        List<Matricula> matriculas = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue; // Ignora líneas vacías
                }
                String[] datos = linea.split(",");
                if (datos.length < 5) {
                    continue; // Si la línea no tiene todos los campos, se omite
                }
                Matricula matricula = new Matricula();
                matricula.setNumMatricula(Integer.parseInt(datos[0].trim()));
                matricula.setCodAlumno(Long.parseLong(datos[1].trim()));
                matricula.setCodCurso(Long.parseLong(datos[2].trim()));
                matricula.setFecha(datos[3].trim());
                matricula.setFecha(datos[4].trim());
                matriculas.add(matricula);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matriculas;
    }

    public List<Matricula> finByAlumno(long codAlummno){

        List<Matricula> matriculas = new ArrayList<>();

        for (Matricula matricula: read()){
            if (matricula.getCodAlumno().equals(codAlummno)){
                matriculas.add(matricula);
            }
        }
        return matriculas;
    }

    public List<Matricula> finByCurso(long codCurso){

        List<Matricula> matriculas = new ArrayList<>();

        for (Matricula matricula: read()){
            if (matricula.getCodCurso().equals(codCurso)){
                matriculas.add(matricula);
            }
        }
        return matriculas;
    }
}
