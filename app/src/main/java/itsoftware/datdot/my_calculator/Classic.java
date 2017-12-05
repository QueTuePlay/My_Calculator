package itsoftware.datdot.my_calculator;

class Classic {

    String EnterNumber(int a, String mString) {
        switch (a) {
            case R.id.B_0:
                if (!mString.equals("0")) {
                    a = 0;
                } else a = -1;
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
        if (a == -1) {
            mString = mString + "";
        } else mString = mString + String.valueOf(a);
        return mString;
    }

    String Comma(String mString) {
        if (!mString.contains(",") && !mString.equals("")) {
            mString = mString + ",";
        }
        return mString;
    }

    String AllClear() {
        return "";
    }

    String Backspace(String mString) {
        try {
            if (mString.charAt(0) == '-' && mString.length() == 2) {
                mString = "";
            }
            if (mString.length() != 0) {
                mString = mString.substring(0, mString.length() - 1);
            }
        } catch (Exception ex) {
            mString = "";
        }
        return mString;
    }

    String ChangeSign(String mString) {
        if (!mString.equals("")) {
            if (mString.contains("-")) {
                mString = mString.substring(1, mString.length());
            } else {
                mString = "-" + mString;
            }
        }
        return mString;
    }

    String Plus(String mString) {
        if (!mString.equals("")) {
            mString = mString.replace(",", ".");
            float a = Float.valueOf(mString);
            float b = Float.valueOf(mString);
            int Result = Math.round(a + b);
            mString = String.valueOf(Result);
        }
        return mString;
    }
}