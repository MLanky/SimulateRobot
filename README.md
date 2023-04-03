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

Now in case it feels a burden to you to write this code again and again. You could do the following.

An environment variable could help you compile the above codes into a single word which you can type in your command line surrounded by %.

In order to set your environment variable, go to the search bar in the bottom left corner of the screen. Then type environment variables in the search bar.

You can click the open button in order to open it in the control panel. Then follow these steps:

Go to tab: Advanced, which will probably be the default tab when you open it.
Click "Environment Variables" in the bottom right.
Click "New" in the 2nd bottom panel.
set "Variable name" as "JAVA_FX"
set "Variable value" as the following:
--module-path "Path to your javafx lib folder" --add-modules javafx.controls,javafx.fxml Please write the full correct path to your lib folder in your openjfx folder that you downloaded. And make sure it is inside double quotes.

After doing that, click "OK" and then close the control panel. Now you need to restart the command line application. Without restarting, it will not show the environment variable that you just set. Just close it and open it again.

Now type the following in your command line: echo %JAVA_FX%

This should show you the variable value that you had just set. If it prints JAVA_FX, then please consider re-referring the above steps and checking for any path errors you made while typing the path to the lib folder in variable value in environment variables.

If it shows the correct value, continue:

Now you can type the following command in your command line. Make sure you are in the folder where your .java file is saved, if not please direct to the folder by using the "cd" command mentioned earlier:

javac %JAVA_FX% YourFile.java Make sure to change the "YourFile" name to the name of your java file.

Then it should compile the java file into a java class file. Then you type the following in your command line: java %JAVA_FX% YourFile

This should work fine.

If you have any questions, please mention them in the comments section.
