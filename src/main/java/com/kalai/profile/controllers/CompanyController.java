package com.kalai.profile.controllers;

import com.kalai.profile.models.Companies;
import com.kalai.profile.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/company")
public class CompanyController {

  @Autowired private CompanyService companyService;

  @GetMapping
  public @ResponseBody Iterable<Companies> getAll() {
    return companyService.getAll();
  }

  @PostMapping(value = "/create")
  public @ResponseBody Iterable<Companies> add(@RequestBody final Companies company) {
    return companyService.add(company);
  }

  @DeleteMapping(value = "/delete/{id}")
  public @ResponseBody Iterable<Companies> delete(@PathVariable Integer id) {
    return companyService.delete(id);
  }

  @PatchMapping(value = "/update")
  public @ResponseBody Iterable<Companies> update(@RequestBody final Companies company) {
    return companyService.update(company);
  }
}
