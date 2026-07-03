# Übungsblatt 7

TODO

---

1.

Invarianten für die innere Schleife

$A[j] \le A[i]$

$A[j] \le A[x]$

$\forall i \le x \le k$

Inverianten für die äußere Schleife

$A[l] \lt A[r]$

$\forall l \lt j \land r \lt i$

2.

a)

TODO

Die Sprungweite $2^k$ macht keinen Sinn, man damit immer die gleichen Elemente vergleicht und die Sortierung manchmal gar nicht funktioniert. $3n+1$ wäre eine bessere Sprungweite

b)

Alle kleinen Zahlen an ungeraden Positionen und alle großen Zahlen an geraden Positionen. Man mischt kleine und große Zahlen nicht.

Jedes Element mit Wert $k$ muss um $k-1$ Positionen nach vorne geschoben werden.

Die kleinen Zahlen $k=1,2,3,4 \dots , \frac{n}{2}$ müssem nach vorne geschoben werden um ca. $k-1$ Positionen.

$1+2+3+ \dots + \frac{n}{2}-1 = \sum_{n=1}^{\frac{n}{2}-1}k = \frac{(\frac{n}{2}-1)\cdot\frac{n}{2}}{2} \in O(n^2)$

3.

TODO
