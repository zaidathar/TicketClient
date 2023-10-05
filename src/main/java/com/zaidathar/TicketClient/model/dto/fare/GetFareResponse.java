package com.zaidathar.TicketClient.model.dto.fare;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetFareResponse {
    @JsonProperty("response")
    FareResponse fareResponse;
}
