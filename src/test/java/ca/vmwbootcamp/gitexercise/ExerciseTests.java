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

    @Test
    @DisplayName("Exercise 3")
    void exercise3() {
        assertThat(3).isEqualTo(3);
    }

    @Test
    @DisplayName("Exercise 4")
    void exercise4() {
        assertThat(4).isEqualTo(4);
    }
}
