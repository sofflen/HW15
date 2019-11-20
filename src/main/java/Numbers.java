public class Numbers {


    public String[] one(int x) {
        if (x == 1)
            return new String[]{"   ##   ", " ####   ", "   ##   ", "   ##   ", "   ##   ", "   ##   ", " ###### ", "1"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] two(int x) {
        if (x == 2)
        return new String[]{" #######  ", "##     ## ", "       ## ", " #######  ", "##        ", "##        ", "######### ", "2"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] three(int x) {
        if (x == 3)
        return new String[]{" #######  ", "##     ## ", "       ## ", " #######  ", "       ## ", "##     ## ", " #######  ", "3"};
        else
        return new String[]{"","","","","","",""};
    }

    public String[] four(int x) {
        if (x == 4)
        return new String[]{"##        ", "##    ##  ", "##    ##  ", "##    ##  ", "######### ", "      ##  ", "      ##  ", "4"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] five(int x) {
        if (x == 5)
        return new String[]{"######## ", "##       ", "##       ", "#######  ", "      ## ", "##    ## ", " ######  ", "5"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] six(int x) {
        if (x == 6)
        return new String[]{" #######  ", "##     ## ", "##        ", "########  ", "##     ## ", "##     ## ", " #######  ", "6"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] seven(int x) {
        if (x ==7)
        return new String[]{"######## ", "##    ## ", "    ##   ", "   ##    ", "  ##     ", "  ##     ", "  ##     ", "7"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] eight(int x) {
        if (x == 8)
        return new String[]{" #######  ", "##     ## ", "##     ## ", " #######  ", "##     ## ", "##     ## ", " #######  ", "8"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] nine(int x) {
        if (x == 9)
        return new String[]{" #######  ", "##     ## ", "##     ## ", " ######## ", "       ## ", "##     ## ", " #######  ", "9"};
        else
            return new String[]{"","","","","","",""};
    }

    public String[] zero(int x) {
        if (x == 0)
        return new String[]{"  #####   ", " ##   ##  ", "##     ## ", "##     ## ", "##     ## ", " ##   ##  ", "  #####   ", "0"};
        else
            return new String[]{"","","","","","",""};
    }
}
