# Übungsblatt 5

[Uebung5.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=407682)

[Symbolab Determinantenrechner](https://www.symbolab.com/solver/matrix-determinant-calculator)

[Web 2.0 Rechner](https://web2.0rechner.de/)

[Matrix Calc - LGS Solver](https://www.matrixcalc.org/de/slu.html)

---

1.

(a)

$$
\begin{align*}
det
\begin{pmatrix}
-1 & 0  & -3 & 1  \\
2  & -1 & 1  & -2 \\
3  & 0  & 2  & -1 \\
-1 & 7  & -3 & 5  \\
\end{pmatrix} &= -det
\begin{pmatrix}
2  & -1 & 1  & -2 \\
-1 & 0  & -3 & 1  \\
3  & 0  & 2  & -1 \\
-1 & 7  & -3 & 5  \\
\end{pmatrix} \\
&= det\begin{pmatrix}
-1 & 2  & 1  & -2 \\
0  & -1 & -3 & 1  \\
0  & 3  & 2  & -1 \\
7  & -1 & -3 & 5  \\
\end{pmatrix} \\
&= det \begin{pmatrix}
-1 & 2  & 1  & -2 \\
0  & -1 & -3 & 1  \\
0  & 3  & 2  & -1 \\
0  & 13 & 4  & -9  \\
\end{pmatrix} \\
&= (-1)^{1+1}\cdot (-1) \cdot det
\begin{pmatrix}
-1 & -3 & 1  \\
3  & 2  & -1 \\
13 & 4  & -9  \\
\end{pmatrix} \\
&= -det
\begin{pmatrix}
-1 & -3 & 1  \\
3  & 2  & -1 \\
13 & 4  & -9  \\
\end{pmatrix} \\
&= -( \\
&\hspace{2cm}(-1)\cdot 2 \cdot (-9) + \\
&\hspace{2cm}(-3)(-1) \cdot 13 + \\
&\hspace{2cm}1 \cdot 3 \cdot 4 - \\
&\hspace{2cm}13 \cdot 2 \cdot 1 - \\
&\hspace{2cm} 4 \cdot (-1)(-1) - \\
&\hspace{2cm}(-9) \cdot 3 \cdot (-3) \\
&\quad\quad) \\
&= -(18 + 39 + 12 - 26 - 4 - 81) \\
&= 42
\end{align*}
$$

(b)

$$
\begin{align*}
det \begin{pmatrix}
1 & 0 & 5 & 3  \\
1 & 2 & 2 & 1  \\
0 & 1 & 3 & 1  \\
4 & 0 & 2 & -3 \\ 
\end{pmatrix} &= -det
\begin{pmatrix}
0 & 1 & 3 & 1  \\
1 & 2 & 2 & 1  \\
1 & 0 & 5 & 3  \\
4 & 0 & 2 & -3 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
1 & 0 & 3 & 1  \\
2 & 1 & 2 & 1  \\
0 & 1 & 5 & 3  \\
0 & 4 & 2 & -3 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
1 & 0 & 3  & 1  \\
0 & 1 & -4 & -1 \\
0 & 1 & 5  & 3  \\
0 & 4 & 2  & -3 \\ 
\end{pmatrix} \\
&= (-1)^{1+1} \cdot 1 \cdot det
\begin{pmatrix}
1 & -4 & -1 \\
1 & 5  & 3  \\
4 & 2  & -3 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
1 & -4 & -1 \\
1 & 5  & 3  \\
4 & 2  & -3 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
1 & -4 & -1 \\
0 & 9  & 4  \\
4 & 2  & -3 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
1 & -4 & -1 \\
0 & 9  & 4  \\
0 & 18 & 1 \\ 
\end{pmatrix} \\
&= det
\begin{pmatrix}
9  & 4  \\
18 & 1 \\ 
\end{pmatrix} \\
&= 9 \cdot 1 - 18 \cdot 4 \\
&= -63
\end{align*}
$$

(c)

$$
\begin{align*}
det \begin{pmatrix}
1  & 0 & 3 & 4 \\
-2 & 1 & 0 & 3 \\
1  & 4 & 1 & 5 \\
0  & 2 & 2 & 0 \\
\end{pmatrix} 
&= det \begin{pmatrix}
1  & 0 & 3  & 4  \\
0  & 1 & 6  & 11 \\
0  & 4 & -2 & 1  \\
0  & 2 & 2  & 0  \\
\end{pmatrix} \\
&= det \begin{pmatrix}
1 & 6  & 11 \\
4 & -2 & 1  \\
2 & 2  & 0  \\
\end{pmatrix} \\
&= det \begin{pmatrix}
1 & 6   & 11  \\
0 & -26 & -43 \\
0 & -10 & -22 \\
\end{pmatrix} \\
&= det \begin{pmatrix}
-26 & -43 \\
-10 & -22 \\
\end{pmatrix} \\
&= (-26)(-22) - (-10)(-43) \\
&= 572 - 430 \\
&= 142
\end{align*}
$$

---

2.

(a)

$$
\displaylines{
\left(
\begin{array}{ccc|c}
1  & 2 & -4 & -1 \\
-3 & 1 & 5  & 3  \\
0  & 7 & 10 & 17 \\
\end{array}
\right)
\quad \text{II} + 3 \cdot \text{I} \\
\left(
\begin{array}{ccc|c}
1 & 2 & -4 & -1 \\
0 & 7 & -7 & 0  \\
0 & 7 & 10 & 17 \\
\end{array}
\right)
\quad \text{III} - \text{II} \\
\left(
\begin{array}{ccc|c}
1 & 2 & -4 & -1 \\
0 & 7 & -7 & 0  \\
0 & 0 & 17 & 17 \\
\end{array}
\right) 
\quad \text{III} : 17 \\
\left(
\begin{array}{ccc|c}
1 & 2 & -4 & -1 \\
0 & 7 & -7 & 0  \\
0 & 0 & 1 & 1 \\
\end{array}
\right)
\quad \text{II} + 7 \cdot \text{III} \\
\left(
\begin{array}{ccc|c}
1 & 2 & -4 & -1 \\
0 & 7 & 0 & 7  \\
0 & 0 & 1 & 1 \\
\end{array}
\right)
\quad \text{II} : 7 \\
\left(
\begin{array}{ccc|c}
1 & 2 & -4 & -1 \\
0 & 1 & 0 & 1  \\
0 & 0 & 1 & 1 \\
\end{array}
\right)
\quad \text{I} - 2 \cdot \text{II} \\
\left(
\begin{array}{ccc|c}
1 & 0 & -4 & -3 \\
0 & 1 & 0 & 1  \\
0 & 0 & 1 & 1 \\
\end{array}
\right)
\quad \text{I} + 4 \cdot \text{III} \\
\left(
\begin{array}{ccc|c}
1 & 0 & 0 & 1 \\
0 & 1 & 0 & 1  \\
0 & 0 & 1 & 1 \\
\end{array}
\right)
}
$$

$x_1 = x_2 = x_3 = 1$

(b)

Gegeben ist folgendes Gleichungssystem:

$$
\left(
\begin{array}{cccc|c}
1  & 1      & a-1   & -1 & a + 2 \\
2  & 2a     & a + 2 & 1  & a + 2 \\
-1 & 1 - 2a & a - 3 & -2 & a - 1 \\
1  & a      & 1     & 1  & 1     \\
\end{array}
\right)
$$

I. für $a = 0$:

$$
\displaylines{
\left(
\begin{array}{cccc|c}
1  & 1 & -1 & -1 & 2  \\
2  & 0 &  2 & 1  & 2  \\
-1 & 1 & -3 & -2 & -1 \\
1  & 0 & 1  & 1  & 1  \\
\end{array}
\right) \quad \text{IV} \cdot 2 \\
\left(
\begin{array}{cccc|c}
1  & 1 & -1 & -1 & 2  \\
2  & 0 &  2 & 1  & 2  \\
-1 & 1 & -3 & -2 & -1 \\
2  & 0 & 2  & 2  & 2  \\
\end{array}
\right) \quad \text{IV} - \text{II} \\
\left(
\begin{array}{cccc|c}
1  & 1 & -1 & -1 & 2  \\
2  & 0 &  2 & 1  & 2  \\
-1 & 1 & -3 & -2 & -1 \\
0  & 0 &  0 & 1  & 0  \\
\end{array}
\right) \quad \text{II} - 2 \cdot \text{I} \\
\left(
\begin{array}{cccc|c}
1  & 1  & -1 & -1 & 2  \\
0  & -2 &  4 & 3  & -2 \\
-1 & 1  & -3 & -2 & -1 \\
0  & 0  &  0 & 1  & 0  \\
\end{array}
\right) \quad \text{III} + \text{I} \\
\left(
\begin{array}{cccc|c}
1  & 1  & -1 & -1 & 2  \\
0  & -2 &  4 & 3  & -2 \\
0  & 2  & -4 & -3 & 1  \\
0  & 0  &  0 & 1  & 0  \\
\end{array}
\right) \quad \text{II} \cdot (-1) \\
\left(
\begin{array}{cccc|c}
1  & 1  & -1 & -1 & 2  \\
0  & 2  & -4 & -3 & 2 \\
0  & 2  & -4 & -3 & 1  \\
0  & 0  &  0 & 1  & 0  \\
\end{array}
\right) \\
\\
2x_2 - 4x_3 - 3x_4 = 2 \\
2x_2 - 4x_3 - 3x_4 = 1 \\
\\
2x_2 - 4x_3 - 3x_4 - 2 = 0 \\
2x_2 - 4x_3 - 3x_4 - 1 = 0 \\
\\
2x_2 - 4x_3 - 3x_4 - 2 = 2x_2 - 4x_3 - 3x_4 - 1 \\
-2 \neq -1
}
$$

Daher nicht lösbar.

II. $a = 1$:

$$
\displaylines{
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & -1 & 3 \\
2  & 2  & 3  & 1  & 3 \\
-1 & -1 & -2 & -2 & 0 \\
1  & 1  & 1  & 1  & 1 \\
\end{array}
\right) \quad \text{II} - 2 \cdot \text{I}, \text{III} + \text{I}, \text{IV} - \text{I} \\
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & -1 & 3  \\
0  & 0  & 3  & 3  & -3 \\
0  & 0  & -2 & -3 & 3  \\
0  & 0  & 1  & 2  & -2 \\
\end{array} 
\right) \quad \text{II} + \text{III} \\
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & -1 & 3  \\
0  & 0  & 1  & 0  & 0 \\
0  & 0  & -2 & -3 & 3  \\
0  & 0  & 1  & 2  & -2 \\
\end{array} 
\right) \quad \text{IV} - \text{II} \\
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & -1 & 3  \\
0  & 0  & 1  & 0  & 0 \\
0  & 0  & -2 & -3 & 3  \\
0  & 0  & 0  & 2  & -2 \\
\end{array} 
\right) \quad \not\text{III}, \text{IV} : 2 \\
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & -1 & 3  \\
0  & 0  & 1  & 0  & 0 \\
0  & 0  & 0  & 1  & -1 \\
\end{array} 
\right) \quad \text{I} + \text{III} \\
\left(
\begin{array}{cccc|c}
1  & 1  & 0  & 0 & 2  \\
0  & 0  & 1  & 0  & 0 \\
0  & 0  & 0  & 1  & -1 \\
\end{array} 
\right)
}
$$

