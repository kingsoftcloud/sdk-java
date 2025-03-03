package ksyun.client.kcs.deletebigkeysanalyseresult.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

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