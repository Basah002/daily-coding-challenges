# 58. Length of Last Word

Diese Aufgabe stammt von LeetCode und gehört zur Kategorie der einfachen String-Probleme.

## Aufgabenstellung

Gegeben ist ein String `s`, der aus Wörtern und Leerzeichen besteht. Finde die **Länge des letzten Worts** im String.  
Ein Wort ist eine zusammenhängende Sequenz aus Nicht-Leerzeichen-Zeichen.

### Beispiele

#### Beispiel 1
- **Input:** `"Hello World"`
- **Output:** `5`
- **Begründung:** Das letzte Wort ist `"World"` mit der Länge 5.

#### Beispiel 2
- **Input:** `"   fly me   to   the moon  "`
- **Output:** `4`
- **Begründung:** Das letzte Wort ist `"moon"`.

#### Beispiel 3
- **Input:** `"luffy is still joyboy"`
- **Output:** `6`
- **Begründung:** Das letzte Wort ist `"joyboy"`.

## Einschränkungen

- `1 <= s.length <= 10⁴`
- Der String `s` enthält nur englische Buchstaben (Groß-/Kleinschreibung) und Leerzeichen `' '`.
- Es ist garantiert, dass mindestens ein Wort vorhanden ist.

## Lösungsansatz

- Entferne ggf. führende oder nachfolgende Leerzeichen.
- Iteriere rückwärts durch den String, bis du auf das erste Nicht-Leerzeichen triffst.
- Zähle von dort aus die Zeichen bis zum nächsten Leerzeichen oder zum Anfang des Strings.
- Alternativ: Teile den String mit `split(" ")` und nimm das letzte Nicht-Leerzeichen-Element.

