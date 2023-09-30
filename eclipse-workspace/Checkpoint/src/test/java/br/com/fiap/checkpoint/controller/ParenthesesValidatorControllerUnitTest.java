package br.com.fiap.checkpoint.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ParenthesesValidatorControllerUnitTest {

    @Test
    public void testValidParentheses() {
        ParenthesesValidatorController controller = new ParenthesesValidatorController();

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("input", "({})[]");

        ResponseEntity<Map<String, Boolean>> response = controller.validateParentheses(requestBody);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().get("isValid"));
    }

    @Test
    public void testInvalidParentheses() {
        ParenthesesValidatorController controller = new ParenthesesValidatorController();

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("input", "({}])");

        ResponseEntity<Map<String, Boolean>> response = controller.validateParentheses(requestBody);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertFalse(response.getBody().get("isValid"));
    }
}
