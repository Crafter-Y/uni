# Übungsblatt 11

TODO

---

1.

| Zeile                        | Zeitaufwand     | Max. Aufrufe                 |
| ---------------------------- | --------------- | ---------------------------- |
| `Algorithm Compute(n)`       | -               | -                            |
| `  for j = 1 ... n do`       | $c_1$           | $n+1$                        |
| `    q(n)`                   | $c_q \cdot n$   | $n$                          |
| `    for k = 1 ... n * j do` | $c_2$           | $\sum_{j=1}^n (j \cdot n+1)$ |
| `      p(n)`                 | $\frac{c_p}{n}$ | $\sum_{j=1}^n (j \cdot n)$   |
| `    endfor`                 | -               | -                            |
| `  endfor`                   | -               | -                            |
| `endAlgorithm`               | -               | -                            |

$$
\begin{align*}
T(n) &= c_1 \cdot (n+1) \\
&+ c_q \cdot n \cdot n  \\
&+ c_2 \cdot \sum_{j=1}^n (j \cdot n+1) \\
&+ \frac{c_p}{n} \cdot \sum_{j=1}^n (j \cdot n) \\
&= c_1 \cdot (n+1) \\
&+ c_1 \cdot n^2 \\
&+ c_2 \cdot n \cdot \sum_{j=1}^n j + \sum_{j=1}^n 1 \\
&+ \frac{c_p}{n} \cdot n \cdot \sum_{j=1}^n j \\
&= c \cdot \Big( 1+ \frac{3}{2}n + 2n^2 + \frac{1}{2}n^3 \Big)
\end{align*}
$$

Für $c = max \{c_1, c_2, c_p, c_q\}$

$T(n) \in \Theta(n^3)$

---

2.

TODO

---

23.

$$
 (x^8+1) : (x^4+1) = x^4 + 1
-(x^8+x^4)
      x^4+1
    -(x^4+1)
           0
$$

- Ja, es handelt sich um ein Generatorpolynom

Codewort vorher: `1011 0000`

$$
x^7+x^5+x^4 : x^4+1 = x^3+x+1
-(x^7+x^3)
    x^5+x^4+x^3
  -(x^5+x)
        x^4+x^3+x
      -(x^4+1)
            x^3+x+1
$$

Codewort: `1011 1011`
