# Übungsblatt 02.5: Vollständige Induktion

[vollst_ind_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=457574)

---

1.

$$
1^2+2^2+3^2 + \dots + n^2 \stackrel{!}{=} \frac{n(n+1)(2n+1)}{6}
$$

Anders formuliert:

$$
\sum_{k=1}^n k^2 \stackrel{!}{=} \frac{n(n+1)(2n+1)}{6}
$$

Induktionsanfang: ($n=1$)

$$
\begin{align*}
\sum_{k=1}^1 k^2 &\stackrel{!}{=} \frac{1(1+1)(2 \cdot 1+1)}{6} \\
1^2 &\stackrel{!}{=} \frac{6}{6} \\
1 &= 1 \\
&&\square
\end{align*}
$$

Induktionsvoraussetzung:

Es gilt:

$$
\sum_{k=1}^n k^2 = \frac{n(n+1)(2n+1)}{6}
$$

Induktionschritt:

Zu zeigen:

$$
\sum_{k=1}^{n+1} k^2 \stackrel{!}{=} \frac{(n+1)((n+1)+1)(2(n+1)+1)}{6} = \frac{2(n+1)(n+2)(n+\frac{3}{2})}{6} 
$$

Beweis:

$$
\begin{align*}
\sum_{k=1}^{n+1} k^2 &= \Big( \sum_{k=1}^n k^2 \Big) + (n + 1)^2 \\
&= \frac{n(n+1)(2n+1)}{6} + (n + 1)^2 \\
&= \frac{n(n+1)(2n+1)}{6} + \frac{6 \cdot (n + 1)^2}{6} \\
&= \frac{n(n+1)(2n+1) + 6 \cdot (n + 1)^2}{6} \\
&= \frac{(2n^3 + 3n^2 + n ) + 6 \cdot (n^2 + 2n + 1)}{6} \\
&= \frac{(2n^3 + 3n^2 + n ) + 6n^2 + 12n + 6}{6} \\
&= \frac{2n^3 + 9n^2 + 13n + 6}{6} \\
&= \frac{2(n+1)(n+2)(n+\frac{3}{2})}{6} \\
&&\square
\end{align*}
$$

---

2.

TODO

---

3.

$$
7^n - 4^n \stackrel{!}{=} 3k
$$

Induktionsanfang:

$$
7^1 - 4^1 = 3 = 3 \cdot 1 \quad \square
$$

Induktionsvoraussetzung:

$$
7^n - 4^n = 3k
$$

Induktionsschritt:

Zu zeigen:

$$
7^{n+1} - 4^{n+1} \stackrel{!}{=} 3k
$$

Beweis:

$$
\begin{align*}
7^{n+1} - 4^{n+1} &= 7 \cdot 7^n - 4 \cdot 4^n \\
&= 3 \cdot 7^n + 7^n + 7^n + 7^n + 7^n - 4^n - 4^n - 4^n - 4^n \\
&= 3 \cdot 7^n + (7^n - 4^n) + (7^n - 4^n) + (7^n - 4^n) + (7^n - 4^n )\\
&= 3 \cdot 7^n + 4 \cdot 3m \\
&= 3 \cdot \underbrace{( 7^n + 4m )}_{k \in \mathbb{N}}\\
&& \square
\end{align*}
$$

---

4.

These:

$$
\sum_{k=1}^n 2k-1 \stackrel{?}{=} n^2
$$

Induktionsanfang:

$$
\begin{align*}
\sum_{k=1}^1 2k-1 \stackrel{!}{=} 1^2 \\
1 = 1 \\
&&\square
\end{align*}
$$

Induktionsschritt:

$$
\begin{align*}
\sum_{k=1}^{n+1} 2k-1 &= (\sum_{k=1}^{n} 2k-1) + 2(n+1)-1 \\
&= n^2 + 2(n+1)-1 \\
&= n^2 + 2n + 1 \\
&= (n+1)^2 \\
&&\square
\end{align*}
$$

---

5.

Zu zeigen:

$$
(1+x)^n \ge 1+n \cdot x
$$

Induktionsanfang: $n=1$

$$
\begin{align*}
(1+x)^1 &\stackrel{!}{\ge} 1 + 1 \cdot x \\
x+1 &= x+1 \\
&&\square
\end{align*}
$$

Induktionsschritt:

$$
\begin{align*}
(1+x)^{n+1} \stackrel{!}{\ge} 1 + (n+1) \cdot x \\
(1+x)(1+x)^n \stackrel{!}{\ge} 1+ x + n \cdot x \\
(1+x)(1+x)^n \ge (1+x)(1+n\cdot x) \stackrel{!}{\ge} 1+ x + n \cdot x \\
1+n \cdot x + x + n \cdot x^2 \stackrel{!}{\ge}  1 + x + n \cdot x \\
x+n^2 \ge x \\
nx^2 \ge 0 \\
&&\square
\end{align*}
$$
