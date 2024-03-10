package org.springframework.ai.yiyan.api;

import lombok.Data;

import java.util.List;

/**
 * 一言 Completion req
 *
 * author: fansili
 * time: 2024/3/9 10:34
 */
@Data
public class YiYanChatCompletionRequest {

    public YiYanChatCompletionRequest(List<Message> messages) {
        this.messages = messages;
    }

    // 聊天上下文信息
    // https://cloud.baidu.com/doc/WENXINWORKSHOP/s/clntwmv7t
    private List<Message> messages;

    // 是否以流式接口的形式返回数据，默认false
    private boolean stream = false;

    @Data
    public static class Message {
        private String role;

        private String content;
    }
}
