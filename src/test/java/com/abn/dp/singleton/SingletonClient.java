package com.abn.dp.singleton;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SingletonClient {

    @Test
    public void test() throws Exception {
        SingletonPattern firstInstance = SingletonPattern.getInstance();
        SingletonPattern secondInstance = SingletonPattern.getInstance();

        assertThat(firstInstance).isEqualTo(secondInstance);
    }
}
