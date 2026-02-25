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

$\roman{1} 3 \lambda_1 + 5 \lambda_2 = 0$

$\roman{2} 7 \lambda_1 + 9 \lambda_2 = 0$

$\roman{3} 2 \lambda_1 + 1 \lambda_2 = 0$

$\lambda_2$ in $I$:

3 l1 + 5(-2l1) = -7l1 = 0

=> l1 = 0

l1 in III:

l2 = -2l1 = -2 * 0 = 0

-> v,w sind linear unabhängig

Sie stellen keine Basis von Q3 dar.

TODO: richtig aufschreiben

(b)

TODO

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

$v_4 = v_3 - v_1$ 

Für die Basis muss dementsprechend einer dieser 3 Vektoren weggelassen werden.

(b)

$w = v_3 - v_2$

TODO: ist das fertig?

(c)

TODO

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

TODO