package ksyun.client.postgresql.describeenginedefaultparameters.v20181225;

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
     * <p>
     * 固定PostgreSQL
     */
    @KsYunField(name = "Engine")
    private String Engine;

    /**
     * 引擎版本
     * <p>
     * 引擎名称和版本必须对应,目前支持的版本:9.6/10/11/12.5/13
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

}