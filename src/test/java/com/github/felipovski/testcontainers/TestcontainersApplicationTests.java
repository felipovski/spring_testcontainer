package com.github.felipovski.testcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

//@Sql(scripts = {"/data/init.sql"})
class TestcontainersApplicationTests extends BaseIntegrationTest {


    @Test
    void shouldReturnSavedUser() {
        // given
        var customer = new Customer("username", "email", "phone", "address");
        customerRepository.save(customer);

        // when
        var customers = testRestTemplate.getForObject("/api/customers", Customers.class);

        // then
//        assertThat(customers.customers().size()).isEqualTo(6L);
        assertThat(customers.customers()).hasSize(11);
        assertThat(customers.customers().get(customers.customers().size()-1).name).isEqualTo(customer.name);
    }
}