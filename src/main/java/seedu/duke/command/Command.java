package seedu.duke.command;


import seedu.duke.ClientList;
import seedu.duke.PairingList;
import seedu.duke.PropertyList;
import seedu.duke.Storage;
import seedu.duke.Ui;

/**
 * Represents an executable command.
 */
public abstract class Command {
    public abstract void execute(Ui ui, Storage storage, PropertyList propertyList, ClientList clientList,
                                 PairingList pairingList);
}