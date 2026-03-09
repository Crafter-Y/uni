# Übungsblatt 5

[Uebung5.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=407682)

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

TODO

---

TODO