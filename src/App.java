import dominio.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario.UsuarioBuilder("Heymy Lorena", "Gonzalez Correa")
                // sin mas datos
                .build();

        Usuario usuario2 = new Usuario.UsuarioBuilder("Gustavo Andres", "Vargas Berrio")
                .edad(20)
                // sin telefono
                // sin direccion
                .build();

        Usuario usuario3 = new Usuario.UsuarioBuilder("Milton Antonio", "Vidales Guzman")
                .edad(18)
                .telefono("3105658989")
                // sin direccion
                .build();

        Usuario usuario4 = new Usuario.UsuarioBuilder("Cardona", "Juan Camilo")
                // sin edad
                .telefono("3105658989")
                .direccion("Cra 28 # 72-128")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
    }
}
