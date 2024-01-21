package com.konsalting.service;

import com.konsalting.model.Symbol;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StringService {
    /**
     * Метод принимает любую строку и возвращает количество каждого символа и сам символов.
     * @param s строка для подсчета
     * @return строка-ответ с количеством каждого символа
     */
    public String countSymbols(String s) {
        if (s.length()<1){
            return "пустая строка";
        }
        List<String> list = Arrays.stream(s.toLowerCase().split("")).sorted().distinct().toList();
        List<Symbol> symbols = new ArrayList<>();
        for (String value : list) {
            symbols.add(new Symbol(value, (int) countOccurrences(s, value.charAt(0))));
        }
        StringBuilder stringBuilder = new StringBuilder();
        symbols = symbols.stream().sorted(Comparator.comparing(Symbol::getCount).reversed()).toList();
        for (Symbol symbol : symbols) {
            stringBuilder.append("\"" + symbol.getS() + "\": ").append(symbol.getCount()).append(",");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }

    private static long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
