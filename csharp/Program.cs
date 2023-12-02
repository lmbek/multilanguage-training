using System;
using System.Runtime.InteropServices;

class Program
{
    // Import the Go DLL on Windows
    [DllImport("./../go/go.dll")]
    public static extern void SayHello();

    static void Main()
    {
        // Call the Go function from C#
        SayHello();
    }
}
