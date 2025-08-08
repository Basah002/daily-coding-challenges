# 344. Reverse String

## Aufgabenbeschreibung
Gegeben ist ein String, der als Array von Zeichen (`char[]`) dargestellt wird.  
Schreibe eine Funktion, die den String **in-place** (ohne zusätzlichen Speicher) umkehrt.  
Es darf nur **O(1)** zusätzlicher Speicher verwendet werden.

## Beispiele

**Beispiel 1**  
Input: `["h","e","l","l","o"]`  
Output: `["o","l","l","e","h"]`

**Beispiel 2**  
Input: `["H","a","n","n","a","h"]`  
Output: `["h","a","n","n","a","H"]`

## Constraints
- `1 <= s.length <= 10^5`
- `s[i]` ist ein druckbares ASCII-Zeichen.

## Komplexität
- **Zeitkomplexität:** O(n) – jedes Zeichen wird höchstens einmal getauscht.
- **Speicherkomplexität:** O(1) – nur konstante Hilfsvariablen werden verwendet.

