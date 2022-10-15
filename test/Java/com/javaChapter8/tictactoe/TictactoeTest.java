package Java.com.javaChapter8.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Java.com.javaChapter8.tictactoe.Flag.*;
import static org.junit.jupiter.api.Assertions.*;

class TictactoeTest {
    Tictactoe tictactoe;
    Board board;

    @BeforeEach
    void setUp() {
        board = new Board(3);
        tictactoe = new Tictactoe(board);
    }

    @AfterEach
    void tearDown() {
        board = null;
        tictactoe = null;
    }

    @Test
    void testHasAGridWhenInitialize(){
        assertNotNull(board.getBoard());
    }

    @Test
    void boardGridValueEqualToValuePassedIntoConstructor(){
        assertEquals(3, board.getBoard().length);
        assertEquals(3, board.getBoard()[0].length);
    }

    @Test
    void tictactoeHasABoard(){
        assertNotNull(tictactoe.getBoard());
    }

    @Test
    void tictactoeBoardIsEmptyWhenInitialized(){
        Board board = tictactoe.getBoard();
        Flag[][] flagList = board.getBoard();
        for (Flag[] flags : flagList){
            for (Flag flag : flags){
                assertEquals(EMPTY, flag);
            }
        }
    }

    @Test
    void tictactoePlayerCanPlaceAValueOnTheBoard() throws TicTactoeException {
        System.out.println(board.toString());
        tictactoe.makeMove(3);
        assertEquals(X, tictactoe.getBoard().getBoard()[0][2]);
        tictactoe.makeMove(5);
        assertEquals(O, tictactoe.getBoard().getBoard()[1][1]);
    }

    @Test
    void testGamePlayerCanPlaceAValueOnTheBoard() throws TicTactoeException {
        tictactoe.makeMove(3);
        assertEquals(Flag.X, tictactoe.getBoard().getBoard()[0][2]);
        tictactoe.makeMove(5);
        assertEquals(Flag.O, tictactoe.getBoard().getBoard()[1][1]);
    }

    @Test
    void testGamePlayersCannotPlayTwoConsecutiveXValues() throws TicTactoeException {
        tictactoe.makeMove(3);
        assertEquals(Flag.X, tictactoe.getBoard().getBoard()[0][2]);
        tictactoe.makeMove(5);
        assertNotEquals(Flag.X, tictactoe.getBoard().getBoard()[1][1]);
        tictactoe.makeMove(1);
        assertEquals(Flag.X, tictactoe.getBoard().getBoard()[0][0]);
        tictactoe.makeMove(2);
        assertEquals(Flag.O, tictactoe.getBoard().getBoard()[0][1]);
    }

    @Test
    void testGamePlayerCanOnlyPlayOnAnEmptySquare() throws  TicTactoeException{
        assertEquals(1, tictactoe.makeMove(3));
        assertEquals(-1, tictactoe.makeMove(3));
        assertEquals(1, tictactoe.makeMove(6));
        assertEquals(-1, tictactoe.makeMove(6));
        assertEquals(-1, tictactoe.makeMove(3));
        assertEquals(1, tictactoe.makeMove(7));
    }

    @Test
    void testGameThrowsIllegalArgumentExceptionWhenUserPassesInOutOfRangeGridPosition() {
        assertThrows(IllegalArgumentException.class, () -> tictactoe.makeMove(17));
        assertThrows(IllegalArgumentException.class, () -> tictactoe.makeMove(10));
    }

    @Test
    void testGameThrowsGameOverExceptionWhenAllSlotsOnGridAreFull() throws TicTactoeException {
        tictactoe.makeMove(1);
        tictactoe.makeMove(2);
        tictactoe.makeMove(3);
        tictactoe.makeMove(4);
        tictactoe.makeMove(5);
        tictactoe.makeMove(6);
        tictactoe.makeMove(7);
        tictactoe.makeMove(8);
        tictactoe.makeMove(9);
        assertThrows(TicTactoeException.class, () -> tictactoe.makeMove(9));
    }

    @Test
    void testGameResetsGameValues() throws TicTactoeException {
        Board oldBoard = tictactoe.getBoard();
        tictactoe.makeMove(1);
        tictactoe.makeMove(4);
        tictactoe.makeMove(2);
        tictactoe.makeMove(5);
        tictactoe.makeMove(3);
        tictactoe.displayBoard();
        assertTrue(tictactoe.checkWin());
        tictactoe.resetGame();
        assertFalse(tictactoe.checkWin());
        assertNotEquals(oldBoard, tictactoe.getBoard());
        assertEquals(oldBoard.getBoard().length, tictactoe.getBoard().getBoard().length);
    }

    @Test
    void testGameWonIfPlayerMakesHorizontalLineXValues() throws TicTactoeException {
        tictactoe.makeMove(1);
        tictactoe.makeMove(2);
        tictactoe.makeMove(4);
        tictactoe.makeMove(3);
        tictactoe.makeMove(7);
        tictactoe.makeMove(7);
        tictactoe.displayBoard();
        assertTrue(tictactoe.checkWin());
        tictactoe.resetGame();
        tictactoe.makeMove(4);
        tictactoe.makeMove(2);
        tictactoe.makeMove(5);
        tictactoe.makeMove(3);
        tictactoe.makeMove(6);
        assertTrue(tictactoe.checkWin());
        tictactoe.resetGame();
        tictactoe.makeMove(7);
        tictactoe.makeMove(2);
        tictactoe.makeMove(8);
        tictactoe.makeMove(1);
        tictactoe.makeMove(9);
        boolean value = tictactoe.checkWin();
        assertTrue(value);
    }

    @Test
    void testGameWonIfPlayerMakesVerticalLineValuesXValues() throws TicTactoeException {
        tictactoe.makeMove(1);
        tictactoe.makeMove(5);
        tictactoe.makeMove(4);
        tictactoe.makeMove(9);
        tictactoe.makeMove(7);
        tictactoe.displayBoard();
        assertTrue(tictactoe.checkWin());
        tictactoe.resetGame();
        assertFalse(tictactoe.checkWin());
        tictactoe.makeMove(2);
        tictactoe.makeMove(3);
        tictactoe.makeMove(5);
        tictactoe.makeMove(4);
        tictactoe.makeMove(8);
        assertTrue(tictactoe.checkWin());
        tictactoe.resetGame();
        assertFalse(tictactoe.checkWin());
        tictactoe.makeMove(3);
        tictactoe.makeMove(1);
        tictactoe.makeMove(6);
        tictactoe.makeMove(2);
        tictactoe.makeMove(9);
        assertTrue(tictactoe.checkWin());
    }

    @Test
    void testGameCanDisplayBoard() throws TicTactoeException {
        tictactoe.makeMove(1);
        tictactoe.makeMove(2);
        tictactoe.makeMove(3);
        tictactoe.makeMove(4);
        tictactoe.makeMove(5);
        tictactoe.makeMove(6);
        tictactoe.makeMove(7);
        tictactoe.makeMove(8);
        tictactoe.makeMove(9);
        tictactoe.displayBoard();
    }
    @Test
    void testGameDiagonal() throws TicTactoeException {
        tictactoe.makeMove(7);
        tictactoe.makeMove(1);
        tictactoe.makeMove(5);
        tictactoe.makeMove(2);
        tictactoe.makeMove(3);
        assertTrue(tictactoe.checkWin());
    }
}