#Template Pattern

###In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.

##Verify the output.

>Cricket Game initialize Start playing

>Cricket Game Started,  Enjoy the game!

>Cricket Game Finised


>Football Game initialize Start playing

>Football Game Started,  Enjoy the game!

>Football Game Finised




	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();

		System.out.println();

		game = new Football();
		game.play();

	}