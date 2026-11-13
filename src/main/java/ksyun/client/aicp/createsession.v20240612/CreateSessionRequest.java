package ksyun.client.aicp.createsession.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSessionRequest
* @Description 请求参数
*/
@Data
public class CreateSessionRequest{
    /***/
    @KsYunField(name="Tags")
    private TagsDto Tags;

    @Data
    @ToString
    public static class TagsDto {
        /***/
        @KsYunField(name="key")
        private String Key;

    }

    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="ExpiresHours")
    private Integer ExpiresHours;

}
