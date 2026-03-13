# Übungsblatt 9

[ti-i-blatt-09.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363699)

---

1.

```prolog
color(rot).
color(blau).
color(gruen).

d(X,Y) :- color(X), color(Y), X \= Y.

farben(Alu, Beka, Cera, Dola, Erito, Faku, Gela, Hora, Iona) :- 
  Cera = rot, 
  Hora = blau,
  Iona = rot,
  d(Alu, Beka),
  d(Alu, Cera),
  d(Alu, Hora),
  d(Beka, Dola),
  d(Beka,Erito),
  d(Beka,Faku),
  d(Beka,Gela),
  d(Beka,Hora),
  d(Beka,Iona),
  d(Cera,Erito),
  d(Cera,Faku),
  d(Dola,Faku),
  d(Dola,Iona),
  d(Erito,Hora), 
  d(Faku,Gela),
  d(Faku,Hora).
```

(a) Es geht nicht mit 3 Farben

(b)

TODO

---

2.

(a)

```prolog
last(X, [X]).
last(X, [_|Lt]) :- last(X, Lt).
``` 

(b)

Meine Lösung:

```prolog
nextto(Return, Y, [_,_]).
nextto(Return, Y, [L1, L2|L]) :- ((L2 = Y)->Return is L1;true); nextto(Return, Y, [L2| L]).
```

Musterlösung:

```prolog
nextto(X, Y, [X, Y|_]).
nextto(X, Y, [_|Tail]) :- nextto(X,Y,Tail).
```

(c)

```prolog
delete(_, [], []).
delete(X, [X|T], R) :-
    delete(X, T, R).
delete(X, [H|T], [H|R]) :-
    H \= X,
    delete(X, T, R).
```

---

3.

(a) Double -> Double

(b) Double -> Double -> Double

(c) Double

(d) Double -> Double

(e) Double -> ( Double -> Float ) -> Float

(f) (Int -> Int) -> (Int -> Int) -> Int -> Int