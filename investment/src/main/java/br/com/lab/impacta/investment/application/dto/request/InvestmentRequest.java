package br.com.lab.impacta.investment.application.dto.request;

import lombok.Data;

@Data
public class InvestmentRequest {
    private Long productId;

    private Double value;
}
