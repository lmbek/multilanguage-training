public class Program {

    // Load the Go DLL
    static {
        // Get the current working directory
        String currentDir = System.getProperty("user.dir");

        // Load the Go DLL with the relative path from the current directory
        System.load(currentDir + "/../go/go.dll");
    }

    // Declare native method (the one in your Go code)
    public native void SayHello();

    public static void main(String[] args) {
        // Call the native method
        new Program().SayHello();
    }
}
