<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #10: Dubstep</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Dubstep.java](Dubstep.java)
* <b>Test Class:</b> [SongTests.java](SongTests.java)
* <b>Solved:</b> Thursday, April 28<sup>th</sup>, 2016

<b>Description:</b>

Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance. Recently, he has decided to take a couple of old songs and make dubstep remixes from them.

Let's assume that a song consists of some number of words. To make the dubstep remix of this song, Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero), after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words), and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX".

Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music, he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.

<b>Input</b>

The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length doesn't exceed 200 characters

<b>Output</b>

Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.