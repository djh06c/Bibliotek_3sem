package org.example.library.common;

import org.example.library.catalog.model.Work;
import org.example.library.catalog.repository.WorkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private final WorkRepository workRepository;

    public InitData(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (workRepository.count() == 0) {
            Work w1 = new Work();
            w1.setTitle("The Great Gatsby");

            Work w2 = new Work();
            w2.setTitle("Mona Lisa");

            Work w3 = new Work();
            w3.setTitle("Symphony No. 5");

            workRepository.save(w1);
            workRepository.save(w2);
            workRepository.save(w3);

            System.out.println("Sample data inserted!");
        }
    }
}
