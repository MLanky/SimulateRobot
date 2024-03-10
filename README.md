# SimulateRobot
This is a fun little program I created when learning about building GUI's with SceneBuilder and JavaFX. The "R" represents the robot, and the "B" and "C" represent packages that the robot can pick up and drop off.

Move the robot with the "move up", "move down", "move left", and "move right" buttons on the GUI.

Pick up packages with the "pick up" and "drop off" buttons on the GUI.

# Running the program from the command line
Please note that this tutorial is for Windows only.

NOTE: If you are using JDK version 10 or below, you can directly run the javafx application as you do with other java programs as javafx is preinstalled in JDK 10 or below. In order to check your JDK version, type the following command in your command line:

javac -version

To compile a javafx application from the command line:

Step 1: Type "cd" and then write the path starting from "C:" (C drive) to the location where you have saved your code above in .java format.

Step 2: Then you need to press Enter so that the command line would open that path. If it yields an error, please recheck the path you passed. If in case the path has white spaces in between somewhere. Please surround it with double quotes(" ") after writing cd. Then try again.

Step 3: Type the following in your command line in the folder where your .java file is:

javac --module-path "Path to your javafx lib folder" --add-modules javafx.controls,javafx.fxml RobotClass.java

In the double quotes above, you need to write the path to the lib folder in your javafx-sdk folder which you installed from openjfx.io.

The above code will compile your .java file into .class file, a code format that can be interpreted by JVM (java virtual machine). 

After this, you need java to interpret and run the .class file you just created using the above syntax.

In order to do that, you just need to remove "c" from "javac" in the above code and also remove the .java extension. Other things remain the same.

java --module-path "Path to your javafx lib folder" --add-modules javafx.controls,javafx.fxml RobotClass.java

This should work perfectly and help you run your javafx application from cmd.
