package br.com.bandtec.avaliacaocontinuada2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {

    List<Lutador> findByLutador(Integer id);
    List<Lutador> findByLutadorVivo(Integer id , boolean vivo);
    List<Lutador> findByLutadorComVida(Double vida);

}


//Professor, tive problemas com os packages e o sr. me orientou na sala a deixar sem, pediu para eu deixar esse comentário!