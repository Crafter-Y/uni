# Übungsblatt 11

[ti-i-blatt-10.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363704)

---

1.

(a)

- (1) $(C \land \neg D) \rightarrow \neg A$
- (2) $B \rightarrow (E \land \neg A)$
- (3) $\neg B \rightarrow (C \land \neg D)$
- (4) $C \rightarrow (A \land \neg E)$

(b) 

Wenn Beka mit der Bahn fährt, dann fährt carsten mit dem Auto und Doris mit der Ban (3). Dann würde Anton mit der Bahn fahren (1) aber Anton müsste auch mit dem Auto fahren, da Cera mit dem Auto fährt (4). Deshalb kann beka nicht mit der Bahn fahren.

Da Beka mit dem Auto fährt, fährt auch Emil mit dem Auto (2).

(c)

Wenn Cera mit dem Auto fährt, dann fährt auch Anton mit dem Auto und Emil mit der Bahn (4). Das steht im Widersprucht zu (2), da Email auf jeden Fall mit dem Auto fährt, da Beka mit dem Auto fährt. Also fährt Cera mit der Bahn.

Da also Regel (2) gelten muss, und Regel (1), (3) und (4) nicht gelten kann, gibt es keine Aussage darüber, ob Doris mit dem Auto fährt.

---

2.

(a)

| $A$ | $B$ | $C$ | $C \lor \neg (\neg B \lor \neg A)$ | $C \lor A$ | $C \lor (B \land A)$ |
| --- | --- | --- | ---------------------------------- | ---------- | -------------------- |
| 0   | 0   | 0   | 0                                  | 0          | 0                    |
| 0   | 0   | 1   | 1                                  | 1          | 1                    |
| 0   | 1   | 0   | 0                                  | 0          | 0                    |
| 0   | 1   | 1   | 1                                  | 1          | 1                    |
| 1   | 0   | 0   | 0                                  | 1          | 0                    |
| 1   | 0   | 1   | 1                                  | 1          | 1                    |
| 1   | 1   | 0   | 1                                  | 1          | 1                    |
| 1   | 1   | 1   | 1                                  | 1          | 1                    |

(b)

$$
\begin{align*}
(C \lor \neg (\neg B \lor \neg A)) \land (C \lor A) &= (C \lor ( B \land  A)) \land (C \lor A) & \text{(Dopp. Neg. & De Morgan)}\\
&= C \lor ((B \land A) \land A) &\text{(Dist.)}\\
&= C \lor (B \land (A \land A)) &\text{(Assoz.)}\\
&= C \lor (B \land A) &\text{(Idemp.)}\\
\end{align*}
$$

---

3.

| Schritt | Aussage                             | Begründung     |
| ------- | ----------------------------------- | -------------- |
| 1       | $A \rightarrow B$                   | Prämisse       |
| 2       | $C \rightarrow D$                   | Prämisse       |
| 3.1     | $A \lor C$                          | Annahme        |
| 3.2.1   | $A$                                 | Annahme        |
| 3.2.2   | $B$                                 | IE 1 3.2.1     |
| 3.2.3   | $B \lor D$                          | DL 3.2.2       |
| 3.2     | $A \rightarrow (B \lor D)$          | II 3.2.1 3.2.3 |
| 3.3.1   | $C$                                 | Annahme        |
| 3.3.2   | $D$                                 | IE 2 3.3.1     |
| 3.3.3   | $B \lor D$                          | DR 3.3.2       |
| 3.3     | $C \rightarrow (B \lor D)$          | II 3.3.1 3.3.3 |
| 3.4     | $(B \lor D)$                        | D 3.1 3.2 3.3  |
| 3       | $(A \lor C) \rightarrow (B \lor D)$ | II 3.1 3.4     |

---

4.

(a)

- (1) $\neg \forall x : \forall y : f(x,y)$
- (2) $\exists x : \neg \exists y : f(x,y)$
- (3) $\exists x : \neg \forall y : f(x,y)$
- (4) $\forall x : \neg \forall y : f(y,x)$

(b)

(1) und (3) stehen in Verbindung. Wenn nicht alle von allen abschreiben, gibt es mindestens eine Person, die das nicht tut, also nicht von allen abschreibt.

(2) und (4) stehen in Verbindung. Wenn es jemanden gibt, der gar nicht abschreibt, hat jeder mindestens eine Person, die bei ihm nicht abschreibt.

---

5.

(a)

