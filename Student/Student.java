/** Java Programming on A Mac without running Terminal */

/** Step 1: To Get Java code to run on a Mac using Xcode IDE you will need to first open Xcode and start a new project (Command Key, Shift Key, N) and go down to OS X --> Other --> External Empty Build --> Enter. */

/**Step 2: Next you will name your Product Name (Project Name Here) and the build tool needs to be set to (usr/bin/javac)--> find a location to save it and click Next */

/** Step 3: Arguements (commands passed to the compiler) expand to include (($TARGETNAME).java) --> then you will change your target name to match up with the file name. */

/** Step 4: File --> New --> file --> OS X --> Other --> Empty --> (FILENAME.java) */

/** Now the empty file is ready to be worked with.
 Here you can add in code.
 public class FileName {
 public static void main(String[] args){
 System.out.println("Hello World!");
 }
 }
 */

/** Noticed nothing ran. Here you can go in to Terminal and run the Java program by executing it with the command(s):
 open Terminal:
 cd(press space bar) --> Drag in the file (located where it was saved i.e Desktop) -->
 Enter --> java (FileName) --> Enter
 (results showen in Terminal)
 --> clear --> enter
 
 in Xcode:
 Go to Product --> Scheme --> Edit Scheme --> Click Run (In the side bar) -->
 info --> Executable --> Other --> Press (Command + Shift + G) --> type in (usr\bin\java)
 --> Click the Java file --> Enter.
 */

/** Arguements
 Arguements to be passed at launch
 ($(TARGETNAME))
 Enviornment Variables
 Name: CLASSPATH
 value: ($(PROJECT_DIR))
 Expand variables by Based on: (FileName) target.
 
 *OPTIONAL*
 Options --> Working Directory --> custom Directory (for other projects and files to be accessed)
 */


/*
Trevis Fields
 CIS 18A Mon/Wed 2:20-3:45
 HUM RM 324
 Professor Casolaro
 Homework # 3 pg 174 
 Exercise 12 (A-C)
*/





