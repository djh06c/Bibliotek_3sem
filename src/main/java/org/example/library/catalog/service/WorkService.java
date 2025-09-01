package org.example.library.catalog.service;

import org.example.library.catalog.model.Work;
import org.example.library.catalog.repository.WorkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkService {

    private final WorkRepository workRepository;

    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }


    //create
    public Work createWork(Work work) {
        return workRepository.save(work);
    }

    //Read all
    public List<Work> getAllWorks() {
        return workRepository.findAll();
    }

    public Optional<Work> getWorkById(long id) {
        return workRepository.findById(id);
    }

    //Update
    public Work updateWork(Long id, Work work) {
        if (workRepository.existsById(id)) {
            work.setId(id);
            return workRepository.save(work);
        }
        else {
            throw new RuntimeException("Work not found with id " +id);
        }
    }

    // Delete
    public void deleteWork(Long id) {
        workRepository.deleteById(id);
    }

    // Search
    public List<Work> searchWorks(String title) {
        return workRepository.findByTitleContaining(title);
    }
}
