# Übungsblatt 4

[differenzialrechnung_übung.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=520139)

---

1.

Ableitung über den Grenzwert des Differenzialquotienten:

$$
f'(x) = \lim_{h \rightarrow 0} \frac{f(x+h)-f(x)}{h}
$$

Für $f(x) = c \cdot x^3$:

$$
\begin{align*}
f'(x) &= \lim_{h \rightarrow 0} \frac{c(x+h)^3 - c x^3}{h} \\
&= c \cdot \lim_{h \rightarrow 0} \frac{(x+h)^3 - x^3}{h} \\
&= c \cdot \lim_{h \rightarrow 0} \frac{x^3 + 3x^2h + 3xh^2 + h^3 - x^3}{h} \\
&= c \cdot \lim_{h \rightarrow 0} \frac{3x^2h + 3xh^2 + h^3}{h} \\
&= c \cdot \lim_{h \rightarrow 0} (3x^2 + 3xh + h^2) \\
&= 3c x^2
\end{align*}
$$

Für $g(x) = \frac{1}{x}$:

$$
\begin{align*}
g'(x) &= \lim_{h \rightarrow 0} \frac{1}{h} \cdot \Big( \frac{1}{x+h} - \frac{1}{x} \Big) \\
&= \lim_{h \rightarrow 0} \frac{1}{h} \cdot \frac{x - (x+h)}{x(x+h)} \\
&= \lim_{h \rightarrow 0} \frac{1}{h} \cdot \frac{-h}{x(x+h)} \\
&= \lim_{h \rightarrow 0} \frac{-1}{x(x+h)} \\
&= -\frac{1}{x^2}
\end{align*}
$$

---

2.

$f(x) = x^x$

Trick: $x^x = e^{ln(x^x)} = e^{x \cdot ln(x)}$, danach Ketten- und Produktregel:

$$
\begin{align*}
f'(x) &= e^{x \cdot ln(x)} \cdot \Big( 1 \cdot ln(x) + x \cdot \frac{1}{x} \Big) \\
&= x^x (ln(x) + 1)
\end{align*}
$$

$g(x) = e^x \cdot x^2 \cdot sin(x)$

Produktregel für drei Faktoren: $(fgh)' = f'gh + fg'h + fgh'$

$$
\begin{align*}
g'(x) &= e^x \cdot x^2 \cdot sin(x) + e^x \cdot 2x \cdot sin(x) + e^x \cdot x^2 \cdot cos(x) \\
&= e^x \big( x^2 sin(x) + 2x \cdot sin(x) + x^2 cos(x) \big)
\end{align*}
$$

$h(x) = \frac{sin(x)}{cos(x)}$

Quotientenregel:

$$
\begin{align*}
h'(x) &= \frac{cos(x) \cdot cos(x) - sin(x) \cdot (-sin(x))}{cos^2(x)} \\
&= \frac{cos^2(x) + sin^2(x)}{cos^2(x)} \\
&= \frac{1}{cos^2(x)}
\end{align*}
$$

$i(x) = |ln(x)|$

$x \lt 0$ liegt nicht im Definitionsbereich, bei $x = 1$ gibt es aber einen Vorzeichenwechsel, also Fallunterscheidung:

$$
|ln(x)| = \begin{cases} ln(x) & \text{falls } x \ge 1 \\ -ln(x) & \text{falls } 0 \lt x \lt 1 \end{cases}
\quad \Rightarrow \quad
i'(x) = \begin{cases} \frac{1}{x} & \text{falls } x \gt 1 \\ -\frac{1}{x} & \text{falls } 0 \lt x \lt 1 \end{cases}
$$

An der Stelle $x = 1$ gilt:

$$
\lim_{x \rightarrow 1^-} i'(x) = -1 \quad \lim_{x \rightarrow 1^+} i'(x) = 1
$$

Die einseitigen Grenzwerte sind verschieden, $i(x)$ ist dort also nicht differenzierbar.

---

3.

Zu zeigen: $sin(x) \le x$ für $x \ge 0$

Umgestellt: $x - sin(x) \ge 0$, wir untersuchen also $f(x) = x - sin(x)$ auf Monotonie:

$$
f'(x) = 1 - cos(x)
$$

Da $cos(x) \le 1$ für alle $x \in \mathbb{R}$, gilt $f'(x) \ge 0$, also ist $f$ monoton wachsend. Weiterhin gilt:

$$
f(0) = 0 - sin(0) = 0
$$

$f$ startet also bei $0$ und wächst, damit ist $f(x) \ge 0$ für alle $x \ge 0$ und somit $sin(x) \le x$.

$$
\square
$$

---

4.

a)

