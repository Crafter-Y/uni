# Übungsblatt 3

[ti-i-blatt-03.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363687)

1.

| ![](./PM1.svg) | ![](./PM2.svg) |
| -------------- | -------------- |


| Schritt | Aussage                                         | Begründung |
| ------- | ----------------------------------------------- | ---------- |
| 1       | $A \rightarrow B$                               | Prämissse  |
| 2.1     | $A \land (B \rightarrow \bot)$                  | Annahme    |
| 2.2     | $A$                                             | KL 2.1     |
| 2.3     | $B \rightarrow \bot$                            | KR 2.1     |
| 2.4     | $B$                                             | IE 1 2.2   |
| 2.5     | $\bot$                                          | IE 2.3 2.4 |
| 2       | $A \land (B \rightarrow \bot) \rightarrow \bot$ | II 2.1 2.5 |

| Schritt | Aussage                                         | Begründung    |
| ------- | ----------------------------------------------- | ------------- |
| 1       | $A \land (B \rightarrow \bot) \rightarrow \bot$ | Prämisse      |
| 2       | $B \lor (B \rightarrow \bot)$                   | TND           |
| 3.1     | $A$                                             | Annahme       |
| 3.2.1   | $B$                                             | 1. Fall von 2 |
| 3.2.2   | $B \rightarrow \bot$                            | 2. Fall von 2 |
| 3.2.3   | $A \land (B \rightarrow \bot)$                  | K 3.1 3.2.2   |
| 3.2.4   | $\bot$                                          | IE 1 3.2.3    |
| 3.2.5   | $B$                                             | F 3.2.4       |
| 3.2     | $B$                                             | D 3.2.1 3.2.5 |
| 3       | $A \rightarrow B$                               | II 3.1 3.2    |

---

2.

(a) Beweis durch Widerspruch/Gegenbeispiel:

Für $p = 41$ zeigt sich:

$$
6 \cdot 41^2 + 36 \cdot 41 + 1 = 11563
$$

$11563$ ist keine Primzahl, damit gilt die Annahme nicht.

(b) Direkter Beweis

Zu zeigen:

$$
\forall n \in \mathbb{N}: \exists k \in \mathbb{N} : n^2 - (n - 1)^2 = 2k - 1
$$

Beweis:

$$
\begin{align*}
n^2 - (n-1)^2 &= n^2 - (n^2 - 2n + 1) \\
&= 2n - 1 \\
&= 2k - 1 &\text{n = k} \\
&&\square
\end{align*}
$$

(c) Direkter Beweis:

$100!$ = 93 326 215 443 944 152 681 699 238 856 266 700 490 715 968 264 381 621 468 592 963 895 217 599 993 229 915 608 941 463 976 156 518 286 253 697 920 827 223 758 251 185 210 916 864 000 000 000 000 000 000 000 000

Ja, das sind 24 Nullen.

(d) Direkter Beweis:

$$
\begin{align*}
x(1-x) &= -x^2 + x \\
&= -(x^2 - x + 0.5) + 0.5 \\
&= -(x - \frac{1}{2})^2 + \frac{1}{4}
\end{align*}
$$

1. $x(1-x)$ ist eine Parabel. In Scheitelpunktform: $-(x- \frac{1}{2})^2 + \frac{1}{4}$
2. Den Eigenschaften der Parabel sind zu entnehmen, dass sie nach unten geöffnet ist und ihren Scheitelpunkt bei ($\frac{1}{2}, \frac{1}{4}$) hat.
3. Damit ist gezeigt, dass der Ausdruck niemals $\frac{1}{4}$ überschreiten wird und somit gültig ist

oder

1. Das negative Quadrat eines Ausdrucks ist niemals größer als 0.
2. Deshalb kann der Ausdruck niemals größer als $\frac{1}{4}$ sein, was zu beweisen war.

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
- nicht linear, da weder $(5,1)$ noch $(1,5)$

Es ist deshalb ebenfalls keine Äquivalenzrelation