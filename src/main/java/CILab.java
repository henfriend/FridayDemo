import java.lang.*;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int caps = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isUpperCase(myString.charAt(i))) {
                caps++;
            }
        }

        if (caps == 0 || caps == myString.length()) {
            return true;
        }

        return caps == 1 && Character.isUpperCase(myString.charAt(0));
    }

}

