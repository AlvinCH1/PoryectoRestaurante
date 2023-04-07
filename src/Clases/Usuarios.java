package Clases;
/**
 * @author drake
 */
public class Usuarios {
    //Propiedades
    private String Login_Usuario;
    private String Pass_Usuario;
    private int  Nivel_Acceso;
    private String Nombre_Usuario;
    private String Apllido_Usuario;
    private String Correo_Usuario;

    //Metodo Constuctor
    public Usuarios() {
        
    }
    
    public Usuarios(String Login_Usuario, String Pass_Usuario, int Nivel_Acceso, String Nombre_Usuario, String Apllido_Usuario, String Correo_Usuario) {
        this.Login_Usuario = Login_Usuario;
        this.Pass_Usuario = Pass_Usuario;
        this.Nivel_Acceso = Nivel_Acceso;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Apllido_Usuario = Apllido_Usuario;
        this.Correo_Usuario = Correo_Usuario;
    }
    
    //Otros Metodos

    public String getLogin_Usuario() {
        return Login_Usuario;
    }

    public void setLogin_Usuario(String Login_Usuario) {
        this.Login_Usuario = Login_Usuario;
    }

    public String getPass_Usuario() {
        return Pass_Usuario;
    }

    public void setPass_Usuario(String Pass_Usuario) {
        this.Pass_Usuario = Pass_Usuario;
    }

    public int getNivel_Acceso(Object value) {
        return Nivel_Acceso;
    }

    public void setNivel_Acceso(int Nivel_Acceso) {
        this.Nivel_Acceso = Nivel_Acceso;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getApllido_Usuario() {
        return Apllido_Usuario;
    }

    public void setApllido_Usuario(String Apllido_Usuario) {
        this.Apllido_Usuario = Apllido_Usuario;
    }

    public String getCorreo_Usuario() {
        return Correo_Usuario;
    }

    public void setCorreo_Usuario(String Correo_Usuario) {
        this.Correo_Usuario = Correo_Usuario;
    }
}