package Java.com.Chapter8.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Java.com.Chapter8.tictactoe.Flag.*;
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
}