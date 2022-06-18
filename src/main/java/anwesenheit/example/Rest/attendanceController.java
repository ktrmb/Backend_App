package anwesenheit.example.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class attendanceController {

    @Autowired
    private attendanceRepository attendanceRepository;

    @GetMapping("/attendance")
    public List<attendanceEntity> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    @GetMapping("attendance/{user_id}")
    attendanceEntity withId(@PathVariable int user_id) throws Exception {
        return (attendanceEntity) attendanceRepository.findByUserid(user_id);
    }

    @PostMapping("attendance")
    public attendanceEntity createAttendance(@RequestBody attendanceEntity attenance) {
        return attendanceRepository.save(attenance);
    }
}
