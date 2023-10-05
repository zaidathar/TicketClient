package com.zaidathar.TicketClient.model.dto.fare;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FareResponse {
    @JsonProperty("header")
    FareHeader fareHeader;

    @JsonProperty("body")
    FareBody fareBody;
}
