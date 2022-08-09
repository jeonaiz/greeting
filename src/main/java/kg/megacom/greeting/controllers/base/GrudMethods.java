package kg.megacom.greeting.controllers.base;

import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface GrudMethods<T> {

    @GetMapping("/all")
    List<T> findAll();

    @GetMapping("/{id}")
    T getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody T t);

    @PutMapping("/update")
    T update(@RequestBody T t);

    @DeleteMapping("/remove/{id}")
    T remove(@PathVariable Long id);
}
