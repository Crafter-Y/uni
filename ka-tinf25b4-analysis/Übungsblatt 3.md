# Übungsblatt 3 - Stetigkeit

[stetigkeit_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=458210)

---

1.

Verkettung stetiger Funktionen ist ebenfalls stetig

---

2.

$$
\frac{x^2-1}{x-1} = \frac{(x+1)(x-1)}{(x-1)} = x+1
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

$x_{2,1}$ unbeschränkt, $L \rightarrow \infty$, also nicht Lipschitz-stetig

---

4.

$$
\begin{align*}
sin(x) = \sum_{k=0}^\infty (-1)^k \frac{x^{2k+1}}{(2k+1)!} \\
= x - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots
\end{align*}
$$

$$
\begin{align*}
\lim_{x \rightarrow 0} \frac{sin(x)}{x} = \lim_{x \rightarrow 0} \frac{x - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots}{x} \\
= \lim_{x \rightarrow 0} 1 - \frac{x^2}{3!} + \frac{x^4}{5!} - \dots \\
= 1
\end{align*}
$$

---

$$
\lim_{x \rightarrow 0^-} g(x) = -1 \\
\lim_{x \rightarrow 0^+} g(x) = 1
$$

=> $\lim_{x \rightarrow 0} g(x)$ existiert nicht, $g$ ist also nicht stetig in $0$

---

$h(x)$: Der Funktionswert oszilliert für $x \rightarrow 0$ immer schneller. Wir suchen also zwei Folgen, die gegen $0$ gehen, auf denen $sin(\frac{1}{x})$ aber verschiedene Werte annimmt:

$$
x_n = \frac{1}{2\pi n + \frac{\pi}{2}} \quad y_n = \frac{1}{2\pi n + \frac{3\pi}{2}}
$$

> Die eine Folge trifft immer das Maximum des Sinus, die andere immer das Minimum.

$$
sin\Big(\frac{1}{x_n}\Big) = sin\Big(2\pi n + \frac{\pi}{2}\Big) = 1 \quad
sin\Big(\frac{1}{y_n}\Big) = sin\Big(2\pi n + \frac{3\pi}{2}\Big) = -1
$$

Für $n \rightarrow \infty$ gilt $x_n \rightarrow 0$ und $y_n \rightarrow 0$, es gibt also zwei verschiedene Häufungspunkte und der Grenzwert existiert nicht. Wegen $h(0) = 0$ ist $h$ nicht stetig in $0$.

---

$i(x)$: Im Vergleich zu $h(x)$ gibt es hier den einhüllenden Faktor $x$, der den Grenzwert auf $0$ zieht:

$$
-|x| \le x \cdot sin\Big(\frac{1}{x}\Big) \le |x| \quad (x \ne 0)
$$

Für $x \rightarrow 0$ gehen sowohl $-|x|$ als auch $|x|$ gegen $0$:

$$
\begin{align*}
\lim_{x \rightarrow 0} -|x| \le \lim_{x \rightarrow 0} x \cdot sin\Big(\frac{1}{x}\Big) &\le \lim_{x \rightarrow 0} |x| \\
0 \le \lim_{x \rightarrow 0} x \cdot sin\Big(\frac{1}{x}\Big) &\le 0 \\
\Rightarrow \lim_{x \rightarrow 0} x \cdot sin\Big(\frac{1}{x}\Big) &= 0
\end{align*}
$$

Wegen $i(0) = 0$ ist $i$ per Sandwich-Kriterium stetig in $0$.

---

5.

Untersucht werden auf $I = [0, \infty)$:

$$
\begin{align*}
f_n(x) &= n \cdot x \cdot e^{-n x} \\
g_n(x) &= x \cdot e^{-n x} \\
h_n(x) &= \frac{sin(n x)}{n}
\end{align*}
$$

Vorgehen: erst die punktweise Grenzfunktion bestimmen, danach auf Gleichmäßigkeit prüfen.

---

$f_n(x)$: Für festes $x$ gilt

$$
\lim_{n \rightarrow \infty} n \cdot x \cdot e^{-n x} = 0
$$

also konvergiert $f_n$ punktweise gegen $0$. Allerdings gilt an der Stelle $x = \frac{1}{n}$:

$$
f_n\Big(\frac{1}{n}\Big) = n \cdot \frac{1}{n} \cdot e^{-1} = e^{-1}
$$

Es gibt also für jedes $n$ eine Stelle, an der der Abstand zur Grenzfunktion konstant $e^{-1}$ beträgt => **nicht gleichmäßig konvergent**.

---

$g_n(x)$: Für festes $x$ gilt

$$
\lim_{n \rightarrow \infty} x \cdot e^{-n x} = 0
$$

also konvergiert $g_n$ punktweise gegen $0$. An der kritischen Stelle $x = \frac{1}{n}$ gilt

$$
g_n\Big(\frac{1}{n}\Big) = \frac{1}{n} \cdot e^{-1} \stackrel{n \rightarrow \infty}{\rightarrow} 0
$$

Der Abstand geht also auch dort gegen $0$ => **gleichmäßig konvergent**.

---

$h_n(x)$: Für festes $x$ gilt

$$
\lim_{n \rightarrow \infty} \frac{sin(n x)}{n} = 0
$$

also konvergiert $h_n$ punktweise gegen $0$. Wegen $|sin(n x)| \le 1$ gilt die von $x$ unabhängige Abschätzung

$$
\Big| \frac{sin(n x)}{n} - 0 \Big| \le \frac{1}{n} \stackrel{n \rightarrow \infty}{\rightarrow} 0
$$

=> **gleichmäßig konvergent**.

---

Erklärung gleichmäßiger Konvergenz:

1. Fall:

Grenzfunktion im geschlossenen Intervall nicht stetig => nicht gleichmäßig

2. Fall

Für x lässt sich f(n) einsetzen, so dass ein konstanter Wert herauskommt => nicht gleichmäßig

3. Fall

Alle anderen Fälle => gleichmäßig
