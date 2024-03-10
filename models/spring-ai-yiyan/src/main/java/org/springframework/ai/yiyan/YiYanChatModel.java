package org.springframework.ai.yiyan;

/**
 * 一言模型
 *
 * 可参考百度文档：https://cloud.baidu.com/doc/WENXINWORKSHOP/s/clntwmv7t
 *
 * author: fansili
 * time: 2024/3/9 12:01
 */
public enum YiYanChatModel {

    ERNIE4_0("ERNIE 4.0"),
    ERNIE4_3_5_8K("ERNIE-3.5-8K"),
    ERNIE4_3_5_8K_0205("ERNIE-3.5-8K-0205"),

    ERNIE4_3_5_8K_1222("ERNIE-3.5-8K-1222"),
    ERNIE4_BOT_8K("ERNIE-Bot-8K"),
    ERNIE4_3_5_4K_0205("ERNIE-3.5-4K-0205"),

    ;

    YiYanChatModel(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
