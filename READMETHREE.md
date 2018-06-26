1.) Type command "git status"
2.) If working branch is currently on develop, type command "git checkout -b feature/classes".

NOTE - Why we have to make sure we are in the develop branch before making the feature branch is because all feature branches are supposed to be branched out from the develop branch, and the develop branch has to be branched out from the master branch. So, for example, if we are going to make another feature branch once we are done with the current feature, we have to go back to develop and then make a new feature branch.

3.) "touch READMETHREE.md" to create the third readme file. 
4.) "touch Vehicle.java" in order to create a java file. The code for the java file is in the remote repository.
5.) git add -A
6.) git commit -m "Readme and Vehicle class added"
7.) git push --setupstream origin feature/classes
8.) Once you're done with your feature branch, go to the remote repository, go to your feature branch and create a pull request.
9.) after clicking "Create a pull request", set the base branch as the develop branch and compare as the feature branch and create pull request, afterwards, confirm and pull merge and confirm merge.

NOTE - The reason for creating a pull request is to merge the feature branch with the develop branch. Once you're done with a feature, you need to merge that to you develop branch.