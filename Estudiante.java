package tallerfinaljavapoo;

import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {
    int identificacion;
    String nombre;
    String email;

    public Estudiante(int identificacion, String nombre, String email) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos de acceso
    int getIdentificacion() {
        return identificacion;
    }

    void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getEmail() {
        return email;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        // Cargar n estudiantes cuyos valores se ingresan por teclado
        System.out.print("Ingrese el número de estudiantes a cargar: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Identificación: ");
            int id = scanner.nextInt();
            System.out.print("Nombre: ");
            scanner.nextLine(); // Limpiar el buffer
            String nombre = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Estudiante nuevoEstudiante = new Estudiante(id, nombre, email);
            listaEstudiantes.add(nuevoEstudiante);
        }

        // Consulta de un estudiante por número de identificación
        System.out.print("Ingrese la identificación del estudiante a consultar: ");
        int idConsulta = scanner.nextInt();

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion() == idConsulta) {
                System.out.println("Estudiante encontrado: " + estudiante.getNombre());
                break;
            }
        }

        // Actualización de la identificación y del nombre
        System.out.print("Ingrese la identificación del estudiante a actualizar: ");
        int idActualizar = scanner.nextInt();

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion() == idActualizar) {
                System.out.print("Ingrese la nueva identificación: ");
                int nuevaId = scanner.nextInt();
                estudiante.setIdentificacion(nuevaId);

                System.out.print("Ingrese el nuevo nombre: ");
                scanner.nextLine(); // Limpiar el buffer
                String nuevoNombre = scanner.nextLine();
                estudiante.setNombre(nuevoNombre);

                System.out.println("Estudiante actualizado con éxito.");
                break;
            }
        }

        // Imprimir el listado de los estudiantes
        System.out.println("Listado de estudiantes:");

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Identificación: " + estudiante.getIdentificacion() +
                    ", Nombre: " + estudiante.getNombre() +
                    ", Email: " + estudiante.getEmail());
        }

        scanner.close();
    }
}
// Angela Sarai Martinez Cetina
// 2821728
// 26-02-2024