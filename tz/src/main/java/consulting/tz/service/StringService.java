
package consulting.tz.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class StringService {
    
    public Map<Character, Integer> getNumberOfString(String s){
        Map<Character, Integer> symbols = new HashMap<Character,Integer>();
        for (int i=0; i<s.length();i++){
            Integer symbol = symbols.getOrDefault(s.charAt(i), 0);
            symbol++;
            symbols.put(s.charAt(i), symbol);
        }
        //Сортировка map по значению по умолчанию
         symbols = symbols.entrySet()
                .stream()
                 //сортируем по значению по убыванию
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                 //собираем в новый LinkedHashMap(Чтобы сохранился установленный нами порядок)
                .collect(
                        Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (o1,o2) -> o1, LinkedHashMap::new));
        return symbols;
    }
    
}
