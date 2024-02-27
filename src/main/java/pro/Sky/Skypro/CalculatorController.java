package pro.Sky.Skypro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String calculator() {
        return "Добро пожаловать в калькулятор"
    }

    @GetMapping(path = "/plus")
    public ResponseEntity<String> plus(@RequestParam Integer num1,@RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ошибка,нужно указать все числа");
            }
        int result = CalculatorService.plus(num1, num2);
            return ResponseEntity.ok(num1 + "+" + num2 + " = " + result);
        }

    @GetMapping(path = "/minus")
    public ResponseEntity<String> minus(@RequestParam Integer num1,@RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ошибка,нужно указать все числа");
        }
        int result = CalculatorService.minus(num1, num2);
        return ResponseEntity.ok(num1 + "-" + num2 + " = " + result);
    }

    @GetMapping("/multiplication")
    public ResponseEntity<String> multiplication(@RequestParam Integer num1,@RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ошибка,нужно указать все числа");
        }
        int result = CalculatorService.multiply(num1,num2);
        return ResponseEntity.ok(num1 + "*" + num2 + " = " + result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите число";
        } else if (num2 == 0) {
            return "делить на ноль нельзя";
        }
        int result = CalculatorService.divide(num1,num2);
        return num1 + " / " num2 + " = " result;
    }

}
