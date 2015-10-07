package io.github.benas.xstream.components;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;

public class TranslateTest {

    private Stream<String> stream;

    private Translate translate;

    @Before
    public void setUp() {
        stream = Stream.of("a", "b");
        translate = Translate.translate("a", "b");
    }

    @Test
    public void apply() {
        List<String> strings = translate.apply(stream).collect(Collectors.toList());

        assertThat(strings).isNotEmpty().hasSize(2).containsExactly("b", "b");
    }
}