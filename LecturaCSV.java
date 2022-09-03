package InterfazNotas;



        import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.logging.Level;
        import java.util.logging.Logger;

/**
 * LectorCSV mantiene los atributos y métodos necesarios para leer un archivo .csv
 */
public class LecturaCSV {
    /**
     * Método que lee el archivo .csv e identifique el tipo de estudiante (A o B) para crear sus respectivas
     */
    public static void leerCSV() {
        String ArchivoCSV =C:\Users\Meibel\IdeaProjects\Demo\src\main\java\InterfazNotas;
        String delimitador = ",";

        BufferedReader lector;

        try {
            lector = new BufferedReader(new FileReader(ArchivoCSV));
            String linea;
            linea = lector.readLine();
            while ((linea = lector.readLine()) != null) {
                if (celda[5].equals("A")) {
                    // Crea nueva variable tipo A
                    Estudiante_A estudiante_a = new Estudiante_A();
                            Integer.parseInt(), Integer.parseInt();
                    estudiante_a.setPromedio_eqt(estudiante_a.obtener_nota()); // Agrega el valor del promedio (examenes, quices, tareas)

                    Tabla.lista.add(estudiante_a);
                } else {
                    // Y este crea una variable nueva para el estiduante tipo B
                    Estudiante_B estudiante_b = new Estudiante_B(),
                            Integer.parseInt(), 0, 0);
                    estudiante_b.setPromedio_proyecto(estudiante_b.obtener_nota()); // Este agrega el valor del promedio (proyectos)

                    Tabla.lista.add(estudiante_b);
                }
            }
    }
}