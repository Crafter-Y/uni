# Übungsblatt 1

Material: [Übungsblatt 1](https://moodle.dhbw.de/mod/resource/view.php?id=363683)

1.

- $L$: Laptopakku ist fast leer
- $N$: Netzteil fehlt
- $S$: Programm ist gespeichert

(a)

$$
\begin{align*}
\neg(S \leftrightarrow \neg N) &= \neg((S \land\neg N) \lor (\neg S \land N)) \\
&= \neg(S \land\neg N) \land \neg(\neg S \land N) \\
&= (\neg S \lor N) \land (S \lor \neg N) \\
&= (\neg S \land S) \lor (\neg S \land \neg N) \lor (N \land S) \lor (N \land \neg N) \\
&= (\neg S \land \neg N) \lor (N \land S) \\
&= S \leftrightarrow N
\end{align*}
$$

| $S$                 | $N$                 | $S \leftrightarrow \neg N$ | $S \leftrightarrow N$ |
| ------------------- | ------------------- | -------------------------- | --------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$          | $\color{green}\top$   |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$        | $\color{red}\bot$     |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$        | $\color{red}\bot$     |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$          | $\color{green}\top$   |

(b)

$$
\begin{align*}
\neg(\neg S \rightarrow L) &= \neg(S \lor L) \\
&= \neg S \land \neg  L
\end{align*}
$$

| $S$                 | $L$                 | $\neg S \rightarrow L$ | $\neg S \land \neg  L$ |
| ------------------- | ------------------- | ---------------------- | ---------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$    | $\color{red}\bot$      |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$    | $\color{red}\bot$      |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$    | $\color{red}\bot$      |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$      | $\color{green}\top$    |

(c)

$$
\begin{align*}
\neg(N \rightarrow (L \land \neg S)) &= \neg(\neg N \lor (L \land \neg S)) \\
&= N \land \neg (L \land \neg S) \\
&= N \land (\neg L \lor S)
\end{align*}
$$

| $N$                 | $L$                 | $S$                 | $N \rightarrow (L \land \neg S)$ | $N \land (\neg L \lor S)$ |
| ------------------- | ------------------- | ------------------- | -------------------------------- | ------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$                | $\color{green}\top$       |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$              | $\color{red}\bot$         |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$                | $\color{green}\top$       |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$                | $\color{green}\top$       |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$              | $\color{red}\bot$         |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$              | $\color{red}\bot$         |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$              | $\color{red}\bot$         |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$              | $\color{red}\bot$         |


(d)

$$
\begin{align*}
\neg((S \land \neg N) \lor (\neg S \land L)) &= \neg(S \land \neg N) \land \neg(\neg S \land L) \\
&= (\neg S \lor N) \land (S \lor \neg L)
\end{align*}
$$

| $S$                 | $N$                 | $L$                 | $(S \land \neg N) \lor (\neg S \land L)$ | $(\neg S \lor N) \land (S \lor \neg L)$ |
| ------------------- | ------------------- | ------------------- | ---------------------------------------- | --------------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$                        | $\color{green}\top$                     |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                        | $\color{green}\top$                     |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$                      | $\color{red}\bot$                       |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$                      | $\color{red}\bot$                       |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$                      | $\color{red}\bot$                       |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                        | $\color{green}\top$                     |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$                      | $\color{red}\bot$                       |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$                        | $\color{green}\top$                     |

|     | Aussage $A$                              | Aussage $A$ versprachlicht                                                                                                                | Aussage $\neg A$                        | Aussage $\neg A$ versprachlicht                                                                                                                               |
| --- | ---------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| (a) | $S \leftrightarrow \neg N$               | Immer genau dann wenn mein Programm gespeichert ist, habe ich das Netzteil zur Hand.                                                      | $S \leftrightarrow N$                   | Entweder ist das Programm nicht gespeichert und das Netzteil fehlt oder das Programm ist gespeichert und das Netzteil fehlt nicht.                            |
| (b) | $\neg S \rightarrow L$                   | Der Laptopakku ist fast leer, wenn mein Programm noch nicht gespeichert ist.                                                              | $\neg S \land \neg  L$                  | Das Programm ist nicht gespeichert und der Akku ist nicht fast leer                                                                                           |
| (c) | $N \rightarrow (L \land \neg S)$         | Der Akku ist fast leer und das Programm ist nicht gespeichert, wenn das Netzteil fehlt.                                                   | $N \land (\neg L \lor S)$               | Das Netzteil fehlt und zudem ist entweder der Akku nicht fast leer oder das Programm gespeichert.                                                             |
| (d) | $(S \land \neg N) \lor (\neg S \land L)$ | Entweder das Programm ist gespeichert und das Netzteil ist vorhanden, oder das Programm ist nicht gespeichert und der Akku ist fast leer. | $(\neg S \lor N) \land (S \lor \neg L)$ | (Entweder ist das Programm nicht gespeichert oder das Netzteil fehlt) und zugleich (entweder ist das Programm gespeichert oder der Akku ist nicht fast leer). |

---

2.

- $E$: Emma
- $S$: Sascha
- $R$: Ralf
- $N$: Nicki

(a) Emma lernt nur mit, wenn Sascha dabei ist.

| $E$                 | $S$                 | $E \rightarrow S$   |
| ------------------- | ------------------- | ------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ |

(b) Sascha ist nur dabei, wenn auch Ralf von der Partie ist.

| $S$                 | $R$                 | $S \rightarrow R$   |
| ------------------- | ------------------- | ------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ |

(c) Ist Ralf dabei, so schaltet sich Nicki hinzu.

| $R$                 | $N$                 | $R \rightarrow N$   |
| ------------------- | ------------------- | ------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ |

(d) Wenn aber Sascha und Nicki zusammen dabei sind, macht Ralf nicht mit.

| $S$                 | $N$                 | $R$                 | $(S \land N) \rightarrow \neg R$ |
| ------------------- | ------------------- | ------------------- | -------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$                |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$              |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$              |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$              |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$              |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$              |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$              |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$              |

(e) Nicki bleibt aber nur, wenn auch Emma oder Sascha da sind.

| $N$                 | $S$                 | $E$                 | $N \rightarrow (E \lor S)$ |
| ------------------- | ------------------- | ------------------- | -------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$        |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$        |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$        |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$          |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$        |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$        |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$        |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$        |

Angenommen, Peter lernt mit Emma:

Wenn Emma ($E$), dann Sascha ($S$) (a), wenn Sascha ($S$), dann Ralf ($R$) (b), wenn Ralf ($R$), dann Nicki ($N$) (c).

Da Sascha ($S$) und Nicki ($N$) kommt nicht Ralf ($R$) (d). Das ist ein Widerspruch. Peter wird nicht mit Emma lernen.

Wenn Sascha ($S$), dann Ralf ($R$) (b), wenn Ralf ($R$), dann Nicki ($N$) (c).

Da Sascha ($S$) und Nicki ($N$) kommt nicht Ralf ($R$) (d). Das ist ein Widerspruch. Peter wird nicht mit Sascha lernen.

Wenn Nicki ($N$), dann dann Emma ($E$) oder Sascha ($S$) (e). Da Emma ($E$) zu Sascha ($S$) führt (a), wenn Sascha ($S$), dann Ralf ($R$) (b), wenn Ralf ($R$), dann Nicki ($N$) (c).

Da Sascha ($S$) und Nicki ($N$) kommt nicht Ralf ($R$) (d). Das ist ein Widerspruch. Peter wird nicht mit Nicki lernen.

Wenn Ralf ($R$), dann Nicki ($N$) (c), dann Emma ($E$) oder Sascha ($S$) (e), dann auf jeden Fall Sascha ($S$) (a), dann Ralf ($R$) (b), dann Nicki ($N$) (c).

Da Sascha ($S$) und Nicki ($N$) kommt nicht Ralf ($R$) (d). Das ist ein Widerspruch. Peter wird nicht mit Ralf lernen.

D.h. Peter wird nicht mit seiner Gruppe lernen können. Niemand in dieser Gruppe wird miteinander lernen können. Es ist Ratsam, dass Peter sich eine neue Gruppe sucht.

---

3.

(a)

| $A$                 | $B$                 | $C$                 | $B \rightarrow C$   | $A \rightarrow (B \rightarrow C)$ |
| ------------------- | ------------------- | ------------------- | ------------------- | --------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$                 |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$               |

(b)

| $A$                 | $B$                 | $C$                 | $A \rightarrow B$   | $(A \rightarrow B) \rightarrow C$ |
| ------------------- | ------------------- | ------------------- | ------------------- | --------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$                 |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$               |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$                 |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$               |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$                 |

(c)

| $A$                 | $B$                 | $C$                 | $A \rightarrow B$   | $C \rightarrow A$   | $(A \rightarrow B) \rightarrow (C \rightarrow A)$ |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------------------------------------- |
| $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$                               |
| $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$                               |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$                               |
| $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$                               |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                                 |
| $\color{red}\bot$   | $\color{green}\top$ | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$                               |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{red}\bot$   | $\color{red}\bot$                                 |
| $\color{red}\bot$   | $\color{red}\bot$   | $\color{red}\bot$   | $\color{green}\top$ | $\color{green}\top$ | $\color{green}\top$                               |

---

4.

$$
\begin{align*}
((A \lor B) \lor C) \land (A \lor (B \lor C)) &= ((A \lor B) \lor C) \land ((A \lor B) \lor C) &\text{(Assozi.*)} \\
&= (((A \lor B) \lor C) \land ((A \lor B) \lor C)) \lor \bot &\text{(Neutral.)} \\
&= (((A \lor B) \lor C) \land ((A \lor B) \lor C)) \lor (((A \lor B) \lor C) \land \neg((A \lor B) \lor C)) &\text{(Komplem.)} \\
&= ((A \lor B) \lor C) \land (((A \lor B) \lor C) \lor \neg((A \lor B) \lor C)) &\text{(Distrib.)} \\
&= ((A \lor B) \lor C) \land \top &\text{(Komplem.)} \\
&= ((A \lor B) \lor C) &\text{(Neutral.)} \\
\end{align*}
$$

(*) Assoziativität weiß ich nicht herzuleitern oder drum herum zu arbeiten. Durch die Aufgabenstellung sollte das aber gegeben sein.

---

5.

(a)

$$
\begin{align*}
(C \lor \neg(A \land \neg (C \lor \neg A))) \land (C \lor \neg B)
&= (C \lor \neg(A \land (\neg C \land A))) \land (C \lor \neg B) &\text{(De Morgan)} \\
&= (C \lor \neg(A \land (A \land \neg C))) \land (C \lor \neg B) &\text{(Kommut.)} \\
&= (C \lor \neg((A \land A) \land \neg C)) \land (C \lor \neg B) &\text{(Assozi.)} \\
&= (C \lor \neg(A \land \neg C)) \land (C \lor \neg B) &\text{(Idemp.)} \\
&= (C \lor (\neg A \lor C)) \land (C \lor \neg B) &\text{(De Morgan)} \\
&= (C \lor (C \lor \neg A)) \land (C \lor \neg B) &\text{(Kommut.)} \\
&= ((C \lor C) \lor \neg A) \land (C \lor \neg B) &\text{(Assozi.)} \\
&= (C \lor \neg A) \land (C \lor \neg B) &\text{(Idemp.)} \\
&= C \lor (\neg B \land \neg A) &\text{(Distrib.)}
\end{align*}
$$

(b)

$$
\begin{align*}
\neg (B \lor \neg C) \lor ((\neg B \land A) \land A)
&= \neg (B \lor \neg C) \lor (\neg B \land (A \land A)) &\text{(Assozi.)} \\
&= \neg (B \lor \neg C) \lor (\neg B \land A) &\text{(Idemp.)} \\
&= (\neg B \land C) \lor (\neg B \land A) &\text{(De Morgan)} \\
&= \neg B \land (C \lor A) &\text{(Distrib.)}
\end{align*}
$$

(c)

$$
\begin{align*}
(C \lor A) \land (C \lor \neg (B \lor \neg A))
&= C \lor (A \land \neg (B \lor \neg A)) &\text{(Distrib.)} \\
&= C \lor (A \land (\neg B \land A)) &\text{(De Morgan)} \\
&= C \lor (A \land (A \land \neg B)) &\text{(Kommut.)} \\
&= C \lor ((A \land A) \land \neg B) &\text{(Assoz.)} \\
&= C \lor (A \land \neg B) &\text{(Idemp.)}
\end{align*}
$$

(d)

$$
\begin{align*}
(\neg B \lor A) \land ((\neg B \lor \neg C) \land (\neg(\neg A \lor C) \lor \neg B))
&= (\neg B \lor A) \land ((\neg B \lor \neg C) \land (\neg B \lor \neg(\neg A \lor C))) &\text{(Kommut.)} \\
&= (\neg B \lor A) \land (\neg B \lor (\neg C \land \neg(\neg A \lor C))) &\text{(Distrib.)} \\
&= (\neg B \lor A) \land (\neg B \lor (\neg C \land (A \land \neg C))) &\text{(De Morgan)} \\
&= (\neg B \lor A) \land (\neg B \lor (\neg C \land (\neg C \land A))) &\text{(Kommut.)} \\
&= (\neg B \lor A) \land (\neg B \lor ((\neg C \land \neg C) \land A)) &\text{(Assoz.)} \\
&= (\neg B \lor A) \land (\neg B \lor (\neg(C \land C) \land A)) &\text{(De Morgan.)} \\
&= (\neg B \lor A) \land (\neg B \lor (\neg C \land A)) &\text{(Idemp.)} \\
&= \neg B \lor (A \land (\neg C \land A)) &\text{(Distrib.)} \\
&= \neg B \lor (A \land (A \land \neg C)) &\text{(Kommut.)} \\
&= \neg B \lor ((A \land A) \land \neg C) &\text{(Assoz.)} \\
&= \neg B \lor (A \land \neg C) &\text{(Idemp.)} \\
\end{align*}
$$