package practica.movies.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Document(collection = "Movie")
public class Movie {

    @Id
    private int id;
    private String title;
    private String director;
    private String rating;
    private String createdOn;

}
