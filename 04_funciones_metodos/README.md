# Curso de Java: Funciones y Métodos

Este repositorio contiene el material del curso de Java donde se aborda el tema de funciones y métodos. Este módulo es fundamental para aprender a organizar y reutilizar el código de manera efectiva.

## Contenido

- [Introducción a las funciones](#introducción-a-las-funciones)
- [Paso de parámetros](#paso-de-parámetros)
- [Sobrecarga de métodos](#sobrecarga-de-métodos)
- [Métodos con valor de retorno](#métodos-con-valor-de-retorno)
- [Métodos con modificadores de acceso](#métodos-con-modificadores-de-acceso)

Por supuesto, aquí tienes la descripción en formato Markdown:

## Métodos en Java

En Java, los métodos son bloques de código que encapsulan una serie de instrucciones para realizar una tarea específica. Proporcionan modularidad y reutilización de código al dividir un programa en partes más pequeñas y manejables.

Un método consta de una firma que incluye el tipo de retorno, el nombre del método y los parámetros (si los tiene). El tipo de retorno indica el tipo de dato que el método devuelve después de su ejecución, y los parámetros son variables opcionales que se pueden pasar para proporcionar valores de entrada.

Los beneficios de utilizar métodos en Java incluyen:

- **Reutilización de código**: Permite escribir un conjunto de instrucciones una vez y reutilizarlo en diferentes partes del programa, evitando la duplicación de código.

- **Modularidad**: Facilita la división de un programa en partes más pequeñas y manejables, lo que mejora la legibilidad y el mantenimiento del código.

- **Abstracción**: Los métodos permiten ocultar los detalles de implementación y proporcionar una interfaz clara para interactuar con otras partes del programa.

- **Organización**: Ayudan a organizar el código de manera estructurada y lógica, lo que facilita la comprensión y el seguimiento del flujo del programa.

En resumen, los métodos en Java son bloques de código que realizan tareas específicas y se utilizan para dividir un programa en partes más pequeñas y reutilizables. Proporcionan estructura, modularidad y abstracción al código, lo que facilita su mantenimiento y comprensión.

## Introducción a las funciones

En esta sección, exploraremos la importancia de las funciones en la programación y cómo nos ayudan a dividir el código en bloques más pequeños y reutilizables. Además, aprenderemos la sintaxis básica de una función en Java y cómo podemos utilizarla para realizar operaciones simples.

## Paso de parámetros

El paso de parámetros es una parte fundamental de las funciones en Java. En este apartado, aprenderemos los diferentes tipos de parámetros (valor y referencia) y cómo se pasan a una función. También veremos ejemplos prácticos de funciones que toman diferentes tipos de parámetros.

## Sobrecarga de métodos

La sobrecarga de métodos nos permite tener múltiples métodos con el mismo nombre pero con diferentes parámetros. En esta sección, exploraremos este concepto y veremos cómo podemos utilizarlo para crear métodos que realicen operaciones similares pero con diferentes tipos de datos o número de parámetros.

## Métodos con valor de retorno

A veces, necesitamos que una función nos devuelva un valor calculado. En este apartado, aprenderemos cómo especificar el tipo de retorno en una función y cómo podemos utilizarlo para obtener resultados. Veremos ejemplos de funciones que realizan cálculos y devuelven el resultado.

## Métodos con modificadores de acceso

En Java, podemos utilizar modificadores de acceso (public, private, protected) para controlar el acceso a los métodos. En esta sección, exploraremos los diferentes modificadores de acceso y cómo afectan la visibilidad y el acceso a los métodos desde otras partes del programa.

¡Claro! Aquí tienes algunos ejemplos de métodos en Java para diferentes situaciones:

1. Método sin retorno y sin parámetros:
```java
public void saludar() {
    System.out.println("¡Hola, bienvenido!");
}
```

2. Método con retorno y parámetros:
```java
public int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

3. Método estático:
```java
public static void imprimirMensaje(String mensaje) {
    System.out.println(mensaje);
}
```

4. Método recursivo:
```java
public int calcularFactorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * calcularFactorial(n - 1);
    }
}
```

5. Método con argumentos variables:
```java
public int sumarNumeros(int... numeros) {
    int suma = 0;
    for (int numero : numeros) {
        suma += numero;
    }
    return suma;
}
```

