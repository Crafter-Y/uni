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

III.

TODO

---

TODO