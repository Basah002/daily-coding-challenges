## Aufgabe: Palindrome Number

Gegeben ist eine ganze Zahl `x`.  
Schreibe eine Funktion, die prüft, ob `x` ein Palindrom ist.

Eine Zahl ist ein **Palindrom**, wenn sie vorwärts und rückwärts gelesen denselben Wert ergibt.  
Beispielsweise ist `121` ein Palindrom, `-121` aber **nicht**, da das Minuszeichen beim Umdrehen an die falsche Position wandert.

### Beispiel 1:
**Input:** `x = 121`  
**Output:** `true`  
**Erklärung:** `121` ist von links und rechts gelesen identisch.

### Beispiel 2:
**Input:** `x = -121`  
**Output:** `false`  
**Erklärung:** Rückwärts gelesen ergibt sich `121-`, was kein gültiger Ausdruck ist.

### Beispiel 3:
**Input:** `x = 10`  
**Output:** `false`  
**Erklärung:** Rückwärts ist es `01`, was nicht gleich `10` ist.

---

### Zusatz:
- Negative Zahlen können **niemals** Palindrome sein.
- Eine Zahl mit `0` am Ende (z. B. `10`) kann nur ein Palindrom sein, wenn die Zahl selbst `0` ist.

### Einschränkungen:
- `-2³¹ <= x <= 2³¹ - 1`

---

### Ziel:
Implementiere die Funktion effizient **ohne** die Zahl in einen String umzuwandeln (optional – für fortgeschrittene Lösung).
