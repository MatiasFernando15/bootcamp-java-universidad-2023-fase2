package ar.com.educacionit.universidad.desafio.java.modulo.uno;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos a procesar: ");
        int cantidadAlumnos = scanner.nextInt();

        String[] nombres = new String[cantidadAlumnos];
        String[] apellidos = new String[cantidadAlumnos];
        int[] numExamenes = new int[cantidadAlumnos];
        double[] notas = new double[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = scanner.next();
            System.out.print("Apellido: ");
            apellidos[i] = scanner.next();
            System.out.print("Número de exámenes: ");
            numExamenes[i] = scanner.nextInt();

            double sumaNotas = 0;
            for (int j = 0; j < numExamenes[i]; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                sumaNotas += nota;
            }
            notas[i] = sumaNotas / numExamenes[i];
        }

        // Aquí puedes realizar los cálculos necesarios para determinar los alumnos con calificación más alta, más baja, promocionados y los que deben recursar.
        // Puedes utilizar bucles y variables auxiliares para realizar estos cálculos.

        // Luego, imprime la información solicitada.

	}

}
