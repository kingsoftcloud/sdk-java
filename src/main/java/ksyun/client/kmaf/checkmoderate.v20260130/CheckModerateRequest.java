package ksyun.client.kmaf.checkmoderate.v20260130;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CheckModerateRequest
* @Description 请求参数
*/
@Data
public class CheckModerateRequest{
    /**防护应用ID*/
    @KsYunField(name="AppId")
    private String AppId;

    /**消息ID，用于流式检测场景*/
    @KsYunField(name="MsgId")
    private String MsgId;

    /**流式状态：0-非流式，1-流式，2-流式结束*/
    @KsYunField(name="UseStream")
    private Integer UseStream;

    /***/
    @KsYunField(name="Message")
    private MessageDto Message;

    @Data
    @ToString
    public static class MessageDto {
        /**内容来源，取值：user，assistant，system*/
        @KsYunField(name="Role")
        private String Role;

        /**送检内容*/
        @KsYunField(name="Content")
        private String Content;

        /**内容类型：1-文本*/
        @KsYunField(name="ContentType")
        private Integer ContentType;

    }

    /***/
    @KsYunField(name="History",type=2)
    private List<HistoryDto> HistoryList;

    @Data
    @ToString
    public static class HistoryDto {
        /***/
        @KsYunField(name="Role")
        private String Role;

        /***/
        @KsYunField(name="Content")
        private String Content;

        /***/
        @KsYunField(name="ContentType")
        private Integer ContentType;

    }

}
