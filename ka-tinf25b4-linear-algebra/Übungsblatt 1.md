# Übungsblatt 1

[Uebung1.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=364145)

[Musterloesung_Uebung1.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=374589)

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

---

2.

(a) $\forall x \in \mathbb{Z}, x^2 \space mod \space 2 = 0$ (Alle Quadratzahlen sind gerade) (falsch, $1^2 = 1$ und damit ungerade)

(b) $\forall x \in \mathbb{Z}, x^2 \ge 0$ (Alle Quadratzahlen sind nicht negativ) (wahr)

(c)

Sei $M$ die Menge der Fenster eines Hauses ($M := \{\text{Fenster 1}, \text{Fenster 2}, ..., \text{Fenster n}\}$)

$\forall x \in M: x$ ist geschlossen (Alle Fenster eines Hauses sind geschlossen)

(d)

Sei $H$ die Menge aller Zimmer eines Hauses. Seien Mengen $Z_1 ... Z_n$ Megen enthalten in $H$. Jedes Zimmer enthält Fenster ($Z_n := \{\text{Fenster 1}, \text{Fenster 2}, ..., \text{Fenster n}\}$) 

$\forall Z \in H, \exists x \in Z, x \space\text{ist geöffnet}$

---

3.

(a) $\exists x \in \mathbb{Z}, x^2 \space mod \space 2 \neq 0$ (Es gibt eine ungerade Quadratzahl)

(b) $\exists x \in \mathbb{Z}, x^2 \lt 0$ (Es gibt eine negative Quadratzahl)

(c) $\exists x \in M: x$ ist nicht geschlossen (Ein Fenster eines Hauses ist nicht geschlossen)

(d) $\exists Z \in H, \forall x \in Z, x \space\text{ist nicht geöffnet}$ (Es gibt ein Zimmer in dem alle Fenster geschlossen sind)

---

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

Sei $x \in A^c$. Dann ist x nicht in A. Jedes Element von B ist auch in A enthalten. Angenommen x wäre auch in B, dann würde folgen, dass x auch in a liegen muss, was wir bereits ausgeschlossen haben. Also kann x nicht in B liegen. Deshalb sind alle Elemente die nicht in A enthalten sind, auch nicht in B enthalten ($A^c \subseteq B^c$).

Wenn ein x in A und nicht in B enthalten ist ($x \in A \backslash B$), dann ist es nicht in B enthalten, was $B^c$ entspricht.

e)

Die Vereinigung von A und B ergeben eine Menge mit allen Elementen von A und all denen, die durch B dazu gekommen sind. $A \cup B$ enthält also alle Elemente von A und alle Elemente aus B die nicht in A sind. Die die gemeinsamen Elemente (Schnittmenge) davon können also nur die Elemente aus A sein.

f)

Die Schnittmenge A und B enthält nur Elemente, die auch in A enthalten sind. Die Vereinigung von Elementen die auch in A enthalten sind mit der Menge A selber ergibt zwingend die Menge A

g)

Distributivgesetz

h)

Distributivgesetz

i)

Eine Menge $M_1$, die alle Elemente außerhalb von A umfasst enthält möglicherweise auch Elemente von B, aber auch alle anderen Außerhalb. Eine Menge $M_2$, die alle ELemente außerhalb von B umfasst, enthält möglicherweise auch Elemente aus A, aber ebenfalls auch alle anderen Außerhalb. Da Elemente aus A nicht in $M_1$ und von B nicht in $M_2$ enthalten sind, sind die Elemente der Vereinigung nur die Elemente außerhalb von A und B ($(A \cup B)^c$).

---

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

---

6.

(a) 

Könnten zwei verschiedene Werte $x_1$ und $x_2$ auf den gleichen Funktionswert abbilden, könnte ein Wert aus dem Bildbereich mehrfach getroffen werden, was die Voraussetzung der Injektivität verletzt. 

(b) 

Ähnlich wie bei a, sagt die Aussage aus, dass es nur genau einen Wert aus dem Definitionsbereich gibt, der auf einen Wert im Wertebereich abbildet. Gäbe es mehr, würde ein Element doppelt getroffen werden, was der Definition der Injektivität widerspricht.

(c) 

$im(f)$ ist die Menge aller Werte, die von der Abbildung getroffen werden. Die Surjektivität besagt, dass jeder Wert im Wertebereich mindestens einmal getroffen werden muss. B ist der Wertebereich, als muss $im(f) = B$ sein.

(d)

Bijektivität ist gegeben, wenn jeder Wert im Wertebereich genau einmal getroffen wird. Also injektivität und surjektivität besteht. Dafür muss jeder Wert im Wertebereich von genau einem Wert im Definitionsbereich getroffen werden. Also für jeden Wert im Wertebereich gibt es genau einen Wert im Definitionsbereich, der auf den Wert im Wertebereich abgebildet wird.

7.

TODO

8.

TODO