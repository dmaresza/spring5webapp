/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springFramework.spring5webapp.repositories;

import guru.springFramework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author danie
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
