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

</details>

---


#### 2. `Ejercicio de determinar el día de la semana:` Escribe un programa que solicite al usuario ingresar un número del 1 al 7 que represente un día de la semana. Utilizando la estructura condicional if-else, muestra el nombre del día correspondiente (por ejemplo, 1 para "Lunes", 2 para "Martes", etc.).

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}
```
</details>

---

#### 3. `Ejercicio de cálculo de descuento`: Escribe un programa que solicite al usuario ingresar el precio de un producto. Si el precio supera los $100, aplica un descuento del 10% y muestra el precio final; de lo contrario, muestra el precio sin descuento.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio > 100) {
            double descuento = precio * 0.1;
            double precioFinal = precio - descuento;
            System.out.println("Precio con descuento: $" + precioFinal);
        } else {
            System.out.println("Precio sin descuento: $" + precio);
        }

        scanner.close();
    }
}

```
</details>

---

#### 4. `Ejercicio de verificación de un triángulo`: Escribe un programa que solicite al usuario ingresar las longitudes de tres lados de un triángulo. Utilizando la estructura condicional if-else, verifica si es posible formar un triángulo con esas longitudes y muestra un mensaje correspondiente.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class VerificarTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Se puede formar un triángulo con esas longitudes");
        } else {
            System.out.println("No se puede formar un triángulo con esas longitudes");
        }

        scanner.close();
    }
}

```
</details>

---


#### 5. `Ejercicio de conversión de temperaturas`: Escribe un programa que solicite al usuario ingresar una temperatura en grados Celsius. Utilizando la estructura condicional if-else, convierte la temperatura a grados Fahrenheit si es mayor o igual a 0, o a grados Kelvin si es menor a 0, y muestra el resultado.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        if (celsius >= 0) {
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);
        } else {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura en grados Kelvin: " + kelvin);
        }

        scanner.close();
    }
}

```
</details>

---
