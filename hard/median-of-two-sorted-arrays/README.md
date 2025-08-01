## Aufgabe: Median of Two Sorted Arrays

Gegeben sind zwei sortierte Arrays. Finde den Median, ohne sie vollständig zu mergen.  
Die Lösung soll effizient sein – mit einer Laufzeit von **O(log (m + n))**.

Beispiel:
`nums1 = [1, 3]`, `nums2 = [2]` → Median = `2.0`

## Anmerkung
In meiner Lösung werden beide Arrays zu einem neuen Array zusammengeführt und anschließend sortiert.  
Dadurch ergibt sich eine Laufzeit von **O((m + n) · log(m + n))**, da das Sortieren den größten Anteil ausmacht.

➡️ Die Implementierung **liefert korrekte Ergebnisse**, erfüllt aber **nicht die geforderte Zeitkomplexität**.  
Für einfache Tests und Verständnis ist sie jedoch vollkommen geeignet.
