package Abhik;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set <String> s=new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char a=board[i][j];
                if(a!='.'){
                    if(!s.add(a + "r" + i) || !s.add(a+"c"+j) || !s.add(a+"b"+i/3+j/3)){
                    return false;
                    }
                }
            }
        }
        return true;
    }
}
