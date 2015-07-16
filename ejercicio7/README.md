#Ejercicio 7

1.- Hacer una clase Calculadora de números naturales (enteros >=0) que ofrezca los siguientes métodos:
- sumar(int a, int b) : int
- restar(int a, int b) : int
- multiplicar(int a, int b) : int
- dividir(int a, int b) : int

Manejar las posibles excepciones que puedan existir con clases personalizadas. El programa no debe abortar en ningún momento, debe realizar todas las operaciones contenidas en el main. En el método main deberán realizarse las siguientes operaciones:

```
Calculadora calc = new Calculadora();
int a = calc.sumar(8, 10);
int b = calc.restar(20, a);
int c = calc.restar(2, 2);
int d = calc.dividir(a, c);
```
