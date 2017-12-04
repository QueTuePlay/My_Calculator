package itsoftware.datdot.my_calculator;

public class Classic {

    public String EnterNumber(int a) {
        switch (a) {
            case R.id.B_0:
                a = 0;
                break;
            case R.id.B_1:
                a = 1;
                break;
            case R.id.B_2:
                a = 2;
                break;
            case R.id.B_3:
                a = 3;
                break;
            case R.id.B_4:
                a = 4;
                break;
            case R.id.B_5:
                a = 5;
                break;
            case R.id.B_6:
                a = 6;
                break;
            case R.id.B_7:
                a = 7;
                break;
            case R.id.B_8:
                a = 8;
                break;
            case R.id.B_9:
                a = 9;
                break;
        }
        return String.valueOf(a);
    }

    public String AllClear(String mString) {
        return mString = "";
    }

    public String Comma(String mString) {
        if (!mString.contains(",")) {
            mString = mString + ",";
        }
        return mString;
    }

    public String Backspace(String mString) {
        if (mString.length() != 0) {
            mString = mString.substring(0, mString.length() - 1);
        }
        return mString;
    }
}