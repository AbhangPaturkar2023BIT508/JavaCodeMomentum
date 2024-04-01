class Me {
    static {
        System.out.println("Me:static ");

    }
    {
        System.out.println("Me:init ");
    }

    Me() {
        System.out.println("Me:constructor ");
    }

    class DeptBase {
        String deptName = "CSE";
        static int totalFaculty = 15;

        static {
            System.out.println("Dept:static ");
            System.out.println("base");

        }
        {
            // System.out.println("Dept:init " + noOfDept + " " + director);
            System.out.println("base");
        }

        DeptBase() {
            // System.out.println("Dept:constructor " + noOfDept + " " + director);
            System.out.println("base");
        }
    }
}

class Sggs extends Me{
    int noOfDept = 2;
    static String director = "KokareSir";

    static {
        System.out.println("Sggs:static " + director);

    }
    {
        System.out.println("Sggs:init " + noOfDept + " " + director);
    }

    Sggs() {
        System.out.println("Sggs:constructor " + noOfDept + " " + director);
    }

    class Dept extends DeptBase {
        String deptName = "CSE";
        static int totalFaculty = 15;

        static {
            System.out.println("Dept:static " + director);
            System.out.println(totalFaculty);

        }
        {
            System.out.println("Dept:init " + noOfDept + " " + director);
            System.out.println(totalFaculty + " " + deptName);
        }

        Dept() {
            System.out.println("Dept:constructor " + noOfDept + " " + director);
            System.out.println(totalFaculty + " " + deptName);
        }
    }

    public static void main(String[] args) {
        Sggs obj = new Sggs();
        Dept obj2 = obj.new Dept();
        DeptBase obj3 = obj.new DeptBase();
    }
}

// class InnerClass {
//     public static void main(String[] args) {
//         Sggs obj = new Sggs();
//         Dept obj2 = obj.new Dept();
//     }
// }
