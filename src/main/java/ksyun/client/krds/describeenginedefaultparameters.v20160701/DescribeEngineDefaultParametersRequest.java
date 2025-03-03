package ksyun.client.krds.describeenginedefaultparameters.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeEngineDefaultParametersRequest
 * @Description 请求参数
 */
@Data
public class DescribeEngineDefaultParametersRequest {
    /**
     * 数据库引擎名称
     */
    @KsYunField(name = "Engine")
    private String Engine;

    /**
     * 数据库引擎版本
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

}