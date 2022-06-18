package anwesenheit.example.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class usersController {

    @Autowired
    private usersRepository usersRepository;

    @GetMapping("/users")
    public List<usersEntity> getAllUsers() {
        return usersRepository.findAll();
    }

    @GetMapping("users/id/{id}")
    usersEntity withId(@PathVariable int id) throws Exception {
        return usersRepository.findById(id).orElseThrow(() -> new Exception("No employee with ID: "));
    }

    @PostMapping("/users")
    public usersEntity createUser(@RequestBody usersEntity user) {
        return usersRepository.save(user);
    }
//Patchmapping usw. fehlt noch.
}
