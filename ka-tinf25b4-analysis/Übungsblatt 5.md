# Übungsblatt 5

[integralrechnung_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=520140)

---

1.

Untersumme:

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \frac{1}{n} \sum_{k = 0}^{n-1} \Big(\frac{k}{n}\Big)^2 \\
=&\lim_{n \rightarrow \infty} \frac{1}{n} \sum_{k = 0}^{n-1} \frac{k}{n} \cdot \frac{k}{n} \\
=&\lim_{n \rightarrow \infty} \frac{1}{n} \sum_{k = 0}^{n-1} \frac{1}{n} \cdot k \cdot \frac{1}{n} \cdot k \\
=&\lim_{n \rightarrow \infty} \frac{1}{n} \sum_{k = 0}^{n-1} \frac{1}{n^2} \cdot k^2 \\
=&\lim_{n \rightarrow \infty} \frac{1}{n} \cdot \frac{1}{n^2} \sum_{k = 0}^{n-1} k^2 \\
=&\lim_{n \rightarrow \infty} \frac{1}{n^3}\sum_{k = 0}^{n-1} k^2 \\
=&\lim_{n \rightarrow \infty} \frac{1}{n^3}\Bigg(\Big(\sum_{k = 0}^{n-1} k^2\Big) + n^2 - n^2\Bigg) \\
=&\lim_{n \rightarrow \infty} \frac{1}{n^3}\Bigg(\Big(\sum_{k = 0}^{n} k^2\Big) - n^2\Bigg) \\
=&\lim_{n \rightarrow \infty} \frac{1}{n^3} \Big( -n^2 + \frac{n \cdot (n-1)(2n-1)}{6} \Big) \\
=&\lim_{n \rightarrow \infty} -\frac{1}{n} + \frac{1}{n^2} \Big(\frac{2n^2+3n+1}{6}\Big) \\
=&\lim_{n \rightarrow \infty} -\frac{1}{n} + \frac{1}{n^2} \Big(\frac{2n^2}{6}+\frac{3n}{6}+\frac{1}{6}\Big) \\
=&\lim_{n \rightarrow \infty} -\frac{1}{n} + \frac{2n^2}{6n^2} + \frac{3n}{6n^2} + \frac{1}{6n^2} \\
=&\lim_{n \rightarrow \infty} -\frac{1}{n} + \frac{1}{3} + \frac{1}{2} \cdot \frac{1}{n} + \frac{1}{6} \cdot \frac{1}{n^2} \\
=&0 + \frac{1}{3} + 0 \\
=& \frac{1}{3}
\end{align*}
$$

Obersumme:

$$
\begin{align*}
&\lim_{n \rightarrow \infty} \frac{1}{n} \sum_{k = 1}^{n} \Big(\frac{k}{n}\Big)^2 \\
=&\lim_{n \rightarrow \infty}\frac{1}{n^3} \sum_{k = 1}^{n} k^2 \\
=&\lim_{n \rightarrow \infty}\frac{1}{n^3} \sum_{k = 0}^{n} k^2 \\
=&\dots \\
=&\frac{1}{3}
\end{align*}
$$

$$
\begin{align*}
\frac{1}{3} \le \int_0^1 x^2 dx \le \frac{1}{3} \\
\int_0^1 x^2 dx = \frac{1}{3}
\end{align*}
$$

---

2.

a)

$$
\begin{align*}
\int_0^1 4x^3-3x^2+2x-1 \space dx = \\
\Big[x^4-x^3+x^2-x \Big]_0^1 = \\
1-1+1-1 = 0
\end{align*}
$$

b)

$$
\begin{align*}
\int_1^2 \frac{1}{x^3}+x^3 \space dx = \\
\int_1^2 x^{-3}+x^3 \space dx = \\
\Big[ -\frac{1}{2}x^{-2}+\frac{1}{4}x^4 \Big]_1^2 = \\
-\frac{1}{2} \cdot \frac{1}{4} + \frac{1}{4} \cdot 16 - (-\frac{1}{2}+\frac{1}{4}) = \frac{33}{8} = 4.125
\end{align*}
$$

c)

$$
\begin{align*}
\int_0^2 2^x + \sqrt[5]{x} \space dx = \\
\Big[ \frac{1}{ln(2)}2^x + \frac{5}{5+1} \cdot (\sqrt[5]{x})^{5+1} \Big]_0^2 = \\
\Big[ \frac{1}{ln(2)}2^x + \frac{5}{6} \cdot (\sqrt[5]{x})^{6} \Big]_0^2 = \\
\frac{1}{ln(2)}2^2 + \frac{5}{6} \cdot (\sqrt[5]{2})^{6} - (\frac{1}{ln(2)}2^0 + \frac{5}{6} \cdot (\sqrt[5]{0})^{6}) = \\
4 \cdot \frac{1}{ln(2)} + \frac{5}{6} \cdot (\sqrt[5]{2})^{6} - \frac{1}{ln(2)} = \\
3 \cdot \frac{1}{ln(2)} + \frac{5}{6} \cdot (\sqrt[5]{2})^{6} \approx 6.2426
\end{align*}
$$

d)

$$
\begin{align*}
\int_{-2}^1 |x| \space dx = \\
\int_{-2}^0 -x \space dx + \int_0^1 x \space dx = \\
\Big[ -\frac{1}{2}x^2 \Big]_{-2}^0 + \Big[ \frac{1}{2}x^2 \Big]_0^1 = \\
0-(-\frac{1}{2}(-2)^2) + \frac{1}{2}1^2 = \\
2+\frac{1}{2} = 2.5
\end{align*}
$$

---

3.

TODO

4.

a)

$$
\begin{align*}
\int_1^\infty \frac{1}{x^2} dx \\
\newline
\frac{1}{x^2} = x^{-2} \Rightarrow -x^{-1}
\end{align*}
$$