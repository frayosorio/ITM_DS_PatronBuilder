package dominio;

public class Usuario {

    private String nombres; // requeridos
    private String apellidos; // requeridos

    private int edad; // opcional
    private String telefono; // opcional
    private String direccion; // opcional

    public Usuario(UsuarioBuilder builder) {
        this.apellidos = builder.apellidos;
        this.nombres = builder.nombres;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario: " + this.apellidos + " " +
                this.nombres + ", " +
                this.edad + " años, " +
                this.telefono + ", " +
                this.direccion;
    }

    public static class UsuarioBuilder {
        private String nombres;
        private String apellidos;

        private int edad;
        private String telefono;
        private String direccion;

        public UsuarioBuilder(String nombres, String apellidos) {
            this.nombres = nombres;
            this.apellidos = apellidos;
        }

        public UsuarioBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public UsuarioBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public UsuarioBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Usuario build() {
            Usuario usuario = new Usuario(this);
            // puede incluirse codigo con reglas del negocio
            return usuario;
        }

    }

}
