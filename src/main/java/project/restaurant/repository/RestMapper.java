package project.restaurant.repository;

import org.apache.ibatis.annotations.Mapper;
import project.restaurant.domain.Rest;
import project.restaurant.domain.RestSearchCond;

import java.util.List;

@Mapper
public interface RestMapper {

    List<Rest> findAll(RestSearchCond rest);
}
