package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	public ArrayList<Note> convertStringToArrayList(String score){
		ArrayList<Note> notes = new ArrayList<Note>();
	}
	

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void printScores()
	{
		for(String sss:score.split(" "))
		{
			System.out.println(sss);

			for(int i = score.length() - 1; i >= 0; i--)
			{
				if(score[] = 1)
				{
					System.out.println("Quaver");
				}
				else
				{
					System.out.println("Crochet");
				}
			}
		}
	}

	public void loadScore()
	{
		for(int i = score.length() - 1; i >= 0; i--)
		{
			notes.add(score.charAt(i));
		}
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
