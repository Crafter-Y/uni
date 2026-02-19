# Übungsblatt 3

[Uebung3.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=403026)

---

1.

TODO

2.

TODO

---

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

TODO

---

4.

(a)

$U := \{(x_1, x_2, x_3) \in \mathbb{R}^3 | x_2 = x_2 = 2x_3 \}$

$x_1 = x_2 = 2x_3$

$x_3 = t$

$$
(x_1, x_2, x_3) = (2t, 2t, t) = t(2, 2, 1)
$$

$U = \{t(2,2,1)| t \in \mathbb{R}\}$

Abschluss unter Addition:

Seien $u, u' \in U$

$u = t \cdot (2,2,1)$, $u' = s \cdot (2,2,1), s, t \in \mathbb{R}$

$u + u' = (t + s) \cdot (2,2,1)$

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