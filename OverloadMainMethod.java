class OverloadMainMethod{
    static{
        main("2");
    }
    public static void main(String[] args) {
        System.out.println("Original main()");
        main(5);
    }
    public static void main(String  str) {
        System.out.println("main(String)");
    }
    public static void main(int a) {
        System.out.println("main(int)");
    }
}