1.) Type command "git status"
2.) If working branch is currently on develop, type command "git checkout -b feature/classes".

NOTE - Why we have to make sure we are in the develop branch before making the feature branch is because all feature branches are supposed to be branched out from the develop branch, and the develop branch has to be branched out from the master branch. So, for example, if we are going to make another feature branch once we are done with the current feature, we have to go back to develop and then make a new feature branch.

3.) "touch READMETHREE.md" to create the third readme file. 
4.) "touch Vehicle.java" in order to create a java file. The code for the java file is in the remote repository.
5.) git add -A
6.) git commit -m "Readme and Vehicle class added"
7.) git push --setupstream origin feature/classes