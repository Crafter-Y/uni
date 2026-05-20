# Übungsblatt 2

TODO: source

---

1.

Grundlage: Geometrische Summe berechnen:

$$
\sum_{k=0}^\infty a \cdot r^k = \frac{a}{1-r}
$$

a)

$$
= \sum_{k=0}^\infty (-1)^k \cdot (\frac{1}{2})^k = \sum_{k=0}^\infty (\frac{-1}{2})^k = \frac{1}{1-(-\frac{1}{2})} = \frac{2}{3}
$$

TODO b,c

---

2.

$$
\begin{align*}
\lim_{n \rightarrow \infty} 0.\underbrace{999 \dots 9}_{n} &= 0.9 + 0.09 + 0.09 + \dots \\
&= 0.9 \cdot (1 + \frac{1}{10} + \frac{1}{100} + \dots) \\
&= 0.9 \cdot \sum_{k=0}^\infty (\frac{1}{10})^k \\
&= \frac{9}{10} \cdot (\frac{1}{1-\frac{1}{10}}) \\
&= \frac{9}{10} \cdot (\frac{1}{\frac{9}{10}}) \\
&= 1
\end{align*}
$$

---

3.

$$
\begin{align*}
0.\overline{12} &= \frac{12}{100} + \frac{12}{10000} + ... \\
&= \frac{12}{100} \cdot (1+ \frac{1}{100} + \frac{1}{10000} + \dots) \\
&= \frac{12}{100} \cdot \sum_{k=0}^\infty (\frac{1}{100})^k \\
&= \frac{12}{100} \cdot \frac{1}{1- \frac{1}{100}} \\
&= \frac{12}{99}
\end{align*}
$$

---

4.

Überprüfen auf Konvergenz:

a)

$$
s_a = \sum_{n=0}^\infty \frac{n^2}{2^n}
$$

Quotientenkriterium:

$$
\begin{align*}
|\frac{\frac{(n+1)^2}{2^{n+1}}}{\frac{n^2}{2^n}}| &= |\frac{(n+1)^2}{2^{n+1}} \cdot \frac{2^n}{n^2}| \\
&= |\frac{n^2+2n+1}{2^n \cdot 2^1} \cdot \frac{2^n}{n^2}| \\
&= |\frac{(n^2+2n+1)(2^n)}{2^n \cdot 2 \cdot n^2}| \\
&= |\frac{n^2+2n+1}{2 \cdot n^2}| \\
&= |\frac{n^2 \cdot (1+\frac{2}{n}+\frac{1}{n^2})}{2 \cdot n^2}| \\
&= |\frac{1+\frac{2}{n}+\frac{1}{n^2}}{2}| \\
\lim_{n \rightarrow \infty} |\frac{1+\frac{2}{n}+\frac{1}{n^2}}{2}| &= \frac{1}{2} \lt 1 \\
&&\square
\end{align*}
$$

b)

$$
s_b = \sum_{n=0}^\infty \frac{n!}{n^n}
$$

Quotentenkriterium:

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \frac{\frac{(n+1)!}{(n+1)^{n+1}}}{\frac{n!}{n^n}} \\
=&\lim_{n \rightarrow \infty} \frac{(n+1)!}{n!} \cdot \frac{n^n}{(n+1)^{n+1}} \\
=&\lim_{n \rightarrow \infty} (n+1) \cdot \frac{n^n}{(n+1)(n+1)^n} \\
=&\lim_{n \rightarrow \infty} (\frac{n}{n+1})^n \\
=&\lim_{n \rightarrow \infty} (\frac{n+1-1}{n+1})^n \\
=&\lim_{n \rightarrow \infty} (1-\frac{1}{n+1})^n \\
=&\lim_{n \rightarrow \infty} (1 + \frac{-1}{n+1})^n \\
=&\lim_{n \rightarrow \infty} \frac{(1 + \frac{-1}{m})^m}{1 + \frac{-1}{m}} &m=n+1, n=m-1 \\
=& \frac{1}{e} \cdot \frac{1}{1} \\
=& \frac{1}{e} \lt 1 \\
&&\square
\end{align*}
$$

---

5.

a)

$$
S_a = \sum_{k=1}^\infty \frac{(x+1)^k}{k} = \sum_{k=1}^\infty \frac{(x-10)^k}{k}
$$

EP: $x_0 = 1$

$$
= \sum_{k=1}^\infty \frac{1}{k}(x - 2)^k
$$

$1 \le x \lt 3$

R=1

b)

TODO

c)

TODO

$x_0 = 0 => R = 1$