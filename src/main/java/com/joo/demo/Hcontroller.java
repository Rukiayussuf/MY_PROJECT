package com.joo.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("service")
public class Hcontroller {
    
    @Autowired
	private SerRepository servRepository;

    @GetMapping("v")
	List<Ticket> getAllServices(){
		return 	servRepository.findAll();
    }

   @PostMapping("v")
    public void service(@RequestBody Ticket service){
        servRepository.save(service);
    }
    
    @GetMapping("/v/{id}")
    public ResponseEntity<Ticket> getServiceById(@PathVariable long id){
        Ticket service = servRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(service);
    }

    @PutMapping("/v/{id}")
    public ResponseEntity<Ticket> updateService(@PathVariable long id,@RequestBody Ticket ticket){
        Ticket ticket2 = servRepository.findById(id).orElseThrow();
        ticket2.setDate(ticket.getDate());
        ticket2.setFirst_name(ticket.getFirst_name());
        ticket2.setLast_name(ticket.getLast_name());
        ticket2.setGender(ticket.getGender());
        ticket2.setPhone_no(ticket.getPhone_no());
        ticket2.setDest_price(ticket.getDest_price());
        ticket2.setDay(ticket.getDay());
        ticket2.setTime(ticket.getTime());

        Ticket ticket3 = servRepository.save(ticket2);

        return ResponseEntity.ok(ticket3);
    }

    @DeleteMapping("/v/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable long id){
        Ticket service = servRepository.findById(id).orElseThrow();
        servRepository.delete(service);
        Map<String,Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
