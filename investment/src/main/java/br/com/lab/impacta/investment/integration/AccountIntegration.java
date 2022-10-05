package br.com.lab.impacta.investment.integration;

import br.com.lab.impacta.investment.integration.valueObject.AccountBalanceVO;

public interface AccountIntegration {

    AccountBalanceVO getAccountBalanceById(Long accountId);

    boolean debitAccount(Long accountId, Double valueOfDebit);
}
