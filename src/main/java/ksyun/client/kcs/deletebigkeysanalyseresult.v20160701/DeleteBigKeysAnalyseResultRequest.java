package ksyun.client.kcs.deletebigkeysanalyseresult.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteBigKeysAnalyseResultRequest
 * @Description 请求参数
 */
@Data
public class DeleteBigKeysAnalyseResultRequest {
    /**
     * 缓存服务ID(实例ID)
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 大key任务ID
     */
    @KsYunField(name = "TaskId")
    private String TaskId;

}