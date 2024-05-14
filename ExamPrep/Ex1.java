class Me {
    static final int a;

    Me(int a) {
        this.a = a;
    }

}

class Ex1 {
    public static void main(String[] args) {
        Me obj = new Me(10);
        System.out.println(Me.a);
    }
}