# Übungsblatt 3

[Uebung3.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=403026)

---

1.

$$
\#(A \cup B) = \#A + \#B - \#(A \cap B)
$$

Da A und B disjunkt sind, ist die Vereinigung von A und B ($A \cap B$) die leere Menge ($\emptyset$). 

Die Mächtigkeit der leeren Menge ist 0:

$$
\#(\emptyset) = 0
$$

Also gilt:

$$
\begin{align*}
\#A + \#B - 0 = \#A + \#B \\
&&\square
\end{align*}
$$

Wenn beide Mengen nicht disjunkt sind, gibt es eine Schnittmenge $A \cap B$ mit $n$ Elementen. Die Mächtigkeit der Vereinigung von $A$ und $B$ wäre dann:

$$
\#A + \#B -n \neq \#A + \#B
$$

Also gilt die Aussage nicht für nicht disjunkte Mengen, also gilt sie nur für diskunkte Mengen.

---

2.

a)

$$
\begin{align*}
(x^4 + 2x^3& - 16x + \hspace{0.6cm} 14):(x-3) = x^3 + 5x^2 - x - 3 \\
-(x^4- 3x^3&) \\
5x^3&-16x^2+\hspace{0.5cm}14 \\
-(5x^3&-15x^2) \\
&-x^2+ \hspace{1.1cm} 14 \\
-&(-x^2+3x) \\
&\hspace{1.1cm}-3x+ 14 \\
&\hspace{0.5cm}-(-3x + 9) \\
&\hspace{2.8cm}5
\end{align*}
$$

b)

$$
\begin{align*}
(x^6-2x^5-&8x^4+13x^3-13x^2+4x-4):(x^2+3x-7) = x^4 - x^3 - 2x^2 + 1 \\
-(x^6+3x^5-&7x^4) \\
-x^5-&x^4+13x^3-13x^3+4x-4 \\
-(-x^5-&3x^4+7x^3) \\
&2x^4 + 6x^3 - 13x^2 + 4x - 4 \\
-(&2x^4 + 6x^3 - 14x^2) \\
&\hspace{2.8cm}x^2 + 4x - 4 \\
&\hspace{2cm}-(x^2 + 3x - 7) \\
&\hspace{4.2cm}x + 3
\end{align*}
$$

---°

3.

a)

Zu zeigen:

$$
0_k \cdot v \stackrel{!}{=} 0_v
$$

Beweis:

$$
\begin{align*}
0_k + 0_k &= 0_k & ||\cdot v \\
(0_k + 0_k)\cdot v &= 0_kv \\
0_kv + 0_kv &= 0_kv &|| + (-0_kv) \\
0_k \cdot v + (0_k \cdot v + (-0_k \cdot v)) &= 0_k \cdot v + (-0_k \cdot v) \\
0_k \cdot v + 0_v &= 0_v \\
0_k \cdot v &= 0_v \\
&&\square
\end{align*}
$$

b)

Zu zeigen:

$$
\lambda \cdot 0_v \stackrel{!}{=} 0_v
$$

Beweis:

$$
\begin{align*}
0_v + 0_v &= 0_v &||\cdot \lambda \\
\lambda (0_v + 0_v) &= \lambda 0_v \\
\lambda 0_v + \lambda 0_v &= \lambda 0_v  &|| -\lambda 0_v\\
\lambda 0_v + \lambda 0_v - \lambda 0_v &= \lambda 0_v - \lambda 0_v \\
\lambda 0_v = 0_v \\
&&\square
\end{align*}
$$

c)

Zu zeigen:

$$
\lambda \cdot v = 0 \Rightarrow \lambda \stackrel{!}{=} 0 \lor v = 0
$$

Beweis:

TODO

---

4.

(a)

$U := \{(x_1, x_2, x_3) \in \mathbb{R}^3 | x_2 = x_2 = 2x_3 \}$

$x_1 = x_2 = 2x_3$

$t = x_3$

$$
(x_1, x_2, x_3) = (2t, 2t, t) = t(2, 2, 1)
$$

$U = \{t(2,2,1)| t \in \mathbb{R}\}$

Abschluss unter Addition:

Seien $u, u' \in U$

$u = t \cdot (2,2,1)$, $u' = s \cdot (2,2,1), s, t \in \mathbb{R}$

$u + u' = (t + s) \cdot (2,2,1)$

Abschluss unter Skalarmultiplikation:

$\lambda \cdot u = \lambda \cdot t \cdot (2,2,1)$

(b)

$U := \{(x_1, x_2, x_3) \in \mathbb{R}^2 | x_1^2 + x_2^2 = 0\}$

$x_1^2 + x_2^2 = 0$

$x^2 + y^2 = 0$

$x^2 = -y^2$

$x_1 = 0, x_2 = 0$

$U = \{t(0,0) | t \in \mathbb{R}\} = \{(0,0)\}$

$U \neq \emptyset$, da $(0,0) \in U$

Seien $u, u' \in U$. Zu zeigen: $u + u' \in U$

$u + u' = (0,0) + (0,0) = (0,0) \in U$,

Sei $u \in U$ und $\lambda \in \mathbb{R}$. Zu zeigen: $\lambda \cdot u \in U$

$\lambda \cdot (0,0) = (0,0) \in U$