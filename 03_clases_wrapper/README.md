# Clases Wrapper en Java

Las clases wrapper en Java son clases que proporcionan un envoltorio para tipos primitivos, permitiendo tratarlos como objetos. Cada tipo primitivo tiene su correspondiente clase wrapper en Java, que proporciona métodos útiles para manipular y convertir los valores primitivos.

## Clases Wrapper disponibles en Java

A continuación se presentan las clases wrapper para los tipos primitivos en Java:

- **Integer**: envuelve un valor entero.
- **Double**: envuelve un valor de punto flotante de doble precisión.
- **Boolean**: envuelve un valor booleano.
- **Character**: envuelve un carácter.
- **Byte**: envuelve un valor byte.
- **Short**: envuelve un valor corto.
- **Long**: envuelve un valor largo.
- **Float**: envuelve un valor de punto flotante.

Estas clases proporcionan métodos para realizar conversiones entre los tipos primitivos y sus correspondientes clases wrapper. Por ejemplo, puedes convertir un valor entero a un objeto Integer usando el método estático `valueOf()`:

```java
int num = 42;
Integer obj = Integer.valueOf(num);
```
