# Übungsblatt 7

[ti-i-blatt-07.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363695)

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
- Determiniertheit, da es immer die gleiche Anzahl Schritte ist
- Finitheit, da es einen eindeutigen Schritt gibt, der immer wiederholt wird
- Terminierung, da es immer eine Lösung findet
- Dynamisch Frei, da keine Daten, außer die Schritte gespeichert werden
- Komplexität, da die Lautzeit vermutet werden kann

(b)

- Nicht allgemein, es löst gar kein Problem
- Ausführbar, man kann nach jedem Schritt einen weiteren machen
- Nicht Determinismus, da nach einem Schritt ein zufälliger anderer kommt
- Determiniertheit, da nie ein Ergenbis kommt
- Finitheit, die Beschreibung scheint mir eindeutig
- Nicht Terminiert, es gibt kein Stopkriterium
- Nicht dynamisch finit, da ein unendliches Gitter gegeben ist
- Nicht Komplexität, Es benötigt unendlich Laufzeit und Ressourcen

(c)

- Allgemein, da es für eine Eingabe n etwas tut
- Ausführbar, da man kann nach jedem Schritt einen weiteren machen
- Nicht Determinismus, Schritte weiterhin zufällig
- Nicht Determiniertheit, es können unterschiedlich lange Wege gefunden werden
- Finitheit, die Aufgabenstellung enthält alle Informationen, die ich brauche
- Terminierung, da der Algorithmus irgendwann terminiert
- Dynamisch finit, da das feld so groß ist, wie die eingabe und man nur eine Zahl als augabe braucht.
- Komplexität, da statistisch abzuschätzen ist, wann das Ergebnis getroffen wird

---

3.

(a)

```
Algorithm isPrime(a)
  b = a
  while b > 2 do
    if a mod (b-1) == 0 then
      return false
    endif
    b = b - 1
  endwhile
  return true
EndAlgorithm
```

(b)

```
Algorithm isGoldbach(a)
  b = a
  while b > 1 do
    if isPrime(b) then
       c = a - b
       if isPrime(c) then
         print(b,c)
         return true
       endif
    endif
    b = b - 1
  endwhile
  return false
EndAlgorithm
```

---

4.

TODO