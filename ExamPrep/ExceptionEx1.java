// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class ExceptionEx1 {
//     public static void main(String[] args) {
//         cd "f:\SGGS\JavaCodeMomentum\ExamPrep\"; if ($?) { javac ISE2.java } ; if ($?) { java ISE2 }
//     }
//     // public static void main(String[] args) {
//     //     System.out.println("main : hello");
//     //     doStuff();
//     //     System.out.println("Main : end");
//     // }

//     // public static void doStuff() {
//     //     try {

//     //         doMoreStuff();
//     //     } 
//     //     finally{

//     //     }
//     //     // catch (Exception e) {
//     //     //     e.printStackTrace();
//     //     // }
//     // }

//     // public static void doMoreStuff() {
//     //     // try {

//     //     System.out.println(10 / 0);
//     //     // } catch (Exception e) {
//     //     // e.printStackTrace();
//     //     // }
//     // }
// }

// import java.io.File;
// import java.io.IOException;

// public class ExceptionEx1 {
//     public static void main(String[] args) {
//         try {
//             // Change directory
//             ProcessBuilder changeDir = new ProcessBuilder("cmd", "/c", "cd", "f:\\SGGS\\JavaCodeMomentum\\ExamPrep\\");
//             changeDir.directory(new File("f:\\SGGS\\JavaCodeMomentum\\ExamPrep\\"));
//             Process changeDirProcess = changeDir.start();
//             int changeDirResult = changeDirProcess.waitFor();

//             // Compile Java file
//             ProcessBuilder compile = new ProcessBuilder("javac", "ISE2.java");
//             Process compileProcess = compile.start();
//             int compileResult = compileProcess.waitFor();

//             // Run Java file
//             ProcessBuilder run = new ProcessBuilder("java", "ISE2");
//             Process runProcess = run.start();
//             int runResult = runProcess.waitFor();

//             // Check results
//             if (changeDirResult == 0 && compileResult == 0 && runResult == 0) {
//                 System.out.println("Java file executed successfully.");
//             } else {
//                 System.err.println("Error in executing Java file.");
//             }
//         } catch (IOException | InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

class ExceptionEx1 {
    static void myMethod(){
        try{
            Thread.sleep(1213);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
        try{
            Thread.sleep(1213);
            // throw new InterruptedException();
        }catch(InterruptedException e){
            System.err.println(e);
        }
    }
}
