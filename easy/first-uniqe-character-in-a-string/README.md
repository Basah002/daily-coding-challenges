# 387. First Unique Character in a String

## Problemstellung
Gegeben ist ein String `s`. Finde den **Index** des ersten Zeichens, das **nicht wiederholt** vorkommt. Falls es kein solches Zeichen gibt, soll `-1` zurückgegeben werden.

Ein Zeichen gilt als **einzigartig**, wenn es im gesamten String nur **einmal** vorkommt. Die Reihenfolge des Strings muss beibehalten werden, und es soll der **erste** Index zurückgegeben werden, an dem ein solches Zeichen gefunden wird.

---

## Beispiele

**Beispiel 1**  
Input: s = "leetcode"  
Output: 0  
Erklärung: Das Zeichen 'l' an Index 0 kommt nur einmal im String vor.

**Beispiel 2**  
Input: s = "loveleetcode"  
Output: 2  
Erklärung: Das Zeichen 'v' an Index 2 kommt nur einmal im String vor.

**Beispiel 3**  
Input: s = "aabb"  
Output: -1  
Erklärung: Kein Zeichen im String ist einzigartig.

---

## Einschränkungen
- `1 <= s.length <= 10^5`
- `s` besteht ausschließlich aus Kleinbuchstaben des englischen Alphabets (`'a'`–`'z'`).


