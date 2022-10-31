package com.example.techno_shop;

import com.example.techno_shop.model.Role;
import com.example.techno_shop.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
@SpringBootTest
public class RoleRepositoryTests {

    @Autowired
    private RoleRepository repo;

    @Test
    public void testCreateFirstRole(){
        Role roleAdmin = new Role("test");
        Role savedRole = repo.save(roleAdmin);
        assertThat(savedRole.getId()).isGreaterThan(0);
    }

//    @Test
//    public void testCreateRestRoles() {
//        Role roleSalesperson = new Role("Salesperson");
//        Role roleEditor = new Role("Editor");
//        Role roleShipper = new Role("Shipper");
//        Role roleAssistant = new Role("Assistant");
//        repo.saveAll(List.of(roleSalesperson, roleEditor, roleShipper, roleAssistant));
//
//    }
}
