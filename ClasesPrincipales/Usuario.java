# Jeremy Rivera Moreira
public class Usuario{
    private String cedula;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contraseña;
    private String numeroCelular;
    private TipoUsuario tipoUsuario;
    private int edad;

    //metodos get y set
    public String getCedula(){
        return cedula;
        }
    public String getNombre(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public String getNumeroCelular(){
        return numeroCelular;
    }
    public TipoUsuario getTipoUsuario(){
        return tipoUsuario;
    }
    public int getEdad(){
        return edad;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public void setNombres(String nombres){
        this.nombres = nombres; 
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos; 
    }
    public void setUsuario(String usuario){
        this.usuario = usuario; 
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña; 
    }
    public void setEdad(int edad){
        this.edad = edad; 
    }
    public void setNumeroCelular(String numeroCelular){
        this.numeroCelular = numeroCelular
    }
    //constructor para edad
    public Usuario(int edad){
        this.edad = edad;
    }
    public Usuario(){
        this.edad = 18;
    }
}