- $x_1 + x_2 = 2$
- $x_1 = 2 - x_2$
- $x_2 = 2 - x_1$
- $x_3 = 0$
- $x_4 = -1$

III. $a \neq 0, 1$:

Wir eliminieren zunächst allgemein in Spalte 1:

$$
\displaylines{
\left(
\begin{array}{cccc|c}
1  & 1      & a-1   & -1 & a + 2 \\
2  & 2a     & a + 2 & 1  & a + 2 \\
-1 & 1 - 2a & a - 3 & -2 & a - 1 \\
1  & a      & 1     & 1  & 1     \\
\end{array}
\right) \quad \text{II} - 2 \cdot \text{I}, \text{III} + \text{I}, \text{IV} - \text{I} \\
\left(
\begin{array}{cccc|c}
1 & 1      & a-1    & -1 & a + 2  \\
0 & 2a - 2 & 4 - a  & 3  & -a - 2 \\
0 & 2 - 2a & 2a - 4 & -3 & 2a + 1 \\
0 & a - 1  & 2 - a  & 2  & -a - 1 \\
\end{array}
\right) \quad \text{III} + \text{II}, \space 2 \cdot \text{IV} - \text{II} \\
\left(
\begin{array}{cccc|c}
1 & 1        & a-1   & -1 & a + 2  \\
0 & 2(a - 1) & 4 - a & 3  & -a - 2 \\
0 & 0        & a     & 0  & a - 1  \\
0 & 0        & -a    & 1  & -a     \\
\end{array}
\right) \quad \text{IV} + \text{III} \\
\left(
\begin{array}{cccc|c}
1 & 1        & a-1   & -1 & a + 2  \\
0 & 2(a - 1) & 4 - a & 3  & -a - 2 \\
0 & 0        & a     & 0  & a - 1  \\
0 & 0        & 0     & 1  & -1     \\
\end{array}
\right)
}
$$

