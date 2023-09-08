package ar.com.educacionit.universidad.desafio.java.modulo.uno;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato dd/mm/aaaa:");
        String input = scanner.nextLine();

        // Dividir la entrada en día, mes y año
        String[] partes = input.split("/");
        if (partes.length != 3) {
            System.out.println("Formato de fecha incorrecto. Debe ser dd/mm/aaaa.");
            return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        // Realizar las validaciones
        if (año >= 1900 && año <= 2099) {
            if (mes >= 1 && mes <= 12) {
                if (mes == 2) {
                    // Verificar si el año es bisiesto
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        if (dia >= 1 && dia <= 29) {
                            System.out.println("La fecha es correcta.");
                        } else {
                            System.out.println("Día incorrecto para febrero bisiesto.");
                        }
                    } else {
                        if (dia >= 1 && dia <= 28) {
                            System.out.println("La fecha es correcta.");
                        } else {
                            System.out.println("Día incorrecto para febrero no bisiesto.");
                        }
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("Día incorrecto para este mes.");
                    }
                } else {
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("Día incorrecto para este mes.");
                    }
                }
            } else {
                System.out.println("Mes incorrecto.");
            }
        } else {
            System.out.println("Año incorrecto.");
        }

	}

}
