1.) Type command "clear" in order to have a clean terminal for the next step.
2.) Type "git status" and you will see there is nothing to commit and everything is up to date with your remote repository.
3.) "git checkout -b develop" will create a new branch on your local repository called "develop" and it will checkout(Move current position) to that branch.
4.) "touch READMETWO.md" will create a new file with that name in your develop branch. 
5.) "git add -A" will add files to staging area so that they can be committed.
6.) git commit -m "READMETWO added" will commit that changes.
7.) "git push -u origin develop", this will guide you to a --set-upstream-to command, type that. That will create the develop branch on your remote repository and push the changes. 