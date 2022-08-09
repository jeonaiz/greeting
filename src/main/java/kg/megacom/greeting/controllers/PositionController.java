package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.GrudMethods;
import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")


public class PositionController implements GrudMethods<Position>{


    @Override
    public List<Position> findAll() {
        return null;
    }

    @Override
    public Position getById(Long id) {
        return null;
    }

    @Override
    public Position save(Position position) {
        return null;
    }

    @Override
    public Position update(Position position) {
        return null;
    }

    @Override
    public Position remove(Long id) {
        return null;
    }
}
