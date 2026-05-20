# Übungsblatt 02.5: Vollständige Induktion

TODO: soruce

---

TODO

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

TODO: verstehen