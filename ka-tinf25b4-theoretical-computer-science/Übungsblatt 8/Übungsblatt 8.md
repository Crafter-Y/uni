# Übungsblatt 8

[ti-i-blatt-08.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363697)

---

1.

(a)

```mermaid
flowchart TD
    root(+)
    n1(+)
    n2(4)
    n3(3)
    n4(+)
    n5(fern)
    n6(X)
    n7(Y)

    root --> n1
    n1 --> n2
    n1 --> n3
    root --> n4
    n4 --> n5
    n5 --> n6
    n4 --> n7
```

(b)

```mermaid
flowchart TD
    root(+)
    n1(+)
    n2(y)
    n3(%)
    n4(17)
    n5(okt)
    n6(a)
    n7(b)
    n8(<)
    n9(X)
    n10(2)
    n11(z)

    root --> n1
    n1 --> n2
    n1 --> n3
    n3 --> n4
    n3 --> n5
    n5 --> n6
    n5 --> n7
    n5 --> n8
    n8 --> n9
    n8 --> n10
    root --> n11
```

---

2.

(a)

Wenn man für `X=7` und `Y=3` einsetzt, sind beide Ausdrücke gleich.

(b)

Man kann für `Y=f(a)` und `Z=f(Y)` also `Z=f(f(a))` einsetzen, dann sind beide Ausdrücke gleich.

(c)

Nicht unifizierbar, da

- `X=f(Y)`
- `Y=f(X)`

Dann wäre `X=f(f(X))`, was keine Lösung findet, da X immer weiter in sich selber eingebaut wird.

---

3.

```prolog
v(at, ch).
v(at, cz).
v(be, de).
v(be, lu).
v(be, nl).
v(ch, fr).
v(cz, de).
v(cz, pl).
v(de, dk).
v(de, fr).
v(de, lu).
v(de, nl).
v(de, pl).
v(fr, lu).

grenze(X,Y) :- v(X,Y); v(Y,X).

transit(X, Y) :- grenze(X,Z),grenze(Z,Y),Z \= de, X \= Y.
```