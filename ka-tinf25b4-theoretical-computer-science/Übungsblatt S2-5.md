# Übungsblatt 5

TODO

---

1.

[Geogebra](https://www.geogebra.org/calculator/fnkeakxt)

$$
\begin{align*}
p(x) &= 0 \cdot \frac{x-3}{1-3} \cdot \frac{x-5}{1-5} \cdot \frac{x-6}{1-6} \\
&-7 \cdot \frac{x-1}{3-1} \cdot \frac{x-5}{3-5} \cdot \frac{x-6}{3-6} \\
&-2 \cdot \frac{x-1}{5-1} \cdot \frac{x-3}{5-3} \cdot \frac{x-6}{5-6} \\
&+8 \cdot \frac{x-1}{6-1} \cdot \frac{x-3}{6-3} \cdot \frac{x-5}{6-5}
\end{align*}
$$

$$
p(-4) = 7
$$

$$
\begin{align*}
q(x) &= -2 \cdot \frac{x-2}{1-2} \cdot \frac{x-3}{1-3} \cdot \frac{x-9}{1-9} \\
&-3  \cdot \frac{x-1}{2-1} \cdot \frac{x-3}{2-3} \cdot \frac{x-9}{2-9} \\
&-4  \cdot \frac{x-1}{3-1} \cdot \frac{x-2}{3-2} \cdot \frac{x-9}{3-9} \\
&-10 \cdot \frac{x-1}{9-1} \cdot \frac{x-2}{9-2} \cdot \frac{x-3}{9-3}
\end{align*}
$$

$$
p(-7) = 6
$$

---

2.

Für binäre Suche:

$$
\frac{31 + 61}{2} = 46
$$

Für lineare Interpolation:

$$
l(x) = 31 \cdot \frac{x-59}{-11-59} + 61 \cdot \frac{x+11}{59+11}
$$

$l(31) = 49$

Für quadratische Interpolation:

$$
l(x) = 1\cdot \frac{(x+11)(x-59)}{(-53+11)(-53-59)}+31\cdot \frac{(x+53)(x-59)}{(-11+53)(-11-59)}+61\cdot \frac{(x+53)(x+11)}{(59+53)(59+11)}
$$

$l(31) = 52

---

3.

| Schritt | T           | MF          | FC          | Häufigkeit    |
| ------- | ----------- | ----------- | ----------- | ------------- |
| 1       | 1,2,3,4,6,5 | 6,2,3,4,5,1 | 6,1,2,3,4,5 | (0,0,0,0,0,1) |
| 2       | 2,1,3,4,6,5 | 2,6,3,4,5,1 | 6,2,1,3,4,5 | (0,1,0,0,0,1) |
| 3       | 2,1,3,4,5,6 | 5,6,3,4,2,1 | 6,2,5,1,3,4 | (0,1,0,0,1,1) |
| 4       | 2,1,3,4,5,6 | 2,6,3,4,5,1 | 2,6,5,1,3,4 | (0,2,0,0,1,1) |
| 5       | 1,2,3,4,5,6 | 1,6,3,4,5,2 | 2,6,5,1,3,4 | (1,2,0,0,1,1) |
| 6       | 1,2,3,4,5,6 | 1,6,3,4,5,2 | 2,1,6,5,3,4 | (2,2,0,0,1,1) |
| 7       | 2,1,3,4,5,6 | 2,6,3,4,5,1 | 2,1,6,5,3,4 | (2,3,0,0,1,1) |
| 8       | 2,1,4,3,5,6 | 4,6,3,2,5,1 | 2,1,6,5,4,3 | (2,3,0,1,1,1) |

---

4.

TODO

