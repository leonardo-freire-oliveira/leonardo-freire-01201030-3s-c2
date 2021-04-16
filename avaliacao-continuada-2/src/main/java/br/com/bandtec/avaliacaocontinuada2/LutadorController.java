package br.com.bandtec.avaliacaocontinuada2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutador")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    public ResponseEntity getLutadores(@RequestParam Integer id){
        return ResponseEntity.status(200).body(repository.findById(id));
    }

    @GetMapping
    public ResponseEntity getLutadoresVivos(@RequestParam Integer id, @RequestParam boolean vivo){
        return ResponseEntity.status(200).body(repository.findByLutadorVivo(id,vivo));
    }

    @GetMapping
    public ResponseEntity getLutadoresComVida(@RequestParam Double vida){
        return ResponseEntity.status(200).body(repository.findByLutadorComVida(vida));
    }



}
