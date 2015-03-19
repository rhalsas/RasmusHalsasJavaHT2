import java.util.ArrayList;



public class Deck {

	
	
	private ArrayList<Card> CardCheck;
	static private Deck instance;
	public void AddToDeck(Card card){
		if(this.CardCheck == null) this.CardCheck = new ArrayList();
		this.CardCheck.add(card);
	}
	public Card getCard(int key){
	
		return this.CardCheck.get(key);
		
	}
	public Deck(){
		int z = -1;
		String type = "";
		String rank = "";
	
		for(int i = 0 ; i < 52; i++)
		{
			if((i % 13) == 0)z++;
			int buf = 0;
			buf = i - (13*z);
			
			switch(z){
				case 0:
					type = "Heart";
					break;
				case 1:
					type = "Spade";
					break;
				case 2:
					type = "Clubs";
					break;
				case 3:
					type = "Diamond";
					break;
			}
			switch(buf){
				case 0:
					rank = "Ace";
					break;
				case 1:
					rank = "2";
					break;
				case 2:
					rank = "3";
					break;
				case 3:
					rank = "4";
					break;
				case 4:
					rank = "5";
					break;
				case 5:
					rank = "6";
					break;
				case 6:
					rank = "7";
					break;
				case 7:
					rank = "8";
					break;
				case 8:
					rank = "9";
					break;
				case 9:
					rank = "10";
					break;
				case 10:
					rank = "Jack";
					break;
				case 11:
					rank = "Queen";
					break;
				case 12:
					rank = "King";
					break;
				
				
			}		
			this.AddToDeck(new Card(type + " " + rank));

		}
		
	}
	public void Deal(int amount){
		for(int i = 0;i < amount; i++)
		{
			System.out.print(this.getCard((int) Math.floor(Math.random()*this.CardCheck.size())).getName());
		}
	}
	public void showDeck(){
		for(int i = 0;i < 52; i++)
		{
			System.out.print(this.getCard(i).getName());
		}
	}
	static Deck getInstance(){
		if(instance == null) instance = new Deck();
		return instance;
	}
	
}
