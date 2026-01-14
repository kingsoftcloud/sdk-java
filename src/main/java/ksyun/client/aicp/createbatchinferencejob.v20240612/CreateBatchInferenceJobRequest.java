package ksyun.client.aicp.createbatchinferencejob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateBatchInferenceJobRequest
* @Description 请求参数
*/
@Data
public class CreateBatchInferenceJobRequest{
    /***/
    @KsYunField(name="JobName")
    private String JobName;

    /***/
    @KsYunField(name="JobDesc")
    private String JobDesc;

    /***/
    @KsYunField(name="ApikeyId")
    private String ApikeyId;

    /**模型名，如：deepseek-r1-0528*/
    @KsYunField(name="Model")
    private String Model;

    /***/
    @KsYunField(name="ExecuteTimeoutMs")
    private Long ExecuteTimeoutMs;

    /**文件类型：user_ks3 用户ks3;upload_ks3 上传文件*/
    @KsYunField(name="InputDataType")
    private String InputDataType;

    /***/
    @KsYunField(name="Ks3Region")
    private String Ks3Region;

    /***/
    @KsYunField(name="Ks3Ak")
    private String Ks3Ak;

    /***/
    @KsYunField(name="Ks3Sk")
    private String Ks3Sk;

    /***/
    @KsYunField(name="InBucket")
    private String InBucket;

    /***/
    @KsYunField(name="OutBucket")
    private String OutBucket;

    /***/
    @KsYunField(name="InObjectName")
    private String InObjectName;

    /***/
    @KsYunField(name="OutObjectName")
    private String OutObjectName;

}
