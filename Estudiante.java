package InterfazNotas;



/**

 */
public abstract class Estudiante { //Superclase abstracta que contiene los atributos generales.
    private String carne;
    private String nombre;
    private String correo;
    private String telefono;
    private String nickname;
    private String tipo;
    private int promedio_exam;
    private int promedio_quiz;
    private int promedio_tarea;
    private int proyecto_1;
    private int proyecto_2;
    private int proyecto_3;
    private int nota_final;

    /**
     * Método constructor de la super clase
     */
    public Estudiante(String Carne, String NombreApellido, String Correo, String Telefono, String Nickname, String Tipo, int PromedioExam, int PromedioQuiz,
                      int PromedioTarea, int Proyecto1, int Proyecto2, int Proyecto3, int NotaFinal) {
        this.Carne = Carne;
        this.NombreApellido = NombreApellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Nickname = Nickname;
        this.Tipo = Tipo;
        this.PromedioExam = PromedioExam;
        this.PromedioQuiz = PromedioQuiz;
        this.PromedioTarea = PromedioTarea;
        this.Proyecto1 = Proyecto1;
        this.Proyecto2 = Proyecto2;
        this.Proyecto3 = Proyecto3;
        this.NotaFinal = NotaFinal;

    }

    public String getCarne() {
        return Carne;
    }

    public String getNombre() {
        return NombreApellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNickname() {
        return Nickname;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getPromedio_exam() {
        return PromedioExam;
    }
    public int getPromedio_quiz() {
        return PromedioQuiz;
    }

    public int getPromedio_tarea() {
        return PromedioTarea;
    }

    public int getProyecto_1() {
        return Proyecto1;
    }

    public int getProyecto_2() {
        return Proyecto2;
    }

    public int getProyecto_3() {
        return Proyecto3;
    }

    public int getNota_final() {
        return NotaFinal;
    }


    public void setNota_final(int NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    abstract  obtener_nota();

    public obtener_final() {
         nota;
        nota = (getProyecto1() + getProyecto2() + getProyecto3() + getPromedioExam() + getPromedioQuiz() + getPromedioTarea()) / 6;
        return nota;
    }

}