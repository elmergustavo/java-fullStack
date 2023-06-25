# Estructuras de control

Estructuras de control: condicionales (if-else, switch), bucles (for, while, do-while) y estructuras de control adicionales.

# Estructuras de Control en Java

Este repositorio contiene ejemplos de estructuras de control en Java, incluyendo condicionales (if-else, switch), bucles (for, while, do-while) y otras estructuras de control adicionales.

## Condicionales

### if-else

La estructura de control if-else permite ejecutar un bloque de código si se cumple una condición y otro bloque de código si la condición no se cumple.

Ejemplo:
```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
} else {
    // Código a ejecutar si la condición es falsa
}
```


#### 1. `Ejercicio de adivinar un número`: Escribe un programa que genere un número aleatorio entre 1 y 100. Luego, solicita al usuario que adivine el número generado. Utilizando la estructura condicional if-else, muestra un mensaje indicando si el número ingresado por el usuario es mayor o menor que el número generado, y continúa solicitando al usuario que adivine hasta que lo haga correctamente.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroIngresado;

        System.out.println("Adivina el número generado (entre 1 y 100)");

        do {
            System.out.print("Ingresa un número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número generado.");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número ingresado es mayor que el número generado.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        } while (numeroIngresado != numeroAleatorio);

        scanner.close();
    }
}
```

En este programa, se genera un número aleatorio utilizando la clase `Random` y se almacena en la variable numeroAleatorio. Luego, se solicita al usuario que adivine el número y se utiliza un bucle do-while para continuar solicitando el número hasta que se adivine correctamente.

Dentro del bucle, se compara el número ingresado por el usuario con el número aleatorio utilizando la estructura condicional if-else. Se muestra un mensaje indicando si el número es mayor o menor que el número generado. Si el número ingresado es igual al número generado, se muestra un mensaje de felicitaciones y se termina el bucle.

El programa también lleva un contador de intentos para mostrar cuántos intentos tomó al usuario adivinar el número.

---
