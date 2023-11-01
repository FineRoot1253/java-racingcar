package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
    @Test
    void splitTest() {
        String dummy1 = "1,2";
        String dummy2 = "1";

        String[] dummy1Array = dummy1.split(",");
        String[] dummy2Array = dummy2.split(",");

        assertThat(dummy1Array).containsExactly("1","2");
        assertThat(dummy2Array).contains("1");
    }

    @Test
    void substringTest() {
        String dummy = "(1,2)";

        String substringDummy = dummy.substring(1, 4);

        assertThat(substringDummy).isEqualTo("1,2");
    }

    @Test
    @DisplayName(value = "chatAtTest:[exception test]")
    void chatAtTest(){
        String dummy = "abc";

        assertThatThrownBy(()->{
            dummy.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining(("String index out of range: 3"));
    }
}