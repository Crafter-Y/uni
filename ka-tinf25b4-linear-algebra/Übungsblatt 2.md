# Übungsblatt 2

[Uebung2.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=378185)

1.

a)

- Reflexiv, jeder besucht den Kurs, den er selber besucht
- Symmetrisch, wenn Person 1 und Person 2 einen Kurs besuchen, gilt das auch für Person 2 und Person 1
- Nicht Transitiv, da P1 und P2 zusammen einen Kurs besuchen können, P2 und P3 zusammen in einem anderen Kurs sein können und das bedeutet, dass P1 und P3 nicht zusammen in einem Kurs sind. Seidenn eine Person kann nur einen Kurs besuchen oder es ist Voraussetzung, dass es eine Abfrage zu einem bestimmten Zeitpunkt ist.

b)

- Reflexiv: jedes $x \ge x$, da $x = x$
- Nicht symmetrisch, da wenn eine Zahl $x \gt y$, nicht gleichzeitig $y \gt x$ gelten kann.
- Transitiv, da $x \ge y \ge z$ immer gilt 

c)

- Nicht reflexiv, da nicht alle Zahlen ungerade sind
- Symmetrisch, da wenn x und y ungerade sind, sind es auch y und x
- Transitiv, da wenn x und y und z ungerade sind, ist x und z automatisch immer ungerade

d)

- Nicht reflexiv, da $x-x = 0 \neq 3$
- Nicht Symmetrisch, wenn $x - y = 3$, dann ist $y - x = -3$ und $3 \neq -3$
- Nicht transitiv, da wenn $x - y = 3$ und $y - z = 3$, dann ist $x - z = 6 \neq 0$

---

2.

a)

- Reflexiv, da immer gilt $f(x) = f(x)$ 
- Symmetrisch, da wenn $f(x) = f(y)$, dann gilt auch $f(y) = f(x)$
- Transitiv, da wenn $f(x) = f(y)$ und $f(y) = f(z)$, dann gilt $f(x) = f(y) = f(z)$, also $f(x) = f(z)$

b)

Gegeben ist:

$$
\displaylines{
\overline{f} : X / \sim \rightarrow Y, [x] \rightarrowtail f(x) \\
\text{(Eine Funktion }\overline{f} \text{ bildet alle Äquivalenzklassen auf einen Wert Y ab.} \\
\text{Y entspricht dem Funktionswert der zugehörigen Werteklasse)}
}
$$

Die Definition für Injektivität ist:

$$
\displaylines{
\forall x,y \in A : f(x) = f(y) \Rightarrow x = y \\
\text{(Wenn f(x) und f(y) gleich sind, müssen auch x und y gleich sein} \\
\text{, damit Injektivität gegeben ist.)}
}
$$

Angewendet auf $\overline{f}$ bedeutet das, es muss gelten:

$$
\overline{f}([x_1]) = \overline{f}([x_2]) \Rightarrow [x_1] = [x_2]
$$

Durch die Definition von $\overline{f}$ ist bereits gegeben, dass:

$$
\overline{f}([x]) = f(x)
$$

Also gilt:

$$
f(x_1) = f(x_2) \Rightarrow [x_1] = [x_2]
$$

Aus der Ursprungsrelation aus der Aufgabenstellung

$$
x_1 \sim x_2 : \Leftrightarrow f(x_1) = f(x_2)
$$

lässt sich 

$$
f(x_1) = f(x_2)
$$

ausdrücken als

$$
x_1 \sim x_2
$$

also gilt

$$
x_1 \sim x_2 \Rightarrow [x_1] = [x_2]
$$

da, wenn zwei Elemente äquivalent sind, dann liegen sie in derselben Gruppe, also haben sie dieselbe Gruppe.

Somit haben wir gezeigt, dass:

$$
\overline{f}([x_1]) = \overline{f}([x_2]) \Rightarrow [x_1] = [x_2]
$$

und $\overline{f}$ damit injektiv ist.

c)

