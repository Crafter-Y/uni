# Übungsblatt 2

Material: [Übungsblatt 2](https://moodle.dhbw.de/mod/resource/view.php?id=363685)

1.

(a)

| $A$                 | $B$                 | $\neg B \rightarrow \neg A$ | $A \land (\neg B \rightarrow \neg A)$ | $(A \land (\neg B \rightarrow \neg A)) \rightarrow B$ |
| ------------------- | ------------------- | --------------------------- | ------------------------------------- | ----------------------------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$         | $\color{green}\top$                   | $\color{green}\top$                                   |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$           | $\color{red}\bot$                     | $\color{green}\top$                                   |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$         | $\color{red}\bot$                     | $\color{green}\top$                                   |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$         | $\color{red}\bot$                     | $\color{green}\top$                                   |

(b)

$$
\begin{align*}
(A \land (\neg B \rightarrow \neg A)) \rightarrow B &= (A \land (B \lor \neg A)) \rightarrow B &\text{(H.)} \\
&= ((A \land B) \lor (A \land \neg A)) \rightarrow B &\text{(Dist.)} \\
&= ((A \land B) \lor \bot) \rightarrow B &\text{(Komplem.)} \\
&= (A \land B) \rightarrow B &\text{(Neutral.)} \\
&= \neg(A \land B) \lor B &\text{(H.)} \\
&= (\neg A \lor \neg B) \lor B &\text{(De Morgan)} \\
&= \neg A \lor (\neg B \lor B) &\text{(Assoz.)} \\
&= \neg A \lor \top &\text{(Komplem.)} \\
&= \top &\text{(Ausl.)} \\
\end{align*}
$$

(c)

![PM](./PM1.png)

(d)

TODO: formal sicherlich nicht so richtig. Ich habe versucht nachzubauen, was ich in (c) gemacht habe

| Schritt | Aussage                                                                         | Begründung    |
| ------- | ------------------------------------------------------------------------------- | ------------- |
| 1       | $A \land ((B \rightarrow \bot) \rightarrow (A \rightarrow \bot))$               | Prämisse      |
| 2       | $A$                                                                             | KL 1          |
| 3       | $(B \rightarrow \bot) \rightarrow (A \rightarrow \bot)$                         | KR 1          |
| 4       | $B \lor (B \rightarrow \bot)$                                                   | TND           |
| 5.1     | $B \rightarrow B$                                                               |               |
| 5.2.1   | $B$                                                                             | Annahme für D |
| 5.2.2   | $B \rightarrow \bot$                                                            | Annahme für D |
| 5.3     | $A \rightarrow \bot$                                                            | IE 3 5.2.2    |
| 5.4     | $\bot$                                                                          | IE 5.3 2      |
| 5.5     | $B$                                                                             | F 5.4         |
| 6       | $B$                                                                             | D 4 5.2.1 5.5 |
| 7       | $A \land ((B \rightarrow \bot) \rightarrow (A \rightarrow \bot)) \rightarrow B$ | II 1 6        |

2.

TODO