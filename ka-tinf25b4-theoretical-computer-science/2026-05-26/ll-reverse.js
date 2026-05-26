class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    append(value) {
        const node = new Node(value);
        if (this.head === null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    toArray() {
        const result = [];
        let current = this.head;
        while (current !== null) {
            result.push(current.value);
            current = current.next;
        }
        return result;
    }

    // My implementation of the reverse function
    reverse() {
        let current = this.head;
        let next = current.next;
        current.next = null;
        this.tail = current;
        while (next !== null) {
            const nextNext = next.next;
            next.next = current;
            current = next;
            next = nextNext;
        }
        this.head = current;
    }
}

const list = new LinkedList();
list.append(1);
list.append(2);
list.append(3);
list.append(4);
list.append(5);

console.log("before:", list.toArray());
list.reverse();
console.log("after: ", list.toArray());
