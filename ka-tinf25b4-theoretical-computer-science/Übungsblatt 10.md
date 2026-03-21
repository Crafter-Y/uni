# Übungsblatt 10

[ti-i-blatt-10.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363701)

---

1.

(a)

```haskell
check :: (Double -> Bool) -> (Double -> Bool) -> Double -> Bool
check rule1 rule2 value = rule1(value) && rule2(value)
```

(b)

```haskell
positive :: Double -> Bool
positive x = x > 0

less100 :: Double -> Bool
less100 x = x < 100
```

(c)

```haskell
checkPoLe :: Double -> Bool
checkPoLe = check positive less100
```

(d)

```haskell
never :: Double -> Bool
never = check positive never
```

---

2.

```haskell
main :: IO ()
main = do
  print (soil (1, 1)) -- 3
  print (soil (2, 2)) -- 7
  print (soil (3, 3)) -- 61
  --print (soil (4, 4)) -- timeout

soil :: (Int, Int) -> Int
soil (0, m) = m + 1
soil (n, 0) = soil (n - 1, 1)
soil (n, m) = soil (n - 1, soil (n, m - 1))
```

---

3.

```haskell
main :: IO ()
main = do
  print (rle [1, 1, 1, 4, 3, 3, 3, 3, 3, 2, 2]) -- [(1,3),(4,1),(3,5),(2,2)]
  
rle :: [Int] -> [(Int, Int)]
rle [] = []
rle (x:xs) = count x 1 xs 
  where
    count x n [] = [(x,n)]
    count x n (y:ys)
      | x == y = count x (n+1) ys
      | otherwise = (x,n) : count y 1 ys
```