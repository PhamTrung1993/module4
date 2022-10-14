package dao;

import model.Word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DictionaryDAO implements IDictionaryDAO {
    static List<Word> wordList = new ArrayList<>();

    static {
        wordList.add(new Word("help","giúp đỡ"));
        wordList.add(new Word("hello","xin chào"));
        wordList.add(new Word("lunch","bữa trưa"));
        wordList.add(new Word("dinner","bữa tối"));

    }

    @Override
    public String searchVietnamese(String english) {
        Iterator iterator = wordList.iterator();

        String vietnamese = "";
        while (iterator.hasNext()) {
            Word handler = (Word) iterator.next();
            if (handler.getEnglish().equals(english)) {
                vietnamese = handler.getVietnamese();
            }
        }
        return vietnamese;
    }

//    public static void main(String[] args) {
//        DictionaryDAO dictionaryDAO = new DictionaryDAO();
//        String result = dictionaryDAO.searchVietnamese("lunch");
//        System.out.println(result);
//    }
}
