void main() {
    short myShortValue = 32767; // 0111111111111111

    IO.println(myShortValue); // 32767

    myShortValue += 1;

    IO.println(myShortValue); // 1000000000000000
}