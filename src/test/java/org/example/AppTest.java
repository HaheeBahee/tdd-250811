package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {

    @Test
    @DisplayName("'==명언 앱==' 출력")
    void t1(){
        Scanner sc = TestUtil.genScanner("종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        new App(sc).run(); //기존의 스캐너가 아니라 테스트용 스캐너를 사용해야함
        String out = outputStream.toString();

        assertThat(out).contains().toString();

    }
}