Wenn $f(X) per Definition alle tatsächliche getroffenen Werte enthält, dann wird auch jeder Wert in f(X) getroffen. Daraus ergibt sich, dass $\overline{f}$ surjektiv ist.

Da $\overline{f}$ nun injektiv und surjektiv ist, ist $\overline{f}$ bijektiv.

---

3.

Beweisen Sie

$$
\#P(M) = 2^{\#M}
$$

durch vollständige Induktion über $n = \#M$

Induktionsanfang: $n = 0$ ($P(\emptyset) = \{\emptyset\}$)

$$
\#P(\emptyset) = 1 = 2^0 \quad \square
$$

Induktionsvoraussetzung:

Für ein $n \in \mathbb{N}$ gilt für alle Mengen M mit $\#M = n$:

$$
\#P(M) = 2^{\#M}
$$

Induktionsschritt:

Sei nun M eine Menge mit $\#M = n + 1$. Wir wählen ein $x \in M$:

Jede Teilmenge $N \subseteq M$ erfüllt eine der beiden Eigenschaften: $X \in N$ oder $X \notin N$

Wir zerlegen die Potenzmengen $P(M)$ in eine disjunkte Vereinigung:

$$
A := \{N \subseteq M | x \notin N\}
$$

$$
B := \{N \subseteq M | x \in N\}
$$

$$
P(M) = A \stackrel{\cdot}{\cup} B, \#P(M) = \#A+\#B
$$

Wir betrachten die Menge A. Eine Teilmenge N gehört genau dann zu A, wenn sie kein x enthält. Das ist äquivalent dazu, dass N eine Teilmenge von $M \backslash \{x\}$ ist.

Es gilt also: $A = P(M \backslash \{x\})$

Wir können eine Abbildung $\phi$ mit

$$
\phi : A \rightarrow B, \phi(N): N \cup \{x\}
$$

Die Abbildung $\phi$ ist bijektiv, weil wir eine Umkehrabbildung

$$
\psi: B \rightarrow A, \psi(N): N \backslash \{x\}
$$

bilden können.

Daraus folgt: $\#A = \#B$ wegen Bijektivität von $\phi$.

$$
\#P(M) = \#A + \#B = \#A + \#A = 2 \cdot \#A = 2 \cdot \#P(M \backslash \{x\})
$$

$\#(M \backslash \{x\}) = n$, aus der Induktionsvoraussetzung folgt

$$
\#P(M \backslash \{x\}) = 2^n
$$

und 

$$
\begin{align*}
\#P(M) &= 2 \cdot \#(M \backslash \{x\}) \\
&= 2 \cdot 2^n \\
&= 2^{n + 1} \\
&&\square
\end{align*}
$$


---

4.

Beweisen Sie:

$$
2^j - \sum_{k = 0}^{j - 1} 2^k = 1 \space\space j \in \mathbb{N}
$$

Induktionsanfang $j = 1$

$$
\begin{align*}
2^1 - \sum_{k = 0}^{1 - 1} 2^k &\stackrel{!}{=} 1 \\
2 - 2^0 &\stackrel{!}{=} 1 \\
2 - 1 &\stackrel{!}{=} 1 \\
1 &= 1 \\
&& \square
\end{align*}
$$

Induktionsvoraussetzung:

$$
2^j - \sum_{k = 0}^{j - 1} 2^k = 1
$$

Inuktionsschritt:

Zu zeigen, dass gilt:

$$
2^{j + 1} - \sum_{k = 0}^{(j + 1) - 1} 2^k \stackrel{!}{=} 1
$$

Beweis:

$$
\begin{align*}
2^{j + 1} - \sum_{k = 0}^{(j + 1) - 1} 2^k &= 2 \cdot 2^j - (\sum_{k = 0}^{j - 1} 2^k + 2^j) \\
&= 2^j + 2^j - \sum_{k = 0}^{j - 1} 2^k - 2^j \\
&= 2^j - \sum_{k = 0}^{j - 1} 2^k \\
&= 1 &\text{(IV)} \\
&&\square
\end{align*}
$$