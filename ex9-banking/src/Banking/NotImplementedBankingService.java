package Banking;

import java.util.ArrayList;
import java.util.List;

public class NotImplementedBankingService {
    List<Banking> accounts = new ArrayList<>();

    public void addAccount(Banking account) {
        accounts.add(account);
    }

    public Banking findAccount(int numberAccount) {
        for (Banking banking : accounts) {
            if (banking.getNumberAccount().equals(numberAccount)) {
                return banking;
            }
        }
        return null;
    }
}
