package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	public ArrayList<Note> convertStringToArrayList(String score)
	{
		ArrayList<Note> notes = new ArrayList<Note>();
	}
	
	private float leftBorder;
	private float border;

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
				if(duration = 1)
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
		drawNotes();
		textAlign(CENTER, CENTER);

		for(int i = 0; i <= 8; i++)
		{
			float x = map(i, 0, 8, leftBorder, width - border);
			drawLine(10, 50, 200, 50);
			text(i, x, border/2);	
		}

		for(int i = 0; i <= score.size; i++)
		{
			float y = map(i, 0, score.size(), border + 50, height - border - 20);
            Note t = score.get(i);
            float x1 = map(t.getStart(), 1, 30, leftBorder, width - border);
            float x2 = map(t.getEnd(), 1, 50, leftBorder, width - border);
            int c = (int) map(i, 0, score.size(), 0, 50);
            fill(c, 255, 255);
            rect(x1, y - 20, x2 - x1, 40);
            fill(255);
            textAlign(CENTER, CENTER);
            text(t.getTask(), 20, y);
		}
			
	}

	void drawNotes()
	{
		for(int i = score.length() - 1; i >= 0; i--)
		{
			score.render(this)
		}
	}
}
