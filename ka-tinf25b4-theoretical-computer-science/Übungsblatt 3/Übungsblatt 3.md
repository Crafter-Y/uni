# Übungsblatt 3

[ti-i-blatt-03.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363687)

1.

| ![](./PM1.svg) | ![](./PM2.svg) |
| -------------- | -------------- |

TODO: "schriftlicher beweis" hierfür aus den Lösungen übernehmen

---

2.

(a) Beweis durch Widerspruch:

Für $p = 41$ zeigt sich:

$$
6 \cdot 41^2 + 36 \cdot 41 + 1 = 11563
$$

$11563$ ist keine Primzahl, damit gilt die Annahme nicht.

(b) Direkter Beweis

1. Quadratzahlen sind eine ganze Zahl mal sich selber
2. Ganze Zahlen sind abwechselnd gerade und ungerade
3. Deren Quadrate sind dementsprechend auch abwechselnd gerade und ungerade
4. Die Differenz zwischen einer geraden und ungeraden Zahl ist immer ungerade

(c) Direkter Beweis:

$100!$ = 93 326 215 443 944 152 681 699 238 856 266 700 490 715 968 264 381 621 468 592 963 895 217 599 993 229 915 608 941 463 976 156 518 286 253 697 920 827 223 758 251 185 210 916 864 000 000 000 000 000 000 000 000

Ja, das sind 24 Nullen.

(d) ^Direkter Beweis:

1. $x(1-x)$ ist eine Parabel. In Scheitelpunktform: $-(x- \frac{1}{2})^2 + \frac{1}{4}$
2. Den Eigenschaften der Parabel sind zu entnehmen, dass sie nach unten geöffnet ist und ihren Scheitelpunkt bei ($\frac{1}{2}, \frac{1}{4}$) hat.
3. Damit ist gezeigt, dass der Ausdruck niemals $\frac{1}{4}$ überschreiten wird und somit gültig ist

---

3.

(a)

$(A \cup B) \times (C \cup D)$ entspricht $(A \times C) \cup (A \times D) \cup (B \times C) \cup (B \times D)$. $(A \times C) \cup (B \times D)$ sind daher enthalten.

(b)

Es gilt bereits:

$$
(A \times C) \cup (B \times D) \subseteq (A \cup B) \times (C \cup D)
$$

Damit inäquivalenz herrscht, muss gelten:

$$
(A \cup B) \times (C \cup D) \not \subseteq (A \times C) \cup (B \times D)
$$

Dem ist so, da alle 

$$
(A \times D) \cup (B \times C) \not \subseteq (A \times C) \cup (B \times D)
$$

---

4.

Bereits hier gezeigt: [Lineare Algebra 1 - Übungsblatt 2, Aufgabe 3](/ka-tinf25b4-linear-algebra/Übungsblatt%202.md)

---

5.

![](./Relation1.svg)

Es gibt keine konkrete Regel, die diese Paare bestimmt. Es handelt sich einfach um irgendeine Relation.

Eigenschaften:

- nicht reflexiv, da z.B. $(1,1)$ nicht enthalten ist
- nicht symmetrisch, da $(4, 5)$ aber nicht $(5,4)$
- nicht transitiv, da $(1, 3)$ und $(3, 1)$, aber nicht $(1,1)$
- nicht antisymmetrisch, da $(1, 3)$ und $(3, 1)$ aber nicht $3 = 1$

Es ist deshalb ebenfalls keine Äquivalenzrelation