public int analysis(String expression) {

        int result = 0;
        String str = "";
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch >= '0' && ch <= '9') {
                str += ch;
            } else {
                result += Integer.parseInt(str);
                str = "" + ch;
            }
        }
        if (str != "") {
            result += Integer.parseInt(str);
        }
        return result;
    }