$$
\begin{align*}
\lim_{x \rightarrow -\infty} \frac{(2+3x)(2-3x)}{x^2} &= \lim_{x \rightarrow -\infty} \frac{4-9x^2}{x^2} \\
&= \lim_{x \rightarrow -\infty} \Big( \frac{4}{x^2} - 9 \Big) \\
&= -9
\end{align*}
$$

b)

Erst die Differenz zusammenfassen:

$$
\begin{align*}
\frac{1}{x-3} - \frac{5}{x^2-x-6} &= \frac{1}{x-3} - \frac{5}{(x-3)(x+2)} \\
&= \frac{x+2-5}{(x-3)(x+2)} \\
&= \frac{x-3}{(x-3)(x+2)} \\
&= \frac{1}{x+2}
\end{align*}
$$

Daher:

$$
\lim_{x \rightarrow 3} \frac{1}{x+2} = \frac{1}{5}
$$

c)

$$
\begin{align*}
\lim_{x \rightarrow \infty} \frac{e^x + e^{-x}}{e^x - e^{-x}} &= \lim_{x \rightarrow \infty} \frac{e^x(1+e^{-2x})}{e^x(1-e^{-2x})} \\
&= \lim_{x \rightarrow \infty} \frac{1+e^{-2x}}{1-e^{-2x}} \\
&= \frac{1+0}{1-0} = 1
\end{align*}
$$

---

5.

Satz von l'Hospital:

> Ist $\lim_{x \rightarrow x_0} \frac{f(x)}{g(x)}$ ein unbestimmter Ausdruck ($\frac{0}{0}$ oder $\frac{\infty}{\infty}$) und existiert $\lim_{x \rightarrow x_0} \frac{f'(x)}{g'(x)}$, so sind beide Grenzwerte gleich.

Die Regel darf beliebig oft angewendet werden, solange der Ausdruck unbestimmt bleibt.

a)

$$
\lim_{x \rightarrow 0} \frac{x}{sin(x)} \quad \Big( \frac{0}{0} \Big)
$$

Nach l'Hospital:

$$
\lim_{x \rightarrow 0} \frac{1}{cos(x)} = \frac{1}{1} = 1
$$

Der Grenzwert existiert, kann also ersetzt werden:

$$
\lim_{x \rightarrow 0} \frac{x}{sin(x)} = 1
$$

b)

$$
\lim_{x \rightarrow 0} \frac{a^x - b^x}{x} \quad \Big( \frac{0}{0} \Big)
$$

Nach l'Hospital:

$$
\lim_{x \rightarrow 0} \frac{a^x ln(a) - b^x ln(b)}{1} = ln(a) - ln(b)
$$

Der Grenzwert existiert, also:

$$
\lim_{x \rightarrow 0} \frac{a^x - b^x}{x} = ln(a) - ln(b)
$$

c)

$$
\lim_{x \rightarrow 1} \frac{x^2 - e^{x-1}}{ln(x)} \quad \Big( \frac{0}{0} \Big)
$$

Nach l'Hospital:

$$
\lim_{x \rightarrow 1} \frac{2x - e^{x-1}}{\frac{1}{x}} = \frac{2-1}{1} = 1
$$

Der Grenzwert existiert, also:

$$
\lim_{x \rightarrow 1} \frac{x^2 - e^{x-1}}{ln(x)} = 1
$$

---

6.

Gesucht ist das Taylor-Polynom $T_3(x,0)$ von $f(x) = -cos(x)$ sowie der Fehler durch das Restglied im Abstand $|x_0| = 1$.

Ableitungen an der Stelle $x_0 = 0$:

$$
\begin{align*}
f(x) &= -cos(x) & f(0) &= -1 \\
f'(x) &= sin(x) & f'(0) &= 0 \\
f''(x) &= cos(x) & f''(0) &= 1 \\
f^{(3)}(x) &= -sin(x) & f^{(3)}(0) &= 0
\end{align*}
$$

Taylor-Polynom 3. Ordnung um $x_0 = 0$:

$$
\begin{align*}
T_3(x,0) &= f(0) + f'(0)(x-x_0) + \frac{f''(0)}{2!}(x-x_0)^2 + \frac{f^{(3)}(0)}{3!}(x-x_0)^3 \\
&= -1 + 0 + \frac{1}{2}x^2 + 0 \\
&= -1 + \frac{x^2}{2}
\end{align*}
$$

**Restglied**

Restglied in Lagrange-Form, mit einem $\xi$ zwischen $0$ und $x$:

$$
R_3(x) = \frac{f^{(4)}(\xi)}{4!} x^4
$$

Es gilt $f^{(4)}(x) = cos(x)$ und damit $|f^{(4)}(\xi)| = |cos(\xi)| \le 1$. Für $|x| \le 1$ folgt:

$$
|R_3(x)| \le \frac{1}{4!} |x|^4 \le \frac{1}{24}
$$

Der maximale Fehler im Abstand $|x| \le 1$ beträgt also $\frac{1}{24}$.
