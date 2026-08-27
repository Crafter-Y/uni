# Übungsblatt 4

[Uebung4.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=403041)

---

1.

(a)

Lineare (Un-) abhängigkeit

$$
\begin{align*}
\lambda_1 \cdot v + \lambda_2 \cdot w = 0 \\
\lambda_1 \cdot \begin{pmatrix}
3 \\ 7 \\ 2
\end{pmatrix} + \lambda_2 \cdot
\begin{pmatrix}
5 \\ 9 \\ 1
\end{pmatrix} = 
\begin{pmatrix}
0 \\ 0 \\ 0
\end{pmatrix}
\end{align*}
$$

$\text{I}\quad 3 \lambda_1 + 5 \lambda_2 = 0$

$\text{II}\quad 7 \lambda_1 + 9 \lambda_2 = 0$

$\text{III}\quad 2 \lambda_1 + 1 \lambda_2 = 0$

$\lambda_2$ in $I$:

$3 \cdot \lambda_1 + 5(-2 \cdot \lambda_1) = -7 \cdot \lambda_1 = 0$

=> $\lambda_1 = 0$

$\lambda_1$ in III:

$\lambda_2 = -2 \cdot \lambda_1 = -2 \cdot 0 = 0$

=> $v,w$ sind linear unabhängig

Sie stellen keine Basis von Q3 dar.

(b)

$$
\begin{pmatrix}
\lambda_1 \cdot 1 \\ \lambda_1 \cdot 2
\end{pmatrix} + 
\begin{pmatrix}
\lambda_2 \cdot 3 \\ \lambda_2 \cdot 7
\end{pmatrix} + 
\begin{pmatrix}
\lambda_3 \cdot (-1) \\ \lambda_3 \cdot 3
\end{pmatrix} =
\begin{pmatrix}
0 \\ 0
\end{pmatrix}
$$

$\text{I}\quad \lambda_1 + 3 \lambda_2 - \lambda_3 = 0$

$\text{II}\quad 2 \lambda_1 + 7 \lambda_2 + 3 \lambda_3 = 0$

$II - 2 \cdot I$: $(2 \lambda_1 + 7 \lambda_2 + 3 \lambda_3) - (2 \lambda_1 + 6 \lambda_2 - 2 \lambda_3)$

$\lambda_2 = -5 \lambda_3$

In $I$ einsetzen:

$\lambda_1  + 3(-5 \lambda_3) - \lambda_3$

$\lambda_1 = 16 \lambda_3$

$\lambda_3 + 16 \lambda_1 - 5 \lambda_2 = 0$

$\lambda_3 = 5 \lambda_1 - 16 \lambda_3$

In $\mathbb{Q}^2$ können höchstens zwei Vektoren linear unabhängig sein. Die Menge $\{u, v, w\}$ enthält drei Vektoren, also ist sie linear abhängig und keine Basis.

(c)

$\lambda_1 \cdot f + \lambda_2 \cdot g + \lambda_3 \cdot h = 0$

$\lambda_1 \cdot (X + 1) + \lambda_2 (X^2 + 3X + 2) + \lambda_3 \cdot (X^3 - X + 7) = 0$

$\lambda_3 X^3 + \lambda_2 X^2 + X \cdot (\lambda_1 + 3 \lambda_2 - \lambda_3) + (\lambda_1 + 2 \lambda_2 + 7 \lambda_3) = 0$

1. $\lambda_3 = 0$
2. $\lambda_2 = 0$
3. $\lambda_1 + 3 \lambda_2 - \lambda_3 = 0$
4. $\lambda_1 + 2 \lambda_2 + 7 \lambda_3 = 0$

=> $\lambda_1 = \lambda_2 = \lambda_3 = 0$, deshalb sind die Polynome linear unabhängig.

Es kann auch keine Basis sein, da es nur 3 Vektoren für eine Dimension 4 sind.

---

2.

(a) 

$v_4 = v_3 - 3v_1$ 

Für die Basis muss dementsprechend einer dieser 3 Vektoren weggelassen werden.

(b)

$w = v_3 - v_2$

(c)

Nach dem Basisaustauschsatz können wir in $\mathcal{B} = \{v_1, v_2, v_3\}$ entweder $v_2$ oder $v_3$ durch $w$ ersetzen, da

$$
w = \lambda_2 v_2 + \lambda_3 v_3 \quad \text{mit} \quad \lambda_2 = -1 \neq 0, \space \lambda_3 = 1 \neq 0
$$

Damit ist z.B.

$$
\mathcal{B}' = \{v_1, v_2, w\}
$$

eine Basis von $lin(v_1, v_2, v_3, v_4)$, die $w$ enthält.

---

3.

(a)

Für eine lineare Abbildung:

Additiv:

