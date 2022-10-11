package seedu.duke.command;


import seedu.duke.ClientList;
import seedu.duke.PairingList;
import seedu.duke.PropertyList;
import seedu.duke.Storage;
import seedu.duke.Ui;

import java.util.ArrayList;

/**
 * Adds a client to the client list.
 */
public class CommandAddClient extends CommandAdd {
    private final String clientName;
    private final String clientContactNumber;
    private final String clientEmail;
    private final String clientBudgetPerMonth;

    /**
     * Constructs constructor for Command Add Client which stores client's name, contact number, email and budget/month.
     *
     * @param clientDetails Contains client's name, contact number, email and budget/month.
     */
    public CommandAddClient(ArrayList<String> clientDetails) {
        this.clientName           = clientDetails.get(0);
        this.clientContactNumber  = clientDetails.get(1);
        this.clientEmail          = clientDetails.get(2);
        this.clientBudgetPerMonth = clientDetails.get(3);
    }

    @Override
    public void execute(Ui ui, Storage storage, PropertyList propertyList, ClientList clientList,
                        PairingList pairingList) {
        clientList.addClient(clientName, clientContactNumber, clientEmail, clientBudgetPerMonth);
        ui.showClientAddedConfirmationMessage(clientList);
        //Update Storage
        storage.addToClientFile(this.clientName, this.clientContactNumber,
                this.clientEmail, Integer.parseInt(this.clientBudgetPerMonth));
    }
}