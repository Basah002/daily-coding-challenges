## Aufgabe: Valid Anagram

Gegeben sind zwei Strings `s` und `t`.  
Gib `true` zurück, wenn `t` ein **Anagramm** von `s` ist – andernfalls `false`.

Ein **Anagramm** ist ein Wort oder Satz, der durch Umordnen der Buchstaben eines anderen Wortes oder Satzes entsteht.  
Die Häufigkeit jedes Zeichens muss gleich sein.

---

### Beispiele

#### Beispiel 1:
**Input:**  
`s = "anagram"`  
`t = "nagaram"`  
**Output:**  
`true`

---

#### Beispiel 2:
**Input:**  
`s = "rat"`  
`t = "car"`  
**Output:**  
`false`

---

### Einschränkungen

- `1 <= s.length, t.length <= 5 * 10⁴`
- `s` und `t` bestehen nur aus **englischen Kleinbuchstaben** (`a` bis `z`)

