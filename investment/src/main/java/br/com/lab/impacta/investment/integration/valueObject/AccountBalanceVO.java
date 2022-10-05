package br.com.lab.impacta.investment.integration.valueObject;

import lombok.Data;

@Data
public class AccountBalanceVO {
    private Long accountId;

    private Double balance;
}
