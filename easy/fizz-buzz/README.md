## Aufgabe: Fizz Buzz

Gegeben ist eine Ganzzahl `n`.  
Gib ein String-Array zurück, das die Zahlen von **1 bis n** enthält, jedoch mit folgenden Ersetzungen:

- Für Vielfache von **3 und 5** gib `"FizzBuzz"` aus.
- Für Vielfache von **3** gib `"Fizz"` aus.
- Für Vielfache von **5** gib `"Buzz"` aus.
- Für alle anderen Zahlen gib die Zahl selbst als String aus.

---

### Beispiele

#### Beispiel 1:
**Input:**  
`n = 3`  
**Output:**  
`["1", "2", "Fizz"]`

#### Beispiel 2:
**Input:**  
`n = 5`  
**Output:**  
`["1", "2", "Fizz", "4", "Buzz"]`

#### Beispiel 3:
**Input:**  
`n = 15`  
**Output:**  
`["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]`

---

### Lösungshinweis

Die Aufgabe lässt sich mit einer einfachen Schleife von `1` bis `n` lösen.  
Für jede Zahl wird geprüft:
- ob sie durch 3 und 5 teilbar ist → `"FizzBuzz"`
- ob sie nur durch 3 teilbar ist → `"Fizz"`
- ob sie nur durch 5 teilbar ist → `"Buzz"`
- andernfalls wird die Zahl selbst als String gespeichert.

Diese Aufgabe ist ideal zum Üben von **Modulo-Operatoren** und **Bedingungen (if/else)**.
