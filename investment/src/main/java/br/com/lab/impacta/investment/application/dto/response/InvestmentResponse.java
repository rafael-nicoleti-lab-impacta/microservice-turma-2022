package br.com.lab.impacta.investment.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class InvestmentResponse {
    private Long id;

    private Double value;

    private Date creation;
}
