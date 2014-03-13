package testsestimation;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextFieldFilter extends PlainDocument {
    public static final String LOWERCASE =
            "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ALPHA =
            LOWERCASE + UPPERCASE
                    + "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯяІіЄєҐґ";
    public static final String NUMERIC =
            "0123456789";

    public static final String B_NUMERIC =
            "123456789";

    //private static final int LIMIT = 19;
    public static final String FLOAT =
            NUMERIC + ".";
    public static final String ALPHA_NUMERIC =
            ALPHA + NUMERIC;
    protected String acceptedChars = null;
    protected boolean negativeAccepted = false;
    private int limitLength=19;

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }


    public JTextFieldFilter() {
        this(ALPHA_NUMERIC);
    }

    public JTextFieldFilter(String acceptedchars) {
        acceptedChars = acceptedchars;
    }

    public void setNegativeAccepted(boolean negativeaccepted) {
        if (acceptedChars.equals(NUMERIC) ||
                acceptedChars.equals(FLOAT) ||
                acceptedChars.equals(ALPHA_NUMERIC)) {
            negativeAccepted = negativeaccepted;
            acceptedChars += "-";
        }
    }

    public void insertString
            (int offset, String str, AttributeSet attr)
            throws BadLocationException {


        if (str == null) return;

        if (acceptedChars.equals(UPPERCASE)) {
            str = str.toUpperCase();
        } else if (acceptedChars.equals(LOWERCASE)) {
            str = str.toLowerCase();
        }

        for (int i = 0; i < str.length(); i++) {
            if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1) {
                return;
            }
        }

        if (acceptedChars.equals(FLOAT) ||
                (acceptedChars.equals(FLOAT + "-") && negativeAccepted)) {
            if (str.indexOf(".") != -1) {
                if (getText(0, getLength()).indexOf(".") != -1) {
                    return;
                }
            }
        }
        if (negativeAccepted && str.indexOf("-") != -1) {
            if (str.indexOf("-") != 0 || offset != 0) {
                return;
            }
        }

        int currLength = this.getContent().length() - 1;
        int max = limitLength - currLength;
        if (str.length() <= max) {
            super.insertString(offset, str, attr);
        } else {
            super.insertString(offset, str.substring(0, max), attr);
        }

        // super.insertString(offset, str, attr);
    }


}
