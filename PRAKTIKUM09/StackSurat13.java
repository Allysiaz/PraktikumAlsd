public class StackSurat13 {
    Surat13[] stack;
    int top;
    int size;
    
    public StackSurat13 (int size) {
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
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

    public void push(Surat13 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat13 pop() {
        if (!isEmpty()) {
            Surat13 proses = stack[top];
            top--;
            return proses;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }

    }

    public Surat13 peek() {
        if (!isEmpty()) {
           return stack[top]; 
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }


}
