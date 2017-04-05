package jancor.com.pokerwar.logic;

/**
 * Created by janco on 10.03.2017.
 */

public class Card {

    final private Figures figure;
    final private Colours colour;
    final private Integer strenght;

    public Card(Figures figure, Colours colour, Integer strenght){

        this.figure=figure;
        this.colour=colour;
        this.strenght=strenght;
    }

    public Figures getFigure() {
        return figure;
    }

    public Colours getColour() {
        return colour;
    }

    public Integer getStrenght() {
        return strenght;
    }

    @Override
    public String toString() {
        return
                figure +
                " " + colour +
                " " + strenght ;
    }
}