| n    | 1   | 2   | 3   | 4   |
| ---- | --- | --- | --- | --- |
| f(n) | 6   | 6   | 8   | 12  |

(b)

Zu zeigen:

$$
f(n) \stackrel{!}{\le} 3 \cdot 2^n
$$

Induktionsanfang (IA) - $n = 1$

$$
\begin{align*}
f(1) &\stackrel{!}{\le} 3 \cdot 2^1 \\
6 &= 6 \\
&&\square
\end{align*}
$$

Induktionsvoraussetzung (IV)

Es gilt:

$$
f(n) \le 3 \cdot 2^n
$$

Induktionsschritt (IS)

Zu zeigen:

$$
f(n + 1) \stackrel{!}{\le} 3 \cdot 2^{n+1}
$$

Beweis:

$$
\begin{align*}
f(n + 1) &\le 3 \cdot 2^{n+1} \\
(2-\frac{2}{n + 1}) \cdot f(n + 1 - 1) &\le 3 \cdot 2 \cdot 2^n \\
(2-\frac{2}{n + 1}) \cdot f(n) &\le 3 \cdot 2^n \cdot 2 \\
(2-\frac{2}{n + 1}) &\le  2 \\
&&\square
\end{align*}
$$

(c)

```js
let f = (n) => n == 1 ? 6 : (2-2/n)*f(n-1)
```

---

6.

(a)

- R
  - Reflexiv, da $(a,a), (b,b), (c,c), (d,d)$ enthalten sind.
  - Antiymmetrisch, da es keine $(x,y)$ und $(y,x)$ Paare gibt.
- Q
  - Reflexiv, da $(a,a), (b,b), (c,c), (d,d)$ enthalten sind.
  - Nicht Antisymmetrisch, da $(a,c)$ und $(c,a)$, aber $a \neq c$

(b)

$b$ und $d$ sind minimale Elemente, da niemand (außer sie selber) zu ihnen hin zeigt.

Es gibt keine kleinsten Elemente, da weder von $b$ noch von $d$ alle anderen Elemente erreicht werden. Von $b$ kann nicht $d$ erreicht werden und von $d$ nicht $b$, da sie sonst keine kleinsten Elemente wären.

(c)

$Q$ ist eine Äquivalenzrelation, da sie reflexiv, symmetrisch und transitiv ist:

- reflexiv (siehe oben)
- symmetrisch, da zu $(a,c)$ auch $(c,a)$ und zu $(b,d)$ auch $(d,b)$ existiert
- transitiv, da 
  - $a \rightarrow c \rightarrow a$ und $(a,a)$
  - $c \rightarrow a \rightarrow c$ und $(c,c)$
  - $b \rightarrow d \rightarrow b$ und $(b,b)$
  - $d \rightarrow b \rightarrow d$ und $(d,d)$

(d)

$[a] = [c] = \{a,c\}$

$[b] = [d] = \{b,d\}$

---

7.

TODO

---

8.

(a)

|                  | $x_1$ | $x_2$ | $x_3$ | $T1$ | $T2$ | $T3$ | $T4$ |
| ---------------- | ----- | ----- | ----- | ---- | ---- | ---- | ---- |
| $x_1$            | 1     |       |       |      | 1    |      | 1    |
| $\overline{x_1}$ | 1     |       |       |      |      | 1    |      |
| $x_2$            |       | 1     |       |      |      | 1    | 1    |
| $\overline{x_2}$ |       | 1     |       | 1    |      |      |      |
| $x_3$            |       |       | 1     |      | 1    |      |      |
| $\overline{x_3}$ |       |       | 1     | 1    |      |      |      |
| $T1_1$           |       |       |       | 1    |      |      |      |
| $T1_2$           |       |       |       | 2    |      |      |      |
| $T2_1$           |       |       |       |      | 1    |      |      |
| $T2_2$           |       |       |       |      | 2    |      |      |
| $T3_1$           |       |       |       |      |      | 1    |      |
| $T3_2$           |       |       |       |      |      | 2    |      |
| $T4_1$           |       |       |       |      |      |      | 1    |
| $T4_2$           |       |       |       |      |      |      | 2    |
| $T$              | 1     | 1     | 1     | 4    | 4    | 4    | 4    |

(b)

Eine Belegung ist $x_1, x_2, \overline{x_3}$

---

9.

(a)

