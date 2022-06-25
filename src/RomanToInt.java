public class RomanToInt {
    public int romanToInt(String s) {
        char [] romans = s.toCharArray();
        int total = 0;
        for (int count = 0; count < romans.length; count++) {
            switch (romans[count]) {
                case 'I':
                    if (count < romans.length - 1) {
                        if (romans[count + 1] == 'V') {
                            total = total - 1;
                            break;
                        } else if (romans[count + 1] == 'X') {
                            total = total - 1;
                            break;
                        }
                    }
                    total = total + 1;
                    break;
                case 'V':
                    total = total + 5;
                    break;
                case 'X':
                    if (count < romans.length - 1) {
                        if (romans[count + 1] == 'L') {
                            total = total - 10;
                            break;
                        } else if (romans[count + 1] == 'C') {
                            total = total - 10;
                            break;
                        }
                    }
                    total = total + 10;
                    break;
                case 'L':
                    total = total + 50;
                    break;
                case 'C':
                    if (count < romans.length - 1) {
                        if (romans[count + 1] == 'D') {
                            total = total - 100;
                            break;
                        } else if (romans[count + 1] == 'M') {
                            total = total - 100;
                            break;
                        }
                    }
                    total = total + 100;
                    break;
                case 'D':
                    total = total + 500;
                    break;
                case 'M':
                    total = total + 1000;
                    break;
                default:
                    //ignore anything that is not a roman numeral
                    break;
            }
        }
        return total;
    }
}
