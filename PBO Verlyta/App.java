//Inheritance pewarisan

//abstract tidak jelas, tidak bisa langsung dibuat objek
abstract class Peminjaman {
    void denda() {
    }

    void pengembalian() {
    }
}

class PBO extends Peminjaman {
    @Override
    void denda() {

    }
}

// encapsulation terdapat 3 sintax
// overloading jika ingin memiliki banyak fungsi dalam 1 kelas maka parameternya
// harus berbeda
class Parent {
    public int x;

    void print(String tipeAnggota, int bayar) {
        System.out.println("Print Parent");
    }

    void print(String tipeAnggota) {
        System.out.println("Print Parent");
    }

    void print() {
        System.out.println("Print Parent");
    }
}

// overriding jika masih ingin memakai fungsi yang sama dengan kelas Parent maka
// menambahkan @override
class A extends Parent {
    @Override
    void print() {
        System.out.println("Print A");
    }

    void test() {
        print();
        x = 5;
    }
}

class B extends A {
    void test2() {
        print();
    }
}

public class App extends Parent {
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("Mahasiswa");

        A a = new A();
        a.print();

    }
}