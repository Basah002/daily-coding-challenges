## Aufgabe: Remove Element

Gegeben ist ein Array `nums` und ein Wert `val`.  
Entferne **in-place** alle Vorkommen von `val` im Array.  
Die Funktion soll die Anzahl der verbleibenden Elemente (≠ `val`) zurückgeben.  
Die Reihenfolge der übrigen Elemente darf verändert werden.  

**Ziel:**  
Die Lösung soll ohne zusätzliche Speicherstrukturen auskommen (in-place).  

---

### Beispiel 1:

**Input:**  
`nums = [3,2,2,3]`, `val = 3`  
**Output:**  
`2`, mit `nums = [2,2,_,_]`

**Erklärung:**  
Zwei Elemente (2,2) bleiben übrig, 3 wird entfernt.

---

### Beispiel 2:

**Input:**  
`nums = [0,1,2,2,3,0,4,2]`, `val = 2`  
**Output:**  
`5`, mit `nums = [0,1,4,0,3,_,_,_]`  

**Erklärung:**  
Alle Vorkommen von 2 wurden entfernt. Die restlichen 5 Elemente können in beliebiger Reihenfolge angeordnet sein.

---

### Anmerkung:

Die Aufgabe wurde mithilfe eines **Two-Pointer-Ansatzes** gelöst:  
- Ein Pointer läuft durch das Array  
- Der andere speichert gültige Werte (≠ `val`) an vorderster Stelle

Dieser Ansatz ist effizient mit Laufzeitkomplexität **O(n)** und konstantem Speicherverbrauch **O(1)**.
