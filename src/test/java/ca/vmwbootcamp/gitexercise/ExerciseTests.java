package ca.vmwbootcamp.gitexercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Exercise Tests")
class ExerciseTests {

    @Test
    @DisplayName("Exercise 1")
    void exercise1() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    @DisplayName("Exercise 2")
    void exercise2() {
        assertThat(2).isEqualTo(2);
    }
}
