## Aufgabe: Remove Duplicates from Sorted Array

Gegeben ist ein sortiertes Array `nums`. Die Aufgabe besteht darin, die doppelten Elemente **in-place** zu entfernen, sodass jedes Element nur **einmal** vorkommt.  
Der relative Abstand der eindeutigen Werte muss dabei erhalten bleiben.

Die Funktion soll die Anzahl der eindeutigen Elemente `k` zurückgeben. Die ersten `k` Positionen im Array `nums` sollen genau diese eindeutigen Werte enthalten.  
Was hinter `k` im Array steht, spielt keine Rolle.

### Beispiel 1:
**Input:** `nums = [1,1,2]`  
**Output:** `k = 2`, `nums = [1,2,_]`

### Beispiel 2:
**Input:** `nums = [0,0,1,1,1,2,2,3,3,4]`  
**Output:** `k = 5`, `nums = [0,1,2,3,4,_...]`

### Hinweise:
- Die Lösung muss **in-place** erfolgen (d.h. ohne zusätzliches Array).
- Das Array ist **nicht absteigend sortiert**.
- Ziel ist es, möglichst effizient zu arbeiten (idealerweise O(n)).

