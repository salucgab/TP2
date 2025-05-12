import java.util.ArrayList;

class Favalier extends Piece{
    
    public Favalier(){
	super('B', new Position());
    }

    public Favalier(char couleur, Position position){
	super(couleur, position);
    }


    public String getType(){
    	return new String("dame");
    }
    

    public ArrayList<Position> getDeplacementPossible(Plateau pl)
    {
		// Une dame a les coups possibles de la tour et du fou combinés
		ArrayList<Position> retour = new ArrayList<Position>();
		
		Cavalier c = new Cavalier(this.getCouleur(), this.getPosition());
		Fou f = new Fou(this.getCouleur(), this.getPosition());

		
		ArrayList<Position> deplacementPossible = c.getDeplacementPossible(pl);
		for(Position p : deplacementPossible)
			retour.add(p);

		deplacementPossible = f.getDeplacementPossible(pl);
		for(Position p : deplacementPossible)
			retour.add(p);

		return retour;
    }

    
}
