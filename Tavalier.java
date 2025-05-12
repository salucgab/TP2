import java.util.ArrayList;

class Tavalier extends Piece{
    
    public Tavalier(){
	super('B', new Position());
    }

    public Tavalier(char couleur, Position position){
	super(couleur, position);
    }


    public String getType(){
    	return new String("tavalier");
    }
    

    public ArrayList<Position> getDeplacementPossible(Plateau pl)
    {
	ArrayList<Position> liste = new ArrayList<Position>();

    Tour t = new Tour(this.getCouleur(), this.getPosition());

    ArrayList<Position> deplacementPossible = t.getDeplacementPossible(pl);
	for(Position p : deplacementPossible)
	    liste.add(p);

	int positionDepartX = this.getPosition().getX();
	int positionDepartY = this.getPosition().getY();
	

	// . . . . .
	// . . . . .
	// . . C . .
	// X . . . .
	// . . . . .
	int indiceX = positionDepartX-2;
	int indiceY = positionDepartY-1;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . . .
	// X . . . .
	// . . C . .
	// . . . . .
	// . . . . .
	indiceX = positionDepartX-2;
	indiceY = positionDepartY+1;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . X . . .
	// . . . . .
	// . . C . .
	// . . . . .
	// . . . . .
	indiceX = positionDepartX-1;
	indiceY = positionDepartY+2;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . X .
	// . . . . .
	// . . C . .
	// . . . . .
	// . . . . .
	indiceX = positionDepartX+1;
	indiceY = positionDepartY+2;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . . .
	// . . . . X
	// . . C . .
	// . . . . .
	// . . . . .
	indiceX = positionDepartX+2;
	indiceY = positionDepartY+1;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . . .
	// . . . . .
	// . . C . .
	// . . . . X
	// . . . . .
	indiceX = positionDepartX+2;
	indiceY = positionDepartY-1;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . . .
	// . . . . .
	// . . C . .
	// . . . . .
	// . . . X .
	indiceX = positionDepartX+1;
	indiceY = positionDepartY-2;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	// . . . . .
	// . . . . .
	// . . C . .
	// . . . . .
	// . X . . .
	indiceX = positionDepartX-1;
	indiceY = positionDepartY-2;
	if((indiceX >= 0) && (indiceX < 8) && (indiceY >= 0) && (indiceY < 8)){
	    Piece pi = pl.getCase(indiceX, indiceY);
	    if(pi == null)
		liste.add(new Position(indiceX, indiceY));
	    else if(pi.getCouleur() != this.getCouleur())
		liste.add(new Position(indiceX, indiceY));
	}

	return liste;
    }
}

    
