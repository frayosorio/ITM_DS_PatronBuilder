import dominio.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario.UsuarioBuilder("Daniel", "Henao Carvajal")
                .telefono("3134567890")
                .build();

        Usuario usuario2 = new Usuario.UsuarioBuilder("Zulma Paola", "Parra")
                // sin mas datos
                .build();

        Usuario usuario3 = new Usuario.UsuarioBuilder("Juan José", "Molina Urbaez")
                .telefono("3214448887")
                .direccion("Cra 35 # 65-19")
                .edad(23)
                .build();

        Usuario usuario4 = new Usuario.UsuarioBuilder("Ximena", "Urrea Rivera")
                .direccion("Av 80 # 32-124 apto 201")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
    }
}
