# Clases Wrapper en Java

Las clases wrapper en Java son clases que proporcionan un envoltorio para tipos primitivos, permitiendo tratarlos como objetos. Cada tipo primitivo tiene su correspondiente clase wrapper en Java, que proporciona métodos útiles para manipular y convertir los valores primitivos.

| Tipo Primitivo | Clase Wrapper |
| ------------- | ------------- |
| int           | Integer       |
| double        | Double        |
| boolean       | Boolean       |
| char          | Character     |
| byte          | Byte          |
| short         | Short         |
| long          | Long          |
| float         | Float         |

Estas clases proporcionan métodos para realizar conversiones entre los tipos primitivos y sus correspondientes clases wrapper. Por ejemplo, puedes convertir un valor entero a un objeto Integer usando el método estático `valueOf()`:

```java
int num = 42;
Integer obj = Integer.valueOf(num);
```

Las clases wrapper en Java son un conjunto de clases que proporcionan un envoltorio para los tipos de datos primitivos en Java. Estas clases permiten tratar los tipos primitivos como objetos al proporcionar métodos y funcionalidades adicionales.

Cada tipo primitivo tiene su propia clase wrapper correspondiente en Java, y estas clases se utilizan para realizar operaciones más avanzadas y manipular los valores primitivos de manera más flexible. A continuación se describen las principales clases wrapper disponibles en Java:

- **Integer**: La clase Integer envuelve un valor entero de 32 bits. Proporciona métodos para convertir enteros en diferentes formatos (binario, octal, hexadecimal), realizar operaciones aritméticas y manipular valores enteros.

- **Double**: La clase Double envuelve un valor de punto flotante de doble precisión de 64 bits. Proporciona métodos para realizar operaciones aritméticas, comparaciones, obtener valores especiales como infinito y NaN (Not a Number), y convertir números en diferentes formatos.

- **Boolean**: La clase Boolean envuelve un valor booleano (true o false). Proporciona métodos para realizar operaciones lógicas, comparaciones y conversiones entre booleanos y otros tipos de datos.

- **Character**: La clase Character envuelve un único carácter Unicode. Proporciona métodos para comprobar la categoría de un carácter, convertir caracteres en diferentes formatos, realizar operaciones de comparación y manipular valores de caracteres.

- **Byte**: La clase Byte envuelve un valor de 8 bits que representa un número entero. Proporciona métodos para realizar operaciones aritméticas, comparaciones y convertir bytes en diferentes formatos.

- **Short**: La clase Short envuelve un valor de 16 bits que representa un número entero. Proporciona métodos para realizar operaciones aritméticas, comparaciones y convertir números cortos en diferentes formatos.

- **Long**: La clase Long envuelve un valor de 64 bits que representa un número entero largo. Proporciona métodos para realizar operaciones aritméticas, comparaciones y convertir números largos en diferentes formatos.

- **Float**: La clase Float envuelve un valor de punto flotante de precisión simple de 32 bits. Proporciona métodos para realizar operaciones aritméticas, comparaciones, obtener valores especiales como infinito y NaN, y convertir números en diferentes formatos.

Estas clases wrapper son útiles en situaciones en las que necesitas trabajar con tipos de datos primitivos en contextos que requieren objetos, como al utilizar estructuras de datos genéricas, APIs específicas que trabajan con objetos o al aprovechar funcionalidades específicas de cada clase wrapper.


### Ejemplo con la clase Integer:
```java
// Declaración de una variable entera primitiva
int num = 42;

// Envoltura de la variable entera en un objeto Integer
Integer obj = Integer.valueOf(num);

// Utilizando métodos de la clase Integer
System.out.println("Valor del objeto Integer: " + obj.toString());
System.out.println("Valor en binario: " + Integer.toBinaryString(obj));
System.out.println("Valor en hexadecimal: " + Integer.toHexString(obj));
System.out.println("Suma con otro entero: " + obj + 10);

```
```java
Integer num = Integer.valueOf(42); // Crear un objeto Integer con el valor 42   forma explicita

// Métodos disponibles en la clase Integer
int value = num.intValue(); // Obtener el valor entero del objeto Integer
String str = num.toString(); // Convertir el objeto Integer a una cadena de texto
int parsedInt = Integer.parseInt("123"); // Convertir una cadena de texto a un valor entero

```

```java
int sum = Integer.sum(10, 20); // Sumar dos enteros
int compareResult = Integer.compare(10, 20); // Comparar dos enteros

```

```java
int intValue = Integer.parseInt("42"); // Convertir una cadena de texto a un valor entero
String binaryString = Integer.toBinaryString(42); // Convertir un entero a una cadena binaria
int maxValue = Integer.max(10, 20); // Obtener el valor máximo entre dos enteros
int minValue = Integer.min(10, 20); // Obtener el valor mínimo entre dos enteros

```
### Ejemplo con la clase Double:

```java
double doubleValue = Double.parseDouble("3.14"); // Convertir una cadena de texto a un valor de punto flotante
String hexString = Double.toHexString(3.14); // Convertir un valor de punto flotante a una cadena hexadecimal
double maxValue = Double.max(1.23, 4.56); // Obtener el valor máximo entre dos números de punto flotante
double minValue = Double.min(1.23, 4.56); // Obtener el valor mínimo entre dos números de punto flotante

```

### Ejemplo con la clase Character:

```java
boolean isDigit = Character.isDigit('9'); // Verificar si un carácter es un dígito
boolean isLetter = Character.isLetter('A'); // Verificar si un carácter es una letra
boolean isWhitespace = Character.isWhitespace(' '); // Verificar si un carácter es un espacio en blanco
char toUpperCase = Character.toUpperCase('a'); // Convertir un carácter a mayúscula


```

### Ejemplo con la clase Boolean:

```java
boolean parsedBoolean = Boolean.parseBoolean("true"); // Convertir una cadena de texto a un valor booleano
String toString = Boolean.toString(true); // Convertir un valor booleano a una cadena de texto
boolean logicalAnd = Boolean.logicalAnd(true, false); // Realizar una operación lógica AND entre dos valores booleanos
boolean logicalOr = Boolean.logicalOr(true, false); // Realizar una operación lógica OR entre dos valores booleanos

```



