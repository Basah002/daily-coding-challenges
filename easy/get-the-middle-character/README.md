# Get the Middle Character

Diese Coding-Aufgabe verlangt, dass du das oder die mittleren Zeichen eines **nicht-leeren** Strings zurückgibst.

## 🧠 Aufgabenbeschreibung

Gegeben ist ein **nicht-leerer** String. Gib die **mittleren Zeichen** zurück:

- Hat der String eine **ungerade** Länge → gib **ein** mittleres Zeichen zurück.
- Hat der String eine **gerade** Länge → gib **zwei** mittlere Zeichen zurück.

---

## ✍️ Beispiele

| Eingabe       | Ausgabe  | Erklärung                             |
|---------------|----------|----------------------------------------|
| `"test"`      | `"es"`   | Gerade Länge – Zeichen an Index 1 & 2 |
| `"testing"`   | `"t"`    | Ungerade Länge – mittleres Zeichen    |
| `"middle"`    | `"dd"`   | Gerade Länge – Zeichen an Index 2 & 3 |
| `"A"`         | `"A"`    | Nur ein Zeichen – also auch das mittlere |

---

## 💡 Lösungsansatz

1. Prüfe, ob die Länge des Strings **gerade** oder **ungerade** ist.
2. Falls **ungerade**: gib das Zeichen an `s.length() / 2` zurück.
3. Falls **gerade**: gib die Zeichen im Bereich `[s.length()/2 - 1, s.length()/2 + 1)` zurück.

Der Algorithmus hat eine Laufzeit von **O(1)**, da keine Schleifen notwendig sind.

---

## 📌 Einschränkungen

- Der Eingabestring ist garantiert **nicht leer**.
- Es wird angenommen, dass nur Buchstaben enthalten sind (keine Sonderzeichen oder Leerzeichen).

---

## ✅ Tags

`Strings` · `Grundlagen` · `Indexierung`