Da $a \neq 0$ und $a \neq 1$, dürfen wir die Pivots normieren ($\text{II} : 2(a-1)$, $\text{III} : a$). Es gibt in jeder Spalte eine Stufe und in der letzten Spalte keine zusätzliche Stufe, das System ist also eindeutig lösbar. Rückwärtseinsetzen liefert

$$
\begin{align*}
x_4 &= -1 \\
x_3 &= \frac{a - 1}{a} \\
x_2 &= -\frac{2}{a} \\
x_1 &= \frac{3a + 1}{a}
\end{align*}
$$

Also gilt für $a \neq 0, 1$

$$
Loes(A,b) = \left\{
\begin{pmatrix}
\frac{3a+1}{a} \\ -\frac{2}{a} \\ \frac{a-1}{a} \\ -1
\end{pmatrix}
\right\}
$$

Für $a = 1$ (Fall II) lautet die Lösungsmenge entsprechend

$$
Loes(A,b) =
\begin{pmatrix}
3 \\ 0 \\ 0 \\ -1
\end{pmatrix}
+ lin \left\{
\begin{pmatrix}
1 \\ -1 \\ 0 \\ 0
\end{pmatrix}
\right\}
$$

also unendlich viele Lösungen, und für $a = 0$ (Fall I) ist das System nicht lösbar.

