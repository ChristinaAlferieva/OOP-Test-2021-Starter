package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class Note {
    private char note;
    private int duration;
    private float distance;
    private float xG, yG;
    private float displayName;


    public Note()
    {

    }

    public void render(PApplet pa)
    {
        float border = pa.width * 0.1f;
        float x = PApplet.map(xG, -5, 5, border, pa.width - border);
        float y = PApplet.map(yG, -5, 5, border, pa.width - border);
        pa.line(x - 5, y, x + 5, y);
        pa.line(x, y - 5, x, y + 5);
        pa.circle(x, y);
        pa.textAlign(PApplet.CENTER, PApplet.CENTER);
        pa.text(displayName, x + 15, y)
    }
    
    public Note(String displayName, float distance, float xG, float yG)
    {
        this.displayName = displayName;
        this.distance = distance;
        this.xG = xG;
        this.yG = yG;
    }

    public char isNote()
    {
        return note;
    }

    public int isDuration()
    {
        return duration;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public float getDistance()
    {
        return distance;
    }

    @Override
    public String toString()
    {
        return "Note";
    }
}


