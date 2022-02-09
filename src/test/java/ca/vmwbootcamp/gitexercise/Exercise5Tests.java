package ca.vmwbootcamp.gitexercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Exercise 5 Tests")
class Exercise5Tests {

    @Test
    @DisplayName("Exercise 5")
    void exercise5() {
        assertThat(5).isEqualTo(5);
    }
}
