package ksyun.client.krds.describeenginedefaultparameters.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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