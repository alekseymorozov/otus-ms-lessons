package io.swagger.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public interface HealthApi {
    @Operation(summary = "Health check", description = "Check that app is alive", tags={ "Health check" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/health")
    public ResponseEntity check();
}
