# Übungsblatt 3 - Stetigkeit

[stetigkeit_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=458210)

---

1.

Verkettung stetiger Funktionen ist ebenfalls stetig

---

2.

$$
\frac{x^2-1}{x-1} = \frac{(x+1)(x-1)}{(x-1)} = x-1
$$

$$
x+1 \Rightarrow 1+1 = 2
$$

$a=2$

$$
(x^3+x^2-x-1):(x-1)=x^2+2x+1=(x+1)^2
$$

$(1+1)^2 = 4$

$b=4$

---

3.

$f(x) = x^2 \quad I = [0,1]$

$$
\begin{align*}
|f(x_2)-f(x_1)| \le L \cdot |x_2-x_1| \\
|x_2-x_1||x_2+x_1| \le L \cdot |x_2-x_1| \\
|x_2+x_1| \le L
\end{align*}
$$

$x_{1,2}$ werden maximal für $x=1$:

$$
|2| = 2 \le L
$$

$I_g = [0, \infty)$ und $|x_2+x_1| \le L$

$x_{2,1}$ unbeschränkt, $L \rightarrow \infty$, nicht Leibschnitz Stetig

---

4.

$$
\begin{align*}
sin(x) = \sum_{k=0}^\infty (-1)^k \frac{x^{2k-1}}{(2k+1)!} \\
= x - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots
\end{align*}
$$

$$
\begin{align*}
\lim_{x \rightarrow 0} \frac{sin(x)}{x} = \lim_{x \rightarrow 0} \frac{x - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots}{x} \\
= \lim_{x \rightarrow 0} 1 - \frac{x^3}{3!} + \frac{x^5}{5!} \\
= 1
\end{align*}
$$

---

$$
\lim_{x \rightarrow 0^-} g(x) = -1 \\
\lim_{x \rightarrow 0^+} g(x) = 1
$$

=> nicht stetig

---

TODO

---

5.

TODO

Erklärung gleichmäßiger Konvergenz:

1. Fall:

Grenzfunktion im geschlossenen Intervall nicht stetig => nicht gleichmäßig

2. Fall

Für x lässt sich f(n) einsetzen, so dass ein konstanter Wert herauskommt => nicht gleichmäßig

3. Fall

Alle anderen Fälle => gleichmäßig
