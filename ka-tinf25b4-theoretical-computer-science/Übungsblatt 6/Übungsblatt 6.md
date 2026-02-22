# Übungsblatt 6

[ti-i-blatt-06.pdf](https://moodle.dhbw.de/mod/resource/view.php?id=363693)

---

1.

3SAT-Problem:

$$
(x_3 \lor \overline{x_2} \lor \overline{x_1}) \land (x_3 \lor x_2 \lor x_3) \land (x_1 \lor \overline{x_3} \lor \overline{x_2}) \land (x_1 \lor \overline{x_2} \lor x_3) \land (\overline{x_1} \lor \overline{x_3} \lor \overline{x_1}) 
$$

Teilsummenproblem:

|                  | $x_1$ | $x_2$ | $x_3$ | $T1$ | $T2$ | $T3$ | $T4$ | $T5$ |
| ---------------- | ----- | ----- | ----- | ---- | ---- | ---- | ---- | ---- |
| $x_1$            | 1     |       |       |      |      | 1    | 1    |      |
| $\overline{x_1}$ | 1     |       |       | 1    |      |      |      | 1    |
| $x_2$            |       | 1     |       |      | 1    |      |      |      |
| $\overline{x_2}$ |       | 1     |       | 1    |      | 1    | 1    |      |
| $x_3$            |       |       | 1     | 1    | 1    |      | 1    |      |
| $\overline{x_3}$ |       |       | 1     |      |      | 1    |      | 1    |
| $T1_1$           |       |       |       | 1    |      |      |      |      |
| $T1_2$           |       |       |       | 2    |      |      |      |      |
| $T2_1$           |       |       |       |      | 1    |      |      |      |
| $T2_2$           |       |       |       |      | 2    |      |      |      |
| $T3_1$           |       |       |       |      |      | 1    |      |      |
| $T3_2$           |       |       |       |      |      | 2    |      |      |
| $T4_1$           |       |       |       |      |      |      | 1    |      |
| $T4_2$           |       |       |       |      |      |      | 2    |      |
| $T5_1$           |       |       |       |      |      |      |      | 1    |
| $T5_2$           |       |       |       |      |      |      |      | 2    |
| $T$              | 1     | 1     | 1     | 4    | 4    | 4    | 4    | 4    |

| $x_1$               | $x_2$               | $x_3$               | $(x_3 \lor \overline{x_2} \lor \overline{x_1}) \land (x_3 \lor x_2 \lor x_3) \land (x_1 \lor \overline{x_3} \lor \overline{x_2}) \land (x_1 \lor \overline{x_2} \lor x_3) \land (\overline{x_1} \lor \overline{x_3} \lor \overline{x_1})$ |
| ------------------- | ------------------- | ------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                                                                                                                                                                                                                         |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$                                                                                                                                                                                                                       |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$                                                                                                                                                                                                                         |

Die einzige gültige Kombination ist: $\neg x_1, \neg x_2, x_3$

---

2.

(a)

34: 13 + 15 + 6

31: 8 + 9 + 14

49: nicht möglich. 

20: 6 + 14

16: nicht möglich

39: nicht möglich

(b)

18: 3 + 15

10: nicht möglich

61: nicht möglich

70: 3 + 11 + 13 + 15 + 12 + 16

69: nicht möglich

77: nicht möglich

---

3.

[HellmannBrute](./HellmannBrute.java): `Top Secret!11`

---

4.

TODO