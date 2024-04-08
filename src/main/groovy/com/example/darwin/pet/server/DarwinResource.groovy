package com.example.darwin.pet.server

import com.example.darwin.pet.module.Request
import groovy.transform.CompileStatic
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
class DarwinResource {


  @GetMapping("/starter")
  ResponseEntity<String> getValue() {
    ResponseEntity.ok("Hello World")
  }

  @GetMapping("/starter/{id}")
  @ResponseBody
  ResponseEntity<String> getWithPathVariable(@PathVariable("id") String id) {
    ResponseEntity.ok("ID: " + id)
  }

  @GetMapping("/starter/request")
  @ResponseBody
  ResponseEntity<String> getWithRequestParam(@RequestParam("id") String id) {
    ResponseEntity.ok("ID: " + id)
  }

  @PostMapping("/starter")
  @ResponseBody
  ResponseEntity<Request> postRequestBody(@RequestBody Request id) {
    ResponseEntity.ok(id)
  }

  @PutMapping("/starter")
  @ResponseBody
  ResponseEntity<Request> putWithRequestBody(@RequestBody Request id) {
    ResponseEntity.ok(id)
  }

  @DeleteMapping("/starter/{id}")
  @ResponseBody
  ResponseEntity<String> deleteWithPathParam(@PathVariable("id") String id) {
    ResponseEntity.ok(id)
  }

}
