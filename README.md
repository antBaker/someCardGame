# someCardGame.java

Group name: [Free Space]

Group members: [Antony Baker, Jobayer Hossain, Tosca Stoloff]

Group mentor: [Richard Drinkwater]

Project title: [Pyramid Solataire]

Project page: [https://github.com/antBaker/someCardGame]

Instructions for use: 
Game is structered with rows going from 1 - 7 down. and index's are indicated in (brackets). When entering moves please provide the index as well as the row after. Be honest or it will break.
type integer for index and <enter> then type integer <enter> for the row. This is the basic structure of inputs. For single inputs such as the king as it adds to 13 please just input index of king or indicate it in the draw pile.
Initial construction was anticpating mouse x and y inputs to determine row and index however we did not finish a GUI element. 

Please download jar file and run this command in terminal.
Use command java -jar someCardGame.jar in terminal

Tools used: Game is text based tools used include, ArrayLists, JOptionPane, Scanner and Random Libraries. 
The rest of the code is written using the java language util. Simple gui using NetBeans java swing however incomplete.

Concepts used: Shuffling alrgorithm learnt in Csc 102 is used. (Fisher algorithm). Classes are used and enum classes for the suite and rank values of the card objects
ArrayList functions are used extensively to manage card objects and there movement.
Scanner class used to get simple index and position inputs of selection from user.

Assumptions: [State ANY assumptions about how you expect the system will be used or run]
-User has jdk installed and are able to compile and run java files in command line. Text based pyramid solitaire ONLY.


Limitations: [State ANY limitations concerning what your program cannot do, though those functions may be implied by the nature of the project]
-Limitations are that understanding of the pyramid solitaire are assumed. Rows start from 1-7 going down. indexes are in (brackets). Partial bugs if user has unexpected inputs not all are accounted for. But game can be played fully if user follows the
traditional rules of pyramid solitaire.
