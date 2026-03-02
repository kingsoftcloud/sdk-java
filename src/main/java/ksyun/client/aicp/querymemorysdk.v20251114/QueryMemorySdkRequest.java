package ksyun.client.aicp.querymemorysdk.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMemorySdkRequest
* @Description 请求参数
*/
@Data
public class QueryMemorySdkRequest{
    /***/
    @KsYunField(name="Namespace")
    private String Namespace;

    /***/
    @KsYunField(name="UserId")
    private String UserId;

    /***/
    @KsYunField(name="Query")
    private String Query;

    /***/
    @KsYunField(name="SceneId")
    private String SceneId;

    /***/
    @KsYunField(name="OccurredAfter")
    private Long OccurredAfter;

    /***/
    @KsYunField(name="OccurredBefore")
    private Long OccurredBefore;

    /***/
    @KsYunField(name="Mode")
    private String Mode;

    /***/
    @KsYunField(name="ReturnCitations")
    private Boolean ReturnCitations;

    /***/
    @KsYunField(name="Limit")
    private Integer Limit;

}
