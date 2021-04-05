package practica.movies.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import practica.movies.models.Movie;

public interface MovieRepository extends MongoRepository<Movie,Integer> {
}
