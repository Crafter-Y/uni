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

$5808_{16} = 0011 1000 0000 1000 = \underbrace{0}_{Sign} \underbrace{01110}_{Exponent} \underbrace{00 0000 1000}_{Mantisse}$

Exponent: $01110_2 = 14 \rightarrow 14-15 = -1$

$\underbrace{1}_{Hidden Bit}.0000001000 \cdot 2^{-1} = 0.10000001_2 = \frac{1}{2} + \frac{1}{256} = 0.50390625_{10}$

$4D40_{16} = 0100 1101 0100 0000 = \underbrace{0}_{Sign} \underbrace{10011}_{Exponent} \underbrace{01 0100 0000}_{Mantisse}$

Exponent: $10011_2 = 19 \rightarrow 19-15 = 4$

$\underbrace{1}_{Hidden Bit}.0101000000 \cdot 2^{4} = 10101_2 = 21_{10}$

> Multiplikation, wie hier beschrieben haben wir nicht besprochen: https://numeral-systems.com/ieee-754-multiply/

$21 \cdot 0,50390625 = 10.58203125$ (Taschenrechner)


$10.58203125_{16} = 1010.10010101_2 = 1.01010010101 \cdot 2^{3}$

Sign Bit: $0$

Exponent: $3 \rightarrow 3 + 15 = 18_2 = 10010_2$

Mantissee: $01010010101_2 \rightarrow 0101001010_2$ (Auf 10 Bit begrenzen - Hier wird die Zahl veränder und ein Fehler eingefügt)

Zusammenbauen: $\underbrace{0}_{Sign} \underbrace{10010}_{Exponent} \underbrace{0101 0010 10}_{Mantisse}$

---

3.

TODO