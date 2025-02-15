package arreglos;

import clases.Alumno;
import clases.Curso;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArregloAlumno {

    private final String fileName = "alumno.csv";

    public void create(Alumno alumno) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            String linea = "\n" + alumno.getCodAlumno() + ","
                    + alumno.getEdad() + ","
                    + alumno.getCelular() + ","
                    + alumno.getSexo() + ","
                    + alumno.getNombres()+","
                    + alumno.getEstado();
            pw.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Alumno findById(long id){
        Alumno alumno = null;

        for (Alumno c: read()){
            if (c.getCodAlumno().equals(id)){
                return c;
            }
        }
        throw new NoSuchElementException("No se encontro alumno!");
    }

    public List<Alumno> read() {
        List<Alumno> alumnos = new ArrayList<>();
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
                Alumno alumno = new Alumno();
                alumno.setCodAlumno(Long.parseLong(datos[0].trim()));
                alumno.setEdad(Integer.parseInt(datos[1].trim()));
                alumno.setCelular(Integer.parseInt(datos[2].trim()));
                alumno.setSexo(Integer.parseInt(datos[3].trim()));
                alumno.setEstado(Integer.parseInt(datos[4].trim()));
                alumno.setNombres(datos[5].trim());
                alumno.setApellidos(datos[6].trim());
                alumno.setDni(datos[7].trim());
                alumnos.add(alumno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alumnos;
    }

    public void delete(Long codAlumno) {
        List<Alumno> alumnos = read();
        boolean eliminado = false;
        // Se busca el curso con el codCurso indicado y se elimina
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getCodAlumno().equals(codAlumno)) {
                alumnos.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            try (FileWriter fw = new FileWriter(fileName, false);
                 PrintWriter pw = new PrintWriter(fw)) {
                for (Alumno alumno : alumnos) {
                    String linea = alumno.getCodAlumno() + ","
                            + alumno.getEdad() + ","
                            + alumno.getCelular() + ","
                            + alumno.getSexo() + ","
                            + alumno.getNombres()+","
                            + alumno.getEstado();
                    pw.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