---

3.

(a)

$$
A = \begin{pmatrix}
-1 & 3 & 42 \\
0  & 3 & 7  \\
0  & 0 & 2  \\
\end{pmatrix}
$$

Die Eigenwerte sind die Nullstellen des charakteristischen Polynoms $\chi_A(T) = det(TE_3 - A)$:

$$
TE_3 - A = \begin{pmatrix}
T + 1 & -3    & -42   \\
0     & T - 3 & -7    \\
0     & 0     & T - 2 \\
\end{pmatrix}
$$

Entwicklung nach der 1. Spalte (nur $a_{11} = T + 1$ ist ungleich 0):

$$
\begin{align*}
\chi_A(T) &= (T + 1) \cdot (-1)^{1+1} \cdot det \begin{pmatrix}
T - 3 & -7    \\
0     & T - 2 \\
\end{pmatrix} \\
&= (T + 1)\big((T-3)(T-2) - (-7) \cdot 0\big) \\
&= (T + 1)(T - 3)(T - 2)
\end{align*}
$$

Die Nullstellen und damit die Eigenwerte sind

$$
\lambda_1 = -1, \quad \lambda_2 = 3, \quad \lambda_3 = 2
$$

(b)

$$
B = \begin{pmatrix}
0 & 0 & 2 \\
0 & 1 & 0 \\
2 & 0 & 0 \\
\end{pmatrix}
\quad\Rightarrow\quad
TE_3 - B = \begin{pmatrix}
T  & 0     & -2 \\
0  & T - 1 & 0  \\
-2 & 0     & T  \\
\end{pmatrix}
$$

Entwicklung nach der 2. Zeile (nur $a_{22} = T - 1$ ist ungleich 0):

$$
\begin{align*}
\chi_B(T) &= (T - 1) \cdot (-1)^{2+2} \cdot det \begin{pmatrix}
T  & -2 \\
-2 & T  \\
\end{pmatrix} \\
&= (T - 1)\big(T \cdot T - (-2)(-2)\big) \\
&= (T - 1)(T^2 - 4) \\
&= (T - 1)(T - 2)(T + 2)
\end{align*}
$$

