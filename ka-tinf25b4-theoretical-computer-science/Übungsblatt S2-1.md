# Übungsblatt 1

[ti-ii-blatt-01.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=455966)

Dies ist der Start des 2. Semesters. Die Übungsblätter sind auch hier wieder von 1 an nummeriert. 

---

1.

a)

Due kürzeste Laufzeit wird erreicht, wenn das Array bereits sortiert ist und die längste Laufzeit, wenn es genau falsch herum sortiert ist.

b)

<table>
<tr>
<th>Implementation</th>
<th>best</th>
<th>worst</th>
</tr>
<tr>
<td>
<pre>
1: Algorithmus Bubblesort(A, n)
2:   i = n
3:   repeat
4:     swapped = false
5:     for j = 1 ... i − 1 do
6:       if A[j] > A[j + 1] then
7:         swap A[j], A[j + 1]
8:         swapped = true
9:     i = i − 1
10:  until i < 2 or swapped == false
</pre>
</td>
<td>
<pre>
-
1
- ?
1
n
n-1
-
-
1
1
</pre>
</td>
<td>
<pre>
-
1
- ?
n-1
$\frac{n^2}{2} + \frac{n}{n} - 1$
$\frac{n^2}{2} - \frac{n}{n}$
$\frac{n^2}{2} - \frac{n}{n}$
$\frac{n^2}{2} - \frac{n}{n}$
n-1
n-1
</pre>
</td>
</tr></table>


$A_{best} = 1+1+n+(n-1)+1+1 = 2n + 3$

$a_{worst} = 1+(n-1)+(\frac{n^2}{2} + \frac{n}{n} - 1)+3(\frac{n^2}{2} - \frac{n}{n})+2(n-1) = 2n^2-2n-3$

> In den Lösungen wurde eine Zeiteinheit für `repeat` angegeben. Das erscheint mir falsch, da es sich ja nur im ein Label handelt und keine Operation in dieser Zeile durch geführt wird. Die Aufgabenstellung gibt vor, diese Zeile einmal mit einzuberechnen. Das erscheint mir sinnlos.

c)

$T_{best} = \Theta(n)$

$T_{worst} = \Theta(n^2)$

$T(n) \in \Theta(n) \cap \Theta(n^2)$

---

2.

<table>
<tr>
<th>Implementation</th>
<th>Zeit</th>
<th>Multiplikator</th>
</tr>
<tr>
<td><pre>
1: Algorithmus Compute(n)
2:   p(n);
3:   for j = 1 ... n do
4:     for k = 1 ... j do
5:       q(n);
</pre></td>
<td><pre>
-
$c \cdot n^2$
c
c
$c \cdot log(n)$
</pre></td>
<td><pre>
-
1
n+1
$\sum_{j=1}^n (j+1)$
$\sum_{j=1}^n j$
</pre></td>
</tr>
</table>

$$
\begin{align*}
n^2+(n+1)+(\sum_{j=1}^n (j+1))+log(n) \cdot (\sum_{j=1}^n j) =\\
n^2+(n+1)+(\frac{n^2}{2} + \frac{3}{2}n + \frac{1}{2})+log(n) \cdot (\frac{n^2}{2} + \frac{n}{2}) =\\
\frac{3}{2}n^2 + \frac{5}{2}n + \frac{3}{2} + \frac{1}{2}log(n) \cdot n^2 + \frac{1}{2} log(n) \cdot n
\end{align*}
$$

$T(n) \in \Theta(log(n) \cdot n^2)$

---

3.

TODO

