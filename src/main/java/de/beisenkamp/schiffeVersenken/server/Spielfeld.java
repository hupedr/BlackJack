package de.beisenkamp.schiffeVersenken.server;

public class Spielfeld
{
    public Spielfeld()
    {
        int[][] feld = new int[9][9];
        for(int i=0;i<feld.length;i++)
        {
            for(int j=0;j<feld.length;j++)
            {
                feld[i][j]=0;
            }
        }
    }

    // KEINE SCHIFF = 0    SCHIFF = 1
    // (x/y)   <- Position
    public void schiffPlatzieren(String Position1)
    {

    }
}