$$
f((x_1, y_1), (x_2, y_2)) \stackrel{!}{=} f((x_1, y_1)) + f((x_2, y_2))
$$

Linke Seite:

$$
f((x_1 + x_2, y_1 + y_2)) = (3(x_1 + x_2) + 2(y_1 + y_2), -2(x_1 + x_2))
$$

Rechte Seite:

$$
(3x_1 + 2y_1, -2x_1) + (3x_2 + 2y_2, -2x_2) = (3x_1 + 2y_1 + 3x_2 + 2y_2, -2x_1-2x_2)
$$

Multiplikativ/Homogenität:

$$
f(\lambda \cdot (x,y)) = \lambda \cdot f((x,y))
$$

Linke Seite:

$$
f(\lambda \cdot (x,y)) = f((\lambda x, \lambda y)) = (3 \lambda x + 2 \lambda y, -2 \lambda x)
$$

Rechte Seite:

$$
\lambda \cdot f((x,y)) = \lambda \cdot (3x + 2y, -2x) = (3 \lambda x + 2 \lambda y, -2 \lambda x)
$$

Es handelt sich um eine lineare Abbildung, da Additivität und Homogenität gegeben ist.

(b)

$\sqrt{3} \notin \mathbb{Q}$. Die Abbildung ist nich wohldefiniert. Deshlab müssen wir auch nicht weiter auf Linearität prüfen

---

4.

Zu zeigen: $f: V \to W$ ist genau dann linear, wenn für alle $v, v' \in V$ und $\lambda, \mu \in K$ gilt

$$
f(\lambda v + \mu v') = \lambda f(v) + \mu f(v')
$$

**"$\Rightarrow$"**

Sei $f$ linear. Dann gilt wegen Additivität und Homogenität

$$
f(\lambda v + \mu v') = f(\lambda v) + f(\mu v') = \lambda f(v) + \mu f(v')
$$

**"$\Leftarrow$"**

Sei umgekehrt $f(\lambda v + \mu v') = \lambda f(v) + \mu f(v')$ für alle $v, v' \in V$ und $\lambda, \mu \in K$. Wir zeigen Additivität und Homogenität.

Additivität: Setze $\lambda = \mu = 1$. Dann gilt für alle $v, v' \in V$

$$
f(v + v') = f(1 \cdot v + 1 \cdot v') = 1 \cdot f(v) + 1 \cdot f(v') = f(v) + f(v')
$$

Homogenität: Setze $\mu = 0$ und $v' = 0$. Dann gilt für alle $\lambda \in K$ und $v \in V$

$$
f(\lambda v) = f(\lambda v + 0 \cdot 0) = \lambda f(v) + 0 \cdot f(0) = \lambda f(v)
$$

Damit ist $f$ additiv und homogen, also linear. $\square$

---

5.

Sei $f: V \to W$ eine $K$-lineare Abbildung. Zu zeigen: $ker(f) \subseteq V$ und $im(f) \subseteq W$ sind Untervektorräume.

(a) $ker(f)$ ist Untervektorraum von $V$

Per Definition gilt

$$
ker(f) = \{v \in V | f(v) = 0\}
$$

$0 \in ker(f)$: Da $f$ linear ist, gilt $f(0) = 0$, also $0 \in ker(f)$ und damit $ker(f) \neq \emptyset$.

Abschluss unter Addition: Seien $v, v' \in ker(f)$, also $f(v) = 0$ und $f(v') = 0$. Dann gilt

$$
f(v + v') = f(v) + f(v') = 0 + 0 = 0
$$

also $v + v' \in ker(f)$.

Abschluss unter Skalarmultiplikation: Sei $v \in ker(f)$ und $\lambda \in K$. Dann gilt

$$
f(\lambda v) = \lambda f(v) = \lambda \cdot 0 = 0
$$

also $\lambda v \in ker(f)$. Damit ist $ker(f)$ ein Untervektorraum von $V$.

(b) $im(f)$ ist Untervektorraum von $W$

Per Definition gilt

$$
im(f) = \{w \in W | \exists v \in V: f(v) = w\} = f(V)
$$

$0 \in im(f)$: Da $f(0) = 0$ gilt, wird $0$ getroffen, also $0 \in im(f)$.

Abschluss unter Addition: Seien $w, w' \in im(f)$. Dann gibt es $v, v' \in V$ mit $f(v) = w$ und $f(v') = w'$. Wegen der Linearität gilt

$$
w + w' = f(v) + f(v') = f(v + v') \in im(f)
$$

Abschluss unter Skalarmultiplikation: Sei $w \in im(f)$ und $\lambda \in K$. Dann existiert $v \in V$ mit $f(v) = w$ und es gilt

$$
\lambda w = \lambda f(v) = f(\lambda v) \in im(f)
$$

Also ist $im(f)$ ein Untervektorraum von $W$. $\square$
