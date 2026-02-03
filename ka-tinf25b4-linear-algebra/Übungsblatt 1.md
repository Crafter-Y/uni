# Übungsblatt 1

[Uebung1.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=364145)

1.

(a) $(A \land (A \lor B)) \leftrightarrow A$ (Absorptionsgesetz)

| $A$ | $B$ | $A \land (A \lor B)$ |
| --- | --- | -------------------- |
| $w$ | $w$ | $w$                  |
| $w$ | $f$ | $w$                  |
| $f$ | $w$ | $f$                  |
| $f$ | $f$ | $f$                  |

(b) $(A \lor (A \land B)) \leftrightarrow A$ (Absorptionsgesetz)

| $A$ | $B$ | $A \lor (A \land B)$ |
| --- | --- | -------------------- |
| $w$ | $w$ | $w$                  |
| $w$ | $f$ | $w$                  |
| $f$ | $w$ | $f$                  |
| $f$ | $f$ | $f$                  |

(c) $A \land (B \lor C) \leftrightarrow (A \land B) \lor (A \land C)$ Distributivgesetz

| A   | B   | C   | $A \land (B \lor C)$ | $(A \land B) \lor (A \land C)$ |
| --- | --- | --- | -------------------- | ------------------------------ |
| $w$ | $w$ | $w$ | $w$                  | $w$                            |
| $w$ | $w$ | $f$ | $w$                  | $w$                            |
| $w$ | $f$ | $w$ | $w$                  | $w$                            |
| $w$ | $f$ | $f$ | $f$                  | $f$                            |
| $f$ | $w$ | $w$ | $f$                  | $f$                            |
| $f$ | $w$ | $f$ | $f$                  | $f$                            |
| $f$ | $f$ | $w$ | $f$                  | $f$                            |
| $f$ | $f$ | $f$ | $f$                  | $f$                            |

(d) $A \lor (B \land C) \leftrightarrow (A \lor B) \land (A \lor C)$ Distributivgesetz

| A   | B   | C   | $A \lor (B \land C)$ | $(A \lor B) \land (A \lor C)$ |
| --- | --- | --- | -------------------- | ----------------------------- |
| $w$ | $w$ | $w$ | $w$                  | $w$                           |
| $w$ | $w$ | $f$ | $w$                  | $w$                           |
| $w$ | $f$ | $w$ | $w$                  | $w$                           |
| $w$ | $f$ | $f$ | $w$                  | $w$                           |
| $f$ | $w$ | $w$ | $w$                  | $w$                           |
| $f$ | $w$ | $f$ | $f$                  | $f$                           |
| $f$ | $f$ | $w$ | $f$                  | $f$                           |
| $f$ | $f$ | $f$ | $f$                  | $f$                           |

2.

(a) $\forall x \in \mathbb{Z}, x^2 \space mod \space 2 = 0$ (Alle Quadratzahlen sind gerade) (falsch, $1^2 = 1$ und damit ungerade)

(b) $\forall x \in \mathbb{Z}, x^2 \ge 0$ (Alle Quadratzahlen sind nicht negativ) (wahr)

(c)

Sei $M$ die Menge der Fenster eines Hauses ($M := \{\text{Fenster 1}, \text{Fenster 2}, ..., \text{Fenster n}\}$)

$\forall x \in M: x$ ist geschlossen (Alle Fenster eines Hauses sind geschlossen)

(d)

Sei $H$ die Menge aller Zimmer eines Hauses. Seien Mengen $Z_1 ... Z_n$ Megen enthalten in $H$. Jedes Zimmer enthält Fenster ($Z_n := \{\text{Fenster 1}, \text{Fenster 2}, ..., \text{Fenster n}\}$) 

$\forall Z \in H, \exists x \in Z, x \space\text{ist geöffnet}$

3.

(a) $\exists x \in \mathbb{Z}, x^2 \space mod \space 2 \neq 0$ (Es gibt eine ungerade Quadratzahl)

(b) $\exists x \in \mathbb{Z}, x^2 \lt 0$ (Es gibt eine negative Quadratzahl)

(c) $\exists x \in M: x$ ist nicht geschlossen (Ein Fenster eines Hauses ist nicht geschlossen)

(d) $\exists Z \in H, \forall x \in Z, x \space\text{ist nicht geöffnet}$ (Es gibt ein Zimmer in dem alle Fenster geschlossen sind)

4.

a)

Wenn ein x in A und B enthalten sein muss, dann ist es per Definition auf jeden Fall in A enthalten.

Eine Menge, die alle Elemente aus A und B enthält, muss per Definition alle Elemente aus B enthalten.

b)

Wenn alle Elemente aus A in B enthalten sind, muss die Schnittmenge per Definition A sein.

Wenn alle Elemente aus A in B enthalten sind, entsprechen beide Mengen kombiniert per Definition der Menge B.

c)

$A^c$ umfasst alle Elemente einer übergeordneten Menge M, die nicht A sind. $(A^c)^c$ sind widerum alle Elemente, die in dieser Menge nicht enthalten sind, also A.

d)

TODO: nicht so wichtig. sollte ich vor der klausur vielleicht nochmal anschauen, wie man das formal aufschreibt


5.

a)

$\{a,b,c\} \times \{x,y\} = \{(a, x), (b, x), (c, x), (a, y), (b, y), (c, y)\}$

b)

$M_1 = \{(1, -1), (1, 0), (2, -1), (2, 0), (2, 1), (3, -1), (3, 0), (3, 1), (3, 2), (4, -1), (4, 0), (4, 1), (4, 2)\}$

$M_2 = \{(1,-1), (2, 0), (3, 1), (4,2)\}$

$M_3 = \{(1,-1), (1, 1), (2,2)\}$

c)

$P(\{a\}) = \{\emptyset, \{a\}\}$

$P(P(\{a\})) = P(\{\emptyset, \{a\}\}) = \{\emptyset, \{\emptyset\}, \{a\}, \{\emptyset, \{a\}\}\}$

6.

TODO: nicht verstanden

7.

TODO

8.

TODO