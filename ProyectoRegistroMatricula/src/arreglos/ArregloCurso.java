package arreglos;

import clases.Curso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArregloCurso {

    private final String fileName = "curso.csv";

    public void create(Curso course) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            String linea = "\n" + course.getCodCurso() + ","
                    + course.getCiclo() + ","
                    + course.getCantidadCreditos() + ","
                    + course.getHoras() + ","
                    + course.getAsignatura();
            pw.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Curso findById(long id){
        Curso curso = null;

        for (Curso c: read()){
            if (c.getCodCurso().equals(id)){
                return c;
            }
        }
        throw new NoSuchElementException("No se encontro el curso!");
    }

    public List<Curso> read() {
        List<Curso> courses = new ArrayList<>();
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
                Curso course = new Curso();
                course.setCodCurso(Long.parseLong(datos[0].trim()));
                course.setCiclo(Integer.parseInt(datos[1].trim()));
                course.setCantidadCreditos(Integer.parseInt(datos[2].trim()));
                course.setHoras(Integer.parseInt(datos[3].trim()));
                course.setAsignatura(datos[4].trim());
                courses.add(course);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public void delete(Long codCurso) {
        List<Curso> courses = read();
        boolean eliminado = false;
        // Se busca el curso con el codCurso indicado y se elimina
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCodCurso().equals(codCurso)) {
                courses.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            try (FileWriter fw = new FileWriter(fileName, false);
                 PrintWriter pw = new PrintWriter(fw)) {
                for (Curso course : courses) {
                    String linea = course.getCodCurso() + ","
                            + course.getCiclo() + ","
                            + course.getCantidadCreditos() + ","
                            + course.getHoras() + ","
                            + course.getAsignatura();
                    pw.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

