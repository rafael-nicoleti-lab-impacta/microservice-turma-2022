package br.com.lab.impacta.investment.integration.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DebitAccountRequest {
    private double valueOfDebit;
}
