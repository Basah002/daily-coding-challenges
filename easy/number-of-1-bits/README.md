## Aufgabe: Number of 1 Bits

Gegeben ist eine positive ganze Zahl `n`.

Schreibe eine Funktion, die die Anzahl der **1-Bits** (auch "Set Bits" genannt) in der **Binärdarstellung** von `n` zurückgibt.  
Diese Anzahl wird auch als **Hamming-Gewicht** bezeichnet.

---

### Beispiele

#### Beispiel 1:
**Input:**  
`n = 11`  
**Output:**  
`3`  
**Erklärung:**  
Die Binärdarstellung von `11` ist `1011`, das enthält drei Einsen.

---

#### Beispiel 2:
**Input:**  
`n = 128`  
**Output:**  
`1`  
**Erklärung:**  
Die Binärdarstellung von `128` ist `10000000`, das enthält eine Eins.

---

#### Beispiel 3:
**Input:**  
`n = 2147483645`  
**Output:**  
`30`  
**Erklärung:**  
Die Binärdarstellung enthält dreißig Einsen.

---

### Einschränkungen

- `1 <= n <= 2^31 - 1`
