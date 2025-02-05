package org.springframework.ai.yiyan;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import reactor.core.publisher.Flux;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * 一言测试
 *
 * author: fansili
 * time: 2024/3/8 21:55
 */
public class YiYanChatTests {

    private YiYanChatClient yiYanChatClient;

    @Before
    public void setup() {
        YiYanApi yiYanApi = new YiYanApi(
                "",
                "",
                YiYanChatModel.ERNIE4_3_5_8K,
                86400
        );
        yiYanChatClient = new YiYanChatClient(yiYanApi);
    }

    @Test
    public void callTest() {
        ChatResponse call = yiYanChatClient.call(new Prompt("什么编程语言最好？"));
        System.err.println(call.getResult());
    }

    @Test
    public void streamTest() {
        Flux<ChatResponse> fluxResponse = yiYanChatClient.stream(new Prompt("用java帮我写一个快排算法？"));
        fluxResponse.subscribe(new Consumer<ChatResponse>() {
            @Override
            public void accept(ChatResponse chatResponse) {
                System.err.print(chatResponse.getResult().getOutput().getContent());
            }
        });
        // 阻止退出
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
