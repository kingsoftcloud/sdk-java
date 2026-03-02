package ksyun.client.kmaf.queryanswer.v20260130;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryAnswerRequest
* @Description 请求参数
*/
@Data
public class QueryAnswerRequest{
    /**防护应用ID*/
    @KsYunField(name="AppId")
    private String AppId;

    /**消息ID*/
    @KsYunField(name="MsgId")
    private String MsgId;

    /**是否返回流式结果：0-非流式，1-流式*/
    @KsYunField(name="UseStream")
    private Integer UseStream;

}
