# gamesimulation
games won
Your challenge this week is to create a Java application that will simulate the outcome of the hands of any card game where money can change hands.
Your application will have the following features – the player will be able to input integer values for starting bankroll, desired outcome (the players bankroll at which they will quit the game), and the number of trials to run.
Thus the player may start with a bankroll of $50, a desired bankroll of $250 (at which they will quit the game), and 100 trials to run.
The application will use nested loops and selection structures to simulate a series of card games, keeping track of the number of games won (and lost).
At the end of the application’s run it will print to the screen the number of wins out of the number of trials and the percent of games won.
This problem is clearly one where you should solve the problem before you start to write code since there are many possible approaches, of which only one will produce a good solution. On the next page I have included a suggested solution to this problem.
Your file will, of course, begin with the standard comment block that you have been using since the start of this course.
By now you should be able to write Java code that is simple, clear, and follows the guidelines expressed in the textbook and discussed in our class meetings. I expect your code to be neat, well organized, and easy to read. The output to the screen will be well organized.
NOTE: You will use only Java code for which examples have been demonstrated in the textbook thus far or discussed in the on-line class meetings.
This assignment is due not later than the end of the day, Monday, October 14.
Put your source code (TheGambler.java) for this project in a zip folder named wk5YourLastName.zip. Upload the zip folder to the appropriate link on the Blackboard Assignments page.
A suggested solution to the Kenny Rogers Project
In a Java Application
User inputs integer value for gamblers starting bankroll
User inputs integer value for gamblers desired bankroll – if the gambler’s bankroll reaches this value he quits the game
User inputs integer value for the number of trials to perform – each trial will consist of enough games to either reduce the gamblers bankroll to zero or increase it to the desired bankroll
Declare an integer variable (set to zero) to keep track of the number of wins
The solution, obviously, will consist of nested looping structures and selection structures
First (outer loop) will loop to perform the required number of trials
Set cash equal to stake
Second (inner loop) will simulate the results of one card game. This loop will repeat as long as cash is greater than zero and less than the desired bankroll
Assume that the gambler has chance of winning the game of less than 50%
Use a random number generator to determine if the gambler won the game
If the gambler won, add $1.00 to his cash
Otherwise subtract $1.00 from his cash
At the end of the inner loop (one game is run) -
If the value of cash equals the gamblers desired bankroll, then increment wins by one
After the outer loop stops, print to the screen the number of wins out of the number of trials and the percent of games won.
