package sda.collections;

import com.sda.collections.NameMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class NameMapperTest {

    @Test
    void givenNameList_whenGetFirstNames_thenReturnFirstNameAndInitial() {
        //  given
        NameMapper nameMapper = new NameMapper();
        List<String> names = new ArrayList<>();
        names.add("dan nistor");
        names.add("alex nistor");
        names.add("alex vasile");

        List<String> expectedList = Arrays.asList("dan", "alex n", "alex v");

        // when
        List<String> actualList = nameMapper.getFirstNames(names);

        // then
        assertThat(actualList).isEqualTo(expectedList);
    }
}