/*
a = jahr mod 19
b = jahr mod 4
c = jahr mod 7
k = jahr div 100
p = (8k + 13) div 25
q = k div 4
m = (15 + k - p - q) mod 30
n = (4 + k - q) mod 7
d = (19a + m) mod 30
e = (2b + 4c + 6d + n) mod 7
ostern = (22 + d + e) (bezogen auf 1. März)
 */
void main() {
    int jahr = 2025;
    int a,b,c,k,p,q,m,n,d,e,ostern;

    a = jahr % 19;
    b = jahr % 4;
    c = jahr % 7;
    k = (int) jahr / 100;
    p = (int) (8 * k + 13) / 25;
    q = (int) k / 4;
    m = (15 + k - p - q) % 30;
    n = (4 + k - q) % 7;
    d = (19 * a + m) % 30;
    e = (2 * b + 4 * c + 6 * d + n) % 7;
    ostern = (22 + d + e);

    IO.println(ostern + " Tage vom Anfang des März");
    if (ostern > 31) {
        IO.println("Also: " + ostern % 31 + " April");
    }
}