
import java.util.Scanner;

    public static void main(String[] args) {
    final double PRECIO_BANO = 15.00;
    final double PRECIO_CORTE = 20.00;
    final double PRECIO_VET = 50.00;
    final double DESC_MASCOTA_PEQUENA = 0.20;
    final double RECARGO_URGENCIA = 1.5;
        double costo_final = 0.0;
        System.out.println("Ingrese el tipo de mascota P (perro), G (gato), R (roedor), A (ave): ");
        try (Scanner scanner = new Scanner(System.in)) {
            String tipo = scanner.nextLine();
            System.out.println("Ingrese el peso de la mascota: ");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese la edad de la mascota: ");
            int edad = scanner.nextInt();
            System.out.println("Ingrese el tipo de servicio: B (baño), C (corte), V (veterinario): ");
            String servicio = scanner.next();
            System.out.println("Entro por urgencia? S (si), N (no): ");
            Boolean urgente = scanner.next().equals("S");

            switch (tipo) {
                case "P" -> System.out.println("El tipo de mascota es: Perro");
                case "G" -> System.out.println("El tipo de mascota es: Gato");
                case "R" -> System.out.println("El tipo de mascota es: Roedor");
                case "A" -> System.out.println("El tipo de mascota es: Ave");
                default -> System.out.println("Tipo de mascota no válido.");
            }

            switch (servicio) {
                case "B" -> {
                    System.out.println("El servicio es: Baño");
                    costo_final = PRECIO_BANO;
                    System.out.println("El precio del servicio es: " + costo_final);
                }
                case "C" -> {
                    System.out.println("El servicio es: Corte");
                    costo_final = PRECIO_CORTE;
                    System.out.println("El precio del servicio es: " + costo_final);
                }
                case "V" -> {
                    System.out.println("El servicio es: Veterinario");
                    costo_final = PRECIO_VET;
                    System.out.println("El precio del servicio es: " + costo_final);
                }
                default -> System.out.println("Servicio no válido.");
            }
            if (peso <= 5) {
                System.out.println("Aplica para descuento por mascota pequeña: ");
                costo_final = costo_final * (1 - DESC_MASCOTA_PEQUENA);
                System.out.println("El precio final con descuento es: " + costo_final);
            }
            if (urgente) {
                System.out.println("Aplica para recargo por urgencia: ");
                costo_final = costo_final * RECARGO_URGENCIA;
                System.out.println("El precio final con recargo es: " + costo_final);
            } else {
                System.out.println("El precio final es: " + costo_final);
            }
        }
    }
