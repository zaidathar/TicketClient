package com.zaidathar.TicketClient.controller;

import com.zaidathar.TicketClient.constants.URIConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.zaidathar.TicketClient.constants.URIConstants.*;

@RestController
@Slf4j
@RequestMapping(BASE_URI + ADMIN_URI)
public class AdminController {
    @GetMapping(GET_ALL_CHANNEL)
    public ResponseEntity<String> getAllChannel() throws Exception{
        return ResponseEntity.ok("S");
    }
}
