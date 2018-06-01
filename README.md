# test55

Java program to parse any input text and extract every date it contains and count the dates 
using <a href="http://natty.joestelmach.com/">NATTY</a>.

<h3>Exemple</h3>

 `input text :`
``` markdown
Marvin Lee Minsky at the Mathematics Genealogy Project; 20 May 2014

Marvin Lee Minsky at the AI Genealogy Project. {reprint 18 September 2011)

"Personal page for Marvin Minsky". web.media.mit.edu. Retrieved 23 June 2016.

Admin (January 27, 2016). "Official Alcor Statement Concerning Marvin Minsky". 

	Alcor Life Extension Foundation. Retrieved 2016-04-07.

"IEEE Computer Society Magazine Honors Artificial Intelligence Leaders". 

	DigitalJournal.com. August 24, 2011. Retrieved September 18, 2011. 

	Press release source: PRWeb (Vocus).

"Dan David prize 2014 winners". May 15, 2014. Retrieved May 20, 2014.
```

 `The programe produce (output) :`
``` markdown
2014:
		-5
			-20 (2)
2011:
		-9
			-18 (2)
2016:
		-6
			-23 (1)
2016:
		-1
			-27 (1)
2016:
		-4
			-7 (1)
2011:
		-8
			-24 (1)
2014:
		-5
			-15 (1)
```


