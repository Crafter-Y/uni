# Übungsblatt 2

[ti-ii-blatt-02.pdf](https://moodle.dhbw.de/mod/quiz/view.php?id=455969)

[Konvertierungsrechner für HEX,DEC,OCT,BIN](https://www.rapidtables.com/convert/number/decimal-to-binary.html)

[2er Komplement Rechner](https://tools.info-bw.de/zweierkomplement/)

---

1.

a)

$z_1 = 251.5625_{10}$

$1 \cdot 128 + 1 \cdot 64 + 1 \cdot 32 + 1 \cdot 16 + 1 \cdot 8 + 0 \cdot 4 + 1 \cdot 2 + 1 \cdot 1 . 1 \cdot \frac{1}{2} + 0 \cdot \frac{1}{4} +0 \cdot \frac{1}{8} + 1 \cdot \frac{1}{16}$

$= 11111011.1001_{2}$

$1111 1011.1001_{2} = FB.9_{16}$

$011 111 011.100 100_{2} = 373.44_8$

b)

$z_2 = 2F.9_{16}$

$2F.9_{16} = 0010 1111 . 1001_2$

$000 101 111 . 100 100_2 = 57.44_8$

$2 \cdot 16 + 15 + \frac{1}{2} + \frac{1}{16} = 47.5625_{10}$

c)

$z_3 = -56_{10}$

$56_{10} = 0 \cdot 128 + 0 \cdot 64 + 1 \cdot 32 + 1 \cdot 16 + 1 \cdot 8 + 0 \cdot 4 + 0 \cdot 2 + 0 \cdot 1 = 00111000_2$

$00111000 \rightarrow 11000111 \rightarrow 11001000_2 \Leftrightarrow -56_{10}$


---

2.

$z_1 = 5808_{16}$

$z_2 = 4D40_{16}$

$5808_{16} = 0101 1000 0000 1000 = \underbrace{0}_{Sign} \underbrace{10110}_{Exponent} \underbrace{00 0000 1000}_{Mantisse}$

Exponent: $10110_2 = 22 \rightarrow 22-15 = 7$

$\underbrace{1}_{Hidden Bit}.0000001000 \cdot 2^{7} = 10000001_2 = 129$

$4D40_{16} = 0100 1101 0100 0000 = \underbrace{0}_{Sign} \underbrace{10011}_{Exponent} \underbrace{01 0100 0000}_{Mantisse}$

Exponent: $10011_2 = 19 \rightarrow 19-15 = 4$

$\underbrace{1}_{Hidden Bit}.0101000000 \cdot 2^{4} = 10101_2 = 21_{10}$

$21 \cdot 129 = 2709$ (Taschenrechner)

$2709{16} = 101010010101_2 = 1.01010010101 \cdot 2^{11}$

Sign Bit: $0$

Exponent: $11 \rightarrow 11 + 15 = 26_2 = 11010_2$

Mantissee: $01010010101_2 \rightarrow 0101001010_2$ (Auf 10 Bit begrenzen - Hier wird die Zahl verändert und ein Fehler eingefügt)

Zusammenbauen: $\underbrace{0}_{Sign} \underbrace{11010}_{Exponent} \underbrace{0101001010}_{Mantisse}$

---

3.

Kleinste Zahl der Zahlentypen $x \gt 1$:

Single: Bias 127

$$
\begin{align*}
\underbrace{0}_{1 Sign} \underbrace{01111111}_{8 Exponent} \underbrace{00000000000000000000001}_{23 Mantisse} \\
= 1,00000000000000000000001_2 = 1 + \frac{1}{2^{23}}
\end{align*}
$$

Half: Bias 15

$$
\begin{align*}
\underbrace{0}_{1 Sign} \underbrace{01111}_{5 Exponent} \underbrace{0000000001}_{10 Mantisse} \\
= 1,0000000001_2 = 1 + \frac{1}{2^{10}}
\end{align*}
$$

bfloat16: Bias 127

TODO

Die harmonische Reihe sieht so aus:

$$
\sum_{k=1}^{\infty} \frac{1}{k} = \frac{1}{1} + \frac{1}{2} + \frac{1}{3} + \dots
$$

Wann ist $\frac{1}{k}$ kleiner als $2^{-m}$?

Für Single: 

$$
\begin{align*}
\frac{1}{j} \lt 2^{-23} \\
k \gt 2^{23} \\
k \gt 8 388 608
\end{align*}
$$

Für Half: $\frac{1}{k} \gt 2^{10} = 1024$

---

4.

TODO

5.

TODO

🙏➡️👤⏰