- Allgemein: Löst das Problem für eine Klasse von q
- Ausführbar: Jeder Schritt ist berechenbar
- Determinismus: Jeder Schritt ist eindeutig
- Finitheit: Die Beschreibung ist endlich
- Terminierung nur bei $q \ge 2$

(b)

```js
const f = (q) => {
  let p = 3
  for (;q !== 2;q--) p+=q-1
  return p
}
```

(c)

```js
const f = (q, p = 3) => {
  if (q == 2) return p;
  return f(q-1, p+q-1);
}
```

---

10.

(a)

Vorher:

- x = 4
- r = 1
- n = 1

Nach 1 Iterationen:

- x = 4
- r = $1 \cdot \frac{1}{2} = \frac{1}{2}$
- n = 2

Nach 2 Iterationen:

- x = 4
- r = $1 \cdot \frac{1}{2} \cdot \frac{2}{3} = \frac{1}{3}$
- n = 3

Nach 3 Iterationen

- x = 4
- r = $1 \cdot \frac{1}{2} \cdot \frac{2}{3} \cdot \frac{3}{4} = \frac{1}{4}$
- n = 4

(b)

`recip(x)` berechnet die Reziproke, also den Kehrwert einer Zahl zurück, wie in (a) zu erkennen ist.

(c)

Schleifenbedingung: $n \neq x$

Schleifeninvariante: $r = \frac{1}{n}$

(d)

Vor 2: $x \in \mathbb{N}$
Vor 3: $x \in \mathbb{N} \land r = 1$
Nach 3: $x \in \mathbb{N} \land r = 1 \land n = 1$
Vor 5: $x \in \mathbb{N} \land n \lt x \land r = \frac{1}{n}$
Vor 6: $x \in \mathbb{N} \land n \lt x \land r = \frac{1}{n + 1}$
Nach 6: $x \in \mathbb{N} \land n \le x \land r = \frac{1}{n}$
Vor 7: $x \in \mathbb{N} \land n = x \land r = \frac{1}{n}$

---

11.

TODO

---

12.

(a)

13 und 9

(b)

```prolog
amplitude([Xh|Xt], X) :- amplitude([Xh|Xt], X, Xh, Xh).

amplitude([], X, Min, Max) :- X is Max - Min.

amplitude([Xh|Xt], X, Min, Max) :- Min=<Xh, Max >=Xh, amplitude(Xt, X, Min, Max).
amplitude([Xh|Xt], X, Min, Max) :- Xh<Min, amplitude(Xt, X, Xh, Max).
amplitude([Xh|Xt], X, Min, Max) :- Xh>Max, amplitude(Xt, X, Min, Xh).
```

---

13.

(a)

```prolog
wertig(ass, 8).
wertig(n10, 7).
wertig(koenig, 6).
wertig(dame, 5).
wertig(n9, 4).
wertig(n8, 3).
wertig(n7, 2).

besser(Karte1, Karte2) :- wertig(Karte1, Y), wertig(Karte2, Z), Y > Z.
```

(b)

```prolog
schlaegt(Farbe1, Wert1, Farbe1, Wert2) :- besser(Wert1, Wert2).
schlaegt(Farbe1, Wert1, Farbe2, Wert2) :- Farbe1 = herz.
```

---

14.

(a) Int

(b) Int -> Int

(c) (Int -> Int) -> [Int] -> Bool

(d) [Int] -> Bool

(e) Bool

---

15.

(a)

```haskell 
firstEvenProductList :: [Int] -> Int
```

(b)

Meine Lösung:

```haskell
main :: IO ()
main = do
  print (firstEvenProductList [1,2,3,4,5,6]) -- 8

firstEvenProductList :: [Int] -> Int
firstEvenProductList [] = 1
firstEvenProductList l = fe l True
  where
    fe [] _ = 1
    fe (x:xs) first
      | (even x && first) = x * (fe xs False)
      | (even x && not first) = x
      | (not (even x) && first) = fe xs True
      | otherwise = fe xs False
```

Musterlösung:

```haskell
main :: IO ()
main = do
  print (firstEvenProductList [1,2,3,4,5,6]) -- 8

firstEvenProductList :: [Int] -> Int
firstEvenProductList [] = 1
firstEvenProductList (x:xs)
  | even x = x * second xs
  | otherwise = firstEvenProductList xs
  where 
    second (y:ys)
      | even y = y
      | otherwise = second ys
    second [] = 1
    
```

(c)

`Command timed out`

(d)

`200`