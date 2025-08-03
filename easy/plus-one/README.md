# 66. Plus One

## 📝 Beschreibung

Gegeben ist ein Array `digits`, das eine große Ganzzahl darstellt, wobei jedes Element im Array ein Ziffer des Integers ist.  
Die Ziffern sind in der Reihenfolge von der bedeutendsten zur am wenigsten bedeutenden angeordnet (von links nach rechts).  
Der Integer enthält **keine führenden Nullen**.

**Ziel:** Inkrementiere den Integer um eins und gib das Ergebnis wieder als Array von Ziffern zurück.

---

## 🧠 Beispiele

### Beispiel 1
**Input:** `digits = [1, 2, 3]`  
**Output:** `[1, 2, 4]`  
**Erklärung:** 123 + 1 = 124 → Ergebnis: `[1, 2, 4]`

### Beispiel 2  
**Input:** `digits = [4, 3, 2, 1]`  
**Output:** `[4, 3, 2, 2]`  
**Erklärung:** 4321 + 1 = 4322 → Ergebnis: `[4, 3, 2, 2]`

### Beispiel 3  
**Input:** `digits = [9]`  
**Output:** `[1, 0]`  
**Erklärung:** 9 + 1 = 10 → Ergebnis: `[1, 0]`

---

## 🔍 Constraints

- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` enthält **keine führenden Nullen**



