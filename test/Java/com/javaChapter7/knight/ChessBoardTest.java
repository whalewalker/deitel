package Java.com.javaChapter7.knight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ChessBoardTest {

    private ChessBoard chessBoard;

    @BeforeEach
    void setUp() {
        chessBoard = new ChessBoard(8);
    }

    @AfterEach
    void tearDown() {
        chessBoard = null;
    }

    @Test
    void checkIfConstructorCreate8by8Matrix(){
        int [][] expected = new int[8][8];
        assertEquals(chessBoard.getChessBoard().length, expected.length);
        chessBoard.displayChessBoard();
    }

    @Test
    void checkIfChessBoardCanBeDisplay(){
        ChessBoard chessBoard = new ChessBoard(2);
        String expected = " *  * \n *  * \n";
        assertEquals(expected, chessBoard.displayChessBoard());
    }


}