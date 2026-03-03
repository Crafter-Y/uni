# Übungsblatt 7

[ti-i-blatt-07.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363695)

[Pseudocode Interpreter](https://moodle.dhbw.de/pluginfile.php/497806/mod_resource/content/13/pseudocode.html)

---

1.

Der Algorithmus berechnet die Fakultät.

$x = 16, f(x) = 16! =$ 20 922 789 888 000

---

2.

(a)

- Allgemein, da es für alle $n \times n$ eine Lösung angibt
- Ausführbar
- Nicht Determinismus, da ein Zufälliger Weg genommen wird
- Determiniert, da es immer die gleiche Anzahl Schritte ist
- Finitheit, da es einen eindeutigen Schritt gibt, der immer wiederholt wird
- Terminierung, da es immer eine Lösung findet
- Dynamisch Frei, da keine Daten, außer die Schritte gespeichert werden

(b)

- Allgemein
- Ausführbar, man kann nach jedem Schritt einen weiteren machen
- Nicht Determinismus, da nach einem Schritt ein zufälliger anderer kommt
- Determiniert, nur wenn es terminiert
- Finitheit, die Beschreibung scheint mir eindeutig
- Nicht Terminiert, es gibt kein Stopkriterium
- nicht dynamisch finit

(c)

- Allgemein, da es für eine Eingabe n etwas tut
- Ausführbar, da man kann nach jedem Schritt einen weiteren machen
- Nicht Determinismus, Schritte weiterhin zufällig
- Nicht Determiniertheit, es können unterschiedlich lange Wege gefunden werden
- Finitheit, die Aufgabenstellung enthält alle Informationen, die ich brauche
- Terminierung, da der Algorithmus irgendwann terminiert
- nicht dynamisch finit, speicher nicht berechnebar

---

3.

(a)

```
Algorithm isPrime(a, k)
  if k == nil then
    k = 2
  endif
  if a < 2 then
    return false
  endif
  if k > (a - 1) then
    return true
  endif
  if a mod k == 0 then
    return false
  endif
  return isPrime(a, k + 1)
EndAlgorithm
```

(b)

```
Algorithm isGoldbach(a, b)
  if b == nil then
    b = a
  endif
  if b == 1 then
    return false
  endif
  if isPrime(b) and isPrime(a-b) then
    return true
  endif
  return isGoldbach(a, b-1)
EndAlgorithm
```

---

4.

Vorbedingung 2: $n \in \mathbb{N}$

Zwischenbed. 2,3: $n \in \mathbb{N} \land s = 0$

Zwischenbed 3,4: $n \in \mathbb{N} \land s = 0 \land i = n$

Invariante 4: $n \in \mathbb{N} \land s = \frac{n^2}{2} + \frac{n}{2} - \frac{i^2}{2} - \frac{i}{2}$

Vorbedingung 5: $n \in \mathbb{N} \land s = \frac{n^2}{2} + \frac{n}{2} - \frac{i^2}{2} - \frac{i}{2} \land i \gt 0$

Zwischenbed 5,6: $n \in \mathbb{N} \land s = \frac{n^2}{2} + \frac{n}{2} - \frac{(i-1)^2}{2} - \frac{i}{2} \land i \gt 0$

Nachbedingung 6: $n \in \mathbb{N} \land s = \frac{n^2}{2} + \frac{n}{2} - \frac{i^2}{2} - \frac{i}{2} \land i \ge 0$

Nachbedingung 7: $n \in \mathbb{N} \land s = \frac{n^2}{2} + \frac{n}{2} \land i = 0$