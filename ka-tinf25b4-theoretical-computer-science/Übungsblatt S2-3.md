# Übungsblatt 3

[ti-ii-blatt-03.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=455970)

---

1.

Wenn die Länge des Arrays um einen Faktor skaliert wird, dann ist diese Skalierung im unendlichen Bereich ebenfalls Unendlich. Einfach gesagt: Je mehr Elemente eingefügt werden, desto weniger oft muss das Array erweitert werden. Im Sinne der Unendlichkeit würde das Array dann also gar nicht mehr erweitert werden, sondern die Elemente nur hinzugefügt werden, was mit konstanter Zeit $\Theta(1)$ funktioniert.

---

2.

$A_1$:

$V = (3,2,1,4,9)$

$C = (3,1,3,2,5)$

$R = (1,2,4,4,5,6)$

$$
A_2 = \begin{pmatrix}
0 & 8 & 0 & 0 & 0 \\
0 & 0 & 0 & 0 & 2 \\
0 & 0 & 0 & 9 & 0 \\
0 & 0 & 0 & 0 & 0 \\
1 & 0 & 0 & 7 & 0 \\
\end{pmatrix}
$$

---

3.

Matrix vorbereiten:

$$
x_r = 
\begin{pmatrix}
V_1 \cdot x_{C_1} + V_2 \cdot x_{C_2} \\
0 \\
V_3 \cdot x_{C_3} \\
V_4 \cdot x_{C_4}
V_5 \cdot x_{C_5}
\end{pmatrix} =
\begin{pmatrix}
7 \cdot x_2 + 9 \cdot x_4 \\
0 \\
-6 \cdot x_3 \\
2 \cdot x_1 \\
-3 \cdot x_5
\end{pmatrix}
$$

für $x^{(1)}$:

$$
y = \begin{pmatrix}
7 \cdot 2 + 9 \cdot 4 \\
0 \\
-6 \cdot 3 \\
2 \cdot 1 \\
-3 \cdot 5
\end{pmatrix} = 
\begin{pmatrix}
50 \\
0 \\
-18 \\
2 \\
-15
\end{pmatrix}
$$

für $x^{(2)}$:

$$
y = 
\begin{pmatrix}
7 \cdot 0 + 9 \cdot 1 \\
0 \\
-6 \cdot (-2) \\
2 \cdot 1 \\
-3 \cdot 3
\end{pmatrix} = 
\begin{pmatrix}
9 \\
0 \\
12 \\
2 \\
-9
\end{pmatrix}
$$

für $x^{(3)}$:

$$
y = 
\begin{pmatrix}
7 \cdot (-1) + 9 \cdot 0 \\
0 \\
-6 \cdot 3 \\
2 \cdot 2 \\
-3 \cdot 2
\end{pmatrix} =
\begin{pmatrix}
-7 \\
0 \\
-18 \\
4 \\
-6
\end{pmatrix}
$$

Die normale Matrixvektormultiplikation hat etwa $n^2$ (n = Anzahl Elemente) Laufzeit und die CRS Matrixvektormultiplikation nur $n$ (n = Anzahl nicht Null Elemente). Das macht die beiden n nicht vergleichbar.

---

4.

Vereinigung:

```
Input1 = [...]
Input2 = [...]

Ergebnis = []

for Element in Input1 + Input2:
  found = false
  for Needle in Ergebnis:
    if Element == Needle:
      found = true
  if !found:
    Ergebnis + Element

return Ergebnis
```

Schnitt:

```
Input1 = [...]
Input2 = [...]

Ergebnis = []

for Element1 in Input1:
  for Element2 in Input2:
    if Element1 == Element2:
      Ergebnis + Element1

return Ergebnis
```

Differenz:

```
Input1 = [...]
Input2 = [...]

Ergebnis = Input1

for Element in Input2:
  for Needle in Ergebnis:
    if Element == Needle:
      Ergebnis - Needle

return Ergebnis
```