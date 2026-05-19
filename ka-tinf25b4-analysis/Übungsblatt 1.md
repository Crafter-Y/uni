# Übungsblatt 1

[folgen_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=456343)

---

1.

$$
\begin{align*}
(a_n)_{n=0}^{\infty} &\text{ mit } (a_n) = 3^n \\
(b_n)_{n=1}^{\infty} &\text{ mit } (b_n) = (-1)^n \\
(c_n)_{n=1}^{\infty} &\text{ mit } (c_n) = 3n + 1
\end{align*}
$$

---

2.

$$
\begin{align*}
(b_n)_{n=-4}^{\infty} &= \frac{2 + (n+4)^2}{9^{n+4}} \\
(c_n)_{n=3}^{\infty} &= \frac{2 + (n-3)^2}{9^{n-3}} \\
(c_n)_{n=2}^{-\infty} &= \frac{2 + (-2-n)^2}{9^{-2-n}} \\
\end{align*}
$$

---

3.

TODO

---

4.

TODO

---

5.

Man kann abschätzen:

$$
\frac{1}{n} \cdot (-1) \le \frac{1}{n} \cdot sin(\frac{\pi}{2}n) \le \frac{1}{n} \cdot (1)
$$

Da

$$
\lim_{n \rightarrow \infty} \frac{1}{n} = 0
$$

ist der grenzwert der Folge 0.

---

6.

$$
\begin{align}
&\lim_{n \rightarrow \infty} \sqrt{n^2+n} - n \\
=&\lim_{n \rightarrow \infty} \frac{(\sqrt{n^2+n} - n)(\sqrt{n^2+n} + n)}{\sqrt{n^2+n} + n} \\
=&\lim_{n \rightarrow \infty} \frac{(\sqrt{n^2+n})^2 - n^2}{\sqrt{n^2+n} + n} \\
=&\lim_{n \rightarrow \infty} \frac{n^2+n - n^2}{\sqrt{n^2+n} + n} \\
=&\lim_{n \rightarrow \infty} \frac{n}{\sqrt{n^2+n} + n} \\
=&\lim_{n \rightarrow \infty} \frac{n}{n \cdot \sqrt{1+\frac{1}{n}} + n} \\
=&\lim_{n \rightarrow \infty} \frac{n}{n \cdot (\sqrt{1+\frac{1}{n}} + 1)} \\
=&\lim_{n \rightarrow \infty} \frac{1}{\sqrt{1+\frac{1}{n}} + 1} \\
=&\frac{1}{\sqrt{1+0} + 1} \\
=&\frac{1}{2} \\
\end{align}
$$

---

7.

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \sqrt{n+1} - \sqrt{n} \\
=& \lim_{n \rightarrow \infty} \frac{(\sqrt{n+1} - \sqrt{n})(\sqrt{n+1} + \sqrt{n})}{\sqrt{n+1} + \sqrt{n}} \\
=& \lim_{n \rightarrow \infty} \frac{(\sqrt{n+1})^2 - (\sqrt{n})^2}{\sqrt{n+1} + \sqrt{n}} \\
=& \lim_{n \rightarrow \infty} \frac{n+1-n}{\sqrt{n+1} + \sqrt{n}} \\
=& \lim_{n \rightarrow \infty} \frac{1}{\sqrt{n+1} + \sqrt{n}} \\
=& \space 0
\end{align*}
$$

---

8.

$$
\begin{align*}
&\lim_{n \rightarrow \infty} (\frac{n+3}{2n+8})^{37} \\
=&\lim_{n \rightarrow \infty} (\frac{1+\frac{3}{n}}{2+\frac{8}{n}})^{37} \\
=& (\frac{1}{2})^{37} \\
\end{align*}
$$

---

$$
\begin{align*}
&\lim_{n \rightarrow \infty} (\frac{31}{n^2}+\frac{2n}{n}+7)^4 \\
=& \lim_{n \rightarrow \infty} (\frac{31}{n^2}+2+7)^4 \\
=& (2+7)^4 \\
=& \space 9^4 = 6561 \\
\end{align*}
$$

---

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \frac{1}{(2+\frac{1}{n})^8} \\
=& \frac{1}{2^8} \\
=& \frac{1}{256}
\end{align*}
$$

---

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \frac{\sqrt[n]{n^2} + \sqrt{2} \cdot 4}{4 \sqrt[n]{n} + \sqrt[n]{4n}} \\
=&\lim_{n \rightarrow \infty} \frac{\sqrt[n]{n} \cdot \sqrt[n]{n} + \sqrt{2} \cdot 4}{4 \sqrt[n]{n} + \sqrt[n]{4} \cdot \sqrt[n]{n}} \\
=& \frac{1 + \sqrt{2} \cdot 4}{4 + 1} \\
=& \frac{1 + 4\sqrt{2}}{5}
\end{align*}
$$