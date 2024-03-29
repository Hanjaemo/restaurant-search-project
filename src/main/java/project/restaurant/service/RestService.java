package project.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.restaurant.domain.Rest;
import project.restaurant.domain.RestSearchCond;
import project.restaurant.repository.RestRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestService {

    private final RestRepository repository;

    public List<Rest> findAll(RestSearchCond cond) {
        return repository.findAll(cond);
    }
}
