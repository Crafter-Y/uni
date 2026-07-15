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
=&\lim_{n \rightarrow \infty} \frac{1}{n^3} \Big( -n^2 + \frac{n \cdot (n+1)(2n+1)}{6} \Big) \\
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
\int_0^1 & 4x^3-3x^2+2x-1 \space dx \\
&= \Big[x^4-x^3+x^2-x \Big]_0^1 \\
&=1-1+1-1 \\
&= 0
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

$$
\int \frac{f'(x)}{f(x)}dx = \int \frac{1}{f(x)} \cdot \frac{f'(x) dx}{dt}
$$

$f(x) = t$

$\frac{dt}{dx} = f'(x)$

$\Rightarrow dt = f'(x) \cdot dx$

$$
\stackrel{Subst}{=} \int \frac{1}{t} \cdot dt = ln \space t + c
$$

4.

a)

$$
\begin{align*}
\int_1^\infty \frac{1}{x^2} dx \\
\newline
\frac{1}{x^2} = x^{-2} \Rightarrow -x^{-1} \\
\rightarrow 1
\end{align*}
$$

b)

$$
\begin{align*}
\int_0^\infty e^{-x} dx = \Bigg[ -e^{-x} \Bigg]_0^\infty \\
= 1 \cdot e^0 - 0 = 1
\end{align*}
$$

c)

$$
\begin{align*}
\int_2^\infty \frac{1}{x(x-1)} \space dx \\
\newline
\text{Partialbruchzerlegung} \\
\frac{1}{x(x-1)} = \frac{a}{x} + \frac{b}{x-1} \\
= \frac{a(x-1)+bx}{x(x-1)} \\
= \frac{ax+bx-a}{x(x-1)} \\
= (a+b)x - a \\
\newline
a+b = 0 \\
-a = 1 \\
\Rightarrow a = -1 \\
\Rightarrow b = 1 \\
\newline
\int_2^\infty -\frac{1}{x} + \frac{1}{x-1} \space dx = 
\Bigg[ -ln \space x + ln(x-1) \Bigg]_2^\infty \\
= \lim_{b \rightarrow \infty} \Bigg[ -ln \space x + ln(x-1) \Bigg]_2^\infty \\
= \lim_{b \rightarrow \infty}-ln b + ln (b-1) + ln 2 - ln 1 \\
= \lim_{b \rightarrow \infty}ln(b-1) - ln b + ln 2 \\
= \lim_{b \rightarrow \infty} ln \frac{b-1}{b} + ln 2 \\
= ln 1 + ln 2 \\
= ln 2
\end{align*}
$$

d)

$$
\begin{align*}
\int_0^\frac{\pi}{4} sin x \cdot cos x dx \\
= \Bigg[ \frac{1}{2} sin^2x \Bigg]_0^\frac{\pi}{4} \quad \text{Scharfes hinsehen} \\
= \frac{1}{2} sin^2(\frac{\pi}{4}) - \frac{1}{2} sin^2(0) \\
= \frac{1}{2} \cdot \frac{1}{\sqrt{2}^2}-0 = \frac{1}{4}
\end{align*}
$$

e)

$$
\begin{align*}
\int_0^1 x \cdot e^x \space dx \\
= \Bigg[ x \cdot e^x \Bigg]_0^1 - \int_0^1 e^x \space dx \\
= \Bigg[ e^x \Bigg]_0^1 \\
= e^1 - 0 - e^1 + e^0 = 1
\end{align*}
$$

f)

$$
\begin{align*}
\int_0^1 x \cdot e^{x^2-1} \space dx \\
= \Bigg[ \frac{1}{2} e^{x^2-1} \Bigg]_0^1 \\
= \frac{1}{2} e^0 - \frac{1}{2} e^{-1} = \frac{1}{2}(1-\frac{1}{e}) 
\end{align*}
$$

Wenn man das durch schwarfes Hinsehen nicht direkt sieht, dann kann man auch substituieren:

$$
\begin{align*}
\text{Subst. } t = x^2-1 \\
\frac{dt}{dx} = 2x \Rightarrow dt = 2x \cdot dx \\
t(0) = 0-1 = -1 \\
t(1) = 1^2-1 = 0 \\
\newline
\int_0^1 \underbrace{e^{x^2-1}}_{e^t} \frac{1}{2} \underbrace{\cdot 2x \space dx}_{dt} \\
\int_{-1}^0 e^t dt = \Bigg[ e^t \Bigg]_{-1}^0 = \frac{1}{2} (e^0 - e^{-1}) \\
= \frac{1}{2} (1- \frac{1}{e})
\end{align*}
$$

g)

$$
\begin{align*}
\int_0^1 ln(x) \space dx = \int_0^1 1 \cdot ln x \space dx \\
= \Bigg[ x \cdot ln \space x \Bigg]_0^1 - \int_0^1 x \cdot \frac{1}{x} dx \\
= \Bigg[ x \cdot ln \space x \Bigg]_0^1 - \Bigg[ x \Bigg]_0^1 \\
= \Bigg[ x(ln \space x -1) \Bigg]_0^1 \\
= 1 \cdot (ln \space 1 - 1) - 0 \cdot (ln \space 0 - 1) \\
= 0 - 1 - 0 + 0 = -1
\end{align*}
$$
