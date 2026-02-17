# Übungsblatt 4

[Übungsblatt 4](https://moodle.dhbw.de/mod/resource/view.php?id=363689)

---

1.

Gegeben ist folgende Relation:

$R = \{ (a, a), (a, d), (b, b), (b, e), (c, c), (d, a), (d, d), (e, b), (e, e) \}$

(a)

- Reflexiv, da $(a,a),(b,b),(c,c),(d,d),(e,e)$ enthalten sind
- Symmetrisch, da $(a, d) \Leftrightarrow (d,a)$, $(b, e) \Leftrightarrow (e,b)$ enthalten sind
- Transitiv, da $(a, d), (d,a)$ und $(a,a), (d,d)$, sowie  $(b, e), (e,b)$ und $(b,b), (e,e)$ enthalten sind

Da diese Eigenschaften erfüllt sind, handelt es sich bei R um eine Äquivalenzrelation.

(b)

![Graph Image](./graph.svg)

(c)

Es gibt folgende Äquivalenzklassen:

$[a] = [d]$

$[b] = [e]$

$[c]$

Also ist die Menge der Äquivalenzklassen:

$M/R = \{\{a,d\}, \{b,e\}, \{c\}\}$

---

2.

(a)

- Reflexiv, für alle x $sin(x) = sin(x)$ gilt.
- Symmetrisch, da gleichheit symmetrisch ist. Wenn a = b, dann ist auch b = a
- Transitiv, Durch gleichheit zwingend gegeben. Wenn a = b, b = c, dann a = c.

Deshalb handelt es sich um eine Äquivalenzrelation

(b)

$[0] = \{-2\pi, -\pi, 0, \pi, 2\pi\}$

(c)

$$
M/_\sim = \{[x]_\sim|x \in [-\frac{\pi}{2}, \frac{\pi}{2}]\}
$$

---

3.

$(a_1, a_2) R (b_1, b_2) \Leftrightarrow a_1b_2-a_2b_1 \ge 0$

**Reflexivität**:

Ist gegeben, da 

$$
a_1a_2 - a_2a_1 = 0
$$

**Symmetrie**

$$
\begin{align*}
(a,b)R(c,d) &\stackrel{?}{=} (c,d)R(a,b) \\
ad - bc &\neq cb - ad
\end{align*}
$$

Beispiel zum Widerlegen:

$$
\begin{align*}
(3,4)R(1,2) &= 3 \cdot 2 - 4 \cdot 1 = 2 & \ge 0\\
(1,2)R(3,4) &= 1 \cdot 4 - 2 \cdot 3 = -2 & \not \ge 0
\end{align*}
$$

Also nicht symmetrisch

**Transitivität**

$$
\begin{align*}
a_1b_2 - a_2b_1 &\ge 0  \\
b_1c_2 - b_2c_1 &\ge 0 \\
\newline
a_1b_2 &\ge a_2b_1  \\
b_1c_2 &\ge b_2c_1 \\
\newline
a_1b_2c_2 &\ge a_2b_1c_2 &(\cdot c_2) \\
b_1c_2a_2 &\ge b_2c_1a_2 &(\cdot a_2) \\
\newline
a_1b_2c_2 &\ge a_2b_1c_2 \ge b_2c_1a_2 \\
a_1b_2c_2 &\ge b_2c_1a_2 \\
a_1c_2 &\ge c_1a_2 \\
a_1c_2 &- c_1a_2 \ge 0 \\
&&\square
\end{align*}
$$

noch einfacher aus zu zeigen durch:

$$
\begin{align*}
a_1b_2 - a_2b_1 &\ge 0  \\
b_1c_2 - b_2c_1 &\ge 0 \\
\newline
\frac{a_1}{a_2} &\ge \frac{b_1}{b_2} \\
\frac{b_1}{b_2} &\ge \frac{c_1}{c_2} \\
\newline
\frac{a_1}{a_2} &\ge \frac{c_1}{c_2} \\
a_1c_2 &\ge c_1a_2 \\
a_1c_2 &- c_1a_2 \ge 0 \\
&&\square
\end{align*}
$$

**Asymmetrie**

Die Relation kann nicht asymetrisch sein, da sie reflexiv ist.

**Antisymmetrie**

Die Relation ist nicht antisymmetrisch, da gilt:

$$
\begin{align*}
(1,2)R(2,4) \Rightarrow 1 \cdot 4 - 2 \cdot 2 = 0 \\
(2,4)R(1,2) \Rightarrow 2 \cdot 2 - 4 \cdot 1 = 0
\end{align*}
$$

aber dennoch:

$$
(1,2) \neq (2,4)
$$

**Linear**

Die Relation ist linear, da entweder (1) oder (2) gilt:

$$
\begin{align*}
\frac{a_1}{a_2} &\ge \frac{b_1}{b_2} &\text{(1)}\\
\frac{b_1}{b_2} &\ge \frac{a_1}{a_2} &\text{(2)}\\
\end{align*}
$$

Also:

- reflexiv
- Nicht symmetrisch
- transitiv
- Nicht asymmetrisch
- Nicht antisymmetrisch
- Linear

Es handelt sich also um **keine** Äquivalenzrelation, da sie nicht symmetrisch ist.

Es handelt sich um eine **Quasiordnung**, da sie reflexiv und transitiv ist.

Es handelt sich um **keine** Halbordnung, da sie nicht antisymmetrisch ist und deshalb auch **nicht** um eine Vollordnung, auch wenn sie linear ist.

---

4.

(a)

- $R_1$: reflexiv, transitiv, antisymmetrisch - Halbordnung
- $R_2$: reflexiv, transitiv - Quasiordnung
- $R_3$: reflexiv, transitiv, antisymmetrisch - Halbordnung
- $R_4$: reflexiv - keine Ordnung
- $R_5$: reflexiv, transitiv, antisymmetrisch, linear - Vollordnung
- $R_6$: reflexiv, transitiv - Quasiordnung

(b)

- $R_1$: minimal: a,b,c, maximal: a,b,c
- $R_2$: minimal: c, maximal: c
- $R_3$: minimal: a, b, maximal: a, c
- $R_4$: minimal: a, maximal: c,
- $R_5$: minimal: a, maximal: c, kleinstes: a, größtes: c
- $R_6$: minimal: b, kleinstes: b, größtes: a,c

---

5.

$f$:

![](./f.svg)

- injektiv
- nicht surjektiv (0 wird nicht getroffen)
- nicht bijektiv (nicht surjektiv)

$g$:

![](./g.svg)

- nicht injektiv (0 wird doppelt getroffen)
- surjektiv
- nicht bijektiv (nicht injektiv)


$f \circ g$:

![](./fg.svg)

- nicht injektiv (0 wird nicht getroffen)
- nicht surjektiv
- nicht bijektiv (nicht injektiv oder surjektiv)

$g \circ f$:

![](./gf.svg)

- injektiv
- surjektiv
- bijektiv

