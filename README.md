# spatial_clustering

I attach to this post an algorithm for spatial clustering which 
is freely available in git-hub. 

It is taken from the first chapter in my PhD, 
and was jointly developed with Meytal Zahavi.

The algorithm was born from the lack of public algorithm 
which was required for research on the first chapter.
The algorithm takes as input a .csv file which contains 
information on localities: population and coordinates, 
and produces output of a .csv file, 
which creates sub areas (inside the major areas, or without such data). 

The parameters which can be tuned are - population size, and distance. 
For instance, in our case, the script ran a loop which assigned a sub-area 
for localities with a population less than 2,000, 
if it had nearby localities within 250 meter radius of its given coordinates.
