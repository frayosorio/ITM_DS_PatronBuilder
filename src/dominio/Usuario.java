package dominio;

public class Usuario {

    private final String nombres; // requeridos
    private final String apellidos; // requeridos

    private final int edad; // opcional
    private final String telefono; // opcional
    private final String direccion; // opcional

    public Usuario(UsuarioBuilder builder) {
        this.apellidos = builder.apellidos;
        this.nombres = builder.nombres;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
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
        private final String nombres;
        private final String apellidos;

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
            validarUsuario(usuario);
            return usuario;
        }

        public void validarUsuario(Usuario usuario) {
            // validación de la información
        }

    }
}
