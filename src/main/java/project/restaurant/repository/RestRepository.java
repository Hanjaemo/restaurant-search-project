package project.restaurant.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.restaurant.domain.Rest;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RestRepository {

    private final RestMapper restMapper;

    List<Rest> findAll(RestSearchCond cond) {
        return restMapper.findAll(cond);
    }
}