Also gilt $\lambda \in \{1, 2, -2\}$.

---

4.

$$
M := \begin{pmatrix}
1  & -1 & 1 \\
0  & 2  & 0 \\
-2 & -2 & 4 \\
\end{pmatrix} \in M_3(\mathbb{Q})
$$

(a)

$$
TE_3 - M = \begin{pmatrix}
T - 1 & 1     & -1    \\
0     & T - 2 & 0     \\
2     & 2     & T - 4 \\
\end{pmatrix}
$$

Entwicklung nach der 2. Zeile (nur $a_{22} = T - 2$ ist ungleich 0):

$$
\begin{align*}
\chi_M(T) &= (T - 2) \cdot (-1)^{2+2} \cdot det \begin{pmatrix}
T - 1 & -1    \\
2     & T - 4 \\
\end{pmatrix} \\
&= (T - 2)\big((T-1)(T-4) - (-1) \cdot 2\big) \\
&= (T - 2)(T^2 - 5T + 4 + 2) \\
&= (T - 2)(T^2 - 5T + 6) \\
&= (T - 2)^2 (T - 3)
\end{align*}
$$

Die Nullstellen sind $T = 2$ (doppelt) und $T = 3$, die Eigenwerte von $M$ sind also $2$ (algebraische Vielfachheit 2) und $3$.

(b)

Die Eigenräume sind die Lösungsräume der homogenen Systeme $(\lambda E_3 - M)x = 0$.

**Eigenraum zu $\lambda = 2$**

$$
2E_3 - M = \begin{pmatrix}
1 & 1 & -1 \\
0 & 0 & 0  \\
2 & 2 & -2 \\
\end{pmatrix}
$$

$$
\displaylines{
\left(
\begin{array}{ccc|c}
1 & 1 & -1 & 0 \\
0 & 0 & 0  & 0 \\
2 & 2 & -2 & 0 \\
\end{array}
\right) \quad \text{III} - 2 \cdot \text{I} \\
\left(
\begin{array}{ccc|c}
1 & 1 & -1 & 0 \\
0 & 0 & 0  & 0 \\
0 & 0 & 0  & 0 \\
\end{array}
\right)
}
$$

Es bleibt die Gleichung $x_1 + x_2 - x_3 = 0$, also $x_1 = -x_2 + x_3$. Mit $x_2 = s$ und $x_3 = t$ folgt

$$
E_2 = ker(2E_3 - M) = lin \left\{
\begin{pmatrix}
1 \\ -1 \\ 0
\end{pmatrix},
\begin{pmatrix}
-1 \\ 0 \\ -1
\end{pmatrix}
\right\}
$$

**Eigenraum zu $\lambda = 3$**

$$
3E_3 - M = \begin{pmatrix}
2 & 1 & -1 \\
0 & 1 & 0  \\
2 & 2 & -1 \\
\end{pmatrix}
$$

$$
\displaylines{
\left(
\begin{array}{ccc|c}
2 & 1 & -1 & 0 \\
0 & 1 & 0  & 0 \\
2 & 2 & -1 & 0 \\
\end{array}
\right) \quad \text{III} - \text{I}, \text{dann } \text{III} - \text{II} \\
\left(
\begin{array}{ccc|c}
2 & 1 & -1 & 0 \\
0 & 1 & 0  & 0 \\
0 & 0 & 0  & 0 \\
\end{array}
\right) \quad \text{I} : 2, \text{dann } \text{I} - \frac{1}{2}\text{II} \\
\left(
\begin{array}{ccc|c}
1 & 0 & -\frac{1}{2} & 0 \\
0 & 1 & 0            & 0 \\
0 & 0 & 0            & 0 \\
\end{array}
\right)
}
$$

Also $x_2 = 0$ und $x_1 = \frac{1}{2}x_3$. Mit $x_3 = 2$ folgt

$$
E_3 = ker(3E_3 - M) = lin \left\{
\begin{pmatrix}
1 \\ 0 \\ 2
\end{pmatrix}
\right\}
$$

(c)

Als Spalten von $S^{-1}$ nehmen wir Eigenvektoren in der Reihenfolge der Eigenwerte $2, 2, 3$:

