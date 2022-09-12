# BlackjackProject
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⡟⠁⢀⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠹⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⣼⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠈⠿⡿⣿⠿⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠰⠿⠧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢠⠃⠹⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢀⠏⠀⠀⢻⣧⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⡞⠒⠒⠒⠒⢿⣇⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⣀⣴⣇⡀⠀⠀⢀⣈⣿⣆⡀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢲⣶⠆⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣶⣿⣾⣶⡀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⡟⠀⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠁⢀⣰⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
#Description
Ever just want a place to let your hair down and have fun but you have social anxiety and you love computers. Well, you might be a software developer, and you also will likely enjoy playing Black Jack against a faceless console. If this is at all ringing true, this Black Jack Application welcomes you with open arms.

All jokes aside, this Black Jack Application will deals two cards to each player with the dealer having one card face down, just like in a real black jack game.  It allows the user to hit or stand.

This game also accounts for the Ace card being either a 1 value or an 11 value. It also will announce a tie (push).

This game can be played endlessly and the loop shuffles and uses a new deck with each play.
#Technologies Used
I used ASCII art for this README that I was able to find online and I composed this using the ATOM text editor. The code is written in Java using Eclipse as my IDE.
#References
I looked at quite a few other Black Jack programs on youtube, stack overflow, and GitHub for inspiration and help problem solving. Code is read more often than written and I often cannot read code on these pages. People use unique and advanced syntax and dot notation that I am not equipped to read or understand. I will however see someone use a boolean here or there and it sparks my memory of ways that maybe MY code could use a boolean. That was helpful. It also was fascinating to see all the different ways other people have made this code happen.

I did find oracle docs pages useful when I got lost trying to decipher how to properly write my abstract class. I was having trouble properly initializing methods versus actually writing out a code block body.
#Lessons Learned
There were many challenges to this code. I struggled quite a bit with this and to be honest I am surprised at myself for finishing by this evening. I did have to also take on this coding challenge while drilling this weekend for my reserve unit so I was only able to get a little TA help Saturday and the help I got I actually had to call in from my car in the parking lot to get. Also, no A/c working in my building this weekend... In Texas...

Needless to say, I am proud of myself for getting this done. I spent hours Friday night and some of Saturday toiling over the class structure alone. I still feel that the program could have been cleaner. I know steps in my application could have been done as more methods both in the application itself and in the classes, but I fell short on time.  

The biggest single method challenge, once I got the hang of dot notation and calling from other classes, was the Ace card. This was very difficult to wrap my mind around. I started with the idea of determining if an Ace was 1 or 11 based on the starting value of the hand, but that didn't work and then my husband pointed out that Black Jack aces can be an 11 but become a 1 if they would cause a bust. This was a niche Black Jack tidbit I didn't know. The magic of that conversation was that the Ace card TRANSFORMS. so I scoured the internet trying to find something that could help me synthesize the Ace logic and finally pulled together the logic. I literally had a headache, but it appears to work.

I am most concerned that I missed bugs. This is a hard code to test because every time it runs the cards change, Just to test the Ace I had to play MANY hands of Black Jack hoping it would eventually produce enough cards to verify the code worked.
#GitHub upload note
Please note- I did away with the Dealer class, the BlackJackApp is the Dealer.
Also there is a class called dealingApp, that was from the drills and was a testing class I was playing with. It is not part of the final code.
I wanted to remove these from GitHub but I was concerned I was going to remove additional code that was necessary for the project, so I left them.
#Thank you and hope you enjoy my game.
