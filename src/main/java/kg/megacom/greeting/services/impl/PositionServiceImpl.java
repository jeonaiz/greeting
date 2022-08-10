package kg.megacom.greeting.services.impl;

import kg.megacom.greeting.dao.PositionRepository;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;


    public Position save(Position position){
        return positionRepository.save(position);

    }

    @Override
    public Position update(Position position) {
        return null;
    }

    public List<Position> findAll(){
        return positionRepository.findAll();
    }

}