$$
S^{-1} = \begin{pmatrix}
-1 & 1  & 1 \\
0  & -1 & 0 \\
-1 & 0  & 2 \\
\end{pmatrix}, \quad
D = diag(2, 2, 3)
$$

Dann gilt $D = SMS^{-1}$.

---

5.

$$
M = \begin{pmatrix}
-1 & 3  & 3  \\
-3 & 5  & 3  \\
3  & -3 & -1 \\
\end{pmatrix}
$$

**Charakteristisches Polynom**

$$
TE_3 - M = \begin{pmatrix}
T + 1 & -3    & -3    \\
3     & T - 5 & -3    \\
-3    & 3     & T + 1 \\
\end{pmatrix}
$$

Entwicklung nach der 1. Zeile:

$$
\begin{align*}
\chi_M(T) &= (T+1) \big((T-5)(T+1) + 9\big) + 3(3T - 6) - 3(3T - 6) \\
&= (T+1) \big((T-5)(T+1) + 9\big) \\
&= (T+1)(T^2 - 4T + 4) \\
&= (T+1)(T-2)^2
\end{align*}
$$

Die Eigenwerte sind also $2$ (algebraische Vielfachheit 2) und $-1$.

**Eigenraum zu $\lambda = 2$**

$$
2E_3 - M = \begin{pmatrix}
3  & -3 & -3 \\
3  & -3 & -3 \\
-3 & 3  & 3  \\
\end{pmatrix}
$$

$\text{II} - \text{I}$ und $\text{III} + \text{I}$ liefern zwei Nullzeilen, nach $\text{I} : 3$ bleibt

$$
x_1 - x_2 - x_3 = 0 \quad\Leftrightarrow\quad x_1 = x_2 + x_3
$$

Mit $x_2 = s$, $x_3 = t$ folgt

$$
E_2 = ker(2E_3 - M) = lin \left\{
\begin{pmatrix}
1 \\ 1 \\ 0
\end{pmatrix},
\begin{pmatrix}
1 \\ 0 \\ 1
\end{pmatrix}
\right\}
$$

**Eigenraum zu $\lambda = -1$**

$$
-E_3 - M = \begin{pmatrix}
0  & -3 & -3 \\
3  & -6 & -3 \\
-3 & 3  & 0  \\
\end{pmatrix}
$$

$$
\displaylines{
\left(
\begin{array}{ccc|c}
0  & -3 & -3 & 0 \\
3  & -6 & -3 & 0 \\
-3 & 3  & 0  & 0 \\
\end{array}
\right) \quad \text{I} \leftrightarrow \text{II}, \text{dann } \text{III} + \text{I}, \text{III} - \text{II} \\
\left(
\begin{array}{ccc|c}
3 & -6 & -3 & 0 \\
0 & -3 & -3 & 0 \\
0 & 0  & 0  & 0 \\
\end{array}
\right) \quad \text{I} : 3, \text{II} : (-3), \text{dann } \text{I} + 2 \cdot \text{II} \\
\left(
\begin{array}{ccc|c}
1 & 0 & 1 & 0 \\
0 & 1 & 1 & 0 \\
0 & 0 & 0 & 0 \\
\end{array}
\right)
}
$$

Also $x_1 = -t$, $x_2 = -t$ mit $x_3 = t$ und damit

$$
E_{-1} = ker(-E_3 - M) = lin \left\{
\begin{pmatrix}
-1 \\ -1 \\ 1
\end{pmatrix}
\right\}
$$

**Diagonalisierung**

Es gibt insgesamt 3 linear unabhängige Eigenvektoren, $M$ ist also diagonalisierbar. Mit den Eigenvektoren in der Reihenfolge $2, 2, -1$ als Spalten von $S^{-1}$:

$$
S^{-1} = \begin{pmatrix}
1 & 1 & -1 \\
1 & 0 & -1 \\
0 & 1 & 1  \\
\end{pmatrix}, \quad
D = diag(2, 2, -1)
$$

Dann gilt $D = SMS^{-1}$.

---

6.

$$
M = \begin{pmatrix}
-2 & 1  & -1 \\
-1 & 0  & -1 \\
1  & -1 & 0  \\
\end{pmatrix}
$$

**Charakteristisches Polynom**

$$
TE_3 - M = \begin{pmatrix}
T + 2 & -1 & 1 \\
1     & T  & 1 \\
-1    & 1  & T \\
\end{pmatrix}
$$

