# 342. Power of Four

## Problemstellung
Gegeben ist eine ganze Zahl `n`. Gib `true` zurück, wenn `n` eine Potenz von vier ist, andernfalls `false`.  
Eine Zahl ist eine Potenz von vier, wenn sie durch wiederholtes Multiplizieren von 1 mit 4 erreicht werden kann.

## Beispiele
Input: n = 16  
Output: true  
Erklärung: 16 kann als 4 * 4 dargestellt werden.

Input: n = 5  
Output: false  

Input: n = 1  
Output: true  
Erklärung: 1 ist 4^0 und somit eine Potenz von vier.

## Einschränkungen
- -2³¹ <= n <= 2³¹ - 1

## Hinweise
- Negative Zahlen oder 0 sind keine Potenzen von vier.
- Kann mit Schleifen, Logarithmen oder Bit-Operationen gelöst werden.
- Es gibt eine Möglichkeit, das Problem ohne Schleifen oder Rekursion zu lösen.
