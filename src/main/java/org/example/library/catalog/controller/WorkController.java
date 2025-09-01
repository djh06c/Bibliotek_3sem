package org.example.library.catalog.controller;

import org.example.library.catalog.model.Work;
import org.example.library.catalog.service.WorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/works")
public class WorkController {

    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    //GET alle works
    @GetMapping
    public List<Work> getWorks() {
        return workService.getAllWorks();
    }

    //GET find work efter id
    @GetMapping("/{id}")
    public Optional<Work> getWOrkById(@PathVariable Long id) {
        return workService.getWorkById(id);
    }

    //POST opret ny work
    @PostMapping
    public Work createWork(@RequestBody Work work) {
        return workService.createWork(work);
    }

    //PUT opdater eksisterende work
    @PutMapping("/{id}")
    public Work updateWork(@PathVariable Long id, @RequestBody Work work) {
        return workService.updateWork(id, work);
    }

    //DELETE slet work
    @DeleteMapping("/{id}")
    public void deleteWork(@PathVariable Long id) {
        workService.deleteWork(id);
    }

    //GET søg efter title
    @GetMapping("/search")
    public List<Work> searchWork(@RequestParam String title) {
        return workService.searchWorks(title);
    }


}
