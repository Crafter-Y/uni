# Übungsblatt 10

[ti-ii-blatt-10.pdf]()

---

1.

Wegen modulo 10 tauchen einzelne Fehler oft auch schon nicht auf und manche Vertauschungen ebenfalls nicht. Deshalb ist das nicht geeignet. 

TODO: idk

---

2.

a)

Die erste Matrix hat einen Fehler in Zeile 2, Reihe 3

Die 2. Matrix hat keinen Fehler.

b)

Bei der ersten Matrix beispielsweise, wenn zusätzlich die Paritätsbits von Zeile 2 und Reihe 3 ebenfalls falsch sind. 

Bei der zweiten Matrix, wenn man die Bits der ersten beiden Reihen umdreht. 

c)

Bei der ersten matrix könnte man die unteren 2x2 der Nutzbits ändern und es würde nicht auffallen. Oder bzw den einen falschen lassen und nur den unteren Nutzbit und die beiden Paritätsbits

Bei der zweiten Matrix könnten die ersten Bits der Zeile 2 und 3 und die Prüfsummen dieser Reihen getauscht. 

---

3.

$$
6x^2+12x+6 \Rightarrow 6 \cdot (x^2+2x+1) \Rightarrow (x+1)^2 \Rightarrow 6^a(x+1)^b(x+1)^c
$$

| a   | b   | c   | Teiler     |
| --- | --- | --- | ---------- |
| 0   | 0   | 0   | $1$        |
| 0   | 0   | 1   | $(x+1)$    |
| 0   | 1   | 0   | $(x+1)$    |
| 0   | 1   | 1   | $(x+1)^2$  |
| 1   | 0   | 0   | $6$        |
| 1   | 0   | 1   | $6(x+1)$   |
| 1   | 1   | 0   | $6(x+1)$   |
| 1   | 1   | 1   | $6(x+1)^2$ |

---

4.

Nachricht: `0000`

`0000 000` : `1101` = 0 Rest `000`

Codewort: `0000 000`

---

Nachricht: `0001`

`0001 000` : `1101` 

$\Rightarrow (x^3) : (x^3+x^2+1) = 1$

Rest $x^2+1 \Rightarrow$ `101` 

Codewort: `0001 101`

---

Nachricht: `0010`

`0010 000` : `1101` 

$$
 (x^4) : (x^3+x^2+1) = x + 1
-(x^4+x^3+x)
      x^3+   x
    -(x^3+x^2 +1)
          x^2+x+1
$$

Rest $x^2+x+1 \Rightarrow$ `111` 

Codewort: `0010 111`

---

Und so weiter ...

| Datenwort $q$ | $q$ mit drei Nullen | Rest $r$ | Codewort $s=q,r$ |
| ------------: | ------------------: | -------: | ---------------: |
|        `0000` |           `0000000` |    `000` |    **`0000000`** |
|        `0001` |           `0001000` |    `101` |    **`0001101`** |
|        `0010` |           `0010000` |    `111` |    **`0010111`** |
|        `0011` |           `0011000` |    `010` |    **`0011010`** |
|        `0100` |           `0100000` |    `011` |    **`0100011`** |
|        `0101` |           `0101000` |    `110` |    **`0101110`** |
|        `0110` |           `0110000` |    `100` |    **`0110100`** |
|        `0111` |           `0111000` |    `001` |    **`0111001`** |
|        `1000` |           `1000000` |    `110` |    **`1000110`** |
|        `1001` |           `1001000` |    `011` |    **`1001011`** |
|        `1010` |           `1010000` |    `001` |    **`1010001`** |
|        `1011` |           `1011000` |    `100` |    **`1011100`** |
|        `1100` |           `1100000` |    `101` |    **`1100101`** |
|        `1101` |           `1101000` |    `000` |    **`1101000`** |
|        `1110` |           `1110000` |    `010` |    **`1110010`** |
|        `1111` |           `1111000` |    `111` |    **`1111111`** |


---

5.

`: - )`
