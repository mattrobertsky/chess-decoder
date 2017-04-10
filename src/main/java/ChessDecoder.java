package main.java;

public class ChessDecoder {

  public boolean validateInput(String game) {

    try {
      checkInput(game);
      
    } catch (InvalidChessGameException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
    
  }

  private static final String PIECES = "prnbqk";
  
  private void checkInput(String game) throws InvalidChessGameException {
    String[] rows = game.split("/");
    
    if (rows.length < 8) {
      throw new InvalidChessGameException("wrong number of rows");
    }
    
    for (String row : rows) {
      char[] characters = row.toCharArray();
      int count = 0;
      for (char character : characters) {
        if (Character.isDigit(character)) {
          int val = Integer.parseInt(""+character);
          count += val;
        } else {
          if(!PIECES.contains((""+character).toLowerCase())) {
            throw new InvalidChessGameException("unknown chess peice");
          }
          count += 1;
        }
      }
      if (count > 8) {
        throw new InvalidChessGameException("wrong number of squares or pieces");
      }
    }
  }
  
}
