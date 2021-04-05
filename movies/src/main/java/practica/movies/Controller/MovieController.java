package practica.movies.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practica.movies.models.Movie;
import practica.movies.repository.MovieRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieRepository repo;

    @PostMapping
    public String saveMovie(@RequestBody Movie movie){
        repo.save(movie);
        return "El id: "+ movie.getId();
    }
    @GetMapping
    public List<Movie> getMovies(){
        return repo.findAll();
    }
}
