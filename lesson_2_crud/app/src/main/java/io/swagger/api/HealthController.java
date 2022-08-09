package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthController implements HealthApi {

    ObjectMapper objectMapper;

    @Override
    public ResponseEntity<String> check() {
        return new ResponseEntity<String>("{{\"status: \"OK\"}}", HttpStatus.OK);
    }
}