Entwicklung nach der 1. Zeile:

$$
\begin{align*}
\chi_M(T) &= (T + 2)(T^2 - 1) + (T + 1) + (T + 1) \\
&= (T + 2)(T - 1)(T + 1) + 2(T + 1) \\
&= (T + 1)\big((T + 2)(T - 1) + 2\big) \\
&= (T + 1)(T^2 + T) \\
&= T(T + 1)^2
\end{align*}
$$

Die Nullstellen sind $T = 0$ und $T = -1$ (doppelt), die Eigenwerte sind also $0$ und $-1$ (algebraische Vielfachheit 2).

**Eigenraum zu $\lambda = 0$**

$$
0 \cdot E_3 - M = \begin{pmatrix}
2  & -1 & 1 \\
1  & 0  & 1 \\
-1 & 1  & 0 \\
\end{pmatrix}
$$

$$
\displaylines{
\left(
\begin{array}{ccc|c}
2  & -1 & 1 & 0 \\
1  & 0  & 1 & 0 \\
-1 & 1  & 0 & 0 \\
\end{array}
\right) \quad \text{I} \leftrightarrow \text{II}, \text{dann } \text{II} - 2 \cdot \text{I}, \text{III} + \text{I} \\
\left(
\begin{array}{ccc|c}
1 & 0  & 1  & 0 \\
0 & -1 & -1 & 0 \\
0 & 1  & 1  & 0 \\
\end{array}
\right) \quad \text{III} + \text{II}, \text{II} \cdot (-1) \\
\left(
\begin{array}{ccc|c}
1 & 0 & 1 & 0 \\
0 & 1 & 1 & 0 \\
0 & 0 & 0 & 0 \\
\end{array}
\right)
}
$$

Mit $x_3 = t$ folgt $x_1 = -t$ und $x_2 = -t$, also

$$
E_0 = ker(0 \cdot E_3 - M) = lin \left\{
\begin{pmatrix}
-1 \\ -1 \\ 1
\end{pmatrix}
\right\}
$$

**Eigenraum zu $\lambda = -1$**

$$
-E_3 - M = \begin{pmatrix}
1  & -1 & 1  \\
1  & -1 & 1  \\
-1 & 1  & -1 \\
\end{pmatrix}
$$

$\text{II} - \text{I}$ und $\text{III} + \text{I}$ liefern zwei Nullzeilen, es bleibt

$$
x_1 - x_2 + x_3 = 0 \quad\Leftrightarrow\quad x_1 = x_2 - x_3
$$

Mit $x_2 = s$, $x_3 = t$ folgt

$$
E_{-1} = ker(-E_3 - M) = lin \left\{
\begin{pmatrix}
1 \\ 1 \\ 0
\end{pmatrix},
\begin{pmatrix}
-1 \\ 0 \\ 1
\end{pmatrix}
\right\}
$$

**Diagonalisierung**

Es existieren 3 linear unabhängige Eigenvektoren, $M$ ist also diagonalisierbar. Mit den Eigenvektoren in der Reihenfolge $-1, -1, 0$:

$$
S^{-1} = \begin{pmatrix}
1 & -1 & -1 \\
1 & 0  & -1 \\
0 & 1  & 1  \\
\end{pmatrix}, \quad
D = diag(-1, -1, 0)
$$

Dann gilt $D = SMS^{-1}$.

---

7.

(a)

$$
M = \begin{pmatrix}
0 & 1 \\
1 & 0 \\
\end{pmatrix}
\quad\Rightarrow\quad
\chi_M(T) = det \begin{pmatrix}
T  & -1 \\
-1 & T  \\
\end{pmatrix} = T^2 - 1 = (T-1)(T+1)
$$

Die Eigenwerte sind $\lambda_1 = 1$ und $\lambda_2 = -1$.

Für $\lambda = 1$: $E_2 - M = \begin{pmatrix} 1 & -1 \\ -1 & 1 \end{pmatrix}$, also $x_1 - x_2 = 0$ und damit $v_1 = \begin{pmatrix} 1 \\ 1\end{pmatrix}$.

