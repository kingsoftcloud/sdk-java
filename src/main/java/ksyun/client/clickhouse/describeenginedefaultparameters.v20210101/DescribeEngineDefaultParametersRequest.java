package ksyun.client.clickhouse.describeenginedefaultparameters.v20210101;

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
public class DescribeEngineDefaultParametersRequest{
    /**引擎版本。可选：21.8、22.8。*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**参数类型。可选：Users，Config。*/
    @KsYunField(name="ConfigType")
    private String ConfigType;

}
