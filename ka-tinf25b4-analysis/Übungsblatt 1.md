# Übungsblatt 1

[folgen_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=456343)

---

1.

$$
\begin{align*}
(a_n)_{n=0}^{\infty} &\text{ mit } (a_n) = 3^n \\
(b_n)_{n=0}^{\infty} &\text{ mit } (b_n) = (-1)^n \\
(c_n)_{n=1}^{\infty} &\text{ mit } (c_n) = 3n + 1
\end{align*}
$$

---

2.

$$
\begin{align*}
(b_n)_{n=-4}^{\infty} &= a_{n+5} = \frac{2 + (n+5)^2}{9^{n+5}} \\
(c_n)_{n=3}^{\infty} &= a_{n-2} = \frac{2 + (n-2)^2}{9^{n-2}} \\
(d_n)_{n=2}^{-\infty} &= a_{3-n} = \frac{2 + (3-n)^2}{9^{3-n}} \\
\end{align*}
$$

---

3.

a)

Gegeben:

$$
a_n = \frac{8}{3n+1}
$$

Wir suchen:

$$
|\frac{8}{3n+1} - 0| \stackrel{!}{\lt} \epsilon
$$

Lösen der Gleichung nach $n$:

$$
\begin{align*}
|\frac{8}{3n+1} - 0| &\stackrel{!}{\lt} \epsilon \\
\frac{8}{3n+1} - 0 &\stackrel{!}{\lt} \epsilon &\text{Da } n \gt 0 \\
\frac{8}{\epsilon} &\stackrel{!}{\lt} 3n+1 \\
\frac{\frac{8}{\epsilon}-1}{3} &\stackrel{!}{\lt} n \\
\end{align*}
$$

Also bekommen wir ein festes $N$ in Abhängigkeit von $\epsilon$:

$$
N \gt \frac{\frac{8}{\epsilon}-1}{3}
$$

b)

Gegeben:

$$
a_n = \frac{n^2}{n^2+1}
$$

Wir suchen:

$$
|\frac{n^2}{n^2+1} - 1| \stackrel{!}{\lt} \epsilon
$$

Lösen der Gleichung nach $n$:

$$
\begin{align*}
|\frac{n^2}{n^2+1} - 1| &\stackrel{!}{\lt} \epsilon \\
|\frac{n^2}{n^2+1} - \frac{n^2+1}{n^2+1}| &\stackrel{!}{\lt} \epsilon \\
|\frac{n^2-n^2-1}{n^2+1}| &\stackrel{!}{\lt} \epsilon \\
|\frac{-1}{n^2+1}| &\stackrel{!}{\lt} \epsilon \\
\frac{1}{\epsilon} &\stackrel{!}{\lt} n^2+1 \\
\frac{1}{\epsilon} -1 &\stackrel{!}{\lt} n^2 \\
\end{align*}
$$

Also bekommen wir ein festes $N$ in Abhängigkeit von $\epsilon$:

$$
N \gt \sqrt{\frac{1}{\epsilon}-1}
$$

---

4.

a)

Untersuchen der folgenden Folge:

$$
a_n = \frac{1}{n}
$$

Monotonie: $a_{n+1} \le a_n$

$$
\begin{align*}
\frac{1}{n+1} \le \frac{1}{n} \\
n \le n+1 \\
0 \le 1 \\
&&\square
\end{align*}
$$

Beschränktheit:

$$
0 \lt \frac{1}{n} \le 1 \quad \text{Da } n \in \mathbb{N} \Rightarrow a_n \gt 0 \text{ und momoton fallend}
$$

Grenzwert:

$$
\lim_{n \rightarrow \infty} \frac{1}{n} = 0
$$

Konvergenz:

Die Folge ist konvergent nach dem Monotoniekriterium:

- Beschränkt
- Monoton

Infimum und Supremum:

$$
\sup(a_n) = a_1 = 1 \quad \inf(a_n) = 0
$$

b)

Untersuchen der folgenden Folge:

$$
b_n = \frac{n}{n+1}
$$

Monotonie: $a_{n+1} \le a_n$

$$
\begin{align*}
\frac{n+1}{(n+1)+1} \stackrel{!}{\le} \frac{n}{n+1} \\ 
\frac{n+1}{n+2} \stackrel{!}{\le} \frac{n}{n+1} \\
\frac{n+1}{n+2} - \frac{n}{n+1} \stackrel{!}{\le} 0 \\
\frac{(n+1)^2}{(n+2)(n+1)} - \frac{n(n+2)}{(n+1)(n+2)} \stackrel{!}{\le} 0 \\
\frac{(n+1)^2 - n(n+2)}{(n+2)(n+1)} \stackrel{!}{\le} 0 \\
\frac{n^2+2n+1 - n^2-2n}{(n+2)(n+1)} \stackrel{!}{\le} 0 \\
\frac{1}{(n+2)(n+1)} \gt 0 \\
\end{align*}
$$

-> monoton steigend

Beschränktheit:

$$
\frac{1}{2} \le \frac{n}{n+1} \lt 1 \quad \text{Da } n \in \mathbb{N} \Rightarrow b_n \gt 0 \text{ und monoton steigend}
$$

Grenzwert:

$$
\begin{align*}
\lim_{n \rightarrow \infty} \frac{n}{n+1} \\
= \lim_{n \rightarrow \infty} \frac{1}{1+\frac{1}{n}} \\
= \frac{1}{1} \\
= 1\\
\end{align*}
$$

Konvergenz:

Die Folge ist konvergent nach dem Monotoniekriterium:

- Beschränkt
- Monoton

Infimum und Supremum:

$$
\sup(b_n) = 1 \quad \inf(b_n) = b_1 = \frac{1}{2}
$$

c)

Untersuchen der folgenden Folge:

$$
c_n = (-1)^n \cdot \frac{n}{n+1}
$$

Monotonie:

$(-1)^n \cdot \dots \rightarrow$ alternierend und deshalb nicht monoton 

Beschränktheit:

$-1 \le c_n \le 1$

Grenzwert:

2 Häufungspunkte:

$$
c_{2k} = \underbrace{(-1)^{2k}}_{=1} \cdot \frac{2k}{2k+1} \stackrel{k \rightarrow \infty}{\rightarrow} 1
$$

$$
c_{2k-1} = \underbrace{(-1)^{2k-1}}_{=-1} \cdot \frac{2k-1}{2k} \stackrel{k \rightarrow \infty}{\rightarrow} -1
$$

Dementsprechend kein Grenzwert und auch nicht konvergent

Infimum und Supremum:

$$
\sup(c_n) = 1 \quad \inf(c_n) = -1
$$

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

kann man eingrenzen:

$$
0 \le \frac{1}{n} \cdot sin(\frac{\pi}{2}n) \le 0
$$

Per Sandwich Kriterium ist der Grenzwert der Folge 0.

---

6.

$$
\begin{align*}
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
\end{align*}
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
&\lim_{n \rightarrow \infty} \frac{\sqrt[n]{n^2} + \sqrt[2]{4}}{4 \sqrt[n]{n} + \sqrt[n]{4n}} \\
=&\lim_{n \rightarrow \infty} \frac{\sqrt[n]{n} \cdot \sqrt[n]{n} + \sqrt[2]{4}}{4 \sqrt[n]{n} + \sqrt[n]{4} \cdot \sqrt[n]{n}} \\
=& \frac{1 + \sqrt[2]{4}}{4 + 1} \\
=& \frac{1 + 2}{5} = \frac{3}{5}
\end{align*}
$$