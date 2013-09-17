1. What optimization techniques did you use?

Remove all comments and as much whitespace as possible
Make sure all JS and CSS files are combined
Make sure CSS is at the top of the page
Make sure Javascript and CSS are external
Make sure Javascript is at the bottom of the page

2. How did you ensure that the HTML5 offline application cache worked?

The HTML5 offline application cache cannot be tested locally because 
a message will pop up asking, "This website is asking to store data 
for offline use." When I try to press accept, the button does not 
work. 

Thus, I pushed my performance folder to my jmao01.github.com repo 
and so that I could access my online application in 
http://jmao01.github.com/performance/index.html. This way, I could 
successfully press the accept button and check the application 
cache in firefox by looking under Options->Options->Advanced->
Offline Web Content and User Data. When I accept the application 
cache, disconnect from the tufts-guest wireless internet 
connection, and reenter the URL, the website still shows up. 

3. What tools did you use to test the performance of this updated 
version of your game? Using no tools for this assignment is not acceptable.

JSMin
Firebug
Speed Tracer for Chrome
Google PageSpeed Tools

4. What performance aspects have been improved (e.g., loading time, size)? 
Please provide numbers, percentages, or letter grades.

Loading Time -
	Firebug: After implementing the application cache, the loading time 
			 is the following:
					index.html = 5 ms
					style.css = 3 ms
					game.js = 3 ms
					assets/frogger_sprites.png = 1ms
					dead_frog.png = 1ms
	Speed Tracer for Chrome: Event trace of the layout is 1 ms.
	Google PageSpeed Tools: Before editing enhancements, the frogger game 
							received a grade of 78/100 on mobile and 91/100
							on Desktop. After editing enhancements, the 
							frogger game received a grade of 83/100 on mobile 
							and 93/100 on Desktop. 
							The following conditions have passed: Leverage browser 
							caching, optimize images, avoid landing page redirects, 
							enable compression, minify CSS, minify HTML, minify 
							Javascript, prioritize visible content, reduce server 
							response time

Size - 
	JSMin: Before minifying the game.js file, game.js was a size of 12,970 bytes. 
		   After minifying the game.js file, game.js was a size of 10,047 bytes. 
		   Images, HTML, and CSS files have also been minified.
		   
5. Are there potential performance issues?
One performance issue project is that when accept the online application 
cache, I can only see the page work if I retype the URL. Refreshing the 
page results in a "Server not found."