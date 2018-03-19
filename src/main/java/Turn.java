import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Turn {
    String[] nonNumeralTry = {"X","/","-"};
    List<String> tries = new ArrayList();
    Boolean strike = false;
    Boolean spare = false;

    Turn(String turnSquence) {
        for(String str : turnSquence.split("")) {
            switch (str) {
                case "X": strike = true;
                    break;
                case "/": spare = true;
                    break;
                case "":
                    return;
                default:
                    break;
            }
            tries.add(str);
        }
    }

    public int getSum() {
        int sum = 0;

        for(String str : tries) {
            if( !Stream.of(nonNumeralTry).anyMatch(c -> c.equals(str)) ) {
                sum += Integer.parseInt(str);
            }
        }

        return sum;
    }

    public int getTryValue(int index) {
        String thisTry = tries.get(index);

        if(thisTry.equals("X")) {
            return 10;
        }
        if(thisTry.equals("/")) {
            return 10;
        }
        if(thisTry.equals("-")) {
            return 0;
        }

        return Integer.parseInt(tries.get(index));
    }
}
