TODO


```
Prämisse (A -> C) & (B -> C)
KL A -> C
KR B -> C
Annahme A | B
  Annahme A
  IE C
  Annahme B
  IE C
D C
II A | B -> C
```

..


```
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

Meine (falsche) Lösung
```
main :: IO ()
main = do
  print (firstEvenProductList [1,2,3,4,5,6])
  print (evenEl [1,2,3,4,5,6])

firstEvenProductList :: [Int] -> Int
firstEvenProductList [] = 1
firstEvenProductList list = (ev !! 0) * (ev !! 1)
  where ev = evenEl list

evenEl :: [Int] -> [Int]
evenEl [] = []
evenEl (x:xs)
  | even(x) = (x:evenEl(xs))
  | otherwise = evenEl(xs)
```

Musterlösung:

```
main :: IO ()
main = do
  print (firstEvenProductList [1,2,3,4,5,6])

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