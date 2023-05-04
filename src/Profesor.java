public class Profesor extends Persona{
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(Long cedula, String name, String apellido1, String apellido2, int edad, String materia) {
        super(cedula, name, apellido1, apellido2, edad);
        this.materia = materia;
    }

    
    public String calificar(int nota){
        return "su nota es: "+nota;
    }

    public String llamaraLista(){
        return "todos estan en clase";
    }
    
}
