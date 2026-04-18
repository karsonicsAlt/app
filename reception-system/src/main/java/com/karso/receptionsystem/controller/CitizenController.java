package com.karso.receptionsystem.controller;

import com.karso.receptionsystem.dto.CitizenRequest;
import com.karso.receptionsystem.dto.CitizenResponse;
import com.karso.receptionsystem.service.CitizenService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/citizens")
public class CitizenController {

    private final CitizenService citizenService;

    public CitizenController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CitizenResponse create(@Valid @RequestBody CitizenRequest request) {
        return citizenService.create(request);
    }

    @GetMapping
    public List<CitizenResponse> findAll() {
        return citizenService.findAll();
    }

    @GetMapping("/{id}")
    public CitizenResponse findById(@PathVariable Long id) {
        return citizenService.findById(id);
    }

    @PutMapping("/{id}")
    public CitizenResponse update(@PathVariable Long id, @Valid @RequestBody CitizenRequest request) {
        return citizenService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        citizenService.delete(id);
    }
}
