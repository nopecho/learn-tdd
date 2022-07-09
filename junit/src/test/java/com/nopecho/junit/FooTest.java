package com.nopecho.junit;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class FooTest {

    private Long ANY_ID = 1L;

    @Test
    void Foo_객체가_생성된다(){
        Foo foo = new Foo();
        assertThat(foo).isNotNull();
        System.out.println("create Foo Test!");
    }

    @Test
    void 텍스트가_출력된다(){
        System.out.println("print Test!");
    }

    @BeforeAll
    static void 모든_테스트_실행_전_한번만_호출된다(){
        System.out.println("==> ==> BeforeAll Annotation Call! ==> ==>");
    }

    @AfterAll
    static void 모든_테스트_실행_후_한번만_호출된다(){
        System.out.println("<== <== AfterAll Annotation Call! <== <==");
    }

    @BeforeEach
    void 각_테스트_실행_전_항상_호출된다(){
        System.out.println("-> -> BeforeEach Annotation Call! -> ->");
    }

    @AfterEach
    void 각_테스트_실행_후_항상_호출된다(){
        System.out.println("<- <- AfterEach Annotation Call! <- <-");
    }

    @Test
    void Foo_객체의_id는_Value_객체다(){
        Foo foo = new Foo();

        foo.setId(FooId.of(ANY_ID));

        assertThat(foo.getId()).isInstanceOf(FooId.class);
    }

    @Test
    void FooId_객체의_id는_Long_타입이다(){
        FooId fooId = FooId.of(ANY_ID);
        assertThat(fooId.getId()).isInstanceOf(Long.class);
    }
}