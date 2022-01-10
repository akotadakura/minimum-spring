package info.akotadakura.sample.services;

import info.akotadakura.sample.entities.User;
import info.akotadakura.sample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SampleServiceImpl implements SampleService{

    private final UserRepository userRepository;

    @Autowired
    public SampleServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getName(long id) {
        Optional<User> entity= userRepository.findById(id);
        return entity.isPresent() ? entity.get().getName() : "EMPTY!!";
    }
}