Für $\lambda = -1$: $-E_2 - M = \begin{pmatrix} -1 & -1 \\ -1 & -1 \end{pmatrix}$, also $x_1 = -x_2$ und damit $v_2 = \begin{pmatrix} 1 \\ -1\end{pmatrix}$.

$$
S^{-1} = \begin{pmatrix}
1 & 1  \\
1 & -1 \\
\end{pmatrix}, \quad
D = diag(1, -1)
$$

(b)

$$
M = \begin{pmatrix}
3 & 1 \\
0 & 2 \\
\end{pmatrix}
\quad\Rightarrow\quad
\chi_M(T) = det \begin{pmatrix}
T - 3 & -1    \\
0     & T - 2 \\
\end{pmatrix} = (T-3)(T-2)
$$

Da die Matrix obere Dreiecksform hat, ist die Determinante das Produkt der Diagonaleinträge. Die Eigenwerte sind $\lambda_1 = 3$ und $\lambda_2 = 2$.

Für $\lambda = 3$: $3E_2 - M = \begin{pmatrix} 0 & -1 \\ 0 & 1 \end{pmatrix}$, also $x_2 = 0$ und damit $v_1 = \begin{pmatrix} 1 \\ 0\end{pmatrix}$.

Für $\lambda = 2$: $2E_2 - M = \begin{pmatrix} -1 & -1 \\ 0 & 0 \end{pmatrix}$, also $x_1 = -x_2$ und damit $v_2 = \begin{pmatrix} 1 \\ -1\end{pmatrix}$.

$$
S^{-1} = \begin{pmatrix}
1 & 1  \\
0 & -1 \\
\end{pmatrix}, \quad
D = diag(3, 2)
$$

(c)

$$
M = \begin{pmatrix}
-2 & -2 & 1  \\
2  & 3  & -2 \\
0  & 0  & -1 \\
\end{pmatrix}
\quad\Rightarrow\quad
TE_3 - M = \begin{pmatrix}
T + 2 & 2     & -1    \\
-2    & T - 3 & 2     \\
0     & 0     & T + 1 \\
\end{pmatrix}
$$

Entwicklung nach der 3. Zeile:

$$
\begin{align*}
\chi_M(T) &= (T + 1) \cdot det \begin{pmatrix}
T + 2 & 2     \\
-2    & T - 3 \\
\end{pmatrix} \\
&= (T + 1)\big((T+2)(T-3) + 4\big) \\
&= (T + 1)(T^2 - T - 2) \\
&= (T + 1)(T - 2)(T + 1) \\
&= (T - 2)(T + 1)^2
\end{align*}
$$

Die Eigenwerte sind $2$ und $-1$ (algebraische Vielfachheit 2).

Für $\lambda = 2$:

$$
2E_3 - M = \begin{pmatrix}
4  & 2  & -1 \\
-2 & -1 & 2  \\
0  & 0  & 3  \\
\end{pmatrix}
$$

Aus der 3. Zeile folgt $x_3 = 0$, damit bleibt $4x_1 + 2x_2 = 0$, also $x_1 = -\frac{1}{2}x_2$. Mit $x_2 = 2$ folgt

$$
v_1 = \begin{pmatrix}
-1 \\ 2 \\ 0
\end{pmatrix}
$$

Für $\lambda = -1$:

$$
-E_3 - M = \begin{pmatrix}
1  & 2  & -1 \\
-2 & -4 & 2  \\
0  & 0  & 0  \\
\end{pmatrix}
$$

$\text{II} + 2 \cdot \text{I}$ liefert eine Nullzeile, es bleibt $x_1 + 2x_2 - x_3 = 0$, also $x_1 = -2x_2 + x_3$. Mit $x_2 = s$, $x_3 = t$ folgt

$$
v_2 = \begin{pmatrix}
-2 \\ 1 \\ 0
\end{pmatrix}, \quad
v_3 = \begin{pmatrix}
1 \\ 0 \\ 1
\end{pmatrix}
$$

Mit den Spalten $v_1, v_2, v_3$:

$$
S^{-1} = \begin{pmatrix}
-1 & -2 & 1 \\
2  & 1  & 0 \\
0  & 0  & 1 \\
\end{pmatrix}, \quad
D = diag(2, -1, -1)
$$

Dann gilt $D = SMS^{-1}$.
