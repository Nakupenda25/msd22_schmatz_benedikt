# Exercise 5 - Branching and logging

## What is this for?

This is an exercise designed to teach us how to use git branches and logging with Log4j2. We learned how to configure it and how to use it in our code.
This has all been done on a test-branch and then merged into the main branch.

## What's going on right now?

Nothing really, this exercise was really self-explanatory. We just had to follow the instructions and everything worked out fine.

## How did you do it?

First, we created a new branch and switched to it. Here, we first incorporated log4j2 into our Main-Class, and then proceeded to add some logs for the different methods of Caclulator.java

Afterwards, we created a configuration file (I used .xml) to set some properties for the logger. I set the log level to "debug", so that most logs would be displayed.

We also made the logger write logs to a seperate file (You can do this yourself by configuring your [template](src/main/resources/log4j2.xml.template) first).

Then, we merged the branch into the main branch and pushed it to GitHub.

Done. Hooray!