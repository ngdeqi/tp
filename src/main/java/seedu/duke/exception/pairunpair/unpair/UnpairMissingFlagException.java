package seedu.duke.exception.pairunpair.unpair;

import static seedu.duke.Messages.MESSAGE_MISSING_FLAG;
import static seedu.duke.Messages.MESSAGE_UNPAIR_WRONG_FORMAT;

public class UnpairMissingFlagException extends ParseUnpairException {

    private final String WHITESPACE = " ";
    private String[] missingFlags;

    public UnpairMissingFlagException(String[] missingFlags) {
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
                    + MESSAGE_UNPAIR_WRONG_FORMAT;
    }
}