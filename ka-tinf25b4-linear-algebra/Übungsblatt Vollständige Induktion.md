# Vollständige Induktion

[VollstaendigeInduktion.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=379904)

1.

Zu beweisen ist:

$$
\sum_{k = 1}^n 2k = n(n + 1), \quad n \in \mathbb{N} 
$$


**Induktionsanfang: $n = 1$**

$$
\begin{align*}
\sum_{k = 1}^1 2k &\stackrel{!}{=} 1(1 + 1) \\
2 \cdot 1 &= 2 \\
&&\square
\end{align*}
$$

**Induktionsvoraussetzung:**

Es gilt:

$$
\sum_{k = 1}^n 2k = n(n + 1)
$$

**Induktionsschritt:**

Zu zeigen ist:

$$
\sum_{k = 1}^{n+1} 2k \stackrel{!}{=} (n+1)((n+1) + 1)
$$

Beweis:

$$
\begin{align*}
\sum_{k = 1}^{n+1} 2k &= (\sum_{k = 1}^n 2k) + 2 \cdot (n+1) \\
&= n(n + 1) + 2 \cdot (n+1) &\text{(IV)} \\
&= (n + 2) (n + 1) \\
&= (n + 1)((n + 1) + 1) \\
&&\square
\end{align*}
$$

---

2.

Zu beweisen ist:

$$
\sum_{k = 1}^n (4k - 1) = 2n^2 + n, \quad n \in \mathbb{N}
$$

**Induktionsanfang: $n = 1$**

$$
\begin{align*}
\sum_{k = 1}^1 (4k - 1) &\stackrel{!}{=} 2 \cdot 1^2 + 1 \\
(4 \cdot 1 - 1) &\stackrel{!}{=} 2 + 1 \\
3 &= 3
\end{align*}
$$

**Induktionsvoraussetzung:**

Es gilt:

$$
\sum_{k = 1}^n (4k - 1) = 2n^2 + n
$$

**Induktionsschritt:**

Zu zeigen ist:

$$
\sum_{k = 1}^{n + 1} (4k - 1) \stackrel{!}{=} 2(n + 1)^2 + (n + 1)
$$

Beweis:

$$
\begin{align*}
\sum_{k = 1}^{n + 1} (4k - 1) &= (\sum_{k = 1}^n (4k - 1)) + (4 \cdot (n + 1) - 1) \\
&= 2 n^2 + n + 4 \cdot (n + 1) - 1 &\text{(IV)} \\
&= 2 (n^2 + 2n + 1) -4n -2 + n + 4(n + 1) - 1 \\
&= 2(n + 1)^2 - 4n - 2 + n + 4n + 4 - 1 \\
&= 2(n + 1)^2 + (n + 1) \\
&&\square
\end{align*}
$$

---

3.

Zu beweisen ist:

$$
\sum_{k = 0}^n q^k = \frac{1- q^{n + 1}}{1 - q}, \quad m \in \mathbb{N}_0, q \neq 1
$$

**Induktionsanfang: $n = 0$**

$$
\begin{align*}
\sum_{k = 0}^0 q^k &\stackrel{!}{=} \frac{1- q^{0 + 1}}{1 - q} \\
q^0 &\stackrel{!}{=} \frac{1- q^1}{1 - q} \\
1 &= 1 \\
&&\square
\end{align*}
$$

**Induktionsvoraussetzung:**

Es gilt:

$$
\sum_{k = 0}^n q^k = \frac{1- q^{n + 1}}{1 - q}
$$

**Induktionsschritt:**

Zu zeigen ist:

$$
\sum_{k = 0}^{n + 1} q^k \stackrel{!}{=} \frac{1- q^{(n + 1) + 1}}{1 - q}
$$

Beweis:

$$
\begin{align*}
\sum_{k = 0}^{n + 1} q^k &= (\sum_{k = 0}^n q^k) + q^{n + 1} \\
&= \frac{1 - q^{n + 1}}{1 - q} + q^{n + 1} &\text{(IV)} \\
&= \frac{1 - q^{n + 1}}{1 - q} + \frac{q^{n + 1}(1 - q)}{1 - q} \\
&= \frac{1 - q^{n + 1} + q^{n + 1}(1 - q)}{1 - q} \\
&= \frac{1 - q^{n + 1} + q^{n + 1} - q^{n + 1}q}{1 - q} \\
&= \frac{1 - q^{n + 1}q}{1 - q} \\
&= \frac{1 - q^{(n + 1) + 1}}{1 - q} \\
&&\square
\end{align*}
$$