public class StackTugasMahasiswa13 {
    Mahasiswa13[] stack;
    int top;
    int size;

    public StackTugasMahasiswa13 (int size) {
        this.size = size;
        stack = new Mahasiswa13[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa13 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa13 pop() {
        if (!isEmpty()) {
            Mahasiswa13 m = stack[top];
            stack[top] = null;
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa13 peek() {
        if (!isEmpty()) {
            return  stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa13 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    
    public int jumlahData() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim +"\t"+ stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi13 stack = new StackKonversi13();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
