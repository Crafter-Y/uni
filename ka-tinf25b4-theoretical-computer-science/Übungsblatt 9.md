# Übungsblatt 9

[ti-i-blatt-09.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363699)

---

1.

TODO

---

2.

(a)

```prolog
last(Return, [X]) :- Return = X.
last(Return, [X|Xt]) :- last(Return, Xt).
``` 

(b)

```prolog
nextto(Return, Y, [_,_]).
nextto(Return, Y, [L1, L2|L]) :- ((L2 = Y)->Return is L1;true); nextto(Return, Y, [L2| L]).
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

TODO