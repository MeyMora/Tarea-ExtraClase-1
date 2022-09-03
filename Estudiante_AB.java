package InterfazNotas;



/**
 * Estudiante_A representa al estudiante adicionando el atributo del promedio (examenes, quices, tareas) propio de un
 * estudiante de tipo A además de los atributos y metodos heredados de su clase padre (Estudiante). (Herencia, Sobrecarga)
 */
public class Estudiante_AB extends Estudiante {
    private promedioEQT;

    /**
     * Cambia el atributo del promedio (examenes, quices, tareas) por un nuevo valor
     * @param promedioEQT nuevo valor de atributo
     */
    public void setPromedioEQT(double promedio_eqt) {
        this.promedioEQT = promedioEQT;
    }

    /**
     * Devuelve el valor del promedio (examenes, quices, tareas)
     * @return valor de promedio_eqt
     */
    public double getPromedioEQT() {
        return promedioEQT;
    }
    // Objeto de Estudiante_A adicionando un atributo para promedio (examenes, quices, tareas), aplicando sobrecarga
    public Estudiante_A(String Carne, String Nombre, String Correo, String Telefono, String Nickname, String Tipo, int PromedioExam, int PromedioQuiz,
                        int PromedioTarea, int Proyecto1, int Proyecto2, int Proyecto3, double PromedioEQT, int NotaFinal) {

        super(Carne, Nombre, Correo, Telefono, Nickname, Tipo, PromedioExam, PromedioQuiz,
                PromedioTarea, Proyecto1, Proyecto2, Proyecto3, NotaFinal);

        this.promedioEQT = promedioEQT;
    }

    /**
     * Método heredado que calcula la nota del promedio de examenes, quices, tareas del estudiante
     * Este método actua de manera diferente en caso del Estudiante_B, por lo que se realiza una sobreescritura
     * y aplicando polimorfismo
     * @return valor de la nota promedio de examenes, quices, tareas.
     */
    @Override
    public double obtener_nota() {
        double promedio_A;
        promedio_A = (getPromedio_exam() + getPromedio_quiz() + getPromedio_tarea()) / 3;
        return promedio_A;
    }
}

package InterfazNotas;

/**
 */
public class Estudiante_AB extends Estudiante {

    private double promedio_proyecto;

    /**
     */
    public void setPromedio_proyecto(double promedio_proyecto) {
        this.prom_proyecto = prom_proyecto;
    }

    /**
     */
    public double getPromedio_proyecto() {
        return prom_proyecto;
    }

    // Objeto de Estudiante_B adicionando un atributo para promedio (proyectos), aplicando sobrecarga
    public Estudiante_B(String carne, String nombre, String correo, String telefono, String nickname, String tipo, int promedio_exam, int promedio_quiz,
                        int promedio_tarea, int proyecto_1, int proyecto_2, int proyecto_3, double promedio_proyecto, int nota_final) {

        super(carne, nombre, correo, telefono, nickname, tipo, promedio_exam, promedio_quiz,
                promedio_tarea, proyecto_1, proyecto_2, proyecto_3, nota_final);

        this.prom_proyecto = promedio_proyecto;
    }

    /**
     * Método heredado
     */
    @Override
    public  obtener_nota() {
        promedio_B;
        promedio_B = (getProyecto1() + getProyecto2() + getProyecto3()) / 3;
        return promedio_B;
    }

}