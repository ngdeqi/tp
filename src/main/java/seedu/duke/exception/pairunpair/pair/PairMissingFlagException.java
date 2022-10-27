package seedu.duke.exception.pairunpair.pair;

import java.util.ArrayList;

//@@author ngdeqi
import static seedu.duke.Messages.MESSAGE_MISSING_FLAG;
import static seedu.duke.Messages.MESSAGE_PAIR_WRONG_FORMAT;

public class PairMissingFlagException extends ParsePairException {

    private final String WHITESPACE = " ";
    private ArrayList<String> missingFlags;


    public PairMissingFlagException(ArrayList<String> missingFlags) {
        this.missingFlags = missingFlags;
    }

    @Override
    public String toString() {

        StringBuilder missingFlagStringBuilder = new StringBuilder();
        for (String missingFlag : missingFlags) {
            missingFlagStringBuilder.append(missingFlag).append(WHITESPACE);
        }

        String missingFlagsAsString = missingFlagStringBuilder.toString();

        return MESSAGE_MISSING_FLAG
                + missingFlagsAsString + System.lineSeparator()
                + MESSAGE_PAIR_WRONG_FORMAT;
    }
}
