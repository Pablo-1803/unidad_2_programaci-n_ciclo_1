public class Nota {
    public static void main(String[] args) {
        // Constantes
        final double EVALUCAION = 0.30;
        final double GRUPALES = 0.30;
        final double FINAL = 0.40;
        //Datos de entrada
        System.out.println("ingrese la nota de evaluacion: ");
        double evaluacion = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese la nota de trabajos grupales: ");
        double grupales = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese la nota del examen final: ");
        double finalExam = Double.parseDouble(System.console().readLine());
        boolean condicion = (evaluacion >= 0.0 && evaluacion <= 10.01) && (grupales >= 0.0 && grupales <= 10.01) && (finalExam >= 0.0 && finalExam <= 10.01);
        float estado = (condicion) ? 1 : 0;
        if (estado ==1) {
            evaluacion = evaluacion * EVALUCAION;
            grupales = grupales * GRUPALES;
            finalExam = finalExam * FINAL;
        }
        if (estado == 1) {
            double unidad1 = evaluacion+grupales+finalExam;
        } else {
            double unidad1 = 0.0;
            System.out.println("Las notas deben estar entre 0 y 10.");
        }
        double unidad1 = evaluacion+grupales+finalExam;
        double evaluacion_1 = evaluacion/EVALUCAION;
        double grupales_1 = grupales/GRUPALES;
        double finalExam_1 = finalExam/FINAL;
        if (estado == 1) {
            if (unidad1 <= 4.99) {
                System.out.printf("Las notas ingresadas son: %.2f, %.2f, %.2f%n", evaluacion_1, grupales_1, finalExam_1);
                System.out.printf("Nota de unidad 1: %.2f%n", unidad1);
                System.out.println("Reprobado, desempeno DEFICIENTE");
            } else if (unidad1 >= 5.00 && unidad1 <= 6.99) {
                System.out.printf("Las notas ingresadas son: %.2f, %.2f, %.2f%n", evaluacion_1, grupales_1, finalExam_1);
                System.out.printf("Nota de unidad 1: %.2f%n", unidad1);
                System.out.println("Reprobado, desempeno REGULAR");
            }
            else if (unidad1 >= 7.00 && unidad1 <= 8.99) {
                System.out.printf("Las notas ingresadas son: %.2f, %.2f, %.2f%n", evaluacion_1, grupales_1, finalExam_1);
                System.out.printf("Nota de unidad 1: %.2f%n", unidad1);
                System.out.println("Aprobado, desempeno BUENO");
            } else if (unidad1 >= 9.00 && unidad1 <= 10.00) {
                System.out.printf("Las notas ingresadas son: %.2f, %.2f, %.2f%n", evaluacion_1, grupales_1, finalExam_1);
                System.out.printf("Nota de unidad 1: %.2f%n", unidad1);
                System.out.println("Aprobado, Felicitaciones, desempeno EXCELENTE");
            }
        }
    }
}