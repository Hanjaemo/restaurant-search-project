package project.restaurant.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.restaurant.domain.Rest;
import project.restaurant.domain.User;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RestRepository {

    private final RestMapper restMapper;

    public List<Rest> findAll(User user) {
        return restMapper.findAll(user);
    }
}
