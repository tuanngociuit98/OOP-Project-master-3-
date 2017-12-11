package Game;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class HighScore extends BasicGameState{
	int[] listScore=new int[10];
	String [] listname= new String[10];
	public static int Scores;
	public static String  name;
	

	

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		
		
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		
		
	}
	public void move(int begin,int score)
	{
		for(int i=begin;i<10;++i)
		{
		 int b=listScore[i];
		 listScore[i]=score;
		 score=b;
		}
	}
	public void move(int begin,String Name)
	{
		for(int i=begin;i<10;++i)
		{
		 String b=listname[i];
		 listname[i]=Name;
		 Name=b;;
		}
	}
	
	public  void sapxep(int Scores, String name)
	{
		this.Scores=Scores;
		this.name=name;
		for(int i=0;i<10;++i)
		{
			if(listScore[i]<Scores)
			{
				move(i,Scores);
				move(i,name);
			}
		}
	}

	@Override
	public int getID() {
		
		return 3;
	}

}
