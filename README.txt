Flex App Readme

Matthew Demoy - Database setup, Progress Activity, internal timers and program object and child objects, 
Joe Murphy - Schedule Activity, Created increase and decrease features, xml setup for workout view, made sure each screen functions when rotated,
We both worked on the powerpoint and matt recorded that walkthrough
Overall Matt did a little more back end and Joe did a little more front end. 50/50 split.

Howdy, this is Matt from the flex team and this is the final update on the Flex app.
Allot has changed since the proposal mostly due to time constraints but what
weve created at the end of this short timespan is just as important to us and
feature rich for the user. Initially the app was suppose to track workouts down
to the rep, show your progress on lifts and calculate you weight using advanced
algorithms. These three components would solve much of the book keeping usually
required to be a proficent weightlifter. In the end we abandoned the
weight calculating algorithms in favor of a manual incremental increased
done by the user. While this method is less time consuming to be implemented
it is just as usefull to a lifter as compared to the advanced lifter since the
app can remember weights rather than the lifter. We also tracked the workouts
down to the set rather than the repetition because it was to confusing
to keep track of where the user was at in the program when the reps was counted.
Since the main focus of the app is simplicity in utility taking away these two
features helped with these goals immensley. Lastly we chose to implement one
fitness program rather than multiple so we could focus on having the features
of the app work really well for that one program.

This app uses a firebase db and graph view
If you are getting build errors check the gradle build for the app and see 
if its trying to implement a directory local to me or joe's machine. 
If you disconnect from the database their should be default values so the 
app fully functions without the db but will just lack the feature of saving 
weights.

