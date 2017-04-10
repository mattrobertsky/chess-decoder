package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.ChessDecoder;

public class ChessDecoderTest {

  @Test
  public void testValidChessString() {
    ChessDecoder decoder = new ChessDecoder();
    String game = "r1bk3r/p2pBpNp/n4n2/1p1NP2P/6P1/3P4/P1P1K3/q5b1";
    boolean actual = decoder.validateInput(game);
    boolean expected = true;
    assertEquals(expected, actual);
  }
  
  @Test
  public void testForWrongRowCount() {
    ChessDecoder decoder = new ChessDecoder();
    String game = "r1bk3r/p2pBpNp/n4n2/1p1NP2P/6P1/3P4/P1P1K3/q5b1/q5b1";
    boolean actual = decoder.validateInput(game);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void testForWrongRowSquareOrPieceCount() {
    ChessDecoder decoder = new ChessDecoder();
    String game = "r1bk3r/p2pBpNp/n4n2/1p1NP2P/6P1/3P4/P1P1K3/q7b1";
    boolean actual = decoder.validateInput(game);
    boolean expected = false;
    assertEquals(expected, actual);
  }
  
  @Test
  public void testForUnknowPeice() {
    ChessDecoder decoder = new ChessDecoder();
    String game = "r1bk3r/p2pBpNp/n4n2/1p1NP2P/6P1/3P4/S1P1K3/q5b1";
    boolean actual = decoder.validateInput(game);
    boolean expected = false;
    assertEquals(expected, actual);
  }


}
